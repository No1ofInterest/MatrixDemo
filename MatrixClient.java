import java.util.Scanner;

public class MatrixClient {
	/**
	 * Prompts user to create two matrices, and then multiplies them together
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Matrix mat1 = new Matrix(2, 2);
		mat1.scannerFill(input);
		System.out.println();

		Matrix mat2 = new Matrix(2, 2);
		mat2.scannerFill(input);
		System.out.println();

		Matrix mat3 = mat1.multiply(mat2);
		mat3.print();

		input.close();
	}
}