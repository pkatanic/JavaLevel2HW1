import competitors.Cat;
import competitors.Competitor;
import competitors.Human;
import competitors.Robot;
import obstacles.Cross;
import obstacles.Obstacle;
import obstacles.Wall;

public class Main {
    public static void main(String[] args){
        Competitor[] competitors = {new Cat("Василий"),new Human("Анна"),new Robot("R2D2",123456)};
        Obstacle[] course = {new Cross(400), new Wall(8)};


    }
}
