package ObjectOrientedProgramming.Utils;

public abstract class CalculatorUtil {
    public int result;

    public int timeTable(int number, int table){
        int i=0;
        if ( table == 1){
            while(i<=1){
                result = number * i;
                System.out.println(number+" * "+i+" = "+ result);
                i++;
            }
        }
        else if (table == 2){
            while(i<=2){
                result = number * i;
                System.out.println(number+" * "+i+" = "+ result);
                i++;
            }
        }
        else if (table == 3){
            while(i<=3){
                result = number * i;
                System.out.println(number+" * "+i+" = "+ result);
                i++;
            }
        }
        else if (table == 4){
            while(i<=4){
                result = number * i;
                System.out.println(number+" * "+i+" = "+ result);
                i++;
            }
        }
        else if (table == 5){
            while(i<=5){
                result = number * i;
                System.out.println(number+" * "+i+" = "+ result);
                i++;
            }
        }
        else if (table == 6){
            while(i<=6){
                result = number * i;
                System.out.println(number+" * "+i+" = "+ result);
                i++;
            }
        }
        else if (table == 7){
            while(i<=7){
                result = number * i;
                System.out.println(number+" * "+i+" = "+ result);
                i++;
            }
        }
        else if (table == 8){
            while(i<=8){
                result = number * i;
                System.out.println(number+" * "+i+" = "+ result);
                i++;
            }
        }
        else if (table == 9){
            while(i<=9){
                result = number * i;
                System.out.println(number+" * "+i+" = "+ result);
                i++;
            }
        }
        else if (table == 10){
            while(i<=10){
                result = number * i;
                System.out.println(number+" * "+i+" = "+ result);
                i++;
            }
        }
        return result;
    }




    public int sumTable(int number){
        int i=0;
        if ( number == 1){
            while(i<=1){
                result = number + i;
                System.out.println(number+" * "+i+" = "+ result);
                i++;
            }
        }
        else if (number == 2){
            while(i<=2){
                result = number + i;
                System.out.println(number+" + "+i+" = "+ result);
                i++;
            }
        }
        else if (number == 3){
            while(i<=3){
                result = number + i;
                System.out.println(number+" + "+i+" = "+ result);
                i++;
            }
        } else {
            System.out.println("Number is not defined");
        }
        return result;
    }
}
