package racingcar;

public class CarDistance {
    private int distance;
    private String displayDis;

    public void initDistance() {
        this.distance = 0;
        this.displayDis = "";
    }

    public void move() {
        this.distance++;
        this.displayDis += '-';
    }

    public String getDisplayDis() {
        return this.displayDis;
    }
}
