package ex0210;

import java.util.List;

public class StudentEndView {
	/**
	 * ��ü �˻� ���
	 */
	public static void printSelectAll(List<Student> list) {
		System.out.println("----------�л� List " + list.size() + "��----------");
		for(Student st : list) {
			System.out.println(st);
		}
	}
	
	/**
	 * �й��� �ش��ϴ� �л� ���� ���
	 */
	public static void printSearchBySno(Student student) {
		System.out.println(student);
	}
	
	/**
	 * ���� ���� �޽��� ���
	 */
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
