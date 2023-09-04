package dev.lpa;

record BaseballPlayer(String name, String position) implements Player {
}
record FootballPlayer(String name, String position) implements Player {
}

public class Main {
    public static void main(String[] args) {
        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillie's");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        SportsTeam phillies = new SportsTeam("Philadelphia Phillie's");
        SportsTeam astros = new SportsTeam("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        Team phillies2 = new SportsTeam("Philadelphia Phillie's");
        Team astros2 = new SportsTeam("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();

        SportsTeam afc = new SportsTeam("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        afc.addTeamMember(tex);
        afc.listTeamMembers();
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}