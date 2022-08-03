package Com.MyApp.Details.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.MyApp.Details.Entity.Student;
import Com.MyApp.Details.Repository.StudentRepository;
import Com.MyApp.Details.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> fetchStudentByCourse(String studentCourse) {
		
		return studentRepository.findByStudentCourse(studentCourse);
	}

	@Override
	public void removeStudentById(int studentId) {
		
		studentRepository.deleteById(studentId);
	}

}
