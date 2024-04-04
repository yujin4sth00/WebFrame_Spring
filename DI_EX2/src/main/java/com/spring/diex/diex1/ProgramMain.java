package com.spring.diex.diex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgramMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Exam exam = new LecExam(10, 20, 30);
//		Exam exam1 = new LecExam(100, 200, 300);
//		Exam exam2 = new LecExam(1, 2, 3);
		
		//���� applicatoinContext ���ü�(����)�� �̿��Ͽ� ��ü�� �����ϴ� �ڵ� 
		//������ ��ü��(IoC container)�� ����Ű�� �ִ� ������ context ��.
		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//getBean(Exam.class) Ÿ���� ��ü�� �����ͼ� exam ������ ����...
		//getBean(��ü�̸�)
		Exam exam = (Exam) context.getBean("exam5");	
		System.out.println(exam.toString());
		
	
		//1. exam ��ü�� �����ڸ� �̿��Ͽ� ����(DI)
		//ExamConsole console = new OneLineExamPrint(exam2);		
		//ExamConsole console = new MultipleLineExamPrint(exam2);
		
		//2. exam ��ü�� ���͸� �̿��Ͽ� ����(DI)
		//ExamConsole console = new OneLineExamPrint();
//		ExamConsole console = new MultipleLineExamPrint();
//		console.setExam(exam);
		
		//ExamConsole Ÿ���� ��ü�� �����ͼ� console ������ ����
//		ExamConsole console = context.getBean(ExamConsole.class);
//		console.printExam();
		
		//OneLineExamPrint().�̿��ؼ� ���
		OneLineExamPrint console = context.getBean(OneLineExamPrint.class);
		console.printExam();

	}

}
