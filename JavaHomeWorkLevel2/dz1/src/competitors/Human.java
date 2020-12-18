package competitors;

public class Human implements Competitor {
    final private String name;
    final private int maxRunDistance;
    final private  int maxJumpHeight;
    boolean active;

    public Human(String name){
        this.name = name;
        this.maxRunDistance = 2000;
        this.maxJumpHeight = 20;
        this.active = true;
    }
    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance){
            System.out.println(name + " успешно справился с кроссом");
        } else {
            System.out.println(name + " не смог преодолеть кросс");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight){
            System.out.println(name + " успешно перепрыгнул препятствие");
        } else {
            System.out.println(name + " не смог перепрыгнуть препятствие");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return false;
    }

    @Override
    public void showResult() {
        System.out.println(name + ": " + active);
    }
}
