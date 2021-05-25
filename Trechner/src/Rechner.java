import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import rechner.util.*;
public class Rechner extends JFrame {

	private JButton löschen = new JButton();
	private JButton klammer = new JButton();
	private JButton prozent = new JButton();
	private JButton durch = new JButton();
	private JButton sieben = new JButton();
	private JButton acht = new JButton();
	private JButton neun = new JButton();
	private JButton mal = new JButton();
	private JButton vier = new JButton();
	private JButton fuenf = new JButton();
	private JButton sechs = new JButton();
	private JButton minus = new JButton();
	private JButton eins = new JButton();
	private JButton zwei = new JButton();
	private JButton drei = new JButton();
	private JButton plus = new JButton();
	private JButton plusminus = new JButton();
	private JButton zero = new JButton();
	private JButton komma = new JButton();
	private JButton gleich = new JButton();
	private JLabel Ausgabe = new JLabel();
	String eingabe = ("");

	public Rechner() {
		super();
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 500;
		int frameHeight = 500;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		setTitle("Taschenrechner");
		setResizable(true);
		Container cp = getContentPane();
		cp.setLayout(null);

		löschen.setBounds(8, 120, 33, 33);
		löschen.setText("C");
		löschen.setMargin(new Insets(2, 2, 2, 2));
		löschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				löschen_ActionPerformed(evt);
			}
		});
		cp.add(löschen);

		sieben.setBounds(8, 160, 33, 33);
		sieben.setText("7");
		sieben.setMargin(new Insets(2, 2, 2, 2));
		sieben.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				sieben_ActionPerformed(evt);
			}
		});
		cp.add(sieben);

		vier.setBounds(8, 200, 33, 33);
		vier.setText("4");
		vier.setMargin(new Insets(2, 2, 2, 2));
		vier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				vier_ActionPerformed(evt);
			}
		});
		cp.add(vier);

		eins.setBounds(8, 240, 33, 33);
		eins.setText("1");
		eins.setMargin(new Insets(2, 2, 2, 2));
		eins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				eins_ActionPerformed(evt);
			}
		});
		cp.add(eins);

		plusminus.setBounds(8, 280, 33, 33);
		plusminus.setText("+/-");
		plusminus.setMargin(new Insets(2, 2, 2, 2));
		plusminus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				plusminus_MouseClicked(evt);
			}
		});
		cp.add(klammer);

		klammer.setBounds(48, 120, 33, 33);
		klammer.setText("()");
		klammer.setMargin(new Insets(2, 2, 2, 2));
		klammer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				klammer_MouseClicked(evt);
			}
		});
		cp.add(klammer);

		acht.setBounds(48, 160, 33, 33);
		acht.setText("8");
		acht.setMargin(new Insets(2, 2, 2, 2));
		acht.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				acht_ActionPerformed(evt);
			}
		});
		cp.add(acht);

		fuenf.setBounds(48, 200, 33, 33);
		fuenf.setText("5");
		fuenf.setMargin(new Insets(2, 2, 2, 2));
		fuenf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				fuenf_ActionPerformed(evt);
			}
		});
		cp.add(fuenf);

		zwei.setBounds(48, 240, 33, 33);
		zwei.setText("2");
		zwei.setMargin(new Insets(2, 2, 2, 2));
		zwei.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				zwei_ActionPerformed(evt);
			}
		});
		cp.add(zwei);

		zero.setBounds(48, 280, 33, 33);
		zero.setText("0");
		zero.setMargin(new Insets(2, 2, 2, 2));
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				zero_ActionPerformed(evt);
			}
		});
		cp.add(zero);

		prozent.setBounds(88, 120, 33, 33);
		prozent.setText("%");
		prozent.setMargin(new Insets(2, 2, 2, 2));
		prozent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				prozent_ActionPerformed(evt);
			}
		});
		cp.add(prozent);

		cp.add(plusminus);
		neun.setBounds(88, 160, 33, 33);
		neun.setText("9");
		neun.setMargin(new Insets(2, 2, 2, 2));
		neun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				neun_ActionPerformed(evt);
			}
		});
		cp.add(neun);

		sechs.setBounds(88, 200, 33, 33);
		sechs.setText("6");
		sechs.setMargin(new Insets(2, 2, 2, 2));
		sechs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				sechs_ActionPerformed(evt);
			}
		});
		cp.add(sechs);

		drei.setBounds(88, 240, 33, 33);
		drei.setText("3");
		drei.setMargin(new Insets(2, 2, 2, 2));
		drei.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				drei_ActionPerformed(evt);
			}
		});
		cp.add(drei);

		komma.setBounds(88, 280, 33, 33);
		komma.setText(",");
		komma.setMargin(new Insets(2, 2, 2, 2));
		komma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				komma_ActionPerformed(evt);
			}
		});
		cp.add(komma);

		durch.setBounds(136, 120, 33, 33);
		durch.setText("/");
		durch.setMargin(new Insets(2, 2, 2, 2));
		durch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				durch_ActionPerformed(evt);
			}
		});
		cp.add(durch);

		mal.setBounds(136, 160, 33, 33);
		mal.setText("*");
		mal.setMargin(new Insets(2, 2, 2, 2));
		mal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				mal_ActionPerformed(evt);
			}
		});
		cp.add(mal);

		minus.setBounds(136, 200, 33, 33);
		minus.setText("-");
		minus.setMargin(new Insets(2, 2, 2, 2));
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				minus_ActionPerformed(evt);
			}
		});
		cp.add(minus);

		plus.setBounds(136, 240, 33, 33);
		plus.setText("+");
		plus.setMargin(new Insets(2, 2, 2, 2));
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				plus_ActionPerformed(evt);
			}
		});
		cp.add(plus);

		gleich.setBounds(138, 280, 33, 33);
		gleich.setText("=");
		gleich.setMargin(new Insets(2, 2, 2, 2));
		gleich.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				gleich_ActionPerformed(evt);
			}
		});
		cp.add(gleich);

		Ausgabe.setBounds(8, 40, 1000, 50);
		Ausgabe.setText("");
		Ausgabe.setForeground(Color.BLACK);
		Ausgabe.setFont(new Font("Arial", Font.BOLD, 28));
		cp.add(Ausgabe);
		setVisible(true);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		}
		new Rechner();
	}

	public void löschen_ActionPerformed(ActionEvent evt) {
		eingabe = ("");
		Ausgabe.setText(eingabe);
	}

	public void sieben_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat("7");
		Ausgabe.setText(eingabe);
	}

	public void vier_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat("4");
		Ausgabe.setText(eingabe);
	}

	public void eins_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat("1");
		Ausgabe.setText(eingabe);
	}

	public void plusminus_MouseClicked(MouseEvent evt) {
		if (evt.getClickCount() == 1) {
			eingabe = eingabe.concat(" + ");
			Ausgabe.setText(eingabe);
		} else {
			eingabe = eingabe.substring(0, eingabe.length() - 3).concat(" - ");
			Ausgabe.setText(eingabe);
		}
	}

	public void klammer_MouseClicked(MouseEvent evt) {
		if (evt.getClickCount() == 1) {
			eingabe = eingabe.concat(" ( ");
			Ausgabe.setText(eingabe);
		} else {
			eingabe = eingabe.substring(0, eingabe.length() - 3).concat(" ) ");
			Ausgabe.setText(eingabe);
		}
	}

	public void acht_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat("8");
		Ausgabe.setText(eingabe);
	}

	public void fuenf_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat("5");
		Ausgabe.setText(eingabe);
	}

	public void zwei_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat("2");
		Ausgabe.setText(eingabe);
	}

	public void zero_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat("0");
		Ausgabe.setText(eingabe);
	}

	public void prozent_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat(" % ");
		Ausgabe.setText(eingabe);
	}

	public void neun_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat("9");
		Ausgabe.setText(eingabe);
	}

	public void sechs_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat("6");
		Ausgabe.setText(eingabe);
	}

	public void drei_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat("3");
		Ausgabe.setText(eingabe);
	}

	public void komma_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat(",");
		Ausgabe.setText(eingabe);
	}

	public void durch_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat(" / ");
		Ausgabe.setText(eingabe);
	}

	public void mal_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat(" * ");
		Ausgabe.setText(eingabe);
	}

	public void minus_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat(" - ");
		Ausgabe.setText(eingabe);
	}

	public void plus_ActionPerformed(ActionEvent evt) {
		eingabe = eingabe.concat(" + ");
		Ausgabe.setText(eingabe);
	}

	public void gleich_ActionPerformed(ActionEvent evt) {
		String ergebnis;
		ergebnis = rechnen(eingabe);
		Ausgabe.setText(ergebnis);
	}

	public String rechnen(String elemente) {
		String operator = "+";
		String[] parts;
		double result = 0;
		parts = elemente.split(" ");
		Term l = new Term(parts);
		l.durchRechnen();
		l.malRechnen();
		l.minusRechnen();
		l.plusRechnen();
		
		
		/*for (int i = 0; i < parts.length; i++) {
			if (isNumb(parts[i])) {
				switch (operator) {
				case "+":
					result += Double.parseDouble(parts[i]);
					break;
				case "-":
					result -= Double.parseDouble(parts[i]);
					break;
				case "*":
					result *= Double.parseDouble(parts[i]);
					break;
				case "/":
					result /= Double.parseDouble(parts[i]);
					break;
				case "%":
					result %= Double.parseDouble(parts[i]);
					break;
				}
			} else if (isMathOperator(parts[i])) {
				operator = parts[i];
			}
		}*/
		return l.toString();
	}
}