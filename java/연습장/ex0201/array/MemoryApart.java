class MultiArray{
	//������ 2���� �迭 8*9
	private int arr [][] = new int [8][9];
	
	//�޼ҵ��̸� :array99
	public void array99() {
		
		//for loop �� ����Ͽ� 
		//�迭�� ���� (������)�������
		int colLength = arr.length;
		for(int i = 0; i < colLength; i++) {
			int rowLength = arr[i].length;
			for(int j = 0; j < rowLength; j++)
				arr[i][j] = (i + 2) * (j + 1);
		}

		//�迭�� ����� �������
		for(int[] i : arr) {
			for (int j : i)
				System.out.print(j + "\t");
			System.out.println();
		}
	}
}
public class MemoryApart{
	//main�޼ҵ忡�� 
	//MultiArray��ü�� array99�޼ҵ�ȣ��
	public static void main(String[] args) {
		MultiArray m = new MultiArray();
		m.array99();
	}
}