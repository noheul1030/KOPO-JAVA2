package CalcProject;

public class CalcMain {

	public static void main(String[] args) {
		Calc calc1 = new Calc();
		Calc calc2 = new Calc();
		
		calc1.setName("calc #1");
		calc2.setName("calc #2");
		
		int r1 = Calc.add(1, 2);
//		System.out.println(r1);
		
		calc1.setMemory(5);
		int r2 = calc1.addWithMemory(3);
		
		double r3 = Calc.getCircleLengthint(10);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

	}
}
