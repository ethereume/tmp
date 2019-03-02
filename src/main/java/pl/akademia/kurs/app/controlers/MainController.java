package pl.akademia.kurs.app.controlers;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.akademia.kurs.app.model.Student;
import pl.akademia.kurs.app.services.StudentsService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/student")
public class MainController {
    private StudentsService service;

    public MainController(StudentsService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return this.service.getAllStudents();
    }
    @GetMapping("/add")
    public void getIndex(){
        Student d = new Student();
        d.setSalary(3000);
        d.setName("Mateusz");
        d.setOcupation("Programista");
        this.service.saveStudent(d);
    //    return "Strona Startowa";
    }
}
