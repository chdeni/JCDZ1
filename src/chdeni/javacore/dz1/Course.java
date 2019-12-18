package chdeni.javacore.dz1;

public class Course extends Team
{
    int editPoint;
    String winnerName;
    public Course(String nameTeam)
    {
        super(nameTeam);
    }

    public void doIt(String name, int objectMaxRun, float objectMaxJump)
    {
        int point = 0;
        RunTrack[] track = new RunTrack[3];
        track[0] = new RunTrack(50);
        track[1] = new RunTrack(500);
        track[2] = new RunTrack(2000);

        for (RunTrack runTrack : track)
        {
            System.out.println("\n" + runTrack.runLength + " м");
            if (objectMaxRun < runTrack.runLength)
            {
                System.out.println(name + " не сумел пробежать " + runTrack.runLength + " м");
                break;
            }
            System.out.println(name + " успешно пробежал " + runTrack.runLength + " м");
            point++;
        }

        if(track[2].runLength < objectMaxRun)
        {
            Wall[] wall = new Wall[3];
            wall[0] = new Wall(0.2f);
            wall[1] = new Wall(0.8f);
            wall[2] = new Wall(2.0f);

            for (Wall value : wall)
            {
                System.out.println("\n" + value.height + " м");
                if (objectMaxJump < value.height)
                {
                    System.out.println(name + " не сумел прыгнуть на " + value.height + " м");
                    break;
                }
                System.out.println(name + " успешно прыгнул на " + value.height + " м");
                point++;
            }
        }

        if(point > editPoint)
        {
            editPoint = point;
            System.out.println("\nЛидер: " + name);
            winnerName = name;
        }
    }
}
