class Methodinvoke01{
	//������ ���� �޼ҵ带 �ۼ��ϼ���.
	
	/*method �̸� : method01
	��𼭳� ������ ���ٰ���
	���� ����
	�μ��� ����2�� ����
	�μ��� ���� ���� 2���� ���ؼ� ����ϰ� ����*/
	
	public int method01(int iNum1, int iNum2) {
		int newNum = iNum1 * iNum2;
		System.out.println(newNum);
		return newNum;
	}
	
}

class Methodinvoke02{
	
	//method �̸� : method02
	//��𼭳� ������ ���ٰ���,��ü�� �������� �ʰ� ���ٰ���
	//���� ����
	//�μ��� ����2�� ����
	
	//�μ��� ���� ���� 2���� ���ؼ� ����ϰ� ���Ѽ� ����
		
	public static int method02(int iNum1, int iNum2) {
		int total = iNum1 + iNum2;
		System.out.println(total);
		return total;
	}
}

class MethodInvokeExam{
	public static void main(String []args){
		
		//MethodInvoke01�� method01 ȣ��
		Methodinvoke01 m = new Methodinvoke01();
		m.method01(3, 5);
		//MethodInvoke02�� method02 ȣ��

		Methodinvoke02.method02(4, 6);
	}
}

