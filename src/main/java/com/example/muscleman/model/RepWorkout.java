package com.example.muscleman.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rep_workouts")
public class RepWorkout {


    @Id
    Integer id;

    String name;
    String text;
    Integer rec_reps;
    Integer rec_sets;
}