package com.codeclan.example.Workout.Tracker.models;


import javax.persistence.*;

@Entity
@Table(name="exercise")

public class Exercise {

    @Column(name = "name")
    private String name;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "muscle_id", nullable = true)
    private Muscle muscle;

    @OneToOne(mappedBy = "exercise")
    private Set set;

    public Exercise(String name,Muscle muscle){
        this.name = name;
        this.muscle = muscle;
    }


    public Exercise(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Muscle getMuscle() {
        return muscle;
    }

    public void setMuscle(Muscle muscle) {
        this.muscle = muscle;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }
}
