

//�л��� ������ ����, ��ȸ, ���� ��ü
//(�й�, �̸�, ����, �ּ�)
//private���� ���������Ͽ� set, get �޼ҵ带 ����Ѵ�.
class Student {
	private int sno;
	private String name;
	private int age;
	private String addr;

	Student () {}

	Student (int sno, String name, int age) {
		this.sno = sno;
		this.name = name;
		this.age = age;
	}

	Student (int sno, String name, int age, String addr) {
		this(sno, name, age);
		this.addr = addr;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}
}