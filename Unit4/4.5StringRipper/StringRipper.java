//Ryan Densmore
//10/22/18
//Lab 4.5 - String Ripper

public class StringRipper {
    private String word;

    public StringRipper() {}
    public StringRipper(String s) {
        word = s;
    }

    public void setString(String s) { word = s; }

    public String ripString(int x, int y) {
        return word.substring(x, y);
    }
    public String toString() {
        return word + "\n\n";
    }
}