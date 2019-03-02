package pl.akademia.kurs.app.mapper;

import pl.akademia.kurs.app.dtos.StudentDTO;
import pl.akademia.kurs.app.model.Student;

public class StudentMapperImpl implements StudentMapper<Student, StudentDTO> {
    @Override
    public StudentDTO map(Student from) {
        return  StudentDTO.builder()
                .name(from.getName())
                .ocupation(from.getOcupation())
                .salary(from.getSalary())
                .build();
    }
}
