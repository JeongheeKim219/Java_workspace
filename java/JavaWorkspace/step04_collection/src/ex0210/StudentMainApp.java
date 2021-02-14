package ex0210;

import java.util.List;

public class StudentMainApp {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		
		
		System.out.println("1. ��ü �˻�");
		List<Student> list = service.selectAll();
		StudentEndView.printSelectAll(list);
		
		
		System.out.println("2. �߰��ϱ�");
		if(service.insert(new Student(600, "������", 25, "���ǽ�")))
			StudentEndView.printMessage("�߰� ����");
		else
			StudentEndView.printMessage("�߰� ����");
		
		if(service.insert(new Student(300, "������", 25, "���ǽ�")))
			StudentEndView.printMessage("�߰� ����");
		else
			StudentEndView.printMessage("�߰� ����");
		
		
		System.out.println("3. �й��� �ش��ϴ� ���� �˻�");
		StudentEndView.printSearchBySno(service.searchBySno(300));
		StudentEndView.printSearchBySno(service.searchBySno(700));
		
		
		System.out.println("4. �й��� �ش��ϴ� ���� ����");
		if(service.delete(300))
			StudentEndView.printMessage("���� ����");
		else
			StudentEndView.printMessage("���� ����");
		
		if(service.delete(700))
			StudentEndView.printMessage("���� ����");
		else
			StudentEndView.printMessage("���� ����");

		
		System.out.println("5. �й��� �ش��ϴ� ���� ����");
		if(service.update(new Student(100, "�����", "����")))
			StudentEndView.printMessage("���� ����");
		else
			StudentEndView.printMessage("���� ����");

		StudentEndView.printSelectAll(list);
		
	}
}
