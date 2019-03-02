package pl.akademia.kurs.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tstudent")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tname")
    private String name;
    @Column(name = "tocupation")
    private String ocupation;
    @Column(name = "tsalary")
    private double salary;
}
