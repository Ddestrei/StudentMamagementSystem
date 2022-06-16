package web.ddestrei.sms;

import org.springframework.stereotype.Service;
import web.ddestrei.sms.Student;

import java.util.List;
public interface StudentService {
    List<Student>  getAllStudents();

    Student saveStudent(Student student);

     Student updateStudent(Student student);

     Student getStudentById(Long id);

     void deleteStudent(Student student);
}
