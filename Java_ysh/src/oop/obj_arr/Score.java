package oop.obj_arr;
/*
- 이름, 국어, 영어, 수학, 총점, 평균(double)을
 담을 수 있는 객체를 디자인하세요.

- 학생의 모든 정보를 한 눈에 확인할 수 있게
 scoreInfo() 메서드를 선언해 주세요.
 메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

- 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
 */

public class Score {

	private String name;
	private int Kor;
	private int Eng;
	private int Mat;
	private int total;
	private double avr;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return Kor;
	}

	public void setKor(int kor) {
		Kor = kor;
	}

	public int getEng() {
		return Eng;
	}

	public void setEng(int eng) {
		Eng = eng;
	}

	public int getMat() {
		return Mat;
	}

	public void setMat(int mat) {
		Mat = mat;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvr() {
		return avr;
	}

	public void setAvr(double avr) {
		this.avr = avr;
	}

	public Score(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		Kor = kor;
		Eng = eng;
		Mat = mat;
		total = Kor+Eng+Mat;
		avr = ((double)total)/3.0;
	} 

	void scoreInfo() {
		System.out.println();
		System.out.println("이름 : "+name);
		System.out.println("===================================");
		System.out.printf("국어 : %d점 / 영어 : %d점 /수학 : %d점\n",Kor,Eng,Mat);
		System.out.printf("총합: %d점 / 평균 : %.2f점\n",total,avr);
		System.out.println("===================================");
	}




}