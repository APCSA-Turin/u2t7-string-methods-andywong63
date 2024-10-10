package lab3;

public class Main {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();

        System.out.println(methods.longerThan("hello world", 10));
        System.out.println(methods.funnyString("apcsp", 3));
        System.out.println(methods.halvesReversed("windows"));
        System.out.println(methods.pigLatin("programming"));
        System.out.println(methods.removeCharacter("hello wrorld", 7));
        System.out.println(methods.insertAt("thisis a test", " ", "s"));
        System.out.println(methods.endUp("lower upper", 5));
        System.out.println(methods.yellOrWhisper("tESTING"));
        System.out.println(methods.starBetween("stars"));

    }
}
