package com.example.muscleman.repository;

import com.example.muscleman.model.UserRepWorkout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepWorkoutRepository extends JpaRepository<UserRepWorkout, Integer> {
}
