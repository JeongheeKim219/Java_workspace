

//��û ����� ȭ�鿡 ����� ���� ��ü
class EndView {

	//��ü ��ȸ ���
	public static void printSelectAll(Student [] stArr) {
		System.out.println("������ STUDENT INFORMATION(" + StudentService.count + " STUDENT)������");
		for(int i = 0; i < StudentService.count; i++) {
			Student st = stArr[i];
			System.out.println(st.getSno() + " | " + st.getName() + " | " + st.getAge() + " | " + st.getAddr());
		}
	}

	//�й��� �ش��ϴ� ��ȸ ���
	public static void printSearch(Student student) {
		if(student != null)
			System.out.println(student.getSno() + " | " + student.getName() + " | " + student.getAge() + " | " + student.getAddr());
		else
			System.out.println("��ġ�ϴ� �й��� �����ϴ�.");
	}

	//��� or ������ ��� ����, ���� �޽��� ���
	public static void printMessage(String message) {
		System.out.println(message);
	}
}