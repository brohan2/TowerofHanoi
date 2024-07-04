package TOHGame;

public class ScoreManager {
    private String name;
    private float timer;

    public void setName(String name) {
        this.name = name;
    }

    public void setTimer(float timer) {
        this.timer = timer;
    }

    public float getTimer() {
        return timer;
    }

    public String getName() {
        return name;
    }

    ScoreManager(String name,float sec){

        this.name=name;
        this.timer=sec;
    }
}
