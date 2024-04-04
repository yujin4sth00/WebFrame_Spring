package com.spring.diex.diex1;

public class MultipleLineExamPrint implements ExamConsole{
	
	private Exam exam;
		
	public MultipleLineExamPrint(Exam exam) {
		super();
		this.exam = exam;
	}
	
	
	 public MultipleLineExamPrint() {
	 	System.out.println("MultipleLineExamPrint() »ý¼ºÀÚ!!"); 
 	}
	 
	
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void printExam() {
		System.out.printf("MultipleLinePrint : total : %d, avg : %f", exam.total(), exam.avg());
		
	}

	

}
