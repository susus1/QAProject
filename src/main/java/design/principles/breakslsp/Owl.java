package design.principles.breakslsp;

public class Owl extends Bird{
    @Override
    public void fly(){
        this.altitude += 1000;
    }
}