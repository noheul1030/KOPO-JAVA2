package CalcProject;

public class Calc {
	private static double PI = 3.14;

	private String name;
	private int memory;

	public Calc() {

	}

	public int addWithMemory(int a) {
		return this.memory + a;
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static double getCircleLengthint(double r) {
		return 2 * PI * r;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

}
