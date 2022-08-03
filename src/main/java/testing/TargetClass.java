package testing;

class TargetClass {

	public int id = 0;

	public TargetClass() {
	}

	protected String rtnMessage() {
		return "Hello World";
	}

	protected String rtnMessage(boolean flag) {
		if (flag) {
			return "Hello World";
		} else {
			return "GoodBye!";
		}
	}
}
