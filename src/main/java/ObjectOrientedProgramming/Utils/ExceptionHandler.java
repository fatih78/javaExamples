package ObjectOrientedProgramming.Utils;

import java.io.FileNotFoundException;

public class ExceptionHandler extends Exception{


    public ExceptionHandler(FileNotFoundException err) {
    }

    public ExceptionHandler(String fileName) {
    }

    public String ExceptionHandler(String errorMessage, String fileName, FileNotFoundException err) {
        return errorMessage;
    }
}
