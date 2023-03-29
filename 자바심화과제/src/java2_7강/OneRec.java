package java2_7°­;

import java2_6°­.ReportSheet;
// ¹Ì¿Ï·á

public class OneRec {

	private String name;
	private int kor;
	private int eng;
	private int mat;

	OneRec(int iPerson) {

	}

	OneRec(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String name() {
		return this.name;
	};

	public int kor() {
		return this.kor;
	};

	public int eng() {
		return this.eng;
	};

	public int mat() {
		return this.mat;
	};

	public int sum() {
		return this.kor + this.eng + this.mat;
	};

	public double ave() {
		return this.sum() / 3.0;
	};

}

class Test {

	int iPerson = 5;

	public void print() {
		OneRec[] inData = new OneRec[iPerson];

		inData[0] = new OneRec("È«±æ01", 100, 100, 90);
		inData[1] = new OneRec("È«±æ01", 100, 100, 90);
		inData[2] = new OneRec("È«±æ01", 100, 100, 90);
		inData[3] = new OneRec("È«±æ01", 100, 100, 90);
		inData[4] = new OneRec("È«±æ01", 100, 100, 90);
	}
}