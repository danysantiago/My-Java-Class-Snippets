import java.io.PrintStream;
import java.util.ArrayList;


public class PhoneBook {
	private ArrayList<Person> contacts;
	private static PhoneBook SINGLETON = new PhoneBook();
	
	private PhoneBook(){
		this.contacts = new ArrayList<Person>();
	}
	
	public static PhoneBook getInstance(){
		return SINGLETON;
	}
	public int size(){
		return this.contacts.size();
	}
	
	public void add(Person P){
		this.contacts.add(P);
	}
	
	public Person findByPhone(String phone){
		for (Person P : this.contacts){
			if (P.getPhoneNumber().equals(phone)){
				return P;
			}
		}
		return null;
	}

	public void print(PrintStream out){
		for (Person P : this.contacts){
			out.println(P);
		}
	}
	
	
	
	
	
}
