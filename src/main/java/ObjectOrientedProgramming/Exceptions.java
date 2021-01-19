package ObjectOrientedProgramming;

import ObjectOrientedProgramming.Utils.ExceptionHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Exceptions extends ExceptionHandler {
    String fileName = "src/main/resources/myProp.properties";

    public Exceptions(String fileName) {
        super(fileName);
    }

    public String fileNotFound() throws ExceptionHandler {

    try {
        Scanner file = new Scanner(new File(fileName));
            if (file.hasNextLine()) {
                return file.nextLine();
            }
    } catch (FileNotFoundException err) {
            throw new ExceptionHandler(fileName);
    }
    return fileName;
}
}
