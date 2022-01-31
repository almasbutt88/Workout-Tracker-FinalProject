package com.codeclan.example.Workout.Tracker.repository;

import com.codeclan.example.Workout.Tracker.models.Set;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SetRepository extends JpaRepository<Set, Long> {
}
