/*  PROG1400 - Intro to OOP
    Assignment 01 - Fantasy Hockey League
    Written by Meagan Townsend
    01/23/2023
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Team[] teams = new Team[3];
        Player[][] players = new Player[3][3];

        //region Team Entry
        System.out.println("FANTASY HOCKEY APPLICATION");
        System.out.println("TEAM ENTRY");
        System.out.println("================================");
        for (int i = 0; i < teams.length; i++) {
            System.out.print("Enter name for team #" + (i + 1) + ": ");
            String teamName = input.nextLine();

            //region Name Check Min 3 Char
            while (teamName.length() < 3) {
                System.out.print("Team name must be at least 3 characters long. Please enter a valid name: ");
                teamName = input.nextLine();
            }
            //endregion

            teams[i] = new Team(teamName);
        }

        //endregion

        //region Player Entry
        System.out.println("\nPLAYER ENTRY");
        System.out.println("================================");
        for (int i = 0; i < players.length; i++) {
            System.out.println("Enter players for " + teams[i].getTeamName() + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.print("Enter name for player #" + (j + 1) + ": ");
                String playerName = input.nextLine();
                while (playerName.length() < 3) {
                    System.out.print("Player name must be at least 3 characters long. Please enter a valid name: ");
                    playerName = input.nextLine();
                }
                System.out.print("Enter number of goals for " + playerName + ": ");
                int goals = input.nextInt();
                while (goals < 0) {
                    System.out.print("Number of goals must be zero or greater. Please enter a valid number: ");
                    goals = input.nextInt();
                }
                System.out.print("Enter number of assists for " + playerName + ": ");
                int assists = input.nextInt();
                while (assists < 0) {
                    System.out.print("Number of assists must be zero or greater. Please enter a valid number: ");
                    assists = input.nextInt();
                }
                input.nextLine();
                players[i][j] = new Player(playerName, goals, assists, teams[i].getTeamName());
                teams[i].addGoals(goals);
                teams[i].addAssists(assists);
            }
        }
        //endregion

        //region Team Report
        System.out.println("\nREPORT: Stats per Team");
        System.out.println("================================");
        for (Team team : teams) {
            team.calculateBudget();
            team.calculateRating();
            team.outputTeamDetails();
        }
        //endregion

        //region Player report
        System.out.println("\nREPORT: Stats per Player");
        System.out.println("================================");
        for (Player[] teamPlayers : players) {
            for (Player player : teamPlayers) {
                player.outputPlayerDetails();
            }
        }
        //endregion
    }
}
