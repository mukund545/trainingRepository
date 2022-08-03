package Com.MyApp.Details.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import Com.MyApp.Details.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	List<Student> findByStudentCourse(String studentCourse);

}
