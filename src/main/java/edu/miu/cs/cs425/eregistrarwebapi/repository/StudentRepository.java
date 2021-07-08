package edu.miu.cs.cs425.eregistrarwebapi.repository;

import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
