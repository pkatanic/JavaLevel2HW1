package competitors;

public interface Competitor {
    void run(int distance);
    void jump(int height);
    boolean isOnDistance();
    void showResult();
    //String getName();
    //String getType();
}
