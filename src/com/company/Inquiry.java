// package com.company;

import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class Inquiry {

    // variable declarations
    Scanner scanner = new Scanner(System.in);

    String name;

    ArrayList <String> partner = new ArrayList<String>();
    ArrayList <String> jobs = new ArrayList<String>();
    ArrayList <Integer> yrlySalary = new ArrayList<Integer>();
    ArrayList <String> city = new ArrayList<String>();
    ArrayList <Integer> famSize = new ArrayList<Integer>();
    ArrayList <String> carMake = new ArrayList<String>();
    ArrayList <String> carBody = new ArrayList<String>();

    //String variables
    String spouse = "name of someone you like";
    String job = "the name your future dream job";
    String pay = "how much you would like to make a year";
    String town = "where you would like to live";
    String children = "how many childen you would like to have";
    String cMake = "the make of you would like (ex. Mercedes)";
    String carBS = "the car body style you would like (ex. SUV or sedan)";


    String a;
    int b;
    ArrayList z = new ArrayList();
    UserInput user = new UserInput(a, a, b, a, b, a, a);

    UserResults give = new UserResults();

    // display result

    /**
 *
 */
    public void questions() {

        System.out.print("Hello, Fortune Seeker, welcome to M.A.S.H. Romantic Future Predictor." +
                "\n" + "Please enter name: ");
        name = scanner.nextLine().toUpperCase();

        System.out.println("");
        System.out.println("Welcome " + name + ".");
        System.out.println("");

        System.out.println("Please enter the information requested below so that I can get a better idea of what your future love life may hold.");
        System.out.println("You will be asked each question 4 times, meaning you can enter 4 options.");

        stringQuestions(spouse, partner);
        System.out.println("");
        stringQuestions(job, jobs);
        System.out.println("");
        amtQuestions(pay, yrlySalary);
        System.out.println("");
        stringQuestions(town, city);
        System.out.println("");
        amtQuestions(children, famSize);
        System.out.println("");
        stringQuestions(cMake, carMake);
        System.out.println("");
        stringQuestions(carBS, carBody);

        System.out.println(name + ", you entered the following information:");
        System.out.println("");
        System.out.print("You entered: ");
        System.out.println(partner.toString());

        System.out.println("");
        System.out.print("You entered: ");
        System.out.println(jobs.toString());

        System.out.println("");
        System.out.print("You entered: ");
        System.out.println(yrlySalary.toString());

        System.out.println("");
        System.out.print("You entered: ");
        System.out.println(city.toString());

        System.out.println("");
        System.out.print("You entered: ");
        System.out.println(famSize.toString());

        System.out.println("");
        System.out.print("You entered: ");
        System.out.println(carMake.toString());

        System.out.println("");
        System.out.print("You entered: ");
        System.out.println(carBody.toString());

        System.out.println("");
        System.out.println("Testing Successful and Complete!");
        System.out.println("");

        give.randomResults(name, partner, jobs, yrlySalary, city, famSize, carMake, carBody);


    }// end of question() method

    public void stringQuestions(String a, ArrayList z) {

        for (int i = 0; i < 4; i++) {
            System.out.print("Please enter " + a + ": ");
            z.add(scanner.nextLine().toUpperCase());
        }
    }

    public void amtQuestions(String a, ArrayList z) {

        for (int i = 0; i < 4; i++) {
            System.out.print("Please enter " + a + ": ");
            z.add(Integer.parseInt(scanner.nextLine()));
        }
    }

}// end of Inquiry Class {}
