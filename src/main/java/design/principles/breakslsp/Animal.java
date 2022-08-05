package design.principles.breakslsp;

public class Animal{
    public void learnToFly(Bird bird){
        if (bird instanceof Owl){
            bird.fly();
        }
    }
}
