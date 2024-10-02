package edu.bsu.cs;

import java.net.URL;


public class ErrorHandlingCLI {
    public void checkEmptyInput(String articleInput) {
        if (articleInput.isEmpty()) {
            System.err.println("No article input provided.");
            System.out.flush();
        }
    }

    public void checkConnection(URL connection) {
        try {
            connection.openConnection().connect();
        }
       catch (Exception NetworkError){
            System.err.println("The connection was unable to be established.");
            System.exit(0);
        }
    }
}
