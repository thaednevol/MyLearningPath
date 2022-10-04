package co.knry.algorithms.interview;

import java.util.*;

public class TournamentWinner {

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String bestTeam = "";

        HashMap<String, Integer> points = new HashMap<>();
        points.put("", 0);

        for (int i=0; i<competitions.size();i++){
            ArrayList<String> match = competitions.get(i);
            int result = results.get(i);

            String home = match.get(0);
            String visitor = match.get(1);

            String winner = result == 1 ? home : visitor;

            if (!points.containsKey(winner)) {
                points.put(winner, 3);
            }
            else {
                points.put(winner, points.get(winner) + 3);
            }

            if (points.get(winner) > points.get(bestTeam)) {
                bestTeam = winner;
            }
        }

        return bestTeam;
    }
}

class Team {
    String name;
    int points;

    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}