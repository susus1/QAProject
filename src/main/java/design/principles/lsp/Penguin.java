package design.principles.lsp;

public class Penguin extends FlightlessBird {
    private int speed;

    public void flap(){
        this.setSpeed(this.getSpeed() + 5);
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
}