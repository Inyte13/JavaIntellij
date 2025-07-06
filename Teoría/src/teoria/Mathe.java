package teoria;

public class Mathe {
	public static void main(String[] args) {
		//rounds up, always goes up
		System.out.println(Math.ceil(5.1));//6.0
		System.out.println(Math.ceil(-5.1));//-5.0
		//round down, always lower
		System.out.println(Math.floor(5.9));//5.0
		System.out.println(Math.floor(-5.1));//-6.0
		//rounds normally and converts it to an integer
		System.out.println(Math.round(5.5));//6
		System.out.println(Math.round(-6.1));//-6
		//power
		System.out.println(Math.pow(2,3));//8.0
		System.out.println(Math.pow(9,0.5));//3.0
		System.out.println(Math.pow(125,1.0/3));//4.9999
		//absolute value
		System.out.println(Math.abs(-123));}}
