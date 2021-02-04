package FatihObjectOrientedProgramming.DecisionMaking;

import FatihObjectOrientedProgramming.Utils.CustomException;


public class DecisionMakingSwitch {
    public static String exceptionMessage;
    public static String dayString;


    public String simpleSwitchStatement(int value) {
        try {
            {

                // switch statement with int data type
                switch (value) {
                    case 1:
                        dayString = "Monday";
                        System.out.println(dayString);
                        break;
                    case 2:
                        dayString = "Tuesday";
                        System.out.println(dayString);
                        break;
                    case 3:
                        dayString = "Wednesday";
                        System.out.println(dayString);
                        break;
                    case 4:
                        dayString = "Thursday";
                        System.out.println(dayString);
                        break;
                    case 5:
                        dayString = "Friday";
                        System.out.println(dayString);
                        break;
                    case 6:
                        dayString = "Saturday";
                        System.out.println(dayString);
                        break;
                    case 7:
                        dayString = "Sunday";
                        System.out.println(dayString);
                        break;
                    default:
                        throw new CustomException("Invalid Day");
                }
            }
        } catch (CustomException e) {
            return exceptionMessage = e.getMessage();
        }
        return dayString;
    }
}
