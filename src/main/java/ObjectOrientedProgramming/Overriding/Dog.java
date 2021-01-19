package ObjectOrientedProgramming.Overriding;

public class Dog extends Animal {

    @Override
    public String communicate() {
        super.communicate();
        System.out.println(sound2);
        return sound2;
    }
}
