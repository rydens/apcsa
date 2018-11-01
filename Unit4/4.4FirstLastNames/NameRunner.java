//Ryan Densmore
//10/22/18
//Lab 4.4 - First and Last Names

public class NameRunner {
    public static void main(String[] args) {
        Name person = new Name("Sally Baker");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
        
		person.setName("John Doe");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
        
		person.setName("Sammy Lammy");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
        
		person.setName("Benny Programmer");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
        
		person.setName("Sandy Painter");
		System.out.println(person.getFirst());
		System.out.println(person.getLast());
		System.out.println(person);
    }
}