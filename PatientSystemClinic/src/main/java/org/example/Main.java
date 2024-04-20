package org.example;


import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        class Patient {
            private String name;
            private int age;
            private String gender;
            private String phoneNumber;

            public Patient(String name, int age, String gender, String phoneNumber) {
                this.name = name;
                this.age = age;
                this.gender = gender;
                this.phoneNumber = phoneNumber;
            }

            //getter and setters --accessor / mutator
            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            @Override
            public String toString() {
                return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Phone Number: " + phoneNumber;
            }
        }
        //clinic class
        public class Clinic {
            
            private ArrayList<Patient> patients;
            private Scanner scanner;

            public Clinic() {
                patients = new ArrayList<>();
                scanner = new Scanner(System.in);
            }

            public void addPatient() {
                System.out.println("Enter patient name:");
                String name = scanner.nextLine();

                System.out.println("Enter patient age:");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter patient gender:");
                String gender = scanner.nextLine();

                System.out.println("Enter patient phone number:");
                String phoneNumber = scanner.nextLine();

                Patient patient = new Patient(name, age, gender, phoneNumber);
                patients.add(patient);
                System.out.println("Patient added successfully!");
            }

            public void displayPatients() {
                if (patients.isEmpty()) {
                    System.out.println("No patients in the records.");
                } else {
                    System.out.println("Patient Records:");
                    for (Patient patient : patients) {
                        System.out.println(patient);
                    }
                }
            }

            public static void main(String[] args) {
                Clinic clinic = new Clinic();
                Scanner scanner = new Scanner(System.in);
                boolean exit = false;

                while (!exit) {
                    System.out.println("\nMenu:");

                    System.out.println("1. Add a new patient");
                    System.out.println("2. Display all patients");
                    System.out.println("3. Exit");
                    System.out.println("Choose an option:");

                    int choice = Integer.parseInt(scanner.nextLine());

                    switch (choice) { //switch
                        case 1:
                            clinic.addPatient();
                            break;
                        case 2:
                            clinic.displayPatients();
                            break;

                        case 3:
                            exit = true;
                            break;

                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                }

                System.out.println("Exiting the program.");
                scanner.close(); //close java util scanner
            }
        }

    }
    }
