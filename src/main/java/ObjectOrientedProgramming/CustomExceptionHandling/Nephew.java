package ObjectOrientedProgramming.CustomExceptionHandling;

import ObjectOrientedProgramming.Utils.CustomException;

public class Nephew {

    public Nephew find(String nephewName) throws CustomException {

        if (nephewName.equals("Suleyman")) {
            return new Nephew();
        } else {
            throw new CustomException("Could not find nephew with name " + nephewName);
        }
    }
}
