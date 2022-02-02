package com.codeclan.example.Workout.Tracker.models;


import javax.persistence.*;

@Entity
@Table(name = "set")
public class Set {

    @Column(name = "weight")
    private double weight;
    @Column(name = "rep")
    private int rep;
    @Column(name = "comment")
    private String comment;
    @Column(name = "completed")
    private boolean completed;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne()
    @JoinColumn(name = "exercise_id", referencedColumnName = "id")
    private Exercise exercise;

    @ManyToOne
    @JoinColumn(name = "workout_id", referencedColumnName = "id", nullable = true)
    private Workout workout;



    public Set(double weight, int rep, String comment, boolean completed,Exercise exercise, Workout workout) {
        this.weight = weight;
        this.rep = rep;
        this.comment = comment;
        this.completed = completed;
        this.exercise = exercise;
        this.workout = workout;
    }

    public Set() {
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getRep() {
        return rep;
    }

    public void setRep(int rep) {
        this.rep = rep;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }
}
