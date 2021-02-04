package FatihObjectOrientedProgramming.Overriding;

public class Cat extends Animal {

    @Override
    public String communicate() {
        super.communicate();
        System.out.println(sound3);
        return sound3;
    }
}
