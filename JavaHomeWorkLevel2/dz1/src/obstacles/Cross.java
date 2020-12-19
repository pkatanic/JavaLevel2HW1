package obstacles;

import competitors.Competitor;

public class Cross extends Obstacle {
    private int distance;

    public Cross(int distance){
        this.distance = distance;
    }

    @Override
    public void overcome(Competitor competitor) {
        competitor.run(distance);
    }
}
