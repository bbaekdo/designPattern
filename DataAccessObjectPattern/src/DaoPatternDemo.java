
public class DaoPatternDemo {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoTmpl();
		
		for (Student student : studentDao.getStudents()) {
			System.out.println("Student roll no " + student.getRollNo() + " name " + student.getName());
			
		}
	
		Student student = studentDao.getStudents().get(0);
		student.setName("test");
		studentDao.updateStudent(student);
		
		
		studentDao.getStudent(0);
		System.out.println("student roll no " + student.getRollNo() + " name " + student.getName());
			
		
	}
	
}
