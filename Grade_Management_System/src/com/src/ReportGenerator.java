package com.src;

import java.util.ArrayList;

public class ReportGenerator {
	public static void generateReport(ArrayList<StudentGrade> students) {

        if (students.isEmpty()) {
            System.out.println("No students available!");
            return;
        }

        System.out.println("\n===== PERFORMANCE REPORT =====");
        System.out.println("Total Students: " + students.size());

        double highestAvg = 0;
        StudentGrade topStudent = null;

        int a = 0, b = 0, c = 0, d = 0, f = 0;

        for (StudentGrade s : students) {
            double avg = s.getAverage();

            if (avg > highestAvg) {
                highestAvg = avg;
                topStudent = s;
            }

            switch (s.getGrade()) {
                case "A+":
                case "A": a++; break;
                case "B": b++; break;
                case "C": c++; break;
                case "D": d++; break;
                default: f++;
            }
        }

        System.out.println("\n🏆 Top Performer:");
        System.out.println(topStudent.getName() + 
                           " - Average: " + 
                           String.format("%.2f", highestAvg));

        System.out.println("\n📊 Grade Distribution:");
        System.out.println("A Grade: " + a);
        System.out.println("B Grade: " + b);
        System.out.println("C Grade: " + c);
        System.out.println("D Grade: " + d);
        System.out.println("F Grade: " + f);
    }
}

