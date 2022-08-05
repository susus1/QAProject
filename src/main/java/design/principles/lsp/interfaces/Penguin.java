package design.principles.lsp.interfaces;

public class Penguin implements FlightlessBird {
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