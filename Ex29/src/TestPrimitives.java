
public class TestPrimitives {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Primitives P = new Primitives(80);
		int n = 20;
		
		System.out.println("n: " + n);
		System.out.println("P: " + P.getValue());
		
		P.makeCopy(n);
		System.out.println("n: " + n);
		System.out.println("P: " + P.getValue());
	
		PrimitiveUser pUser = new PrimitiveUser(new Primitives(100));
		System.out.println("pUser: " + pUser.getpValue());
		System.out.println("P: " + P.getValue());
		pUser.sideEffect2(P);
		System.out.println("pUser: " + pUser.getpValue());
		System.out.println("P: " + P.getValue());
	
	}

}
