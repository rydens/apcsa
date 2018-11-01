//Ryan Densmore
//10/22/18
//Lab 4.4 - First and Last Names

public class Name {
    private String name;
    
    public Name() {}
    public Name(String s) {
        name = s;
    }

    public void setName(String s) { name = s; }

    public String getFirst() {
        return name.substring(0, name.indexOf(" "));
    }
    public String getLast() {
        return name.substring(name.indexOf(" ") + 1);
    }
    public String toString() {
        return name;
    }
}