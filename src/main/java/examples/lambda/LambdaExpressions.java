package examples.lambda;

import examples.lambda.LambdaExpressions.FuncInterface2;

public class LambdaExpressions {

    interface FuncInterface2 {
        int operation(int a, int b);
    }

    private int operate(int a, int b, FuncInterface2 funcObj) {
        return funcObj.operation(a, b);
    }

    public static void main(String[] args) {
        FuncInterface2 add = (int x, int y) -> x + y;
    	//FuncInterface add = new FuncImpl();

        LambdaExpressions lambda = new LambdaExpressions();
        System.out.println(lambda.operate(5, 7, add));
    }
}

class FuncImpl implements FuncInterface2{
	@Override
	public int operation(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
}