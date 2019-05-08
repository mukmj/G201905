package d0508;

public interface Main11Interface {
	
	//4개 기능 추상 메소드로 선언한다.
	public boolean 학생추가(student stu);
	public student 학생검색(String name);
	public boolean 학생수정(student stu);
	public boolean 학생삭제(student stu);
}
