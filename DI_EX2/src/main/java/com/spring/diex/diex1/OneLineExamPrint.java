package com.spring.diex.diex1;

public class OneLineExamPrint implements ExamConsole{
	private Exam exam;
	
	//�����ڸ� �̿��Ͽ� ��ü ����
	public OneLineExamPrint(Exam exam) {
		super();
		this.exam = exam;
	}	
	
	public OneLineExamPrint() {
		System.out.println("OneLineExamPrint() ������!!");
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
