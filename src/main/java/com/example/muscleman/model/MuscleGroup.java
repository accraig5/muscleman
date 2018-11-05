package com.example.muscleman.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "muscle_groups")
public class MuscleGroup {


    @Id
    Integer id;

    String name;
}