package ObjectOrientedProgramming.CustomExceptionHandling;

import ObjectOrientedProgramming.Utils.CustomException;

public class Student {

    public Student find(String studentID) throws CustomException {

        if (studentID.equals("123456")) {
            return new Student();
        } else {
            throw new CustomException("Could not find student with ID " + studentID);
        }
    }
}

