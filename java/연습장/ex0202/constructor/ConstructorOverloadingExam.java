

class Puppy3{
	/*String Ÿ�� ���� ���� ����
		int Ÿ�� ���� ���� ����*/
	String name;
	int num;
		
	
	/*�μ��� ���� �������ۼ�
		String Ÿ�� ���������� "�޸�" �Ҵ�
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
		�������� ���
	*/
	Puppy3() {
		this.name = "�޸�";
		System.out.println("puplic Puppy3()ȣ��Ǿ����ϴ�");
	}
	
	
	/*String Ÿ���� �μ� 1���� �޴� �������ۼ�
		String Ÿ�� ���������� �μ� �Ҵ�
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
		�������� ���
	*/
	Puppy3(String name) {
		this.name = name;
		System.out.println("puplic Puppy3()ȣ��Ǿ����ϴ�");
	}
		
	
	/*String Ÿ���� �μ� 2���� �޴� �������ۼ�
		�μ�2���� �ϳ��� String���� �����
		String Ÿ���� �μ� 1���� �޴� �����ڿ��� �μ��� �ָ� ȣ��
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
	*/

	Puppy3(String name1, String name2) {
		this(name1 + name2);
		System.out.println("puplic Puppy3()ȣ��Ǿ����ϴ�");
	}
		
	
	
	/*boolean Ÿ���� �μ� 1���� �޴� �������ۼ�
		�μ��� "��"�� �ٿ� �ϳ��� String���� �����
		String Ÿ���� �μ� 1���� �޴� �����ڿ��� �μ��� �ָ� ȣ��
		"puplic Puppy3()ȣ��Ǿ����ϴ�"  ���
	*/					
	Puppy3(boolean name) {
		this(name + "��");
		System.out.println("puplic Puppy3()ȣ��Ǿ����ϴ�");
	}
	
	
	/*char Ÿ���� �μ� 1���� �޴� �������ۼ�
			�μ��� ���� �����ڸ� ȣ���ϰ�
			�μ��� ���� data�� intŸ�� ���������� �Ҵ�	
			"puplic Puppy3()ȣ��Ǿ����ϴ�"���
			int�� �����������
	*/
	Puppy3(char name) {
		this();
		this.num = name;
		char a = (char)(num + 1);
		System.out.println("puplic Puppy3()ȣ��Ǿ����ϴ�");
		System.out.println(a);
	}		
	
	
	/*�޼ҵ� printMemberVariable
	���� ����
	���������� ���
	*/
	public void printMemberVariable() {
		System.out.println("String : " + name + ", int : " + num);
	}
}

class ConstructorOverloadingExam{
		//���θ޼ҵ忡��
		public static void main(String [] args){
		//Puppy3 Ŭ������ �� �����ڸ� �ѹ��� �̿��� ��ü 5�� ����
		Puppy3 p[] = new Puppy3[5];
		p[0] = new Puppy3();
		p[1] = new Puppy3("�赿��");
		p[2] = new Puppy3("���̽�", "�蹫��");
		p[3] = new Puppy3(true);
		p[4] = new Puppy3('��');
			
		//�� ��ü�� printMemberVariable�޼ҵ带 �ѹ��� ȣ��
		for(Puppy3 pu : p)
			pu.printMemberVariable();
	}
}
