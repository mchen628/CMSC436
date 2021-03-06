package edu.umd.cs.gpa.model;

import java.util.Date;

/**
 * Created by howardksw1 on 4/5/17.
 */

public class Work {
    private Category category;
    private String title;
    private double weight;
    private double earned_points;
    private double possible_points;
    private boolean completeness = false;
    private Date due_Date;
    public Work(String title) {
        this.title = title;
    }

    // getter of title
    public Date getDueDate() { return due_Date; }

    // setter of title
    public void setDueDate(Date due_Date) { this.due_Date = due_Date; }

    // getter of title
    public String getTitle() { return title; }

    // setter of title
    public void setTitle(String title) { this.title = title; }

    // setter of category
    public void setCategory(Category category) { this.category = category; }

    // getter of category
    public Category getCategory() { return category; }

    // setter of weight
    public void setWeight(double weight) { this.weight = weight; }

    // getter of weight
    public double getWeight() { return weight; }

    // setter of earned points
    public void setEarned_points(double earned_points) { this.earned_points = earned_points; }

    // getter of earned points
    public double getEarned_points() { return earned_points; }

    // setter of possible points
    public void setPossible_points(double weight) { this.possible_points = possible_points; }

    // getter of possible points
    public double getPossible_points() { return possible_points; }

    public void setCompleteness() { this.completeness = true;}

    public boolean getCompleteness() { return completeness; }

    public enum Category {
        EXAM, ASSIGNMENT, QUIZ, PROJECT, EXTRA
    }


}
