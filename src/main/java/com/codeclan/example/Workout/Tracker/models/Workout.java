package com.codeclan.example.Workout.Tracker.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.tomcat.jni.Local;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Time;
@Entity
@Table(name = "workout")
public class Workout {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

//    @JsonFormat(pattern="HH:mm")
//    @Column(name = "starttime")
//    private LocalDateTime startTime;


    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="EEE MMM dd HH:mm Z yyyy")
    @JsonProperty("starttime")
    @Column(name = "starttime", columnDefinition = "TIME")
    private LocalTime startTime;

    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="EEE MMM dd HH:mm Z yyyy")
    @JsonProperty("endtime")
    @Column(name = "endtime")
    private LocalTime endTime;


    @Column(name = "bodyweight")
    private Double bodyWeight;

    @OneToMany(mappedBy = "workout")
    @JsonBackReference
    private List<Set> setList;

    public Workout(LocalTime startTime, Double bodyWeight){
        this.startTime = startTime;
        this.bodyWeight = bodyWeight;
    }

    public Workout(){}

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(Double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public void addSet(Set set){
        setList.add(set);


    }

    public List<Set> getSetList() {
        return setList;
    }


    public void setSetList(List<Set> set) {
        this.setList = set;
    }
}
