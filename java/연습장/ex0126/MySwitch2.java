class MySwitch2 {
	public static void main(String [] args) {
		int randNum = (int)(Math.random() * 12) + 1;
		String str = "";
		switch(randNum){
			case 2:
				str = "28�ϱ��� �ֽ��ϴ�.";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				str = "30�ϱ��� �ֽ��ϴ�.";
				break;
			default:
				str = "31�ϱ��� �ֽ��ϴ�.";
		}
		System.out.print(randNum + "���� ");
		System.out.println(str);

		
	}
}