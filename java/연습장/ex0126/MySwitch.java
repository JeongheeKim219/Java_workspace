class MySwitch {
	public static void main(String [] args) {
		int no = (int)(Math.random() * 10) + 1;
		char str = '��';
		switch(no) {
			case 1: str = '��'; break;
			case 2: str = '��'; break;
			case 3: str = 'ȭ'; break;
			case 4: str = '��'; break;
			case 5: str = '��'; break;
			case 6: str = '��'; break;
			default: break;
			
		}
		System.out.println(no);
		System.out.print(str);
	}
}