
public class Person {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	public Person(String firstName, String lastName, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	
	public static Person knownPerson(String firstName, String lastName, String phoneNumber){
		return new Person(firstName, lastName, phoneNumber);
	}
	public static Person personWithoutPhone(String firstName, String lastName){
		return new Person(firstName, lastName, "unknown");
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	public boolean equals(Person P) {
		// TODO Auto-generated method stub
		return this.firstName.equals(P.firstName) && this.lastName.equals(P.lastName) &&
			this.phoneNumber.equals(P.phoneNumber);
		
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
