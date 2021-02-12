package FatihObjectOrientedProgramming.LambdaExpressions;

import java.util.Comparator;

public class Apple {
    String color;
    Double weight1;
    Double weight2;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight1() {
        return weight1;
    }

    public Double getWeight2() {
        return weight2;
    }

    public void setWeight1(Double weight1) {
        this.weight1 = weight1;
    }

    public void setWeight2(Double weight2) {
        this.weight2 = weight2;
    }

    public int compare1(Double weight1, Double weight2){
            return getWeight1().compareTo(getWeight2());
        };

//    int compare2 (Double weight1, Double weight2) -> a1.getWeight().compareTo(a2.getWeight());
}
