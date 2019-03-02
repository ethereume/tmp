package pl.akademia.kurs.app.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import pl.akademia.kurs.app.model.Student;

import java.util.List;
import java.util.Optional;

@Repository
public interface Istudents extends JpaRepository<Student, Integer> { }
