
class Car{
		public String carname;
		public int cost;
		
		protected void printAttributes(){
			System.out.println("carname="+carname+"\tcost="+cost);
		}
}

//Car�� ��ӹ޴� EfSonata, Excel, Carnival 3�� Ŭ���� �ۼ�	
	//�� Ŭ������ �μ��� �����ʴ� ������ �ۼ�
	//�� Ŭ������ �������� �����ο��� carname�� cost�� ������ �� �Ҵ�

class EfSonata extends Car{
	EfSonata() {
		carname = "EfSonata";
		cost = 1000;
	}
}
	
class Excel extends Car{
	Excel() {
		carname = "Excel";
		cost = 2000;
	}
}

class Carnival extends Car{
	int a = 100;
	Carnival() {
		carname = "Carnival";
		cost = 3000;
	}
}	
