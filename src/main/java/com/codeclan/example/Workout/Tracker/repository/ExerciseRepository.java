package com.codeclan.example.Workout.Tracker.repository;


import com.codeclan.example.Workout.Tracker.models.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
