package design.patterns.facade;

public class ComputerFacade {
	private Cpu cpu = new Cpu();
	private Memory memory = new Memory();

	public void start() {
		cpu.freeze();
		memory.load(5L, 'a');
		cpu.jump(100L);
		cpu.execute();
	}
}
