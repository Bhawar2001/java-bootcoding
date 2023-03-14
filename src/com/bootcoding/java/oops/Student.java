package com.bootcoding.java.oops;

import jdk.jfr.Percentage;

import java.util.Random;

public class Student { //class
    String name;
    int rollNo;
    int physicalMarks;
    int chemistryMarks;
    int mathMarks;
    double avgeMarks;
    double percentage;
    char grade;

    public void grade(){
        if(percentage>=60){
            grade= 'A';
        } else if (percentage >=50) {
            grade = 'B';
        }else{
            grade= 'C';
        }
    }
    public void display(){
        System.out.println(rollNo);
        System.out.println(physicalMarks);
        System.out.println(chemistryMarks);
        System.out.println(mathMarks);
        System.out.println(grade);
        System.out.println("Average Marks ="+avgeMarks);
        System.out.println("Percentage ="+percentage);

    }
    public void CalculateAverage(){ //method

        avgeMarks = (physicalMarks+chemistryMarks+mathMarks)/3.0;

    }
    public void CalculatePercentage(){  //method
        percentage = (physicalMarks+chemistryMarks+mathMarks)/300.00*100; // single pointer


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getPhysicalMarks() {
        return physicalMarks;
    }

    public void setPhysicalMarks(int physicalMarks) {
        this.physicalMarks = physicalMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public void setChemistryMarks(int chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public double getAvgeMarks() {
        return avgeMarks;
    }

    public void setAvgeMarks(double avgeMarks) {
        this.avgeMarks = avgeMarks;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 1; i <= 50; i++) {
            Student s1 = new Student();
            s1.name = "Bhawar";
            s1.rollNo = i;
            s1.physicalMarks = 10 + random.nextInt(90);
            s1.chemistryMarks = 10 + random.nextInt(90);
            s1.mathMarks = 10 + random.nextInt(90);

            //calling
            s1.CalculateAverage();
            s1.CalculatePercentage();
            s1.grade();
            s1.display();

        }
    }
}



