//Ryan Desmore
//10/4/18
//4.1 Adding Strings

public class AddStrings {
    private String first, last;
    private String sum;

    public AddStrings() {
        first = "";
        last = "";
    }
    public AddStrings(String one, String two) {
        first = one;
        last = two;
    }

    public void setStrings(String one, String two) {
        first = one;
        last = two;
    }
    public void add() {
        sum = first + " " + last;
    }
    public String toString() {
        add();
        String output = sum;
        return output;
    }
}