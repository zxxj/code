package com.atguigu.inherit.exer;

public class Student extends Person{

    private double score;


    public Student() {
    }

    public Student(String name, int age, char gender, double score) {
        super(name, age, gender);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
