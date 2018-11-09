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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getRec_reps() {
        return rec_reps;
    }

    public void setRec_reps(Integer rec_reps) {
        this.rec_reps = rec_reps;
    }

    public Integer getRec_sets() {
        return rec_sets;
    }

    public void setRec_sets(Integer rec_sets) {
        this.rec_sets = rec_sets;
    }
}
