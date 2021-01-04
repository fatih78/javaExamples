package ObjectOrientedProgramming;


public class Pen extends Utils{

    private final String type = loadString().get(5);
    private final String color = loadString().get(4);
    private final int point = loadInt();
    public Boolean clicked = loadBooleanA().get(0);
    public Boolean unclicked = loadBooleanA().get(1);

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
    public Boolean click(){
        return clicked;
    }

    public Boolean unclick(){
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
