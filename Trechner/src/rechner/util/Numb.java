package rechner.util;

public class Numb extends Symbol {
	private double numb;

	public Numb(String n) {
		this.numb = Double.parseDouble(n);
	}
	public Numb(double n) {
		this.numb = n;
	}//
	public double getNumb() {
		return numb;
	}
	public static boolean isNumb(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) < '0' || string.charAt(i) > '9') {
				if (string.charAt(i) != '.') {
					return false;

				}
			}
		}
		if(string.length() == 0) {
			return false;
		}
		if(string.length()>1 && string.charAt(0) == '0') {
			return false;
		}
		return true;
	}
	public String toString() {
		return " "+ numb +" ";
		}
}
