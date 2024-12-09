package org.example.domain;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "student_table")
@Entity(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long id;
    @Column(unique = true)
    public String name;
    public String cls;

    @Temporal(TemporalType.DATE)
    public Date birthdate;

    public Student(String name, String cls,Date birthdate) {
        this.name = name;
        this.cls = cls;
        this.birthdate = birthdate;
    }

}
