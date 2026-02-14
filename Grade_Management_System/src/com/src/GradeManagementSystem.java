package com.src;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeManagementSystem {
		private static ArrayList<StudentGrade> students = new ArrayList<>();
	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {

	        boolean running = true;

	        while (running) {
	            System.out.println("\n===== GRADE MANAGEMENT SYSTEM =====");
	            System.out.println("1. Add Student");
	            System.out.println("2. View All Students");
	            System.out.println("3. Search Student");
	            System.out.println("4. Generate Report");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");

	            int choice = getValidInt(1, 5);

	            switch (choice) {
	                case 1:
	                    addStudent();
	                    break;
	                case 2:
	                    viewStudents();
	                    break;
	                case 3:
	                    searchStudent();
	                    break;
	                case 4:
	                    ReportGenerator.generateReport(students);
	                    break;
	                case 5:
	                    running = false;
	                    System.out.println("Exiting system...");
	                    break;
	            }
	        }

	        scanner.close();
	    }

	    private static void addStudent() {
	        System.out.print("Enter Student Name: ");
	        String name = scanner.nextLine();

	        double[] marks = new double[5];
	        String[] subjects = {"Math", "Science", "English", "History", "Computer"};

	        for (int i = 0; i < 5; i++) {
	            System.out.print(subjects[i] + " marks: ");
	            marks[i] = getValidMark();
	        }

	        StudentGrade student = new StudentGrade(name, marks);
	        students.add(student);

	        System.out.println("✅ Student added successfully!");
	    }

	    private static void viewStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No students available!");
	            return;
	        }

	        for (StudentGrade s : students) {
	            System.out.println(s);
	        }
	    }

	    private static void searchStudent() {
	        System.out.print("Enter name to search: ");
	        String name = scanner.nextLine();

	        for (StudentGrade s : students) {
	            if (s.getName().equalsIgnoreCase(name)) {
	                System.out.println("Student Found:");
	                System.out.println(s);
	                return;
	            }
	        }

	        System.out.println("Student not found!");
	    }

	    private static int getValidInt(int min, int max) {
	        while (true) {
	            try {
	                int value = Integer.parseInt(scanner.nextLine());
	                if (value >= min && value <= max)
	                    return value;
	                else
	                    System.out.print("Enter valid choice: ");
	            } catch (Exception e) {
	                System.out.print("Invalid input! Try again: ");
	            }
	        }
	    }

	    private static double getValidMark() {
	        while (true) {
	            try {
	                double mark = Double.parseDouble(scanner.nextLine());
	                if (mark >= 0 && mark <= 100)
	                    return mark;
	                else
	                    System.out.print("Marks must be 0-100. Re-enter: ");
	            } catch (Exception e) {
	                System.out.print("Invalid input! Enter number: ");
	            }
	        }
	    }
	}
	

	    
