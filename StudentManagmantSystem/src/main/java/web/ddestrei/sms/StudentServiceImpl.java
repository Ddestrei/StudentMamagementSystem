package web.ddestrei.sms;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.ddestrei.sms.Student;
import web.ddestrei.sms.StudentRepository;
import web.ddestrei.sms.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }
}
