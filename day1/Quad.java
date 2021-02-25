package day1;

public class Quad {

	public static void main(String[] args) {
		int a = 3, b = 2, c = 1;
		Quadratic q = new Quadratic(a, b, c);
		q.setValues(q);
		System.out.println(q.calculate());
	}
}

class Quadratic {
	int a;
	int b;
	int c;

	Quadratic() {
		this.a = 1;
		this.b = 1;
		this.c = 1;
	}

	Quadratic(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setValues(Quadratic q) {
		this.a = q.a;
		this.b = q.b;
		this.c = q.c;
	}

	public int getAValue() {
		return this.a;
	}

	public int getBValue() {
		return this.b;
	}

	public int getCValue() {
		return this.c;
	}

	public String calculate() {
		String temp = "";
		temp = getAValue() + "x^2+" + getBValue() + "x+" + getCValue();
		return temp;
	}
}