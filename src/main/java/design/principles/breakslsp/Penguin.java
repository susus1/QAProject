package design.principles.breakslsp;

public class Penguin extends Bird{
    @Override
    public void fly(){
        throw new UnsupportedOperationException();
    }
}