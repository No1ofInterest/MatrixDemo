public class Complex {
	double real, imaginary;
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public Complex(double real) {
		this.real = real;
		this.imaginary = 0;
	}
	public Complex() {
		this.real = 0;
		this.imaginary = 0;
	}

	public void setReal(double real) {
		this.real = real;
	}
	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}
	public void setValue(double real, double imaginary) {
		this.setReal(real);
		this.setImaginary(imaginary);
	}
	public double getReal() {
		return this.real;
	}
	public double getImaginary() {
		return this.imaginary;
	}

	public Complex add(Complex in) {
		Complex out = new Complex();
		out.setReal(this.real + in.getReal());
		out.setImaginary(this.imaginary + in.getImaginary());
		return out;
	}
	public Complex add(double real, double imaginary) {
		Complex in = new Complex(real, imaginary);
		Complex out = this.add(in);
		return out;
	}
	public Complex add(double real) {
		return this.add(real, 0);
	}

	public String toString() {
		if (imaginary != 0) {
			String myString = real + " " + imaginary + "i";
			return myString;
		} else {
			String myString = real + "";
			return myString;
		}
		
	}

	public Complex multiply(Complex in) {
		Complex out = new Complex();
		out.setReal( (this.real * in.getReal()) - (this.imaginary * in.getImaginary()) );
		out.setImaginary( (this.imaginary * in.getReal()) + (this.real * in.getImaginary()) );
		return out;
	}
	public Complex multiply(double real, double imaginary) {
		Complex in = new Complex(real, imaginary);
		Complex out = this.multiply(in);
		return out;
	}
	public Complex multiply(double real) {
		Complex out = this.multiply(real, 0);
		return out;
	}

	public Complex getConjugate() {
		Complex out = new Complex(this.real, 0 - this.imaginary);
		return out;
	}

	public void addTo(Complex in) {
		this.real += in.getReal();
		this.imaginary += in.getImaginary();
	}
	public void addToReal(double real) {
		this.real += real;
	}
	public void addToImaginary(double imaginary) {
		this.imaginary += imaginary;
	}
}