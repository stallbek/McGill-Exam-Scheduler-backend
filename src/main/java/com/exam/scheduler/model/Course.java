package com.exam.scheduler.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "examDates")
public class Course {
    @Id
    private String id;
    private String name;
    private String building;
    private String room;
    private String rows;
    private String timeStart;
    private String timeEnd;
    private String examType;


    public Course() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuilding() {
        return this.building;
    }

    public void setBuilding(String description) {
        this.building = description;
    }

    public String getRoom() {
        return this.room;
    }

    public void setRoom(String description) {
        this.room = description;
    }

    public String getRows() {
        return this.rows;
    }

    public void setRows(String description) {
        this.rows = description;
    }


    public String getTimeStart() {
        return this.timeStart;
    }

    public void setTimeStart(String instructor) {
        this.timeStart = instructor;
    }

    public String getTimeEnd() {
        return this.timeEnd;
    }

    public void setTimeEnd(String instructor) {
        this.timeEnd = instructor;
    }

    public String getExamType() {
        return this.examType;
    }

    public void setExamType(String description) {
        this.examType = description;
    }


}
