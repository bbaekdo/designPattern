import java.util.ArrayList;
import java.util.List;


public class StudentDaoTmpl implements StudentDao {
	List<Student> students;
	
	public StudentDaoTmpl() {
		// TODO Auto-generated constructor stub
		students = new ArrayList<Student>();
		Student student1 = new Student("Paul", 0);
		Student student2 = new Student("Pau123l", 1);
		
		students.add(student1);
		students.add(student2);
		
	}
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student roll no " + student.getRollNo() + "delete from db");
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		students.remove(student.getRollNo());
		System.out.println("Student: roll no " + student.getRollNo() + " delete from db");
	}

}
