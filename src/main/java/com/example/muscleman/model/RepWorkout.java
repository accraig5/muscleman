package com.example.muscleman.model;

import javax.persistence.Column;
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

    @Column(name = "rec_reps")
    Integer recReps;

    @Column(name = "rec_sets")
    Integer recSets;

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

    public Integer getRecReps() {
        return recReps;
    }

    public void setRecReps(Integer recReps) {
        this.recReps = recReps;
    }

    public Integer getRecSets() {
        return recSets;
    }

    public void setRecSets(Integer recSets) {
        this.recSets = recSets;
    }
}
