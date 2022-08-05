package design.principles.lsp;

public abstract class FlyingBird {
    public abstract void fly();
    
    public void extendWings() {
    	System.out.println("wings");
    }
    
}
