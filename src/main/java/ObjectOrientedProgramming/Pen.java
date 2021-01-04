package ObjectOrientedProgramming;


public class Pen extends Utils{

    private final String type = loadStringType();
    private final String color = loadStringColor();
    private final int point = loadInt();
    public boolean clicked = loadBooleanA();
    public boolean unclicked = loadBooleanB();

// Getters
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getPoint() {
        return point;
    }

    public String type(){
        return getType();
    }

    public String color(){
        return getColor();
    }

    public int point(){
        return getPoint();
    }

//    methods
    public  boolean click(){
        return clicked;
    }

    public boolean unclick(){
         return unclicked;
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
