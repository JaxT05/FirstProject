plugins {
    id 'java'
    id 'application'
    id("org.openjfx.javafxplugin") version "0.1.0"
}

group = 'org.example'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation (platform('org.junit:junit-bom:5.9.1'))
    testImplementation ('org.junit.jupiter:junit-jupiter')
    implementation("org.slf4j:slf4j-nop:2.0.16")
    implementation group: 'com.jayway.jsonpath', name: 'json-path', version: '2.9.0'
    implementation("net.minidev:json-smart:2.5.0")

}

tasks.test {
    useJUnitPlatform()
}

javafx {
    version = "22"
    modules("javafx.controls", "javafx.fxml")
}
application {
    mainClass.set("edu.bsu.cs.GraphicalUserInterface")
}