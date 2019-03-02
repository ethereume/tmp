package pl.akademia.kurs.app.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDTO {
    private String name;
    private String ocupation;
    private double salary;

}
