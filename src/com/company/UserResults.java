package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class UserResults {

    // variable declarations
    String a;
    int b;
    ArrayList z,y,x,w,v,u,t = new ArrayList();
    ArrayList<String> home = new ArrayList<>(Arrays.asList("Mansion","Apartment","Shack","House"));
    UserInput user = new UserInput(a, a, b, a, b, a, a);
    int randOpt = (int)Math.round(Math.random() * 3);
    String usr;
    String residence;

    /**
     * 
     * @param a
     * @param z
     * @param y
     * @param x
     * @param w
     * @param v
     * @param u
     * @param t
     */
    public void randomResults(String a, ArrayList z, ArrayList y, ArrayList x, ArrayList w, ArrayList v, ArrayList u, ArrayList t){

        //name
        //    ArrayList<String> partner = new ArrayList<String>();
//    ArrayList <String> jobs = new ArrayList<String>();
//    ArrayList <Integer> yrlySalary = new ArrayList<Integer>();
//    ArrayList <String> city = new ArrayList<String>();
//    ArrayList <Integer> famSize = new ArrayList<Integer>();
//    ArrayList <String> carMake = new ArrayList<String>();
//    ArrayList <String> carBody = new ArrayList<String>();

//        System.out.println("rand number: " + randOpt);

        usr = a;
        user.setSpouse(z.get(randOpt).toString());
        user.setCareer(y.get(randOpt).toString());
        user.setIncome(Integer.parseInt(x.get(randOpt).toString()));
        user.setCity(w.get(randOpt).toString());
        user.setNumOfKids(Integer.parseInt(v.get(randOpt).toString()));
        user.setCarMake(u.get(randOpt).toString());
        user.setCarBodyStyle(t.get(randOpt).toString());

        displayResult(usr, user);

    }

    /**
     *
     * @param usr
     * @param user
     */
    public void displayResult(String usr, UserInput user) {


        residence = home.get(randOpt).toUpperCase();

        System.out.println("");
        System.out.println(usr + ", after consulting the stars, tarot and the spirits . . . your romantic future looks " +
                "like this:");
        System.out.println(user.displayInput());
        System.out.println(residence);

    }

}
