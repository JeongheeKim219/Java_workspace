
class ArrayValue{
	//������ 10�� �����ϴ� �迭����(����� ���ÿ� ���ǰ� ����)
	int iArray[] = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


	/*printArrayValue �޼ҵ��ۼ�
       => �޼ҵ� �ȿ��� ���� ����� �迭���� ���� ����Ѵ�.
	*/
	public void printArrayValue() {
		for(int i = 0; i < iArray.length; i++)
			System.out.print(iArray[i] + " ");
	}
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue�� �ִ� printArrayValue�޼ҵ� ȣ��
		ArrayValue arrayValue = new ArrayValue();
		arrayValue.printArrayValue();
	}
}