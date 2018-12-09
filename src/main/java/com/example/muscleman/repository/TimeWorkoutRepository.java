package com.example.muscleman.repository;

import com.example.muscleman.model.RepWorkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeWorkoutRepository extends JpaRepository<RepWorkout, Integer> {

}
