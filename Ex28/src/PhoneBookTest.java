
public class PhoneBookTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook B = PhoneBook.getInstance();
		B.add(Person.knownPerson("Tito", "Kayak", "7877838900"));
		B.add(Person.personWithoutPhone("Yu", "Y"));
		B.add(Person.knownPerson("Dr.", "Dre", "78778388934"));
		B.print(System.out);
		System.out.println("Find person with phone: 78778388934 " + 
				B.findByPhone("78778388934"));
	
		System.out.println("Find person with phone: 7877777777 " + 
				B.findByPhone("7877777777"));

		
	}

}
