package statickeyword;

class Abc {
	int a;			// non static or instance variable 
	static int b;		// static variable 
	void dis1() {
		System.out.println("non static method");
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	static void dis2() {
		System.out.println("static metho");
		//System.out.println("a "+a);
		System.out.println("b "+b);
	}
}
public class StaticKeywordExamples1 {

	public static void main(String[] args) {
	Abc obj1 = new Abc();
	obj1.a=100;
	Abc.b=200;
	obj1.dis1();
	Abc.dis2();
	obj1.b=300;
	obj1.dis2();
	}

}
