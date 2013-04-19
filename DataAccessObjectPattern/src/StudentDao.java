import java.util.List;


public interface StudentDao {
	public List<Student> getStudents();
	public Student  getStudent(int rollNo);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);
}
