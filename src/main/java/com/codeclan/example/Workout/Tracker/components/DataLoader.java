package com.codeclan.example.Workout.Tracker.components;

import com.codeclan.example.Workout.Tracker.models.Exercise;
import com.codeclan.example.Workout.Tracker.models.Muscle;
import com.codeclan.example.Workout.Tracker.models.Set;
import com.codeclan.example.Workout.Tracker.repository.ExerciseRepository;
import com.codeclan.example.Workout.Tracker.repository.MuscleRepository;
import com.codeclan.example.Workout.Tracker.repository.SetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MuscleRepository muscleRepository;


    @Autowired
    ExerciseRepository exerciseRepository;

    @Autowired
    SetRepository setRepository;

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

        Exercise abCrunch = new Exercise("Ab Crunch",abs);
        exerciseRepository.save(abCrunch);

        Exercise abTwist = new Exercise("Ab Twist",abs);
        exerciseRepository.save(abTwist);

        Set testSet = new Set(10,5,"Test comment",true,abTwist);
        setRepository.save(testSet);

        System.out.println("Set Info: Comment" + testSet.getComment()
                + " ExerciseInfo: " + testSet.getExercise().getName()
                + " MuscleGroupInfo: " + testSet.getExercise().getMuscle().getName());
//
//        Exercise plank = new Exercise("Plank");
//        exerciseRepository.save(plank);
//
//        Exercise sidePlank = new Exercise("Side Plank");
//        exerciseRepository.save(sidePlank);
//
//        Exercise mountainClimber = new Exercise("Mountain Climber");
//        exerciseRepository.save(mountainClimber);
//
//        Exercise legRaise = new Exercise("Leg Raise");
//        exerciseRepository.save(legRaise);
//
//        Exercise kneeRaise = new Exercise("Knee Raise");
//        exerciseRepository.save(kneeRaise);
//
//        Exercise abWheelRollout = new Exercise("Ab Wheel Rollout");
//        exerciseRepository.save(abWheelRollout);
//
//        Exercise cableCrunch = new Exercise("Cable Crunch");
//        exerciseRepository.save(cableCrunch);
//
//        Exercise barbellCurl = new Exercise("Barbell Curl");
//        exerciseRepository.save(barbellCurl);
//
//        Exercise cableCurl = new Exercise("Cable Curl");
//        exerciseRepository.save(cableCurl);
//
//        Exercise dbCurl = new Exercise("DB Curl");
//        exerciseRepository.save(dbCurl);
//
//        Exercise preacherCurl = new Exercise("Preacher Curl");
//        exerciseRepository.save(preacherCurl);
//
//        Exercise ezCurl = new Exercise("EZ Curl");
//        exerciseRepository.save(ezCurl);
//
//        Exercise ropeCurl = new Exercise("Rope Curl");
//        exerciseRepository.save(ropeCurl);
//
//        Exercise wristCurl = new Exercise("Wrist Curl");
//        exerciseRepository.save(wristCurl);
//
//        Exercise seatedInclineDbCurl = new Exercise("Seated Incline DB Curl");
//        exerciseRepository.save(seatedInclineDbCurl);
//
//        Exercise benchDip = new Exercise("Bench Dip");
//        exerciseRepository.save(benchDip);
//
//        Exercise overheadDbExtension = new Exercise("Overhead DB Extension");
//        exerciseRepository.save(overheadDbExtension);
//
//        Exercise cablePushdown = new Exercise("Cable Pushdown");
//        exerciseRepository.save(cablePushdown);
//
//        Exercise skullCrushers = new Exercise("Skull Crushers");
//        exerciseRepository.save(skullCrushers);
//
//        Exercise dbKickback = new Exercise("DB Kickback");
//        exerciseRepository.save(dbKickback);
//
//        Exercise ringDip = new Exercise("Ring Dip");
//        exerciseRepository.save(ringDip);
//
//        Exercise vbarPushdown = new Exercise("V-bar Pushdown");
//        exerciseRepository.save(vbarPushdown);
//
//        Exercise barbellBoxSteps = new Exercise("Barbell Box Step");
//        exerciseRepository.save(barbellBoxSteps);
//
//        Exercise calfRaise = new Exercise("Calf Raise");
//        exerciseRepository.save(calfRaise);
//
//        Exercise barbellFrontSquat = new Exercise("Barbell Front Squat");
//        exerciseRepository.save(barbellFrontSquat);
//
//        Exercise barbellGluteBridge = new Exercise("Barbell Glute Bridge");
//        exerciseRepository.save(barbellGluteBridge);
//
//        Exercise barbellOneLeggedSquat = new Exercise("Barbell One-Legged Squat");
//        exerciseRepository.save(barbellOneLeggedSquat);
//
//        Exercise donkeyCalfRaise = new Exercise("Donkey Calf Raise");
//        exerciseRepository.save(donkeyCalfRaise);
//
//        Exercise inclineLegPress = new Exercise("Incline Leg Press");
//        exerciseRepository.save(inclineLegPress);
//
//        Exercise legPress = new Exercise("Leg Press");
//        exerciseRepository.save(legPress);
//
//        Exercise linearHackPress = new Exercise("Linear Hack Press");
//        exerciseRepository.save(linearHackPress);
//
//        Exercise walkingLunge = new Exercise("Walking Lunge");
//        exerciseRepository.save(walkingLunge);
//
//        Exercise stationaryLunge = new Exercise("Stationary Lunge");
//        exerciseRepository.save(stationaryLunge);
//
//        Exercise romanianDeadlift = new Exercise("Romanian Deadlift");
//        exerciseRepository.save(romanianDeadlift);
//
//        Exercise seatedCalfRaise = new Exercise("Seated Calf Raise");
//        exerciseRepository.save(seatedCalfRaise);
//
//        Exercise standingCalfRaise = new Exercise("Standing Calf Raise");
//        exerciseRepository.save(standingCalfRaise);
//
//        Exercise stepUp = new Exercise("Step Up");
//        exerciseRepository.save(stepUp);
//
//        Exercise stiffLeggedDeadlift = new Exercise("Stiff Legged Deadlift");
//        exerciseRepository.save(stiffLeggedDeadlift);
//
//        Exercise sumoDeadlift = new Exercise("Sumo Deadlift");
//        exerciseRepository.save(sumoDeadlift);
//
//        Exercise alternatingDbPress = new Exercise("Alternating DB Press");
//        exerciseRepository.save(alternatingDbPress);
//
//        Exercise arnoldPress = new Exercise("Arnold Press");
//        exerciseRepository.save(arnoldPress);
//
//        Exercise barbellShrug = new Exercise("Barbell Shrug");
//        exerciseRepository.save(barbellShrug);
//
//        Exercise cableFacePull = new Exercise("Cable Face Pull");
//        exerciseRepository.save(cableFacePull);
//
//        Exercise cableShrug = new Exercise("Cable Shrug");
//        exerciseRepository.save(cableShrug);
//
//        Exercise cableLatRaise = new Exercise("Cable Lat Raise");
//        exerciseRepository.save(cableLatRaise);
//
//        Exercise cleanAndJerk = new Exercise("Clean And Jerk");
//        exerciseRepository.save(cleanAndJerk);
//
//        Exercise linearMachinePress = new Exercise("Linear Machine Press");
//        exerciseRepository.save(linearMachinePress);
//
//        Exercise dbShrug = new Exercise("DB Shrug");
//        exerciseRepository.save(dbShrug);
//
//        Exercise fletcherPress = new Exercise("Fletcher Press");
//        exerciseRepository.save(fletcherPress);
//
//        Exercise frontDbRaise = new Exercise("Front DB Raise");
//        exerciseRepository.save(frontDbRaise);
//
//        Exercise frontPlateRaise = new Exercise("Front Plate Raise");
//        exerciseRepository.save(frontPlateRaise);
//
//        Exercise frontEzRaise = new Exercise("Front EZ Raise");
//        exerciseRepository.save(frontEzRaise);
//
//        Exercise hexBarShrug = new Exercise("Hex Bar Shrug");
//        exerciseRepository.save(hexBarShrug);
//
//        Exercise latDbRaise = new Exercise("Lat DB Raise");
//        exerciseRepository.save(latDbRaise);
//
//        Exercise latMachineRaise = new Exercise("Lat Machine Raise");
//        exerciseRepository.save(latMachineRaise);
//
//        Exercise logPress = new Exercise("Log Press");
//        exerciseRepository.save(logPress);
//
//        Exercise machineShrug = new Exercise("Machine Shrug");
//        exerciseRepository.save(machineShrug);
//
//        Exercise militaryPress = new Exercise("Military Press");
//        exerciseRepository.save(militaryPress);
//
//        Exercise seatedBarbellPress= new Exercise("Seated Barbell Press");
//        exerciseRepository.save(seatedBarbellPress);
//
//        Exercise smithMachinePress = new Exercise("Smith Machine Press");
//        exerciseRepository.save(smithMachinePress);
//
//        Exercise landminePress = new Exercise("landminePress");
//        exerciseRepository.save(landminePress);
//
//        Exercise neckRow = new Exercise("Neck Row");
//        exerciseRepository.save(neckRow);
//
//        Exercise battleRope = new Exercise("Battle Rope");
//        exerciseRepository.save(battleRope);
//
//        Exercise cycle = new Exercise("Cycle");
//        exerciseRepository.save(cycle);
//
//        Exercise ellipticalTrainer = new Exercise("Elliptical Trainer");
//        exerciseRepository.save(ellipticalTrainer);
//
//        Exercise sledPush = new Exercise("Sled Push");
//        exerciseRepository.save(sledPush);
//
//        Exercise kettlebellSwing = new Exercise("Kettlebell Swing");
//        exerciseRepository.save(kettlebellSwing);
//
//        Exercise ropeSkip = new Exercise("Rope Skip");
//        exerciseRepository.save(ropeSkip);
//
//        Exercise outdoorRun = new Exercise("Outdoor Run");
//        exerciseRepository.save(outdoorRun);
//
//        Exercise  treadmillRun= new Exercise("Treadmill Run");
//        exerciseRepository.save(treadmillRun);
//
//        Exercise sprint = new Exercise("Sprint");
//        exerciseRepository.save(sprint);
//
//        Exercise stairmaster = new Exercise("Stairmaster");
//        exerciseRepository.save(stairmaster);
//
//        Exercise swim = new Exercise("Swim");
//        exerciseRepository.save(swim);
//
//        Exercise walk = new Exercise("walk");
//        exerciseRepository.save(walk);
//
//        Exercise barbellRow = new Exercise("Barbell Row");
//        exerciseRepository.save(barbellRow);
//
//        Exercise dbRow = new Exercise("DB Row");
//        exerciseRepository.save(dbRow);
//
//        Exercise divergingPulldown = new Exercise("Divering Pulldown");
//        exerciseRepository.save(divergingPulldown);
//
//        Exercise benchRow = new Exercise("Bench Row");
//        exerciseRepository.save(benchRow);
//
//        Exercise goodMorning = new Exercise("Good Morning");
//        exerciseRepository.save(goodMorning);
//
//        Exercise hammerStrengthRow = new Exercise("Hammer Strength Row");
//        exerciseRepository.save(hammerStrengthRow);
//
//        Exercise inclineBenchRow = new Exercise("Incline Bench Row");
//        exerciseRepository.save(inclineBenchRow);
//
//        Exercise latPulldown = new Exercise("Lat Pulldown");
//        exerciseRepository.save(latPulldown);
//
//        Exercise  dbPullover= new Exercise("DB Pullover");
//        exerciseRepository.save(dbPullover);
//
//        Exercise pullUp = new Exercise("Pull Up");
//        exerciseRepository.save(pullUp);
//
//        Exercise rackPull = new Exercise("Rack Pull");
//        exerciseRepository.save(rackPull);
//
//        Exercise reverseCableFly = new Exercise("Reverse Cable Fly");
//        exerciseRepository.save(reverseCableFly);
//
//        Exercise reverseDbFly = new Exercise("Reverse DB Fly");
//        exerciseRepository.save(reverseDbFly);
//
//        Exercise underhandLatPulldown = new Exercise("Underhand Lat Pulldown");
//        exerciseRepository.save(underhandLatPulldown);
//
//        Exercise tbarRow = new Exercise("T-Bar Row");
//        exerciseRepository.save(tbarRow);
//
//        Exercise wallClimb = new Exercise("Wall Climb");
//        exerciseRepository.save(wallClimb);
//
//        Exercise wideGripLatPulldown = new Exercise("Wide Grip Lat Pulldown");
//        exerciseRepository.save(wideGripLatPulldown);



    }



    }