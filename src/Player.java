/*  PROG1400 - Intro to OOP
    Assignment 01 - Fantasy Hockey League
    Written by Meagan Townsend
    01/23/2023
 */

public class Player {

//region Class Properties
    private String name;
    private int goals;
    private int assists;
    private String teamName;
//endregion

    //region Constructor
    public Player(String name, int goals, int assists, String teamName) {
        this.name = name;
        this.goals = goals;
        this.assists = assists;
        this.teamName = teamName;
    }
    //endregion

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTotal() {
        return goals + assists;
    }
    //endregion

    //region Player Stat Output
    public void outputPlayerDetails() {
        System.out.println(teamName + "\n" + name + "\t" + ": G - " + goals + "\t" + " A - " + assists + "\t" + " Total - " + getTotal());
    }

    //endregion
}
