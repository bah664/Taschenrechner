package rechner.util;

import java.util.ArrayList;
import java.util.List;

public class Term {
	private List<Symbol> list;

	public Term(String[] e) {
		this.list = colectNumb(e);
	}

	private static List<Symbol> colectNumb(String[] liste) {
		List<Symbol> listE = new ArrayList<>();
		for (int i = 0; i < liste.length; i++) {
			if (Numb.isNumb(liste[i])) {
				listE.add(new Numb((liste[i])));
			} else if (Operator.isOperator(liste[i])) {
				listE.add(new Operator(liste[i]));
			} else
				throw new IllegalArgumentException(liste[i]);
		}
		return listE;
	}

	public void durchRechnen() {
		Numb a, b;
		Numb erg;
		for (int i = 0; i < this.list.size();) {
			if (list.get(i) instanceof Operator && ((Operator) list.get(i)).getOperator() == '/') {
				a = (Numb) list.get(i - 1);
				b = (Numb) list.get(i + 1);
				erg = new Numb(a.getNumb() / b.getNumb());
				list.set(i, erg);
				list.remove(i - 1);
				list.remove(i);
			} else
				i++;
		}
	}

	public void malRechnen() {
		Numb a, b;
		Numb erg;
		for (int i = 0; i < this.list.size();) {
			if (list.get(i) instanceof Operator && ((Operator) list.get(i)).getOperator() == '*') {
				a = (Numb) list.get(i - 1);
				b = (Numb) list.get(i + 1);
				erg = new Numb(a.getNumb() * b.getNumb());
				list.set(i, erg);
				list.remove(i - 1);
				list.remove(i);
			} else
				i++;
		}
	}

	public void minusRechnen() {
		Numb a, b;
		Numb erg;
		for (int i = 0; i < this.list.size();) {
			if (list.get(i) instanceof Operator && ((Operator) list.get(i)).getOperator() == '-') {
				a = (Numb) list.get(i - 1);
				b = (Numb) list.get(i + 1);
				erg = new Numb(a.getNumb() - b.getNumb());
				list.set(i, erg);
				list.remove(i - 1);
				list.remove(i);
			} else
				i++;
		}
	}

	public void plusRechnen() {
		Numb a, b;
		Numb erg;
		for (int i = 0; i < this.list.size();) {
			if (list.get(i) instanceof Operator && ((Operator) list.get(i)).getOperator() == '+') {
				a = (Numb) list.get(i - 1);
				b = (Numb) list.get(i + 1);
				erg = new Numb(a.getNumb() + b.getNumb());
				list.set(i, erg);
				list.remove(i - 1);
				list.remove(i);
			} else
				i++;
		}
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < this.list.size(); i++) {
			s += list.get(i);
		}
		return " " + s + " ";
	}
}
