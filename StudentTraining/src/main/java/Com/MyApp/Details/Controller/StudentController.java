package Com.MyApp.Details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.MyApp.Details.Entity.Student;
import Com.MyApp.Details.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping
	public Student addEmployee(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
	}

	@GetMapping("/{studentCourse}")
	public List<Student> getStudentByCourse(@PathVariable String studentCourse )
	{
		return studentService.fetchStudentByCourse(studentCourse);
	}

	@DeleteMapping("/{StudentId}")
	public void deleteStudentById(@PathVariable int StudentId )
	{
		studentService.removeStudentById(StudentId);
	}



}
