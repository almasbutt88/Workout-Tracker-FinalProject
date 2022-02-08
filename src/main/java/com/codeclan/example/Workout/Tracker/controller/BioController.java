package com.codeclan.example.Workout.Tracker.controller;


import com.codeclan.example.Workout.Tracker.models.Muscle;
import com.codeclan.example.Workout.Tracker.models.Profile;
import com.codeclan.example.Workout.Tracker.repository.MuscleRepository;
import com.codeclan.example.Workout.Tracker.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    ProfileRepository profileRepository;

    @GetMapping(value = "/profile")
    public ResponseEntity<List<Profile>> getProfile() {
        return new ResponseEntity<>(profileRepository.findAll(), HttpStatus.OK);
    }
    }

//    @GetMapping(value = "/profile/{id}")
//    public ResponseEntity getProfile(@PathVariable Long id){
//        return new ResponseEntity<>(profileRepository.findById(id), HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/profile")
//    public ResponseEntity<Profile> postProfile(@RequestBody Profile profile){
//        profileRepository.save(profile);
//        return new ResponseEntity<>(profile, HttpStatus.CREATED);
//    }

