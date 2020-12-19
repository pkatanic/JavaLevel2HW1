package obstacles;

import competitors.Competitor;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public void overcome(Competitor competitor) {
        competitor.jump(height);
    }
}
