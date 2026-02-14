package com.src;

public class GradeCalculator {
	  public static double calculateAverage(double[] marks) {
	        double sum = 0;
	        for (double m : marks) {
	            sum += m;
	        }
	        return sum / marks.length;
	    }

	    public static String getGrade(double average) {
	        if (average >= 90) return "A+";
	        else if (average >= 80) return "A";
	        else if (average >= 70) return "B";
	        else if (average >= 60) return "C";
	        else if (average >= 50) return "D";
	        else return "F";
	    }

	    public static double getHighest(double[] marks) {
	        double max = marks[0];
	        for (double m : marks) {
	            if (m > max) max = m;
	        }
	        return max;
	    }

	    public static double getLowest(double[] marks) {
	        double min = marks[0];
	        for (double m : marks) {
	            if (m < min) min = m;
	        }
	        return min;
	    }
	}

