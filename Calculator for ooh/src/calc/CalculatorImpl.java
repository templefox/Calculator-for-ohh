package calc;

public class CalculatorImpl implements Calculator {

	@Override
	public Integer add(Integer a, Integer b) {
		return a+b;
	}

	@Override
	public Double divide(Integer a, Integer b) {	
		return (double) (a/b);
	}

	@Override
	public Integer abs(Integer a) {
		if(a>0){
			System.out.println("Do noting");	
		}else if(a==0){
			System.out.println("It is zero");
		}else {
			a=-a;
		}
		return a;
	}	
}
