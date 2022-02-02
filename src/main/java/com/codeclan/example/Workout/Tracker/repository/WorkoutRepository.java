package com.codeclan.example.Workout.Tracker.repository;

import com.codeclan.example.Workout.Tracker.models.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {

}
