package com.example.Course.Course.course;



import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
@Entity
@Data
@Table(name = "COURSE_DTLS")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    @NotEmpty
    private String name;
    @Column
    @NotEmpty
    @Min(value = 100)
    @Max(value = 500000)
    private Double price;
}
