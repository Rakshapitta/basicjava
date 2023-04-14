package basicas;

class Add {
	void addition() {
		int x = 10, y = 20;
		System.out.println("the addition result is = " + (x + y));
	}
}

class Sub {
	void subtration() {
		int x = 10, y = 20;
		System.out.println("the subtraction result is = " + (x - y));
	}
}

class Mul {
	void multiplication() {
		int x = 10, y = 20;
		System.out.println("the multiplication result is = " + (x - y));
	}
}

class Div {
	void divson() {
		int x = 10, y = 20;
		System.out.println("the divson result is = " + (x - y));
	}
}

public class Basica_Methods {

	void reminder() {
		int x = 10, y = 20;
		System.out.println("the reminder result is = " + (x - y));
	}

	public static void main(String args[]) {

		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		add.addition();
		sub.subtration();
		mul.multiplication();
		div.divson();

		Basica_Methods me = new Basica_Methods();
		me.reminder();

	}
}
