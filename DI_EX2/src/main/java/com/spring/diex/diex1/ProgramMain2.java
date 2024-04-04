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
		
		
		//���� applicatoinContext ���ü�(����)�� �̿��Ͽ� ��ü�� �����ϴ� �ڵ� 
		//������ ��ü��(IoC container)�� ����Ű�� �ִ� ������ context ��.
		ApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		Exam exam = (Exam) context.getBean("exam5");
		
		
		/*
		 * //1. ArrayList ���� ArrayList<Exam> exams = new ArrayList<Exam>();
		 * exams.add(new LecExam(10,20,30)); exams.add(exam);
		 */
		
		ArrayList<Exam> exams = (ArrayList<Exam>) context.getBean("exams");
		
		for(Exam e : exams) {
			System.out.println("ArrayList : " + e.toString());
		}
		
		//2. Map Collection ����
		System.out.println("2.MapCollection ����");
		
		/*
		 * Map<String, String> studentInfo = new LinkedHashMap<String, String>();
		 * studentInfo.put("ȫ�浿1", "ȫ�浿1 �ּ�"); studentInfo.put("ȫ�浿2", "ȫ�浿2 �ּ�");
		 * studentInfo.put("ȫ�浿3", "ȫ�浿3 �ּ�");
		 */
		//���ü��� �̿��Ͽ� ����
		CollectionMap collectionMap = (CollectionMap) context.getBean("collectionMap");
		Map<String, String> studentInfo = collectionMap.getStudentInfo();
		
		
		for(Map.Entry<String, String> student : studentInfo.entrySet()) {
			System.out.println(student.getKey() + " , " + student.getValue());
		}
		
		//3. Set Collection ����
				System.out.println("3.SetCollection ����");
				
				/*
				 * Set<String> studentList = new HashSet<String>(); studentList.add("ȫ�浿1");
				 * studentList.add("ȫ�浿2"); studentList.add("ȫ�浿3");
				 */
				
				CollectionSet collectionSet = (CollectionSet) context.getBean("collectionSet"); //��Ȯ�ϰ� Ÿ�� �������ֱ�
				Set<String> studentList = collectionSet.getStudentList();
				
				for(String studentName : studentList) {
					System.out.println(studentName);
				}

	}

}
