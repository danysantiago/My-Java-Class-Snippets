/**
 * This class is a main program used to show many of the methods of the string data type.
 * @author Manuel Rodriguez-Martinez
 *
 */
public class TestString {
	public static void main(String[] args){
		String name1 = "manuel";
		String name2 = new String("Joe");
		
		// Call a few methods of the string data type
		System.out.printf("Name1: %s\n", name1);
		System.out.printf("Len of name1: %d\n", name1.length());
		System.out.printf("name1: %s, upper case name1: %s\n", name1, name1.toUpperCase());
		
		// Show string concatenation operation: the processing of connecting two strings
		// to get a larger one.
		String name3 = new String (" Camel");
		String name4 = name2 + name3;
		System.out.printf("Concatenation of name2 and name3: %s\n", name4);
		// Show more complex string operations, based on function compositions and direct
		// use of string literals. 
		System.out.printf("Length of word aballarde: %d\n", "aballarde".length());
		System.out.printf("Lenght of concatenation: %d\n", (name2 + name3).length());
		System.out.printf("Replacing o by aa in Joe: %s\n", name2.replace("o", "aa"));
		// Show that a method can return an object, and the you can call the methos of that
		// object. For example, replace() returns a string, and then we call lenth() on that
		// string.
		System.out.printf("Length of replacing o by aa in Joe: %s", name2.replace("o", "aa").length());
	}
}
