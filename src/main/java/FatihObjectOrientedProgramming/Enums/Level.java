package FatihObjectOrientedProgramming.Enums;

public enum Level {
    LOW,
    MEDIUM,
    HIGH;


    public Level Levelling(String value) {
        Level var = Level.valueOf(value);

        switch (value) {
            case "LOW":
                return LOW;
            case "MEDIUM":
                return MEDIUM;
            case "HIGH":
                return HIGH;
        }
        return var;
    }

}
