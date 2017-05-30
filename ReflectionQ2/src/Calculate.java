
public class Calculate {
	private static final String MUL = "*";
	private static final String DIV = "/";
	private static final double NO1 = 123.43;
	private static final double NO2 = 231.99;
	
	public void calculate(String sign){
		if(MUL.equals(sign)){
			System.out.println("Value = " + MUL(NO1, NO2));
		} else if(DIV.equals(sign)){
			System.out.println("Value = " + DIV(NO1, NO2));
		} else{
			System.out.println("Sign is not correct!(*,/)");
		}
	}
	public double MUL(double NO1, double NO2){
		return NO1*NO2;
	}
	public double DIV(double NO1, double NO2){
		return NO1/NO2;
	}
}
