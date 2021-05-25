package rechner.util;

public class Operator extends Symbol {
	private char operator;

	public Operator(String o) {
		this.operator = o.charAt(0);
	}
	public char getOperator() {
		return operator; 
	}
	public static boolean isOperator(String string) {
		String listOperator = "+-*%/";
		return string.length() == 1 && listOperator.contains(string);
	}
	public String toString() {
		return " "+ operator +" ";
		}
}
