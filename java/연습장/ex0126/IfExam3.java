class IfExam3 {
	public static void main(String [] args) {
		int randNum = (int)(Math.random() * 12) + 1;
		String str = "";
		
		if(randNum == 2)
			str = "28�ϱ��� �ֽ��ϴ�.";
		else if(randNum == 4 || randNum == 6 || randNum == 9 || randNum == 11)
			str = "30�ϱ��� �ֽ��ϴ�.";
		else
			str = "31�ϱ��� �ֽ��ϴ�.";
		
		System.out.print(randNum + "���� ");
		System.out.println(str);
		
		
	}
}