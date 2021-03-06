package com.codeclan.example.Workout.Tracker.repository;

import com.codeclan.example.Workout.Tracker.models.Muscle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuscleRepository extends JpaRepository<Muscle, Long> {
}
