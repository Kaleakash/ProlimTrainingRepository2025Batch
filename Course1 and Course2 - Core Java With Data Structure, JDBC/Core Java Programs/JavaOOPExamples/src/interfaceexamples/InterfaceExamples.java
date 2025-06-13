package interfaceexamples;
interface Abc {
	int A=10;
	int M=100;
	void dis1();
		void dis();
}
interface Mno {
	int B=20;
	int M=200;
	void dis2();
		void dis();
}
interface Xyz extends Abc,Mno{
	int C=30;
	void dis3();
}
class Test implements Abc,Mno {
	@Override
	public void dis1() {
		System.out.println("A "+A);
		System.out.println("B "+B);
		System.out.println("M "+Abc.M);
		System.out.println("M "+Mno.M);
		System.out.println("Abc interface method");
	}
	@Override
	public void dis() {
		System.out.println("Abc interface method");
	}
	@Override
	public void dis2() {
		System.out.println("Mno interface method");
	}
	
}
public class InterfaceExamples {

	public static void main(String[] args) {
		Test tt = new Test();
		tt.dis();
		tt.dis1();
		tt.dis2();

	}

}
