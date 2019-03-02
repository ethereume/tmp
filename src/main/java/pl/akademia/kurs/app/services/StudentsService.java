package pl.akademia.kurs.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pl.akademia.kurs.app.dtos.StudentDTO;
import pl.akademia.kurs.app.model.Student;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsService  {

    @Autowired
    private Istudents istudents;

   /* public StudentsService() {
    }

    public StudentsService(Istudents istudents) {
        this.istudents = istudents;
    }*/

    public List<Student> getAllStudents(){
        return this.istudents.findAll();
    }
    public Student saveStudent(Student d ){
        istudents.save(d);
        return d;
    }


}
