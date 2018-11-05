package com.example.muscleman.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "time_workouts")
public class TimeWorkout {


    @Id
    Integer id;

    String name;
    String description;
    String rec_time;
}
