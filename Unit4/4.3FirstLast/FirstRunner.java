//Ryan Densmore
//10/4/18
//4.3 First and Last

public class FirstRunner {
    public static void main(String[] args) {
        FirstAndLast demo = new FirstAndLast("Hello");
        System.out.println(demo.getFirst() + "\t" + demo.getLast());

        demo.setString("World");
        System.out.println(demo);

        demo.setString("JukeBox");
        System.out.println(demo);

        demo.setString("TCEA");
        System.out.println(demo);

        demo.setString("UIL");
        System.out.println(demo);
    }
}