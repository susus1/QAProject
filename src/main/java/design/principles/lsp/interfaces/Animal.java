package design.principles.lsp.interfaces;

public class Animal {
    public void learnToFly(FlyingBird flyBird){
        flyBird.fly();
    }
}
