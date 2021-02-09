import java.util.Scanner;

//�л��� ������ ���, ����, ��ȸ ����� ����ϴ� ��ü
class StudentService {
	
	private Student [] stArr = new Student [10];
	public static int count;

	//�ʱ� ������ ����
	public void init(String [][] data) {
		int cnt = 0;
		for(String [] s : data) {
			stArr[cnt++] = create(s);
			count++;
		}
	}
	
	private Student create(String [] data) {
		Student student = new Student();
		student.setSno(Integer.parseInt(data[0]));
		student.setName(data[1]);
		student.setAge(Integer.parseInt(data[2]));
		student.setAddr(data[3]);
		return student;
	}
	
	//���
	public boolean insert(Student student) {

		if(this.searchBySno(student.getSno()) != null) {
			return false;
		}

		if(count == stArr.length) {
			return false;
		}

		stArr[count] = student;
		count++;
		return true;
	}

	
	//��ü��ȸ
	public Student [] selectAll() {
		return stArr;
	}
	
	
	//�й��� �ش��ϴ� ���� ��ȸ
	public Student searchBySno(int sno) {
		for(int i = 0; i < count; i++)
			if(stArr[i].getSno() == sno) 
				return stArr[i];
		return null;
	}
	
	//�й��� �ش��ϴ� ������ ����(�̸�, ����)
	//�μ��� ���޵� �й��� ��ġ�ϴ� ���� ã�� ������ �μ� ���޵� �̸�, ���̷� �����ϰ� �� ã���� false
	public boolean update(Student student) {
		Student st = new Student();
		st = searchBySno(student.getSno());
		if(student != null) {
			st.setName(student.getName());
			st.setAge(student.getAge());
			return true;
		} else
			return false;
	}
}