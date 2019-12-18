package chdeni.javacore.dz1;

public class Team
{
    String nameTeam;
    Human human;
    Cat cat1;
    Cat cat2;
    Robot robot;

    public Team(String nameTeam)
    {
        this.nameTeam = nameTeam;
        this.human = new Human("Миша", 12, 3000, 1.2f);
        this.cat1 = new Cat("Барсик", 3, 1000, 2.2f);
        this.cat2 = new Cat("Рыжик", 4, 1200, 1.9f);
        this.robot = new Robot("Электроник", 300, 0.2f);
    }

    public void infoTeam()
    {
       System.out.println("Команда: " + this.nameTeam + "\nУчастники: мальчик " + human.name + " - " + human.age + " лет, кот " + cat1.name + " - " + cat1.age + " года, кот " + cat2.name + " - " + cat2.age + " года, робот " + robot.name);
    }
}
