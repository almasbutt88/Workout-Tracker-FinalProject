package com.codeclan.example.Workout.Tracker.repository;
import com.codeclan.example.Workout.Tracker.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository <Profile, Long> {

}
