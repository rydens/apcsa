//Ryan Densmore
//10/4/18
//4.3 First and Last

public class FirstAndLast {
    private String word;

    public FirstAndLast(String s) {
        word = s;
        System.out.println(word);
    }

    public void setString(String s) {
        word = s;
        System.out.println(word);
    }
    public String getFirst() {
        return "" + word.charAt(0);
    }
    public String getLast() {
        return "" + word.charAt(word.length() - 1);
    }
    public String toString() {
        String output = getFirst() + "\t" + getLast();
        return output;
    }
}