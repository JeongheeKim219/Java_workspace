//UsingMethod.java
class UsingMethodExam{
     //�Ʒ��� ���� �޼ҵ带 �ۼ��ϼ���.

     /*Method�̸� :  methodExam03_01
     �ڱ��ڽŸ� ���ٰ���
     ReturnType : ����
     Parameter : ���� 1��
	(�����ο���)�ϴ� �� : 
	methodExam03_01�� ȣ��Ǿ����ϴ�. ���
	�μ��� ���� ���� ��� 
	����*2 ����. */

	private int methodExam03_01(int iNum) {
		System.out.println("methodExam03_01�� ȣ��Ǿ����ϴ�.");
		return iNum * 2;
	}

	////////////////////////////////////////////////////////////////

	 /*Method�̸� :  methodExam03_02
     ��𼭳� �ƹ��� ���ٰ���
     Return String
     Parameter : String 1��, ���� 1��
	(�����ο���)�ϴ� �� : 
		methodExam03_02�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� String �� �ٺ��� �ٿ��� ���
		�ι�°�μ��� ���� ���� methodExam03_01�� �־� �ָ� methodExam03_01�� ȣ���ϰ� �����ϴ� ���� ���
		�μ��� ���� String �� �ٺ��� �ٿ��� ����
	*/

	public String methodExam03_02(String sName, int iNum) {
		String newName = sName + "�ٺ�";
		System.out.println(methodExam03_01(iNum));
		return newName;
	}

	////////////////////////////////////////////////////////////////
			
	 /*Method�̸� :  methodExam03_03
     ���� package���� �ƹ��� ���� ����
     ReturnType : ���Ͼ���
     Parameter : ���� 1���� String 1��
     (�����ο���)�ϴ� �� : 
		methodExam03_03�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� ���� 1���� String 1���� �Ѱ��ָ�
		methodExam03_02ȣ��
	*/	
		
	void methodExam03_03(String sName, int iNum) {
		System.out.println("methodExam03_03�� ȣ��Ǿ����ϴ�.");
		methodExam03_02(sName, iNum);
	}

	////////////////////////////////////////////////////////////////
     
     /*Method�̸� :  methodExam03_04
     ��Ӱ����� ��𼭳� ���� ����
     ReturnType : �Ǽ�(�ε��Ҽ���)
     Parameter : ù��° �μ�(����),�ι�° �μ�(�Ǽ�), ����°�μ�(����)
	(�����ο���)�ϴ� �� : 
		methodExam03_04�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� ���� �̿��� 
		MakeMethodExam02��ü�� methodExam02_04�޼ҵ� ȣ���ϰ�
		method02_04�� �����ϴ� ���� ����
	*/	

	protected float methodExam03_04(int iNum1, float fNum, int iNum2) {
		System.out.println("methodExam03_04�� ȣ��Ǿ����ϴ�.");
		MakeMethodExam02 m = new MakeMethodExam02();
		float newNum = m.methodExam02_04(iNum1, fNum, iNum2);
		System.out.println(newNum);
		return newNum;
	}

	////////////////////////////////////////////////////////////////
		
} // UsingMethodExam ��

class UsingMethod{
	//���θ޼ҵ忡��
		//UsingMethodExam�� ȣ�Ⱑ���� �޼ҵ���� ȣ���ϰ�
		// �����ϴ� �� �ִٸ� ���
	public static void main(String [] args) {

		UsingMethodExam m = new UsingMethodExam();
		//m.methodExam03_01(10);
		m.methodExam03_02("�赿��", 20);
		m.methodExam03_03("�赿��", 30);
		m.methodExam03_04(3, 3.5f, 4);
	}
}

  
