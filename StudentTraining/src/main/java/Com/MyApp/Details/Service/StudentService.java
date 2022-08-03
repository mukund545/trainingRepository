package Com.MyApp.Details.Service;

import java.util.List;

import Com.MyApp.Details.Entity.Student;

public interface StudentService {

	Student saveStudent(Student student);

	List<Student> fetchStudentByCourse(String studentCourse);

	void removeStudentById(int studentId);

	

}

