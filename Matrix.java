import java.util.Scanner;
	/**
	 * One indexed
	 */
public class Matrix {
	private Complex[][] values;

	public Matrix(int height, int width) {
		values = new Complex[height][width];
	}

	public void scannerFill(Scanner input) {
		System.out.print("Will this matrix contain Complex numbers: ");
		boolean willComplex = input.nextLine().equals("y");
		
		for (int y = 1; y <= this.getHeight(); y++) {
			for (int x = 1; x <= this.getWidth(); x++) {
				Complex complex = new Complex();
				System.out.print("Enter Real value for " + y + " " + x + ": ");
				complex.setReal(Double.parseDouble(input.nextLine()));

				if (willComplex) {
					System.out.print("Enter Imag value for " + y + " " + x + ": ");
					complex.setImaginary(Double.parseDouble(input.nextLine()));
				}

				this.setValue(y, x, complex);
			}
		}
	}

	public void print() {
		for (int y = 1; y <= this.getHeight(); y++) {
			for (int x = 1; x <= this.getWidth(); x++) {
				System.out.print("[" + this.getValue(y, x) + "]");
			}
			System.out.println();
		}
	}

	public Matrix multiply(Matrix matrix) {
		if (this.getWidth() != matrix.getHeight()) {
			return null;
		} else {
			Matrix outMatrix = new Matrix(this.getHeight(), matrix.getWidth());
			for (int y = 1; y <= outMatrix.getHeight(); y++) {
				for (int x = 1; x <= outMatrix.getWidth(); x++) {
					Complex thisSum = new Complex();
					// And now we sum 
					for (int k = 1; k <= this.getWidth(); k++) {
						thisSum.addTo(this.getValue(y, k).multiply(matrix.getValue(k, x)));
					}
					outMatrix.setValue(y, x, thisSum);
				}
			}
			return outMatrix;
		}
	}

	/**
	 * Getters and setters for values
	 */
	public int getWidth() {
		return this.values[0].length;
	}
	public int getHeight() {
		return this.values.length;
	}
	public void setValue(int y, int x, Complex value) {
		this.values[y-1][x-1] = value; 
	}
	public Complex getValue(int y, int x) {
		return (values[y-1][x-1]);
	}
}