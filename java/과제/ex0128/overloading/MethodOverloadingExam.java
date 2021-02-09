//MethodOverloadingExam.java
class OverloadedMethod{
	private int i;
	private char c;
	private String s;
       
	public void setOverload(int i){
		this.i = i;
	}
	
	public int getOverload(){
		return i;
	}

	//setOverload�� Overloading�ϼ���. ���ϵ� �ϼ���.
	public char setOverload(char cName) {
		System.out.println("setOverload char�� ����");
		c = cName;
		return c;
	}

	//setOverload�� �� Overloading �ϼ���. �� �ٸ� ������ ���� �ϼ���.
	public String setOverload(String sName) {
		System.out.println("setOverload String�� ����");
		s = sName;
		return s;
	}
	//setOverload�� �� ��Overloading �ϼ���. ���� ���ؿ�
	public void setOverload(int iNum1, int iNum2) {
		System.out.println("setOverload int�� ����");
		i = iNum1 + iNum2;
	}

	//getOverload�� Overloading�ϼ���. ���ϵ� �ϼ���.
	public char getOverload(char cName) {
		System.out.println("getOverload char�� ����");
		return cName;
	}
	//getOverload�� �� Overloading �ϼ���. �� �ٸ� ������ ���� �ϼ���.
	public String getOverload(String sName) {
		System.out.println("getOverload String�� ����");
		return sName;
	}

	//getOverload�� �� ��Overloading �ϼ���. ���� ���ؿ�
	public void getOverload(int iNum) {
		System.out.println("getOverload void�� ����");
	}
		
	
}

class  MethodOverloadingExam{
	public static void main(String [] agr){
		OverloadedMethod overloadedMethod = new OverloadedMethod();
		
		//setOverload
		overloadedMethod.setOverload(5);
		overloadedMethod.setOverload('A');
		overloadedMethod.setOverload("�ȳ�");
		overloadedMethod.setOverload(10, 20);

		//getOverload
		int iNum = overloadedMethod.getOverload();
		char cName = overloadedMethod.getOverload('B');
		String sName = overloadedMethod.getOverload("�ι�° �ȳ�");
		overloadedMethod.getOverload(10);

		//return �� ���
		System.out.println(iNum);
		System.out.println(cName);
		System.out.println(sName);
	}
}