
public class MatrixTest {
	public static void main(String[] args){
		Matrix M0 = new Matrix(3, 3);
		M0.set(0, 0, 9);
		M0.set(0, 1, -2);
		M0.set(0, 2, 4);
		M0.set(1, 0, 3);
		M0.set(1, 1, 0);
		M0.set(1, 2, 8);
		M0.set(2, 0, -1.1);
		M0.set(2, 1, 0.7);
		M0.set(2, 2, 19);

		System.out.println("Matrix M0: ");
		M0.print(System.out);
		
		Matrix M1 = new Matrix(3, 3);
		M1.set(0, 0, -2);
		M1.set(0, 1, -4);
		M1.set(0, 2, 10);
		M1.set(1, 0, 0.3);
		M1.set(1, 1, 20);
		M1.set(1, 2, 4);
		M1.set(2, 0, 1.12);
		M1.set(2, 1, 0.7);
		M1.set(2, 2, 0);

		System.out.println("Matrix M1: ");
		M1.print(System.out);

		Matrix M2 = M1.sum(M0);
		System.out.println("Matrix M2: ");
		M2.print(System.out);
		
		Matrix M3 = M0.substract(M1);
		System.out.println("Matrix M3: ");
		M3.print(System.out);
		
		Matrix M4 = M0.multiply(M1);
		System.out.println("Matrix M4: ");
		M4.print(System.out);
	}

}
