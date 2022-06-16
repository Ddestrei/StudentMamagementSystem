package web.ddestrei.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MainApplicacion implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(MainApplicacion.class,args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student("Patryk","Grys","email");
        studentRepository.save(student1);
        Student student2 = new Student("Andrzej","Grys","email");
        studentRepository.save(student2);
        Student student3 = new Student("Patryk2","Grys2","email2");
        studentRepository.save(student3);
        Student student4 = new Student("Patryk3","Grys3","email3");
        studentRepository.save(student4);
        Student student5 = new Student("Patryk4","Grys4","email4");
        studentRepository.save(student5);

    }
}
