package competitors;

public abstract class Animal implements Competitor {
    final String type;
    final  private String name;
    final int maxRunDistance;
    final int maxJumpHeight;
    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight) {
        this.type=type;
        this.name=name;
        this.maxRunDistance=maxRunDistance;
        this.maxJumpHeight=maxJumpHeight;

        this.onDistance=true;
    }
    public boolean isOnDistance(){
        return onDistance;
    }

    public String getType() {
        return type;
    }


    public String getName() {
        return name;
    }



    public int getMaxRunDistance() {
        return maxRunDistance;
    }



    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }


    public void run(int distance){
        if (distance <= maxRunDistance){
            System.out.println(type + " " + name + " успешно справился с кроссом");
        } else {
            System.out.println(type + " " + name + " не смог преодолеть кросс");
            onDistance = false;
        }
    }

    public void jump(int height){
        if (height <= maxJumpHeight){
            System.out.println(type + " " + name + " успешно перепрыгнул препятствие");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть препятствие");
            onDistance = false;
        }
    }
    public void showResult(){
        System.out.println(type + " " + name + ": " + onDistance);
    }
}
