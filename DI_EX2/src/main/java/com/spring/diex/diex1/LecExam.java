package com.spring.diex.diex1;

public class LecExam implements Exam {
	private int kor;
	private int eng;
	private int math;
	
	public LecExam(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public String toString() {
		return "LecExam [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}

	public LecExam() {
		System.out.println("LecExam() ������ !! ");
	}
	
	public int getKor() { return kor; }
	
	public void setKor(int kor) { this.kor = kor; }
	
	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public int total() {
		// TODO Auto-generated method stub
		return (kor+eng+math);
	}
	@Override
	public float avg() {
		// TODO Auto-generated method stub
		return (total()/3.0f);
	}
}