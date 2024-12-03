package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    public Long id;
    public String name;
    public String cls;
}
