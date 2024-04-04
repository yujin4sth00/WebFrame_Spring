package com.spring.diex.diex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgramMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Exam exam = new LecExam(10, 20, 30);
//		Exam exam1 = new LecExam(100, 200, 300);
//		Exam exam2 = new LecExam(1, 2, 3);
		
		//실제 applicatoinContext 지시서(설명서)를 이용하여 객체를 생성하는 코드 
		//생성된 객체들(IoC container)을 가리키고 있는 변수는 context 임.
		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//getBean(Exam.class) 타입의 객체를 가져와서 exam 변수에 저장...
		//getBean(객체이름)
		Exam exam = (Exam) context.getBean("exam5");	
		System.out.println(exam.toString());
		
	
		//1. exam 객체를 생성자를 이용하여 주입(DI)
		//ExamConsole console = new OneLineExamPrint(exam2);		
		//ExamConsole console = new MultipleLineExamPrint(exam2);
		
		//2. exam 객체를 셋터를 이용하여 주입(DI)
		//ExamConsole console = new OneLineExamPrint();
//		ExamConsole console = new MultipleLineExamPrint();
//		console.setExam(exam);
		
		//ExamConsole 타입의 객체를 가져와서 console 변수에 저장
//		ExamConsole console = context.getBean(ExamConsole.class);
//		console.printExam();
		
		//OneLineExamPrint().이용해서 출력
		OneLineExamPrint console = context.getBean(OneLineExamPrint.class);
		console.printExam();

	}

}
