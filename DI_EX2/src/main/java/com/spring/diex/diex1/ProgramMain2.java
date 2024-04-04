package com.spring.diex.diex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgramMain2 {

	public static void main(String[] args) {
		
		
		//실제 applicatoinContext 지시서(설명서)를 이용하여 객체를 생성하는 코드 
		//생성된 객체들(IoC container)을 가리키고 있는 변수는 context 임.
		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		Exam exam = (Exam) context.getBean("exam5");
		
		
		/*
		 * //1. ArrayList 연습 ArrayList<Exam> exams = new ArrayList<Exam>();
		 * exams.add(new LecExam(10,20,30)); exams.add(exam);
		 */
		
		ArrayList<Exam> exams = (ArrayList<Exam>) context.getBean("exams");
		
		for(Exam e : exams) {
			System.out.println("ArrayList : " + e.toString());
		}
		
		//2. Map Collection 연습
		System.out.println("2.MapCollection 연습");
		
		/*
		 * Map<String, String> studentInfo = new LinkedHashMap<String, String>();
		 * studentInfo.put("홍길동1", "홍길동1 주소"); studentInfo.put("홍길동2", "홍길동2 주소");
		 * studentInfo.put("홍길동3", "홍길동3 주소");
		 */
		//지시서를 이용하여 구현
		CollectionMap collectionMap = (CollectionMap) context.getBean("collectionMap");
		Map<String, String> studentInfo = collectionMap.getStudentInfo();
		
		
		for(Map.Entry<String, String> student : studentInfo.entrySet()) {
			System.out.println(student.getKey() + " , " + student.getValue());
		}
		
		//3. Set Collection 연습
				System.out.println("3.SetCollection 연습");
				
				/*
				 * Set<String> studentList = new HashSet<String>(); studentList.add("홍길동1");
				 * studentList.add("홍길동2"); studentList.add("홍길동3");
				 */
				
				CollectionSet collectionSet = (CollectionSet) context.getBean("collectionSet"); //명확하게 타입 지정해주기
				Set<String> studentList = collectionSet.getStudentList();
				
				for(String studentName : studentList) {
					System.out.println(studentName);
				}

	}

}
