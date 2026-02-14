package com.src;

public class StudentGrade {
	private String name;
    private double[] marks;

    public StudentGrade(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double[] getMarks() {
        return marks;
    }

    public double getAverage() {
        return GradeCalculator.calculateAverage(marks);
    }

    public String getGrade() {
        return GradeCalculator.getGrade(getAverage());
    }

    @Override
    public String toString() {
        return "Name: " + name +
               " | Average: " + String.format("%.2f", getAverage()) +
               " | Grade: " + getGrade();
    }
}

