
//ConstructorExam.java
class Puppy{
		//String,int  Ÿ�� ���� ���� ����(member ��������)
		String name;
		int num;
		
		/*	�޼ҵ� printPuppyName�ۼ�
			�μ�����, ���Ͼ���
			"public void printPuppyName() ȣ��Ǿ����ϴ�!"���
			���������� ���
		*/
		public void printPuppyName() {
			System.out.println("public void printPuppyName() ȣ��Ǿ����ϴ�!");
			System.out.println("String : " + name + ", int : " + num);
		}
		
		
		
		/*�μ��� ���� ������ �ۼ�
			"������ public Puppy() ȣ��Ǿ����ϴ�!"���
			printPuppyName�޼ҵ� ȣ��
				�������� String��"�޸�" �Ҵ�
			�������� int�� -98998 �Ҵ�
		*/
		Puppy() {
			System.out.println("������ public Puppy() ȣ��Ǿ����ϴ�!");
			printPuppyName();
			this.name = "�޸�";
			this.num = -98998;
		}
		
}
class ConstructorExam{
	//���θ޼ҵ忡��
	public static void main(String [] agrs){
		//Puppy��ü ����
		Puppy puppy = new Puppy();
		 
		//Puppy��ü�� printPuppyName�޼ҵ� ȣ��
		puppy.printPuppyName();
		
	}
}
			
