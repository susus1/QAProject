package design.principles.breakslsp;

public abstract class Bird {
    protected int altitude;
    public abstract void fly();

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}