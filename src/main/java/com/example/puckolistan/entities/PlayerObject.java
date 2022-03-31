package com.example.puckolistan.entities;

import javax.persistence.*;

@Entity
public class PlayerObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private int age;

    @Column
    private int height;

    @Column
    private int weight;

    @Column
    private String position;

    @Column
    private String info;

    public PlayerObject(String firstName, String lastName, int age, int height, int weight, String position, String info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.position = position;
        this.info = info;
    }

    public PlayerObject(){};

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getHeightUnits() {
        String hUnit = height + " cm";
        return hUnit;
    }

    public int getWeight() {
        return weight;
    }

    public String getWeightUnits() {
        String wUnit = weight + " kg";
        return wUnit;
    }

    public String getPosition() {
        return position;
    }

    public String getInfo() {
        return info;
    }
}
