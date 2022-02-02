package com.codeclan.example.Workout.Tracker.components;

import com.codeclan.example.Workout.Tracker.models.Exercise;
import com.codeclan.example.Workout.Tracker.models.Muscle;
import com.codeclan.example.Workout.Tracker.models.Set;
import com.codeclan.example.Workout.Tracker.models.Workout;
import com.codeclan.example.Workout.Tracker.models.Profile;
import com.codeclan.example.Workout.Tracker.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MuscleRepository muscleRepository;

    @Autowired
    ExerciseRepository exerciseRepository;

    @Autowired
    SetRepository setRepository;

    @Autowired
    WorkoutRepository workoutRepository;

    @Autowired
    ProfileRepository profileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Muscle abs = new Muscle("Abs");
        muscleRepository.save(abs);

        Muscle back = new Muscle("Back");
        muscleRepository.save(back);

        Muscle chest = new Muscle("Chest");
        muscleRepository.save(chest);

        Muscle biceps = new Muscle("Biceps");
        muscleRepository.save(biceps);

        Muscle triceps = new Muscle("Triceps");
        muscleRepository.save(triceps);

        Muscle legs = new Muscle("Legs");
        muscleRepository.save(legs);

        Muscle shoulders = new Muscle("Shoulders");
        muscleRepository.save(shoulders);

        Muscle cardio = new Muscle("Cardio");
        muscleRepository.save(cardio);

        Exercise abCrunch = new Exercise("Ab Crunch",abs);
        exerciseRepository.save(abCrunch);

        Exercise abTwist = new Exercise("Ab Twist",abs);
        exerciseRepository.save(abTwist);






        Workout testWorkout = new Workout(LocalTime.now(), 88.00);
        workoutRepository.save(testWorkout);
        Set testSet = new Set(10,5,"Test comment",true,abTwist, testWorkout);
        setRepository.save(testSet);

        Workout testWorkout2 = new Workout(LocalTime.now(), 88.00);
        Set testSet3 = new Set(10,5,"Test comment",true,abTwist, testWorkout);
        setRepository.save(testSet3);
        workoutRepository.save(testWorkout2);

        Profile almas = new Profile("Almas", 33, 103.5);
        profileRepository.save(almas);

//        System.out.println("Set Info: Comment" + testSet.getComment()
//                + " ExerciseInfo: " + testSet.getExercise().getName()
//                + " MuscleGroupInfo: " + testSet.getExercise().getMuscle().getName());
//
        Exercise plank = new Exercise("Plank", abs);
        exerciseRepository.save(plank);

        Exercise sidePlank = new Exercise("Side Plank", abs);
        exerciseRepository.save(sidePlank);

        Exercise mountainClimber = new Exercise("Mountain Climber", abs);
        exerciseRepository.save(mountainClimber);

        Exercise legRaise = new Exercise("Leg Raise", abs);
        exerciseRepository.save(legRaise);

        Exercise kneeRaise = new Exercise("Knee Raise", abs);
        exerciseRepository.save(kneeRaise);

        Exercise abWheelRollout = new Exercise("Ab Wheel Rollout", abs);
        exerciseRepository.save(abWheelRollout);

        Exercise cableCrunch = new Exercise("Cable Crunch", abs);
        exerciseRepository.save(cableCrunch);

        Exercise barbellCurl = new Exercise("Barbell Curl", biceps);
        exerciseRepository.save(barbellCurl);

        Exercise cableCurl = new Exercise("Cable Curl", biceps);
        exerciseRepository.save(cableCurl);

        Exercise dbCurl = new Exercise("DB Curl", biceps);
        exerciseRepository.save(dbCurl);

        Exercise preacherCurl = new Exercise("Preacher Curl", biceps);
        exerciseRepository.save(preacherCurl);

        Exercise ezCurl = new Exercise("EZ Curl", biceps);
        exerciseRepository.save(ezCurl);

        Exercise ropeCurl = new Exercise("Rope Curl", biceps);
        exerciseRepository.save(ropeCurl);

        Exercise wristCurl = new Exercise("Wrist Curl", biceps);
        exerciseRepository.save(wristCurl);

        Exercise seatedInclineDbCurl = new Exercise("Seated Incline DB Curl", biceps);
        exerciseRepository.save(seatedInclineDbCurl);

        Exercise benchDip = new Exercise("Bench Dip", triceps);
        exerciseRepository.save(benchDip);

        Exercise overheadDbExtension = new Exercise("Overhead DB Extension", triceps);
        exerciseRepository.save(overheadDbExtension);

        Exercise cablePushdown = new Exercise("Cable Pushdown", triceps);
        exerciseRepository.save(cablePushdown);

        Exercise skullCrushers = new Exercise("Skull Crushers", triceps);
        exerciseRepository.save(skullCrushers);

        Exercise dbKickback = new Exercise("DB Kickback", triceps);
        exerciseRepository.save(dbKickback);

        Exercise ringDip = new Exercise("Ring Dip", triceps);
        exerciseRepository.save(ringDip);

        Exercise vbarPushdown = new Exercise("V-bar Pushdown", triceps);
        exerciseRepository.save(vbarPushdown);

        Exercise barbellBoxSteps = new Exercise("Barbell Box Step", legs);
        exerciseRepository.save(barbellBoxSteps);

        Exercise calfRaise = new Exercise("Calf Raise", legs);
        exerciseRepository.save(calfRaise);

        Exercise barbellFrontSquat = new Exercise("Barbell Front Squat", legs);
        exerciseRepository.save(barbellFrontSquat);

        Exercise barbellGluteBridge = new Exercise("Barbell Glute Bridge", legs);
        exerciseRepository.save(barbellGluteBridge);

        Exercise barbellOneLeggedSquat = new Exercise("Barbell One-Legged Squat", legs);
        exerciseRepository.save(barbellOneLeggedSquat);

        Exercise donkeyCalfRaise = new Exercise("Donkey Calf Raise", legs);
        exerciseRepository.save(donkeyCalfRaise);

        Exercise inclineLegPress = new Exercise("Incline Leg Press", legs);
        exerciseRepository.save(inclineLegPress);

        Exercise legPress = new Exercise("Leg Press", legs);
        exerciseRepository.save(legPress);

        Exercise linearHackPress = new Exercise("Linear Hack Press", legs);
        exerciseRepository.save(linearHackPress);

        Exercise walkingLunge = new Exercise("Walking Lunge", legs);
        exerciseRepository.save(walkingLunge);

        Exercise stationaryLunge = new Exercise("Stationary Lunge", legs);
        exerciseRepository.save(stationaryLunge);

        Exercise romanianDeadlift = new Exercise("Romanian Deadlift", legs);
        exerciseRepository.save(romanianDeadlift);

        Exercise seatedCalfRaise = new Exercise("Seated Calf Raise",legs);
        exerciseRepository.save(seatedCalfRaise);

        Exercise standingCalfRaise = new Exercise("Standing Calf Raise" ,legs);
        exerciseRepository.save(standingCalfRaise);

        Exercise stepUp = new Exercise("Step Up",legs);
        exerciseRepository.save(stepUp);

        Exercise stiffLeggedDeadlift = new Exercise("Stiff Legged Deadlift",legs);
        exerciseRepository.save(stiffLeggedDeadlift);

        Exercise sumoDeadlift = new Exercise("Sumo Deadlift",legs);
        exerciseRepository.save(sumoDeadlift);

        Exercise alternatingDbPress = new Exercise("Alternating DB Press", shoulders);
        exerciseRepository.save(alternatingDbPress);

        Exercise arnoldPress = new Exercise("Arnold Press", shoulders);
        exerciseRepository.save(arnoldPress);

        Exercise barbellShrug = new Exercise("Barbell Shrug", shoulders);
        exerciseRepository.save(barbellShrug);

        Exercise cableFacePull = new Exercise("Cable Face Pull", shoulders);
        exerciseRepository.save(cableFacePull);

        Exercise cableShrug = new Exercise("Cable Shrug", shoulders);
        exerciseRepository.save(cableShrug);

        Exercise cableLatRaise = new Exercise("Cable Lat Raise", shoulders);
        exerciseRepository.save(cableLatRaise);

        Exercise cleanAndJerk = new Exercise("Clean And Jerk", shoulders);
        exerciseRepository.save(cleanAndJerk);

        Exercise linearMachinePress = new Exercise("Linear Machine Press", shoulders);
        exerciseRepository.save(linearMachinePress);

        Exercise dbShrug = new Exercise("DB Shrug", shoulders);
        exerciseRepository.save(dbShrug);

        Exercise fletcherPress = new Exercise("Fletcher Press", shoulders);
        exerciseRepository.save(fletcherPress);

        Exercise frontDbRaise = new Exercise("Front DB Raise", shoulders);
        exerciseRepository.save(frontDbRaise);

        Exercise frontPlateRaise = new Exercise("Front Plate Raise", shoulders);
        exerciseRepository.save(frontPlateRaise);

        Exercise frontEzRaise = new Exercise("Front EZ Raise", shoulders);
        exerciseRepository.save(frontEzRaise);

        Exercise hexBarShrug = new Exercise("Hex Bar Shrug", shoulders);
        exerciseRepository.save(hexBarShrug);

        Exercise latDbRaise = new Exercise("Lat DB Raise", shoulders);
        exerciseRepository.save(latDbRaise);

        Exercise latMachineRaise = new Exercise("Lat Machine Raise", shoulders);
        exerciseRepository.save(latMachineRaise);

        Exercise logPress = new Exercise("Log Press", shoulders);
        exerciseRepository.save(logPress);

        Exercise machineShrug = new Exercise("Machine Shrug", shoulders);
        exerciseRepository.save(machineShrug);

        Exercise militaryPress = new Exercise("Military Press", shoulders);
        exerciseRepository.save(militaryPress);

        Exercise seatedBarbellPress= new Exercise("Seated Barbell Press", shoulders);
        exerciseRepository.save(seatedBarbellPress);

        Exercise smithMachinePress = new Exercise("Smith Machine Press", shoulders);
        exerciseRepository.save(smithMachinePress);

        Exercise landminePress = new Exercise("landminePress", shoulders);
        exerciseRepository.save(landminePress);

        Exercise neckRow = new Exercise("Neck Row", shoulders);
        exerciseRepository.save(neckRow);

        Exercise battleRope = new Exercise("Battle Rope", cardio);
        exerciseRepository.save(battleRope);

        Exercise cycle = new Exercise("Cycle", cardio);
        exerciseRepository.save(cycle);

        Exercise ellipticalTrainer = new Exercise("Elliptical Trainer", cardio);
        exerciseRepository.save(ellipticalTrainer);

        Exercise sledPush = new Exercise("Sled Push", cardio);
        exerciseRepository.save(sledPush);

        Exercise kettlebellSwing = new Exercise("Kettlebell Swing", cardio);
        exerciseRepository.save(kettlebellSwing);

        Exercise ropeSkip = new Exercise("Rope Skip", cardio);
        exerciseRepository.save(ropeSkip);

        Exercise outdoorRun = new Exercise("Outdoor Run", cardio);
        exerciseRepository.save(outdoorRun);

        Exercise  treadmillRun= new Exercise("Treadmill Run", cardio);
        exerciseRepository.save(treadmillRun);

        Exercise sprint = new Exercise("Sprint", cardio);
        exerciseRepository.save(sprint);

        Exercise stairmaster = new Exercise("Stairmaster", cardio);
        exerciseRepository.save(stairmaster);

        Exercise swim = new Exercise("Swim", cardio);
        exerciseRepository.save(swim);

        Exercise walk = new Exercise("walk", cardio);
        exerciseRepository.save(walk);

        Exercise barbellRow = new Exercise("Barbell Row", back);
        exerciseRepository.save(barbellRow);

        Exercise dbRow = new Exercise("DB Row", back);
        exerciseRepository.save(dbRow);

        Exercise divergingPulldown = new Exercise("Divering Pulldown", back);
        exerciseRepository.save(divergingPulldown);

        Exercise benchRow = new Exercise("Bench Row", back);
        exerciseRepository.save(benchRow);

        Exercise goodMorning = new Exercise("Good Morning", back);
        exerciseRepository.save(goodMorning);

        Exercise hammerStrengthRow = new Exercise("Hammer Strength Row", back);
        exerciseRepository.save(hammerStrengthRow);

        Exercise inclineBenchRow = new Exercise("Incline Bench Row", back);
        exerciseRepository.save(inclineBenchRow);

        Exercise latPulldown = new Exercise("Lat Pulldown", back);
        exerciseRepository.save(latPulldown);

        Exercise  dbPullover= new Exercise("DB Pullover", back);
        exerciseRepository.save(dbPullover);

        Exercise pullUp = new Exercise("Pull Up", back);
        exerciseRepository.save(pullUp);

        Exercise rackPull = new Exercise("Rack Pull", back);
        exerciseRepository.save(rackPull);

        Exercise reverseCableFly = new Exercise("Reverse Cable Fly", back);
        exerciseRepository.save(reverseCableFly);

        Exercise reverseDbFly = new Exercise("Reverse DB Fly", back);
        exerciseRepository.save(reverseDbFly);

        Exercise underhandLatPulldown = new Exercise("Underhand Lat Pulldown", back);
        exerciseRepository.save(underhandLatPulldown);

        Exercise tbarRow = new Exercise("T-Bar Row", back);
        exerciseRepository.save(tbarRow);

        Exercise wallClimb = new Exercise("Wall Climb", back);
        exerciseRepository.save(wallClimb);

        Exercise wideGripLatPulldown = new Exercise("Wide Grip Lat Pulldown", back);
        exerciseRepository.save(wideGripLatPulldown);



    }



    }