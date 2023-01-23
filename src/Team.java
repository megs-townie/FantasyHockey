/*  PROG1400 - Intro to OOP
    Assignment 01 - Fantasy Hockey League
    Written by Meagan Townsend
    01/23/2023
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;


//region Class Properties
public class Team {
    private String teamName;
    private int goals;
    private int assists;
    private double budget;
    private String rating;
//endregion


    //region Constructor

    public Team(String teamName) {
        this.teamName = teamName;
        this.goals = 0;
        this.assists = 0;
        this.budget = 0.00;
        this.rating = "0 stars";
    }
    //endregion

    //region Getters and Setters
    public String getTeamName() {
        return teamName;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public double getBudget() {
        return budget;
    }

    public String getRating() {
        return rating;
    }

    public void addGoals(int goals) {
        this.goals += goals;
    }

    public void addAssists(int assists) {
        this.assists += assists;
    }
    //endregion

    //region Calculate Budget

    public void calculateBudget() {
        Random rand = new Random();
        budget = rand.nextInt(100000) + 0.00;
    }
    //endregion

    //region Calculate Rating
    public void calculateRating() {
        int total = goals + assists;
        if (total > 20) {
            rating = "*** stars";
        } else if (total >= 10) {
            rating = "** stars";
        } else if (total > 0) {
            rating = "* stars";
        } else {
            rating = "0 stars";
        }
    }
    //endregion

    //region Team Details Output
    public void outputTeamDetails() {
        DecimalFormat df = new DecimalFormat("$#,###,##0.00");
        System.out.println(teamName + ":" +"\t" +  "G - " + goals + "\t" + " A - " + assists + "\t" + "Total - " + (goals + assists) +"\t" + " Budget - " + df.format(budget));
        System.out.println(" Rating: " + rating);
    }
    //endregion
}