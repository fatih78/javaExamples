package FatihObjectOrientedProgramming.Overriding;

public class Animal {
    protected String sound1 = "Hi, I'am an Animal!";
    protected String sound2 = "Hi, I'am a Dog, Woef woef!";
    protected String sound3 = "Hi, I'am a Cat, Miauwww Miauwww!";


    public String communicate() {
        System.out.println(sound1);
        return sound1;
    }
}
