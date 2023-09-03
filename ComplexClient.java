public class ComplexClient {
	/**
	 * Testing to make sure complex numbers behave nicely
	 */
	public static void main(String[] args) {
		Complex comp1 = new Complex(1, 2);
		Complex comp2 = new Complex(1, 2);

		System.out.println(comp1);
		System.out.println(comp2);

		Complex comp3 = comp1.add(comp2);
		System.out.println(comp3);

		Complex comp4 = comp1.multiply(-1.5);
		System.out.println(comp4);
	}
}