package ObjectOrientedProgramming;

public class Pen {
    String type = "gel";
    String color = "blue";
    int point = 10;
    boolean clicked = false;

    public  void click(){
        clicked = true;
    }

    public void unclick(){
        clicked = false;
    }

//    protected static int a;
//    public static void main (String[] args) {
//        if (a == 1 ) {
//            System.out.println("a is zero!");
//        } else {
//            System.out.println("a is NOT zero!");
//        }
//    }
}
