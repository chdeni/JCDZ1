package chdeni.javacore.dz1;

public class Main
{
    public static void main(String[] args)
    {
        Course team = new Course("Спортсмены");
        team.infoTeam();
        team.doIt(team.human.name, team.human.maxRun, team.human.maxJump);
        team.doIt(team.cat1.name, team.cat1.maxRun, team.cat1.maxJump);
        team.doIt(team.cat2.name, team.cat2.maxRun, team.cat2.maxJump);
        team.doIt(team.robot.name, team.robot.maxRun, team.robot.maxJump);
        System.out.println("\nПобедитель: " + team.winnerName + "!!!");
    }
}
