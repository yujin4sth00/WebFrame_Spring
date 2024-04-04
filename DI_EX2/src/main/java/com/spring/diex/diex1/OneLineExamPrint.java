package com.spring.diex.diex1;

public class OneLineExamPrint implements ExamConsole{
	private Exam exam;
	
	//생성자를 이용하여 객체 주입
	public OneLineExamPrint(Exam exam) {
		super();
		this.exam = exam;
	}	
	
	public OneLineExamPrint() {
		System.out.println("OneLineExamPrint() 생성자!!");
	}
	
		
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}
	
	@Override
	public void printExam() {
		System.out.printf("OneLinePrint : total : %d, avg : %f", exam.total(), exam.avg());
	}

	
}
