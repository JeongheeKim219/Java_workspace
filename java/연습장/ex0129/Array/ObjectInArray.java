//ObjectInArray.java

class ObjectOne{
	public int a;
}

public class ObjectInArray{
	//���� �޼ҵ忡��
	public static void main(String[] args) {

		//ObjectOne Ÿ���� 5�� ���� �����ϴ� �迭�� �����ϰ�
		ObjectOne [] objectOne = new ObjectOne [5];
		
		//5���� ObjectOne��ü�� �����ϼ���.
		for(int i = 0; i < 5; i++) 
			objectOne[i] = new ObjectOne();
		
		//�� ��ü�� �����ִ� �������� ���
		for(ObjectOne ob : objectOne) {
			System.out.print(ob.a + " ");
		}

		System.out.println();

		//�� ��ü�� �ּҰ� ���
		for(ObjectOne ob : objectOne) {
			System.out.print(ob + " ");
		}

		System.out.println();

		//������ ObjectOne��ü�� ���� �ٸ� a�� ���� ������ a�� ���� �����ϼ���.			
		//�� ObjectOne ��ü�� a�� ����ϼ���
		int cnt = 1;
		for(ObjectOne ob : objectOne) {
			ob.a = cnt++;
			System.out.print(ob.a + " ");
		}
	}	
}