import java.util.Scanner;

class StudentMenuView {
	
	static StudentService service;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		String [][] data = {
			{"10", "�赿��", "24", "������"},
			{"11", "�谡��", "28", "��⵵"},
			{"12", "�����", "54", "��籺"},
			{"13", "������", "59", "���ֽ�"},
			{"14", "ȫ�繫", "14", "����"},
		};
		service = new StudentService(data);
		menuPrint();
	}

	//�޴� �׸�
	public static void menuPrint() {
		
		while(true) {
			System.out.println("��������������������");
			System.out.println("1. ���");
			System.out.println("2. ��ü�˻�");
			System.out.println("3. �й��˻�");
			System.out.println("4. ��������");
			System.out.println("9. ����");
			System.out.println("��������������������");
			System.out.print("Ű �Է� : ");
			
			int menuChoice = scanner.nextInt();
			switch(menuChoice) {
				case 1:
					insertMenu();
					break;
				case 2:
					EndView.printSelectAll(service.selectAll());
					break;
				case 3:
					searchBySnoMenu();
					break;
				case 4:
					updateMenu();
					break;
				case 9:
					System.exit(0);
				default:
					System.out.println("�߸��� �����Դϴ�.");
			}
		}
	}

	public static void insertMenu() {
		System.out.print("�й���? ");
		int sno = scanner.nextInt();

		scanner.nextLine();
		System.out.print("�̸���? ");
		String name = scanner.nextLine();

		System.out.print("���̴�? ");
		int age = scanner.nextInt();

		scanner.nextLine();
		System.out.print("�ּҴ�? ");
		String addr = scanner.nextLine();
		
		Student student = new Student(sno, name, age, addr);
		if(service.insert(student)) {
			EndView.printMessage("��ϵǾ����ϴ�.");
		} else {
			EndView.printMessage("��ϵ��� �ʾҽ��ϴ�.");
		}
	}

	public static void searchBySnoMenu() {
		System.out.print("�й���? ");
		int sno = scanner.nextInt();

		Student student = new Student();
		student = service.searchBySno(sno);
		EndView.printSearch(student);
	}

	public static void updateMenu() {
		System.out.print("�й���? ");
		int sno = scanner.nextInt();
		
		scanner.nextLine();
		System.out.print("�̸���? ");
		String name = scanner.nextLine();

		System.out.print("���̴�? ");
		int age = scanner.nextInt();

		Student student = new Student(sno, name, age);
	
		if(service.update(student))
			EndView.printMessage("����Ǿ����ϴ�.");
		else
			EndView.printMessage("��ġ�ϴ� �й��� �����ϴ�.");
	}
}