package web.ddestrei.sms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
