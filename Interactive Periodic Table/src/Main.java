import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;
public class Main {
	public static void main(String args[]) {
		AppWindow tester = new AppWindow();
		tester.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tester.setSize(1400, 800);
		tester.setVisible(true);
	}
}

class AppWindow extends JFrame implements MouseListener {
	private Rectangle red, orange, yellow, green, blue, magenta, bob, H, Li, Na,
			K, Rb, Cs, Fr, Be, Mg, Ca, Sr, Ba, Ra, Sc, Y, La, Ac, Ti, Zr, Hf,
			Rf, V, Nb, Ta, Db, Cr, Mo, W, Sg, Mn, Tc, Re, Bh, Fe, Ru, Os, Hs,
			Co, Rh, Ir, Mt, Ni, Pd, Pt, Ds, Cu, Ag, Au, Rg, Zn, Cd, Hg, Cn, B,
			Al, Ga, In, Tl, C, Si, Ge, Sn, Pb, Fl, N, P, As, Sb, Bi, O, S, Se,
			Te, Po, Lv, F, Cl, Br, I, At, He, Ne, Ar, Kr, Xe, Rn, Ce, Pr, Nd,
			Pm, Sm, Eu, Gd, Tb, Dy, Ho, Er, Tm, Yb, Lu, Th, Pa, U, Np, Am, Pu,
			Cm, Bk, Cf, Es, Fm, Md, No, Lr, Nh, Mc, Ts, Og, Random;
	private Color current;
	Random rand = new Random();
	int upperbound = 104;
	int start_x = 5;
	int start_y = 175;
	int h = 45;
	int w = 50;
	int offset = 20;
	int num = 0;
	int keyx = 22;
	int keyy = 22;
	int delta = 13;
	Font font1 = new Font("Serif", Font.BOLD, 20);
	Font font2 = new Font("Serif", Font.BOLD, 13);
	Font font3 = new Font("Serif", Font.BOLD, 50);
	Font font4 = new Font("Serif", Font.BOLD, 20);
	Font font5 = new Font("Serif", Font.BOLD, 75);

	int i = 0;

	public static void main(String args[]) {
		AppWindow tester = new AppWindow();
		tester.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tester.setSize(1450, 900);
		tester.setVisible(true);
	}

	public AppWindow() {
		// dw about it
		super("PeriodicTable1");
		addMouseListener(this);
		orange = new Rectangle(225, 60, 150, 100);
		yellow = new Rectangle(425, 60, 150, 100);
		green = new Rectangle(625, 60, 150, 100);
		blue = new Rectangle(825, 60, 150, 100);
		magenta = new Rectangle(1025, 60, 150, 100);
		bob = new Rectangle(start_x + w * 17 + 5, 0, 200, 700);
		current = Color.white;

	}

	public void paint(Graphics g) {
		super.paint(g);

		red = new Rectangle(start_x, 15, start_x + w * 18, 150);
		g.setFont(font3);
		FontMetrics metrics3 = g.getFontMetrics(font3);
		int z = red.x + (red.width
				- metrics3.stringWidth("Periodic Table Of Elements")) / 2;
		int y = red.y + ((red.height - metrics3.getHeight()) / 2)
				+ metrics3.getAscent();
		g.setColor(Color.black);
		g.drawString("Periodic Table Of Elements", z, y);
		g.fillRect(z, y + 3, metrics3.stringWidth("Periodic Table Of Elements"),
				3);

		red = new Rectangle(start_x, y - y / 2, start_x + w * 18 + 5, 150);
		g.setFont(font4);
		FontMetrics metrics4 = g.getFontMetrics(font4);
		z = red.x + (red.width
				- metrics4.stringWidth("By: Yugam Goyal and Atharva Kalamkar"))
				/ 2;
		y = red.y + ((red.height - metrics4.getHeight()) / 2)
				+ metrics4.getAscent();
		g.setColor(Color.black);
		g.drawString("By: Yugam Goyal and Atharva Kalamkar", z, y);
		g.fillRect(z, y + 3,
				metrics4.stringWidth("By: Yugam Goyal and Atharva Kalamkar"),
				3);

		red = new Rectangle(start_x + w * 3 - (keyx / 2), start_y, keyx, keyy);
		FontMetrics metrics2 = g.getFontMetrics(font2);
		z = red.x + (red.width - metrics2.stringWidth(" = Nonmetal")) / 2;
		y = red.y + ((red.height - metrics2.getHeight()) / 2)
				+ metrics2.getAscent();
		g.setFont(font2);
		g.setColor(new Color(92, 242, 247));
		g.fillRect(start_x + w * 3 - (keyx / 2), start_y, keyx, keyy);
		g.setColor(Color.black);
		g.drawString(" = Nonmetal", start_x + w * 3 - (keyx / 2) + keyx + 5, y);

		red = new Rectangle(start_x + w * 3 - (keyx / 2), start_y + delta * 2,
				keyx, keyy);
		z = red.x + (red.width - metrics2.stringWidth(" = Alkali Metal")) / 2;
		y = red.y + ((red.height - metrics2.getHeight()) / 2)
				+ metrics2.getAscent();
		g.setFont(font2);
		g.setColor(new Color(247, 92, 92));
		g.fillRect(start_x + w * 3 - (keyx / 2), start_y + delta * 2, keyx,
				keyy);
		g.setColor(Color.black);
		g.drawString(" = Alkali Metal", start_x + w * 3 - (keyx / 2) + keyx + 5,
				y);

		red = new Rectangle(start_x + w * 3 - (keyx / 2), start_y + delta * 4,
				keyx, keyy);
		z = red.x
				+ (red.width - metrics2.stringWidth(" = Alkaline Earth Metal"))
						/ 2;
		y = red.y + ((red.height - metrics2.getHeight()) / 2)
				+ metrics2.getAscent();
		g.setFont(font2);
		g.setColor(new Color(247, 170, 92));
		g.fillRect(start_x + w * 3 - (keyx / 2), start_y + delta * 4, keyx,
				keyy);
		g.setColor(Color.black);
		g.drawString(" = Alkaline Earth Metal",
				start_x + w * 3 - (keyx / 2) + keyx + 5, y);

		red = new Rectangle(start_x + w * 3 - (keyx / 2), start_y + delta * 6,
				keyx, keyy);
		z = red.x
				+ (red.width - metrics2.stringWidth(" = Transition Metal")) / 2;
		y = red.y + ((red.height - metrics2.getHeight()) / 2)
				+ metrics2.getAscent();
		g.setFont(font2);
		g.setColor(new Color(237, 237, 135));
		g.fillRect(start_x + w * 3 - (keyx / 2), start_y + delta * 6, keyx,
				keyy);
		g.setColor(Color.black);
		g.drawString(" = Transition Metal",
				start_x + w * 3 - (keyx / 2) + keyx + 5, y);

		red = new Rectangle(start_x + w * 3 - (keyx / 2), start_y + delta * 8,
				keyx, keyy);
		z = red.x + (red.width - metrics2.stringWidth(" = Lathanoid")) / 2;
		y = red.y + ((red.height - metrics2.getHeight()) / 2)
				+ metrics2.getAscent();
		g.setFont(font2);
		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 3 - (keyx / 2), start_y + delta * 8, keyx,
				keyy);
		g.setColor(Color.black);
		g.drawString(" = Lathanoid", start_x + w * 3 - (keyx / 2) + keyx + 5,
				y);

		red = new Rectangle(start_x + w * 8 - (keyx / 2), start_y, keyx, keyy);
		z = red.x + (red.width - metrics2.stringWidth(" = Actinoid")) / 2;
		y = red.y + ((red.height - metrics2.getHeight()) / 2)
				+ metrics2.getAscent();
		g.setFont(font2);
		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 8 - (keyx / 2), start_y, keyx, keyy);
		g.setColor(Color.black);
		g.drawString(" = Actinoid", start_x + w * 8 - (keyx / 2) + keyx + 5, y);

		// Key2 part two

		red = new Rectangle(start_x + w * 8 - (keyx / 2), start_y + delta * 2,
				keyx, keyy);
		z = red.x + (red.width - metrics2.stringWidth(" = Halogen")) / 2;
		y = red.y + ((red.height - metrics2.getHeight()) / 2)
				+ metrics2.getAscent();
		g.setFont(font2);
		g.setColor(new Color(88, 166, 214));
		g.fillRect(start_x + w * 8 - (keyx / 2), start_y + delta * 2, keyx,
				keyy);
		g.setColor(Color.black);
		g.drawString(" = Halogen", start_x + w * 8 - (keyx / 2) + keyx + 5, y);

		red = new Rectangle(start_x + w * 8 - (keyx / 2), start_y + delta * 4,
				keyx, keyy);
		z = red.x + (red.width - metrics2.stringWidth(" = Basic Metal")) / 2;
		y = red.y + ((red.height - metrics2.getHeight()) / 2)
				+ metrics2.getAscent();
		g.setFont(font2);
		g.setColor(new Color(114, 242, 144));
		g.fillRect(start_x + w * 8 - (keyx / 2), start_y + delta * 4, keyx,
				keyy);
		g.setColor(Color.black);
		g.drawString(" = Basic Metal", start_x + w * 8 - (keyx / 2) + keyx + 5,
				y);

		red = new Rectangle(start_x + w * 8 - (keyx / 2), start_y + delta * 6,
				keyx, keyy);
		z = red.x + (red.width - metrics2.stringWidth(" = Metalloid")) / 2;
		y = red.y + ((red.height - metrics2.getHeight()) / 2)
				+ metrics2.getAscent();
		g.setFont(font2);
		g.setColor(new Color(121, 168, 132));
		g.fillRect(start_x + w * 8 - (keyx / 2), start_y + delta * 6, keyx,
				keyy);
		g.setColor(Color.black);
		g.drawString(" = Metalloid", start_x + w * 8 - (keyx / 2) + keyx + 5,
				y);

		red = new Rectangle(start_x + w * 8 - (keyx / 2), start_y + delta * 8,
				keyx, keyy);
		z = red.x + (red.width - metrics2.stringWidth(" = Noble Gas")) / 2;
		y = red.y + ((red.height - metrics2.getHeight()) / 2)
				+ metrics2.getAscent();
		g.setFont(font2);
		g.setColor(new Color(163, 75, 156));
		g.fillRect(start_x + w * 8 - (keyx / 2), start_y + delta * 8, keyx,
				keyy);
		g.setColor(Color.black);
		g.drawString(" = Noble Gas", start_x + w * 8 - (keyx / 2) + keyx + 5,
				y);

		// Coding line 1
		H = new Rectangle(start_x, start_y, w, h);
		FontMetrics metrics = g.getFontMetrics(font1);
		z = H.x + (H.width - metrics.stringWidth("H")) / 2;
		y = H.y + ((H.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setFont(font1);
		g.setColor(new Color(92, 242, 247));
		g.fillRect(start_x, start_y, w, h);
		g.setColor(Color.black);
		g.drawString("H", z, y);

		g.setColor(new Color(247, 92, 92));
		g.fillRect(start_x, start_y + h, w, h);
		Li = new Rectangle(start_x, start_y + h, w, h);
		z = Li.x + (Li.width - metrics.stringWidth("Li")) / 2;
		y = Li.y + ((Li.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setFont(font1);
		g.setColor(Color.black);
		g.drawString("Li", z, y);

		g.setColor(new Color(247, 92, 92));
		g.fillRect(start_x, start_y + h * 2, w, h);
		Na = new Rectangle(start_x, start_y + h * 2, w, h);
		z = Na.x + (Na.width - metrics.stringWidth("Na")) / 2;
		y = Na.y + ((Na.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setFont(font1);
		g.setColor(Color.black);
		g.drawString("Na", z, y);

		g.setColor(new Color(247, 92, 92));
		g.fillRect(start_x, start_y + h * 3, w, h);
		K = new Rectangle(start_x, start_y + h * 3, w, h);
		z = K.x + (K.width - metrics.stringWidth("K")) / 2;
		y = K.y + ((K.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("K", z, y);

		g.setColor(new Color(247, 92, 92));
		g.fillRect(start_x, start_y + h * 4, w, h);
		Rb = new Rectangle(start_x, start_y + h * 4, w, h);
		z = Rb.x + (Rb.width - metrics.stringWidth("Rb")) / 2;
		y = Rb.y + ((Rb.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Rb", z, y);

		g.setColor(new Color(247, 92, 92));
		g.fillRect(start_x, start_y + h * 5, w, h);
		Cs = new Rectangle(start_x, start_y + h * 5, w, h);
		z = Cs.x + (Cs.width - metrics.stringWidth("Cs")) / 2;
		y = Cs.y + ((Cs.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Cs", z, y);

		g.setColor(new Color(247, 92, 92));
		g.fillRect(start_x, start_y + h * 6, w, h);
		Fr = new Rectangle(start_x, start_y + h * 6, w, h);
		z = Fr.x + (Fr.width - metrics.stringWidth("Fr")) / 2;
		y = Fr.y + ((Fr.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Fr", z, y);

		// Code to make interactiveness
		// Code to make interactiveness
		g.setColor(Color.black);
		g.setColor(current);
		g.fillRect(start_x + w * 18 + 5, 0, 450, 1000);
		if (num == 1) {
			myMethod(g, "H", "Element Name: Hydrogen", "Atomic Number: 1",
					"Atomic Mass: 1.00784 u",
					"Solid/Liquid/Gas(room temp.): Gas",
					"Melting Point: -259.14 Celsius",
					"Boiling Point: -252.87 Celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1776");
		} else if (num == 3) {
			myMethod(g, "Li", "Element Name: Lithium", "Atomic Number: 3",
					"Atomic Mass:  6.941 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 180.5 celsius",
					"Boiling Point: 1330 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1817");
		} else if (num == 11) {
			myMethod(g, "Na", "Element Name: Sodium", "Atomic Number: 11",
					"Atomic Mass:  22.990 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 97.81 celsius",
					"Boiling Point: 882.9 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1807");
		} else if (num == 19) {
			myMethod(g, "K", "Element Name: Potassium", "Atomic Number: 19",
					"Atomic Mass:  39.0983 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 63.28 celsius",
					"Boiling Point: 760 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1807");
		} else if (num == 37) {
			myMethod(g, "Rb", "Element Name: Rubidium", "Atomic Number: 37",
					"Atomic Mass:  86.4678 u",
					"Solid/Liquid/Gas(room temp.): Liquid",
					"Melting Point: 39.3 celsius", "Boiling Point: 668 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1861");
		} else if (num == 55) {
			myMethod(g, "Cs", "Element Name: Caesium", "Atomic Number: 55",
					"Atomic Mass:  132.9055 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 28.44 celsius",
					"Boiling Point: 670.8 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1860");
		} else if (num == 87) {
			myMethod(g, "Fr", "Element Name: Francium", "Atomic Number: 87",
					"Atomic Mass:  223 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 27 celsius", "Boiling Point: 676.8 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1939");
		} else if (num == 4) {
			myMethod(g, "Be", "Element Name: Beryllium", "Atomic Number: 4",
					"Atomic Mass:  9.012 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1287 celsius",
					"Boiling Point: 2970 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1798");
		} else if (num == 12) {
			myMethod(g, "Mg", "Element Name: Magnesium", "Atomic Number: 12",
					"Atomic Mass:  24.305 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 650 celsius", "Boiling Point: 1091 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1755");
		} else if (num == 20) {
			myMethod(g, "Ca", "Element Name: Calcium", "Atomic Number: 20",
					"Atomic Mass:  40.078 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 842 celsius", "Boiling Point: 1484 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1808");
		} else if (num == 38) {
			myMethod(g, "Sr", "Element Name: Strontium", "Atomic Number: 38",
					"Atomic Mass:  87.62 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 777 celsius", "Boiling Point: 1382 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1790");
		} else if (num == 56) {
			myMethod(g, "Ba", "Element Name: Barium", "Atomic Number: 56",
					"Atomic Mass:  137.327 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 727 celsius", "Boiling Point: 1897 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1808");
		} else if (num == 88) {
			myMethod(g, "Ra", "Element Name: Radium", "Atomic Number: 88",
					"Atomic Mass:  226 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 700 celsius", "Boiling Point: 1737 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1898");
		} else if (num == 21) {
			myMethod(g, "Sc", "Element Name: Scandium", "Atomic Number: 21",
					"Atomic Mass:  44.956 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1541 celsius",
					"Boiling Point: 2836 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1879");
		} else if (num == 39) {
			myMethod(g, "Y", "Element Name: Yttrium", "Atomic Number: 39",
					"Atomic Mass:  88.906 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1526 celsius",
					"Boiling Point: 3338 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1794");
		} else if (num == 22) {
			myMethod(g, "Ti", "Element Name: Titanium", "Atomic Number: 22",
					"Atomic Mass:  47.867 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1668 celsius",
					"Boiling Point: 3287 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1791");
		} else if (num == 200) {
			myMethod(g, "La", "Element Name: Lanthanum", "Atomic Number: 57",
					"Atomic Mass: 138.905 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 920 celsius", "Boiling Point: 3464 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1839");
		} else if (num == 201) {
			myMethod(g, "Ac", "Element Name: Actinium", "Atomic Number: 89",
					"Atomic Mass: 227 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1050 celsius",
					"Boiling Point: 3197 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1899");
		} else if (num == 40) {
			myMethod(g, "Zr", "Element Name: Zirconium", "Atomic Number: 40",
					"Atomic Mass:  91.224 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1855 celsius",
					"Boiling Point: 4409 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1789");
		} else if (num == 72) {
			myMethod(g, "Hf", "Element Name: Hafnium", "Atomic Number: 72",
					"Atomic Mass:  178.49 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 2233 celsius",
					"Boiling Point: 4602 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1923");
		} else if (num == 104) {
			myMethod(g, "Rf", "Element Name: Rutherfordium",
					"Atomic Number: 104", "Atomic Mass:  261 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 2100 celsius",
					"Boiling Point: 5500 celsius", "Man Made/Natural: Man Made",
					"When was it found: 1964");
		} else if (num == 23) {
			myMethod(g, "V", "Element Name: Vanadium", "Atomic Number: 23",
					"Atomic Mass:  50.942 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1910 celsius",
					"Boiling Point: 3407 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1801");
		} else if (num == 41) {
			myMethod(g, "Nb", "Element Name: Niobium", "Atomic Number: 41",
					"Atomic Mass:  92.906 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 2477 celsius",
					"Boiling Point: 4927 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1801");
		} else if (num == 73) {
			myMethod(g, "Ta", "Element Name: Tantalum", "Atomic Number: 73",
					"Atomic Mass:  180.948 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 3017 celsius",
					"Boiling Point: 5457 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1802");
		} else if (num == 105) {
			myMethod(g, "Db", "Element Name: Dubnium", "Atomic Number: 105",
					"Atomic Mass:  262 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 1967");
		} else if (num == 24) {
			myMethod(g, "Cr", "Element Name: Chromium", "Atomic Number: 24",
					"Atomic Mass:  51.996 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1907 celsius",
					"Boiling Point: 2672 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1797");
		} else if (num == 42) {
			myMethod(g, "Mo", "Element Name: Molybdenum", "Atomic Number: 42",
					"Atomic Mass:  95.95 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 2623 celsius",
					"Boiling Point: 4639 celsius", "Man Made/Natural: Man Made",
					"When was it found: 1778");
		} else if (num == 74) {
			myMethod(g, "W", "Element Name: Tungsten", "Atomic Number: 74",
					"Atomic Mass:  183.84 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 3422 celsius",
					"Boiling Point: 5555 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1781");
		} else if (num == 106) {
			myMethod(g, "Sg", "Element Name: Seaborgium", "Atomic Number: 106",
					"Atomic Mass: 271.134 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 1974");
		} else if (num == 25) {
			myMethod(g, "Mn", "Element Name: Manganese", "Atomic Number: 25",
					"Atomic Mass: 54.938 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1246 celsius",
					"Boiling Point: 2061 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1774");
		} else if (num == 43) {
			myMethod(g, "Tc", "Element Name: Technetium", "Atomic Number: 43",
					"Atomic Mass: 98.907 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 2157 celsius",
					"Boiling Point: 4265 celsius", "Man Made/Natural: Man Made",
					"When was it found: 1937");
		} else if (num == 75) {
			myMethod(g, "Re", "Element Name: Rhenium", "Atomic Number: 75",
					"Atomic Mass: 186.207 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 3186 celsius",
					"Boiling Point: 5630 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1925");
		} else if (num == 107) {
			myMethod(g, "Bh", "Element Name: Bohrium", "Atomic Number: 107",
					"Atomic Mass: 264 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1981");
		} else if (num == 26) {
			myMethod(g, "Fe", "Element Name: Iron", "Atomic Number: 26",
					"Atomic Mass: 55.845 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1538 celsius",
					"Boiling Point: 2862 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 5000 BC");
		} else if (num == 44) {
			myMethod(g, "Ru", "Element Name: Ruthenium", "Atomic Number: 44",
					"Atomic Mass: 101.07 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 2334 celsius",
					"Boiling Point: 4150 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1844");
		} else if (num == 76) {
			myMethod(g, "Os", "Element Name: Osmium", "Atomic Number: 76",
					"Atomic Mass: 190.23 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 3033 celsius",
					"Boiling Point: 5008 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1803");
		} else if (num == 108) {
			myMethod(g, "Hs", "Element Name: Hassium", "Atomic Number: 108",
					"Atomic Mass: 277 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 1984");
		} else if (num == 27) {
			myMethod(g, "Co", "Element Name: Cobalt", "Atomic Number: 27",
					"Atomic Mass: 58.933 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1495 celsius",
					"Boiling Point: 2870 celsius",
					"Man Made/Natural: Natural Occurring",
					"When was it found: 1735");
		} else if (num == 77) {
			myMethod(g, "Ir", "Element Name: Iridium", "Atomic Number: 77",
					"Atomic Mass: 192.217 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 2466 celsius",
					"Boiling Point: 4130 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1803");
		} else if (num == 45) {
			myMethod(g, "Rh", "Element Name: Rhodium", "Atomic Number: 45",
					"Atomic Mass: 102.906 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1964 celsius",
					"Boiling Point: 3697 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1803");
		} else if (num == 109) {
			myMethod(g, "Mt", "Element Name: Meitnerium", "Atomic Number: 109",
					"Atomic Mass: 278 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 1982");
		} else if (num == 28) {
			myMethod(g, "Ni", "Element Name: Nickel", "Atomic Number: 28",
					"Atomic Mass: 58.693 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1455 celsius",
					"Boiling Point: 2730 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1751");
		} else if (num == 46) {
			myMethod(g, "Pd", "Element Name: Palladium", "Atomic Number: 46",
					"Atomic Mass: 106.42 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1555 celsius",
					"Boiling Point: 2963 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1802");
		} else if (num == 78) {
			myMethod(g, "Pt", "Element Name: Platinum", "Atomic Number: 78",
					"Atomic Mass: 195.08 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1768 celsius",
					"Boiling Point: 3825 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1735");
		} else if (num == 110) {
			myMethod(g, "Ds", "Element Name: Darmstadtium",
					"Atomic Number: 110", "Atomic Mass: 281 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 1994");
		} else if (num == 29) {
			myMethod(g, "Cu", "Element Name: Copper", "Atomic Number: 29",
					"Atomic Mass: 63.546 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1085 celsius",
					"Boiling Point: 2560 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 9000 BC");
		} else if (num == 47) {
			myMethod(g, "Ag", "Element Name: Silver", "Atomic Number: 47",
					"Atomic Mass: 107.87 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 962 celsius", "Boiling Point: 2162 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 3000 BC");
		} else if (num == 79) {
			myMethod(g, "Au", "Element Name: Gold", "Atomic Number: 79",
					"Atomic Mass: 196.97 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1064 celsius",
					"Boiling Point: 2700 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1848");
		} else if (num == 111) {
			myMethod(g, "Rg", "Element Name: Roentgenium", "Atomic Number: 111",
					"Atomic Mass: 282 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 1994");
		} else if (num == 48) {
			myMethod(g, "Cd", "Element Name: Cadmium", "Atomic Number: 48",
					"Atomic Mass: 112.41 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 321 celsius", "Boiling Point: 767 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1817");
		} else if (num == 80) {
			myMethod(g, "Hg", "Element Name: Mercury", "Atomic Number: 80",
					"Atomic Mass: 200.59 u",
					"Solid/Liquid/Gas(room temp.): Liquid",
					"Melting Point: -39 celsius", "Boiling Point: 357 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1500 BC");
		} else if (num == 112) {
			myMethod(g, "Cn", "Element Name: Copernicium", "Atomic Number: 112",
					"Atomic Mass: 285 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 1996");
		} else if (num == 5) {
			myMethod(g, "B", "Element Name: Boron", "Atomic Number: 5",
					"Atomic Mass: 10.81 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 2077 celsius",
					"Boiling Point: 4000 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1808");
		} else if (num == 13) {
			myMethod(g, "Al", "Element Name: Aluminium", "Atomic Number: 13",
					"Atomic Mass: 26.982 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 660 celsius", "Boiling Point: 2470 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1825");
		} else if (num == 31) {
			myMethod(g, "Ga", "Element Name: Gallium", "Atomic Number: 31",
					"Atomic Mass: 69.723 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 30 celsius", "Boiling Point: 2400 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1875");
		} else if (num == 49) {
			myMethod(g, "In", "Element Name: Indium", "Atomic Number: 49",
					"Atomic Mass: 114.82 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 157 celsius", "Boiling Point: 2072 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1863");
		} else if (num == 81) {
			myMethod(g, "Tl", "Element Name: Thallium", "Atomic Number: 81",
					"Atomic Mass: 204.38 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 304 celsius", "Boiling Point: 1473 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1861");
		} else if (num == 113) {
			myMethod(g, "Nh", "Element Name: Nihonium", "Atomic Number: 113",
					"Atomic Mass: 286 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 2003");
		} else if (num == 6) {
			myMethod(g, "C", "Element Name: Carbon", "Atomic Number: 6",
					"Atomic Mass: 12.01 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 3550 celsius",
					"Boiling Point: 4827 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1789");
		} else if (num == 14) {
			myMethod(g, "Si", "Element Name: Silicon", "Atomic Number: 14",
					"Atomic Mass: 28.085 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1414 celsius",
					"Boiling Point: 3265 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1823");
		} else if (num == 32) {
			myMethod(g, "Ge", "Element Name: Germanium", "Atomic Number: 32",
					"Atomic Mass: 72.630 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 938 celsius", "Boiling Point: 2833 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1886");
		} else if (num == 50) {
			myMethod(g, "Sn", "Element Name: Tin", "Atomic Number: 50",
					"Atomic Mass: 118.71 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 232 celsius", "Boiling Point: 2602 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 2100 BC");
		} else if (num == 82) {
			myMethod(g, "Pb", "Element Name: Lead", "Atomic Number: 82",
					"Atomic Mass: 207.2 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 328 celsius", "Boiling Point: 1749 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 3000 BC");
		} else if (num == 114) {
			myMethod(g, "Fl", "Element Name: Flerovium", "Atomic Number: 114",
					"Atomic Mass: 289 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 1998");
		} else if (num == 7) {
			myMethod(g, "N", "Element Name: Nitrogen", "Atomic Number: 7",
					"Atomic Mass: 14.007 u",
					"Solid/Liquid/Gas(room temp.): Gas",
					"Melting Point: -210 celsius",
					"Boiling Point: -196 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1772");
		} else if (num == 15) {
			myMethod(g, "P", "Element Name: Phosphorus", "Atomic Number: 15",
					"Atomic Mass: 30.974 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 44 celsius", "Boiling Point: 281 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1669");
		} else if (num == 33) {
			myMethod(g, "As", "Element Name: Arsenic", "Atomic Number: 33",
					"Atomic Mass: 74.922 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 817 celsius", "Boiling Point: 613 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1250");
		} else if (num == 51) {
			myMethod(g, "Sb", "Element Name: Antimony", "Atomic Number: 51",
					"Atomic Mass: 121.76 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 631 celsius", "Boiling Point: 1587 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 3000 BC");
		} else if (num == 83) {
			myMethod(g, "Bi", "Element Name: Bismuth", "Atomic Number: 83",
					"Atomic Mass: 208.98 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 271 celsius", "Boiling Point: 1564 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1753");
		} else if (num == 115) {
			myMethod(g, "Mc", "Element Name: Moscovium", "Atomic Number: 115",
					"Atomic Mass: 290 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 2003");
		} else if (num == 8) {
			myMethod(g, "O", "Element Name: Oxygen", "Atomic Number: 8",
					"Atomic Mass: 15.999 u",
					"Solid/Liquid/Gas(room temp.): Gas",
					"Melting Point: -219 celsius",
					"Boiling Point: -183 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1772");
		} else if (num == 16) {
			myMethod(g, "S", "Element Name: Sulfur", "Atomic Number: 16",
					"Atomic Mass: 32.06 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 115 celsius", "Boiling Point: 444 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1809");
		} else if (num == 34) {
			myMethod(g, "Se", "Element Name: Selenium", "Atomic Number: 34",
					"Atomic Mass: 78.971 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 220 celsius", "Boiling Point: 685 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1817");
		} else if (num == 52) {
			myMethod(g, "Te", "Element Name: Tellurium", "Atomic Number: 52",
					"Atomic Mass: 127.60 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 450 celsius", "Boiling Point: 988 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1782");
		} else if (num == 84) {
			myMethod(g, "Po", "Element Name: Polonium", "Atomic Number: 84",
					"Atomic Mass: 209 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 254 celsius", "Boiling Point: 962 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1898");
		} else if (num == 116) {
			myMethod(g, "Lv", "Element Name: Livermorium", "Atomic Number: 116",
					"Atomic Mass: 293 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 2000");
		} else if (num == 9) {
			myMethod(g, "F", "Element Name: Fluorine", "Atomic Number: 9",
					"Atomic Mass: 18.998 u",
					"Solid/Liquid/Gas(room temp.): Gas",
					"Melting Point: -220 celsius",
					"Boiling Point: -188 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1886");
		} else if (num == 17) {
			myMethod(g, "Cl", "Element Name: Chlorine", "Atomic Number: 17",
					"Atomic Mass: 35.45 u", "Solid/Liquid/Gas(room temp.): Gas",
					"Melting Point: -101 celsius", "Boiling Point: -34 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1774");
		} else if (num == 35) {
			myMethod(g, "Br", "Element Name: Bromine", "Atomic Number: 35",
					"Atomic Mass: 79.904 u",
					"Solid/Liquid/Gas(room temp.): Liquid",
					"Melting Point: -7 celsius", "Boiling Point: 59 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1826");
		} else if (num == 53) {
			myMethod(g, "I", "Element Name: Iodine", "Atomic Number: 53",
					"Atomic Mass: 126.90 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 114 celsius", "Boiling Point: 184 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1811");
		} else if (num == 85) {
			myMethod(g, "At", "Element Name: Astatine", "Atomic Number: 85",
					"Atomic Mass: 210 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 302 celsius", "Boiling Point: 337 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1940");
		} else if (num == 117) {
			myMethod(g, "Ts", "Element Name: Tennessine", "Atomic Number: 117",
					"Atomic Mass: 294 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 2010");
		} else if (num == 2) {
			myMethod(g, "He", "Element Name: Helium", "Atomic Number: 2",
					"Atomic Mass: 4.0026 u",
					"Solid/Liquid/Gas(room temp.): Gas",
					"Melting Point: -272 celsius",
					"Boiling Point: -269 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1868");
		} else if (num == 10) {
			myMethod(g, "Ne", "Element Name: Neon", "Atomic Number: 10",
					"Atomic Mass: 20.180 u",
					"Solid/Liquid/Gas(room temp.): Gas",
					"Melting Point: -248 celsius",
					"Boiling Point: -246 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1898");
		} else if (num == 18) {
			myMethod(g, "Ar", "Element Name: Argon", "Atomic Number: 18",
					"Atomic Mass: 39.948 u",
					"Solid/Liquid/Gas(room temp.): Gas",
					"Melting Point: -189 celsius",
					"Boiling Point: -186 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1894");
		} else if (num == 36) {
			myMethod(g, "Kr", "Element Name: Krypton", "Atomic Number: 36",
					"Atomic Mass: 83.798 u",
					"Solid/Liquid/Gas(room temp.): Gas",
					"Melting Point: -157 celsius",
					"Boiling Point: -153 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1898");
		} else if (num == 54) {
			myMethod(g, "Xe", "Element Name: Xenon", "Atomic Number: 54",
					"Atomic Mass: 131.29 u",
					"Solid/Liquid/Gas(room temp.): Gas",
					"Melting Point: -112 celsius",
					"Boiling Point: -108 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1898");
		} else if (num == 86) {
			myMethod(g, "Rn", "Element Name: Radon", "Atomic Number: 86",
					"Atomic Mass: 222 u", "Solid/Liquid/Gas(room temp.): Gas",
					"Melting Point: -71 celsius", "Boiling Point: -62 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1900");
		} else if (num == 118) {
			myMethod(g, "Og", "Element Name: Oganesson", "Atomic Number: 118",
					"Atomic Mass: 294 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: Unknown", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 2006");
		} else if (num == 57) {
			myMethod(g, "La", "Element Name: Lanthanum", "Atomic Number: 57",
					"Atomic Mass: 138.91 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 920 celsius", "Boiling Point: 3464 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1839");
		} else if (num == 58) {
			myMethod(g, "Ce", "Element Name: Cerium", "Atomic Number: 58",
					"Atomic Mass: 140.12 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 795 celsius", "Boiling Point: 3443 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1803");
		} else if (num == 59) {
			myMethod(g, "Pr", "Element Name: Praseodymium", "Atomic Number: 59",
					"Atomic Mass: 140.91 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 931 celsius", "Boiling Point: 3512 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1885");
		} else if (num == 60) {
			myMethod(g, "Nd", "Element Name: Neodymium", "Atomic Number: 60",
					"Atomic Mass: 144.24 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1016 celsius",
					"Boiling Point: 3074 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1885");
		} else if (num == 61) {
			myMethod(g, "Pm", "Element Name: Promethium", "Atomic Number: 61",
					"Atomic Mass: 145 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1042 celsius",
					"Boiling Point: 3000 celsius", "Man Made/Natural: Man Made",
					"When was it found: 1945");
		} else if (num == 62) {
			myMethod(g, "Sm", "Element Name: Samarium", "Atomic Number: 62",
					"Atomic Mass: 150.36 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1072 celsius",
					"Boiling Point: 1794 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1879");
		} else if (num == 63) {
			myMethod(g, "Eu", "Element Name: Europium", "Atomic Number: 63",
					"Atomic Mass: 151.96 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 826 celsius", "Boiling Point: 1529 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1901");
		} else if (num == 64) {
			myMethod(g, "Gd", "Element Name: Gadolinium", "Atomic Number: 64",
					"Atomic Mass: 157.25 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1313 celsius",
					"Boiling Point: 3272 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1880");
		} else if (num == 65) {
			myMethod(g, "Tb", "Element Name: Terbium", "Atomic Number: 65",
					"Atomic Mass: 158.93 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1356 celsius",
					"Boiling Point: 3227 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1843");
		} else if (num == 66) {
			myMethod(g, "Dy", "Element Name: Dysprosium", "Atomic Number: 66",
					"Atomic Mass: 162.50 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1412 celsius",
					"Boiling Point: 2567 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1886");
		} else if (num == 67) {
			myMethod(g, "Ho", "Element Name: Holmium", "Atomic Number: 67",
					"Atomic Mass: 164.93 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1472 celsius",
					"Boiling Point: 2695 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1878");
		} else if (num == 68) {
			myMethod(g, "Er", "Element Name: Erbium", "Atomic Number: 68",
					"Atomic Mass: 167.26 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1529 celsius",
					"Boiling Point: 2868 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1843");
		} else if (num == 30) {
			myMethod(g, "Zn", "Element Name: Zinc", "Atomic Number: 30",
					"Atomic Mass: 65.38 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 420 celsius", "Boiling Point: 907 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1746");
		} else if (num == 69) {
			myMethod(g, "Tm", "Element Name: Thulium", "Atomic Number: 69",
					"Atomic Mass: 168.93 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1545 celsius",
					"Boiling Point: 1730 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1879");
		} else if (num == 70) {
			myMethod(g, "Yb", "Element Name: Ytterbium", "Atomic Number: 70",
					"Atomic Mass: 173.05 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 824 celsius", "Boiling Point: 1196 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1878");
		} else if (num == 71) {
			myMethod(g, "Lu", "Element Name: Lutetium", "Atomic Number: 71",
					"Atomic Mass: 174.97 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 3025 celsius",
					"Boiling Point: 6156 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1907");
		} else if (num == 89) {
			myMethod(g, "Ac", "Element Name: Actinium", "Atomic Number: 89",
					"Atomic Mass: 227 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1227 celsius",
					"Boiling Point: 3200 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1889");
		} else if (num == 90) {
			myMethod(g, "Th", "Element Name: Thorium", "Atomic Number: 90",
					"Atomic Mass: 232.04 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1750 celsius",
					"Boiling Point: 4787 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1828");
		} else if (num == 91) {
			myMethod(g, "Pa", "Element Name: Protactinium", "Atomic Number: 91",
					"Atomic Mass: 231.04 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1568 celsius",
					"Boiling Point: 4027 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1913");
		} else if (num == 92) {
			myMethod(g, "U", "Element Name: Uranium", "Atomic Number: 92",
					"Atomic Mass: 238.03 u",
					"Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1132 celsius",
					"Boiling Point: 4131 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1789");
		} else if (num == 93) {
			myMethod(g, "Np", "Element Name: Neptunium", "Atomic Number: 93",
					"Atomic Mass: 237 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 2466 celsius",
					"Boiling Point: 4130 celsius", "Man Made/Natural: Man Made",
					"When was it found: 1940");
		} else if (num == 94) {
			myMethod(g, "Pu", "Element Name: Plutonium", "Atomic Number: 94",
					"Atomic Mass: 244 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 639 celsius", "Boiling Point: 3232 celsius",
					"Man Made/Natural: Naturally Occurring",
					"When was it found: 1940");
		} else if (num == 95) {
			myMethod(g, "Am", "Element Name: Americium", "Atomic Number: 95",
					"Atomic Mass: 243 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1176 celsius",
					"Boiling Point: 2607 celsius", "Man Made/Natural: Man Made",
					"When was it found: 1944");
		} else if (num == 96) {
			myMethod(g, "Cm", "Element Name: Curium", "Atomic Number: 96",
					"Atomic Mass: 247 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 1345 celsius",
					"Boiling Point: 3110 celsius", "Man Made/Natural: Man Made",
					"When was it found: 1944");
		} else if (num == 97) {
			myMethod(g, "Bk", "Element Name: Berkelium", "Atomic Number: 97",
					"Atomic Mass: 247 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 986 celsius", "Boiling Point: 2627 celsius",
					"Man Made/Natural: Man Made", "When was it found: 1949");
		} else if (num == 98) {
			myMethod(g, "Cf", "Element Name: Californium", "Atomic Number: 98",
					"Atomic Mass: 251 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 900 celsius", "Boiling Point: 1472 celsius",
					"Man Made/Natural: Man Made", "When was it found: 1950");
		} else if (num == 99) {
			myMethod(g, "Es", "Element Name: Einsteinium", "Atomic Number: 99",
					"Atomic Mass: 252 u", "Solid/Liquid/Gas(room temp.): Solid",
					"Melting Point: 860 celsius", "Boiling Point: 996 celsius",
					"Man Made/Natural: Man Made", "When was it found: 1952");
		} else if (num == 100) {
			myMethod(g, "Fm", "Element Name: Fermium", "Atomic Number: 100",
					"Atomic Mass: 257 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: 1527 celsius", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 1953");
		} else if (num == 101) {
			myMethod(g, "Md", "Element Name: Mendelevium", "Atomic Number: 101",
					"Atomic Mass: 258 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: 827 celsius", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 1955");
		} else if (num == 102) {
			myMethod(g, "No", "Element Name: Nobelium", "Atomic Number: 102",
					"Atomic Mass: 259 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: 827 celsius", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 1958");
		} else if (num == 103) {
			myMethod(g, "Lr", "Element Name: Lawrencium", "Atomic Number: 103",
					"Atomic Mass: 266 u",
					"Solid/Liquid/Gas(room temp.): Unknown",
					"Melting Point: 1627 celsius", "Boiling Point: Unknown",
					"Man Made/Natural: Man Made", "When was it found: 1961");
		} else {
			g.setColor(Color.black);
			g.drawString("Welcome: Click on any element", start_x + w * 19,
					350);
		}
		num = 0;

		g.setColor(new Color(247, 170, 92));
		g.fillRect(start_x + w, start_y + h, w, h);
		Be = new Rectangle(start_x + w, start_y + h, w, h);
		z = Be.x + (Be.width - metrics.stringWidth("Be")) / 2;
		y = Be.y + ((Be.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Be", z, y);

		g.setColor(new Color(247, 170, 92));
		g.fillRect(start_x + w, start_y + h * 2, w, h);
		Mg = new Rectangle(start_x + w, start_y + h * 2, w, h);
		z = Mg.x + (Mg.width - metrics.stringWidth("Mg")) / 2;
		y = Mg.y + ((Mg.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Mg", z, y);

		g.setColor(new Color(247, 170, 92));
		g.fillRect(start_x + w, start_y + h * 3, w, h);
		Ca = new Rectangle(start_x + w, start_y + h * 3, w, h);
		z = Ca.x + (Ca.width - metrics.stringWidth("Ca")) / 2;
		y = Ca.y + ((Ca.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ca", z, y);

		g.setColor(new Color(247, 170, 92));
		g.fillRect(start_x + w, start_y + h * 4, w, h);
		Sr = new Rectangle(start_x + w, start_y + h * 4, w, h);
		z = Sr.x + (Sr.width - metrics.stringWidth("Sr")) / 2;
		y = Sr.y + ((Sr.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Sr", z, y);

		g.setColor(new Color(247, 170, 92));
		g.fillRect(start_x + w, start_y + h * 5, w, h);
		Ba = new Rectangle(start_x + w, start_y + h * 5, w, h);
		z = Ba.x + (Ba.width - metrics.stringWidth("Ba")) / 2;
		y = Ba.y + ((Ba.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ba", z, y);

		g.setColor(new Color(247, 170, 92));
		g.fillRect(start_x + w, start_y + h * 6, w, h);
		Ra = new Rectangle(start_x + w, start_y + h * 6, w, h);
		z = Ra.x + (Ra.width - metrics.stringWidth("Ra")) / 2;
		y = Ra.y + ((Ra.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ra", z, y);

		for (int x = 2; x <= 11; x++) {

			g.setColor(new Color(237, 237, 135));
			g.fillRect(start_x + w * x, start_y + h * 3, w, h);
			g.setColor(new Color(237, 237, 135));
			g.fillRect(start_x + w * x, start_y + h * 4, w, h);
			g.setColor(new Color(237, 237, 135));
			g.fillRect(start_x + w * x, start_y + h * 5, w, h);
			g.setColor(new Color(237, 237, 135));
			g.fillRect(start_x + w * x, start_y + h * 6, w, h);

		}

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 2, start_y + h * 5, w, h);
		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 2, start_y + h * 6, w, h);

		// Coding Line 3
		Sc = new Rectangle(start_x + w * 2, start_y + h * 3, w, h);
		z = Sc.x + (Sc.width - metrics.stringWidth("Sc")) / 2;
		y = Sc.y + ((Sc.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Sc", z, y);

		Y = new Rectangle(start_x + w * 2, start_y + h * 4, w, h);
		z = Y.x + (Y.width - metrics.stringWidth("Y")) / 2;
		y = Y.y + ((Y.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Y", z, y);

		La = new Rectangle(start_x + w * 2, start_y + h * 5, w, h);
		z = La.x + (La.width - metrics.stringWidth("*La")) / 2;
		y = La.y + ((La.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("*La", z, y);

		Ac = new Rectangle(start_x + w * 2, start_y + h * 6, w, h);
		z = Ac.x + (Ac.width - metrics.stringWidth("+Ac")) / 2;
		y = Ac.y + ((Ac.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("+Ac", z, y);

		// Coding Line 4
		Ti = new Rectangle(start_x + w * 3, start_y + h * 3, w, h);
		z = Ti.x + (Ti.width - metrics.stringWidth("Ti")) / 2;
		y = Ti.y + ((Ti.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ti", z, y);

		Zr = new Rectangle(start_x + w * 3, start_y + h * 4, w, h);
		z = Zr.x + (Zr.width - metrics.stringWidth("Zr")) / 2;
		y = Zr.y + ((Zr.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Zr", z, y);

		Hf = new Rectangle(start_x + w * 3, start_y + h * 5, w, h);
		z = Hf.x + (Hf.width - metrics.stringWidth("Hf")) / 2;
		y = Hf.y + ((Hf.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Hf", z, y);

		Rf = new Rectangle(start_x + w * 3, start_y + h * 6, w, h);
		z = Rf.x + (Rf.width - metrics.stringWidth("Rf")) / 2;
		y = Rf.y + ((Rf.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Rf", z, y);

		// Coding Line 5
		V = new Rectangle(start_x + w * 4, start_y + h * 3, w, h);
		z = V.x + (V.width - metrics.stringWidth("V")) / 2;
		y = V.y + ((V.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("V", z, y);

		Nb = new Rectangle(start_x + w * 4, start_y + h * 4, w, h);
		z = Nb.x + (Nb.width - metrics.stringWidth("Nb")) / 2;
		y = Nb.y + ((Nb.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Nb", z, y);

		Ta = new Rectangle(start_x + w * 4, start_y + h * 5, w, h);
		z = Ta.x + (Ta.width - metrics.stringWidth("Ta")) / 2;
		y = Ta.y + ((Ta.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ta", z, y);

		Db = new Rectangle(start_x + w * 4, start_y + h * 6, w, h);
		z = Db.x + (Db.width - metrics.stringWidth("Db")) / 2;
		y = Db.y + ((Db.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Db", z, y);

		// Coding Line 6
		Cr = new Rectangle(start_x + w * 5, start_y + h * 3, w, h);
		z = Cr.x + (Cr.width - metrics.stringWidth("Cr")) / 2;
		y = Cr.y + ((Cr.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Cr", z, y);

		Mo = new Rectangle(start_x + w * 5, start_y + h * 4, w, h);
		z = Mo.x + (Mo.width - metrics.stringWidth("Mo")) / 2;
		y = Mo.y + ((Mo.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Mo", z, y);

		W = new Rectangle(start_x + w * 5, start_y + h * 5, w, h);
		z = W.x + (W.width - metrics.stringWidth("W")) / 2;
		y = W.y + ((W.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("W", z, y);

		Sg = new Rectangle(start_x + w * 5, start_y + h * 6, w, h);
		z = Sg.x + (Sg.width - metrics.stringWidth("Sg")) / 2;
		y = Sg.y + ((Sg.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Sg", z, y);

		// Coding Line 7
		Mn = new Rectangle(start_x + w * 6, start_y + h * 3, w, h);
		z = Mn.x + (Mn.width - metrics.stringWidth("Mn")) / 2;
		y = Mn.y + ((Mn.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Mn", z, y);

		Tc = new Rectangle(start_x + w * 6, start_y + h * 4, w, h);
		z = Tc.x + (Tc.width - metrics.stringWidth("Tc")) / 2;
		y = Tc.y + ((Tc.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Tc", z, y);

		Re = new Rectangle(start_x + w * 6, start_y + h * 5, w, h);
		z = Re.x + (Re.width - metrics.stringWidth("Re")) / 2;
		y = Re.y + ((Re.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Re", z, y);

		Bh = new Rectangle(start_x + w * 6, start_y + h * 6, w, h);
		z = Bh.x + (Bh.width - metrics.stringWidth("Bh")) / 2;
		y = Bh.y + ((Bh.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Bh", z, y);

		// Coding Line 8
		Fe = new Rectangle(start_x + w * 7, start_y + h * 3, w, h);
		z = Fe.x + (Fe.width - metrics.stringWidth("Fe")) / 2;
		y = Fe.y + ((Fe.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Fe", z, y);

		Ru = new Rectangle(start_x + w * 7, start_y + h * 4, w, h);
		z = Ru.x + (Ru.width - metrics.stringWidth("Ru")) / 2;
		y = Ru.y + ((Ru.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ru", z, y);

		Os = new Rectangle(start_x + w * 7, start_y + h * 5, w, h);
		z = Os.x + (Os.width - metrics.stringWidth("Os")) / 2;
		y = Os.y + ((Os.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Os", z, y);

		Hs = new Rectangle(start_x + w * 7, start_y + h * 6, w, h);
		z = Hs.x + (Hs.width - metrics.stringWidth("Hs")) / 2;
		y = Hs.y + ((Hs.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Hs", z, y);

		// Coding Line 9
		Co = new Rectangle(start_x + w * 8, start_y + h * 3, w, h);
		z = Co.x + (Co.width - metrics.stringWidth("Co")) / 2;
		y = Co.y + ((Co.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Co", z, y);

		Rh = new Rectangle(start_x + w * 8, start_y + h * 4, w, h);
		z = Rh.x + (Rh.width - metrics.stringWidth("Rh")) / 2;
		y = Rh.y + ((Rh.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Rh", z, y);

		Ir = new Rectangle(start_x + w * 8, start_y + h * 5, w, h);
		z = Ir.x + (Ir.width - metrics.stringWidth("Ir")) / 2;
		y = Ir.y + ((Ir.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ir", z, y);

		Mt = new Rectangle(start_x + w * 8, start_y + h * 6, w, h);
		z = Mt.x + (Mt.width - metrics.stringWidth("Mt")) / 2;
		y = Mt.y + ((Mt.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Mt", z, y);

		// Coding Line 10
		Ni = new Rectangle(start_x + w * 9, start_y + h * 3, w, h);
		z = Ni.x + (Ni.width - metrics.stringWidth("Ni")) / 2;
		y = Ni.y + ((Ni.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ni", z, y);

		Pd = new Rectangle(start_x + w * 9, start_y + h * 4, w, h);
		z = Pd.x + (Pd.width - metrics.stringWidth("Pd")) / 2;
		y = Pd.y + ((Pd.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Pd", z, y);

		Pt = new Rectangle(start_x + w * 9, start_y + h * 5, w, h);
		z = Pt.x + (Pt.width - metrics.stringWidth("Pt")) / 2;
		y = Pt.y + ((Pt.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Pt", z, y);

		Ds = new Rectangle(start_x + w * 9, start_y + h * 6, w, h);
		z = Ds.x + (Ds.width - metrics.stringWidth("Ds")) / 2;
		y = Ds.y + ((Ds.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ds", z, y);

		// Coding Line 11
		Cu = new Rectangle(start_x + w * 10, start_y + h * 3, w, h);
		z = Cu.x + (Cu.width - metrics.stringWidth("Cu")) / 2;
		y = Cu.y + ((Cu.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Cu", z, y);

		Ag = new Rectangle(start_x + w * 10, start_y + h * 4, w, h);
		z = Ag.x + (Ag.width - metrics.stringWidth("Ag")) / 2;
		y = Ag.y + ((Ag.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ag", z, y);

		Au = new Rectangle(start_x + w * 10, start_y + h * 5, w, h);
		z = Au.x + (Au.width - metrics.stringWidth("Au")) / 2;
		y = Au.y + ((Au.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Au", z, y);

		Rg = new Rectangle(start_x + w * 10, start_y + h * 6, w, h);
		z = Rg.x + (Rg.width - metrics.stringWidth("Rg")) / 2;
		y = Rg.y + ((Rg.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Rg", z, y);

		// Coding Line 12
		Zn = new Rectangle(start_x + w * 11, start_y + h * 3, w, h);
		z = Zn.x + (Zn.width - metrics.stringWidth("Zn")) / 2;
		y = Zn.y + ((Zn.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Zn", z, y);

		Cd = new Rectangle(start_x + w * 11, start_y + h * 4, w, h);
		z = Cd.x + (Cd.width - metrics.stringWidth("Cd")) / 2;
		y = Cd.y + ((Cd.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Cd", z, y);

		Hg = new Rectangle(start_x + w * 11, start_y + h * 5, w, h);
		z = Hg.x + (Hg.width - metrics.stringWidth("Hg")) / 2;
		y = Hg.y + ((Hg.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Hg", z, y);

		Cn = new Rectangle(start_x + w * 11, start_y + h * 6, w, h);
		z = Cn.x + (Cn.width - metrics.stringWidth("Cn")) / 2;
		y = Cn.y + ((Cn.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Cn", z, y);

		for (int x = 12; x <= 16; x++) {
			g.setColor(new Color(166, 179, 169));
			g.fillRect(start_x + w * x, start_y + h, w, h);
			g.setColor(new Color(166, 179, 169));
			g.fillRect(start_x + w * x, start_y + h * 2, w, h);
			g.setColor(new Color(166, 179, 169));
			g.fillRect(start_x + w * x, start_y + h * 3, w, h);
			g.setColor(new Color(166, 179, 169));
			g.fillRect(start_x + w * x, start_y + h * 4, w, h);
			g.setColor(new Color(166, 179, 169));
			g.fillRect(start_x + w * x, start_y + h * 5, w, h);
			g.setColor(new Color(166, 179, 169));
			g.fillRect(start_x + w * x, start_y + h * 6, w, h);
		}

		// Color coding line 13
		g.setColor(new Color(121, 168, 132));
		g.fillRect(start_x + w * 12, start_y + h, w, h);
		B = new Rectangle(start_x + w * 12, start_y + h, w, h);
		z = B.x + (B.width - metrics.stringWidth("B")) / 2;
		y = B.y + ((B.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("B", z, y);

		g.setColor(new Color(114, 242, 144));
		g.fillRect(start_x + w * 12, start_y + h * 2, w, h);
		Al = new Rectangle(start_x + w * 12, start_y + h * 2, w, h);
		z = Al.x + (Al.width - metrics.stringWidth("Al")) / 2;
		y = Al.y + ((Al.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Al", z, y);

		g.setColor(new Color(114, 242, 144));
		g.fillRect(start_x + w * 12, start_y + h * 3, w, h);
		Ga = new Rectangle(start_x + w * 12, start_y + h * 3, w, h);
		z = Ga.x + (Ga.width - metrics.stringWidth("Ga")) / 2;
		y = Ga.y + ((Ga.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ga", z, y);

		g.setColor(new Color(114, 242, 144));
		g.fillRect(start_x + w * 12, start_y + h * 4, w, h);
		In = new Rectangle(start_x + w * 12, start_y + h * 4, w, h);
		z = In.x + (In.width - metrics.stringWidth("In")) / 2;
		y = In.y + ((In.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("In", z, y);

		g.setColor(new Color(114, 242, 144));
		g.fillRect(start_x + w * 12, start_y + h * 5, w, h);
		Tl = new Rectangle(start_x + w * 12, start_y + h * 5, w, h);
		z = Tl.x + (Tl.width - metrics.stringWidth("Tl")) / 2;
		y = Tl.y + ((Tl.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Tl", z, y);

		g.setColor(new Color(114, 242, 144));
		g.fillRect(start_x + w * 12, start_y + h * 6, w, h);
		Nh = new Rectangle(start_x + w * 12, start_y + h * 6, w, h);
		z = Nh.x + (Nh.width - metrics.stringWidth("Nh")) / 2;
		y = Nh.y + ((Nh.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Nh", z, y);

		// Color coding line 14
		g.setColor(new Color(92, 242, 247));
		g.fillRect(start_x + w * 13, start_y + h, w, h);
		C = new Rectangle(start_x + w * 13, start_y + h * 1, w, h);
		z = C.x + (C.width - metrics.stringWidth("C")) / 2;
		y = C.y + ((C.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("C", z, y);

		g.setColor(new Color(121, 168, 132));
		g.fillRect(start_x + w * 13, start_y + h * 2, w, h);
		Si = new Rectangle(start_x + w * 13, start_y + h * 2, w, h);
		z = Si.x + (Si.width - metrics.stringWidth("Si")) / 2;
		y = Si.y + ((Si.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Si", z, y);

		g.setColor(new Color(121, 168, 132));
		g.fillRect(start_x + w * 13, start_y + h * 3, w, h);
		Ge = new Rectangle(start_x + w * 13, start_y + h * 3, w, h);
		z = Ge.x + (Ge.width - metrics.stringWidth("Ge")) / 2;
		y = Ge.y + ((Ge.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ge", z, y);

		g.setColor(new Color(114, 242, 144));
		g.fillRect(start_x + w * 13, start_y + h * 4, w, h);
		Sn = new Rectangle(start_x + w * 13, start_y + h * 4, w, h);
		z = Sn.x + (Sn.width - metrics.stringWidth("Sn")) / 2;
		y = Sn.y + ((Sn.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Sn", z, y);

		g.setColor(new Color(114, 242, 144));
		g.fillRect(start_x + w * 13, start_y + h * 5, w, h);
		Pb = new Rectangle(start_x + w * 13, start_y + h * 5, w, h);
		z = Pb.x + (Pb.width - metrics.stringWidth("Pb")) / 2;
		y = Pb.y + ((Pb.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Pb", z, y);

		g.setColor(new Color(114, 242, 144));
		g.fillRect(start_x + w * 13, start_y + h * 6, w, h);
		Fl = new Rectangle(start_x + w * 13, start_y + h * 6, w, h);
		z = Fl.x + (Fl.width - metrics.stringWidth("Fl")) / 2;
		y = Fl.y + ((Fl.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Fl", z, y);

		// Color coding line 15
		g.setColor(new Color(92, 242, 247));
		g.fillRect(start_x + w * 14, start_y + h, w, h);
		N = new Rectangle(start_x + w * 14, start_y + h * 1, w, h);
		z = N.x + (N.width - metrics.stringWidth("N")) / 2;
		y = N.y + ((N.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("N", z, y);

		g.setColor(new Color(92, 242, 247));
		g.fillRect(start_x + w * 14, start_y + h * 2, w, h);
		P = new Rectangle(start_x + w * 14, start_y + h * 2, w, h);
		z = P.x + (P.width - metrics.stringWidth("P")) / 2;
		y = P.y + ((P.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("P", z, y);

		g.setColor(new Color(121, 168, 132));
		g.fillRect(start_x + w * 14, start_y + h * 3, w, h);
		As = new Rectangle(start_x + w * 14, start_y + h * 3, w, h);
		z = As.x + (As.width - metrics.stringWidth("As")) / 2;
		y = As.y + ((As.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("As", z, y);

		g.setColor(new Color(121, 168, 132));
		g.fillRect(start_x + w * 14, start_y + h * 4, w, h);
		Sb = new Rectangle(start_x + w * 14, start_y + h * 4, w, h);
		z = Sb.x + (Sb.width - metrics.stringWidth("Sb")) / 2;
		y = Sb.y + ((Sb.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Sb", z, y);

		g.setColor(new Color(114, 242, 144));
		g.fillRect(start_x + w * 14, start_y + h * 5, w, h);
		Bi = new Rectangle(start_x + w * 14, start_y + h * 5, w, h);
		z = Bi.x + (Bi.width - metrics.stringWidth("Bi")) / 2;
		y = Bi.y + ((Bi.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Bi", z, y);

		g.setColor(new Color(114, 242, 144));
		g.fillRect(start_x + w * 14, start_y + h * 6, w, h);
		Mc = new Rectangle(start_x + w * 14, start_y + h * 6, w, h);
		z = Mc.x + (Mc.width - metrics.stringWidth("Mc")) / 2;
		y = Mc.y + ((Mc.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Mc", z, y);

		// Color coding line 16
		g.setColor(new Color(92, 242, 247));
		g.fillRect(start_x + w * 15, start_y + h, w, h);
		O = new Rectangle(start_x + w * 15, start_y + h * 1, w, h);
		z = O.x + (O.width - metrics.stringWidth("O")) / 2;
		y = O.y + ((O.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("O", z, y);

		g.setColor(new Color(92, 242, 247));
		g.fillRect(start_x + w * 15, start_y + h * 2, w, h);
		S = new Rectangle(start_x + w * 15, start_y + h * 2, w, h);
		z = S.x + (S.width - metrics.stringWidth("S")) / 2;
		y = S.y + ((S.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("S", z, y);

		g.setColor(new Color(92, 242, 247));
		g.fillRect(start_x + w * 15, start_y + h * 3, w, h);
		Se = new Rectangle(start_x + w * 15, start_y + h * 3, w, h);
		z = Se.x + (Se.width - metrics.stringWidth("Se")) / 2;
		y = Se.y + ((Se.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Se", z, y);

		g.setColor(new Color(121, 168, 132));
		g.fillRect(start_x + w * 15, start_y + h * 4, w, h);
		Te = new Rectangle(start_x + w * 15, start_y + h * 4, w, h);
		z = Te.x + (Te.width - metrics.stringWidth("Te")) / 2;
		y = Te.y + ((Te.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Te", z, y);

		g.setColor(new Color(121, 168, 132));
		g.fillRect(start_x + w * 15, start_y + h * 5, w, h);
		Po = new Rectangle(start_x + w * 15, start_y + h * 5, w, h);
		z = Po.x + (Po.width - metrics.stringWidth("Po")) / 2;
		y = Po.y + ((Po.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Po", z, y);

		g.setColor(new Color(114, 242, 144));
		g.fillRect(start_x + w * 15, start_y + h * 6, w, h);
		Lv = new Rectangle(start_x + w * 15, start_y + h * 6, w, h);
		z = Lv.x + (Lv.width - metrics.stringWidth("Lv")) / 2;
		y = Lv.y + ((Lv.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Lv", z, y);

		// Color coding line 17
		g.setColor(new Color(88, 166, 214));
		g.fillRect(start_x + w * 16, start_y + h, w, h);
		F = new Rectangle(start_x + w * 16, start_y + h * 1, w, h);
		z = F.x + (F.width - metrics.stringWidth("F")) / 2;
		y = F.y + ((F.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("F", z, y);

		g.setColor(new Color(88, 166, 214));
		g.fillRect(start_x + w * 16, start_y + h * 2, w, h);
		Cl = new Rectangle(start_x + w * 16, start_y + h * 2, w, h);
		z = Cl.x + (Cl.width - metrics.stringWidth("Cl")) / 2;
		y = Cl.y + ((Cl.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Cl", z, y);

		g.setColor(new Color(88, 166, 214));
		g.fillRect(start_x + w * 16, start_y + h * 3, w, h);
		Br = new Rectangle(start_x + w * 16, start_y + h * 3, w, h);
		z = Br.x + (Br.width - metrics.stringWidth("Br")) / 2;
		y = Br.y + ((Br.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Br", z, y);

		g.setColor(new Color(88, 166, 214));
		g.fillRect(start_x + w * 16, start_y + h * 4, w, h);
		I = new Rectangle(start_x + w * 16, start_y + h * 4, w, h);
		z = I.x + (I.width - metrics.stringWidth("I")) / 2;
		y = I.y + ((I.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("I", z, y);

		g.setColor(new Color(88, 166, 214));
		g.fillRect(start_x + w * 16, start_y + h * 5, w, h);
		At = new Rectangle(start_x + w * 16, start_y + h * 5, w, h);
		z = At.x + (At.width - metrics.stringWidth("At")) / 2;
		y = At.y + ((At.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("At", z, y);

		g.setColor(new Color(88, 166, 214));
		g.fillRect(start_x + w * 16, start_y + h * 6, w, h);
		Ts = new Rectangle(start_x + w * 16, start_y + h * 6, w, h);
		z = Ts.x + (Ts.width - metrics.stringWidth("Ts")) / 2;
		y = Ts.y + ((Ts.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ts", z, y);

		// Color coding line 18
		g.setColor(new Color(163, 75, 156));
		g.fillRect(start_x + w * 17, start_y, w, h);
		He = new Rectangle(start_x + w * 17, start_y, w, h);
		z = He.x + (He.width - metrics.stringWidth("He")) / 2;
		y = He.y + ((He.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("He", z, y);

		g.setColor(new Color(232, 111, 23));
		g.fillRect(start_x + w * 12, start_y, 5 * w, h);
		Random = new Rectangle(start_x + w * 12, start_y, 5 * w, h);
		z = Random.x
				+ (Random.width - metrics.stringWidth("Random Element")) / 2;
		y = Random.y + ((Random.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Random Element", z, y);

		g.setColor(new Color(163, 75, 156));
		g.fillRect(start_x + w * 17, start_y + h, w, h);
		Ne = new Rectangle(start_x + w * 17, start_y + h * 1, w, h);
		z = Ne.x + (Ne.width - metrics.stringWidth("Ne")) / 2;
		y = Ne.y + ((Ne.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ne", z, y);

		g.setColor(new Color(163, 75, 156));
		g.fillRect(start_x + w * 17, start_y + h * 2, w, h);
		Ar = new Rectangle(start_x + w * 17, start_y + h * 2, w, h);
		z = Ar.x + (Ar.width - metrics.stringWidth("Ar")) / 2;
		y = Ar.y + ((Ar.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ar", z, y);

		g.setColor(new Color(163, 75, 156));
		g.fillRect(start_x + w * 17, start_y + h * 3, w, h);
		Kr = new Rectangle(start_x + w * 17, start_y + h * 3, w, h);
		z = Kr.x + (Kr.width - metrics.stringWidth("Kr")) / 2;
		y = Kr.y + ((Kr.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Kr", z, y);

		g.setColor(new Color(163, 75, 156));
		g.fillRect(start_x + w * 17, start_y + h * 4, w, h);
		Xe = new Rectangle(start_x + w * 17, start_y + h * 4, w, h);
		z = Xe.x + (Xe.width - metrics.stringWidth("Xe")) / 2;
		y = Xe.y + ((Xe.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Xe", z, y);

		g.setColor(new Color(163, 75, 156));
		g.fillRect(start_x + w * 17, start_y + h * 5, w, h);
		Rn = new Rectangle(start_x + w * 17, start_y + h * 5, w, h);
		z = Rn.x + (Rn.width - metrics.stringWidth("Rn")) / 2;
		y = Rn.y + ((Rn.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Rn", z, y);

		g.setColor(new Color(163, 75, 156));
		g.fillRect(start_x + w * 17, start_y + h * 6, w, h);
		Og = new Rectangle(start_x + w * 17, start_y + h * 6, w, h);
		z = Og.x + (Og.width - metrics.stringWidth("Og")) / 2;
		y = Og.y + ((Og.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Og", z, y);

		for (int x = 3; x <= 16; x++) {
			g.setColor(new Color(252, 174, 246));
			g.fillRect(start_x + w * x, start_y + h * 7 + offset, w, h);
			g.setColor(new Color(247, 116, 237));
			g.fillRect(start_x + w * x, start_y + h * 8 + offset, w, h);
		}

		// *Lanthanoid Series
		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 3, start_y + h * 7 + offset, w, h);
		Ce = new Rectangle(start_x + w * 3, start_y + h * 7 + offset, w, h);
		z = Ce.x + (Ce.width - metrics.stringWidth("Ce")) / 2;
		y = Ce.y + ((Ce.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ce", z, y);

		red = new Rectangle(start_x + w, start_y + h * 7 + offset, w, h);
		z = red.x
				+ (red.width - metrics2.stringWidth("*Lanthanoid Series")) / 2;
		y = red.y + ((red.height - metrics2.getHeight()) / 2)
				+ metrics2.getAscent();
		g.setFont(font2);
		g.setColor(Color.black);
		g.drawString("*Lanthanoid Series", z, y);
		g.setFont(font1);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 4, start_y + h * 7 + offset, w, h);
		Pr = new Rectangle(start_x + w * 4, start_y + h * 7 + offset, w, h);
		z = Pr.x + (Pr.width - metrics.stringWidth("Pr")) / 2;
		y = Pr.y + ((Pr.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Pr", z, y);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 5, start_y + h * 7 + offset, w, h);
		Nd = new Rectangle(start_x + w * 5, start_y + h * 7 + offset, w, h);
		z = Nd.x + (Nd.width - metrics.stringWidth("Nd")) / 2;
		y = Nd.y + ((Nd.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Nd", z, y);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 6, start_y + h * 7 + offset, w, h);
		Pm = new Rectangle(start_x + w * 6, start_y + h * 7 + offset, w, h);
		z = Pm.x + (Pm.width - metrics.stringWidth("Pm")) / 2;
		y = Pm.y + ((Pm.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Pm", z, y);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 7, start_y + h * 7 + offset, w, h);
		Sm = new Rectangle(start_x + w * 7, start_y + h * 7 + offset, w, h);
		z = Sm.x + (Sm.width - metrics.stringWidth("Sm")) / 2;
		y = Sm.y + ((Sm.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Sm", z, y);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 8, start_y + h * 7 + offset, w, h);
		Eu = new Rectangle(start_x + w * 8, start_y + h * 7 + offset, w, h);
		z = Eu.x + (Eu.width - metrics.stringWidth("Eu")) / 2;
		y = Eu.y + ((Eu.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Eu", z, y);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 9, start_y + h * 7 + offset, w, h);
		Gd = new Rectangle(start_x + w * 9, start_y + h * 7 + offset, w, h);
		z = Gd.x + (Gd.width - metrics.stringWidth("Gd")) / 2;
		y = Gd.y + ((Gd.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Gd", z, y);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 10, start_y + h * 7 + offset, w, h);
		Tb = new Rectangle(start_x + w * 10, start_y + h * 7 + offset, w, h);
		z = Tb.x + (Tb.width - metrics.stringWidth("Tb")) / 2;
		y = Tb.y + ((Tb.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Tb", z, y);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 11, start_y + h * 7 + offset, w, h);
		Dy = new Rectangle(start_x + w * 11, start_y + h * 7 + offset, w, h);
		z = Dy.x + (Dy.width - metrics.stringWidth("Dy")) / 2;
		y = Dy.y + ((Dy.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Dy", z, y);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 12, start_y + h * 7 + offset, w, h);
		Ho = new Rectangle(start_x + w * 12, start_y + h * 7 + offset, w, h);
		z = Ho.x + (Ho.width - metrics.stringWidth("Ho")) / 2;
		y = Ho.y + ((Ho.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Ho", z, y);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 13, start_y + h * 7 + offset, w, h);
		Er = new Rectangle(start_x + w * 13, start_y + h * 7 + offset, w, h);
		z = Er.x + (Er.width - metrics.stringWidth("Er")) / 2;
		y = Er.y + ((Er.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Er", z, y);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 14, start_y + h * 7 + offset, w, h);
		Tm = new Rectangle(start_x + w * 14, start_y + h * 7 + offset, w, h);
		z = Tm.x + (Tm.width - metrics.stringWidth("Tm")) / 2;
		y = Tm.y + ((Tm.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Tm", z, y);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 15, start_y + h * 7 + offset, w, h);
		Yb = new Rectangle(start_x + w * 15, start_y + h * 7 + offset, w, h);
		z = Yb.x + (Yb.width - metrics.stringWidth("Yb")) / 2;
		y = Yb.y + ((Yb.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Yb", z, y);

		g.setColor(new Color(252, 174, 246));
		g.fillRect(start_x + w * 16, start_y + h * 7 + offset, w, h);
		Lu = new Rectangle(start_x + w * 16, start_y + h * 7 + offset, w, h);
		z = Lu.x + (Lu.width - metrics.stringWidth("Lu")) / 2;
		y = Lu.y + ((Lu.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Lu", z, y);

		// *Lanthanoid Series
		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 3, start_y + h * 8 + offset, w, h);
		Th = new Rectangle(start_x + w * 3, start_y + h * 8 + offset, w, h);
		z = Th.x + (Th.width - metrics.stringWidth("Th")) / 2;
		y = Th.y + ((Th.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Th", z, y);

		red = new Rectangle(start_x + w, start_y + h * 8 + offset, w, h);
		z = red.x + (red.width - metrics2.stringWidth("+Actinoid Series")) / 2;
		y = red.y + ((red.height - metrics2.getHeight()) / 2)
				+ metrics2.getAscent();
		g.setFont(font2);
		g.setColor(Color.black);
		g.drawString("+Actinoid Series", z, y);
		g.setFont(font1);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 4, start_y + h * 8 + offset, w, h);
		Pa = new Rectangle(start_x + w * 4, start_y + h * 8 + offset, w, h);
		z = Pa.x + (Pa.width - metrics.stringWidth("Pa")) / 2;
		y = Pa.y + ((Pa.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Pa", z, y);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 5, start_y + h * 8 + offset, w, h);
		U = new Rectangle(start_x + w * 5, start_y + h * 8 + offset, w, h);
		z = U.x + (U.width - metrics.stringWidth("U")) / 2;
		y = U.y + ((U.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("U", z, y);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 6, start_y + h * 8 + offset, w, h);
		Np = new Rectangle(start_x + w * 6, start_y + h * 8 + offset, w, h);
		z = Np.x + (Np.width - metrics.stringWidth("Np")) / 2;
		y = Np.y + ((Np.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Np", z, y);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 7, start_y + h * 8 + offset, w, h);
		Pu = new Rectangle(start_x + w * 7, start_y + h * 8 + offset, w, h);
		z = Pu.x + (Pu.width - metrics.stringWidth("Pu")) / 2;
		y = Pu.y + ((Pu.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Pu", z, y);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 8, start_y + h * 8 + offset, w, h);
		Am = new Rectangle(start_x + w * 8, start_y + h * 8 + offset, w, h);
		z = Am.x + (Am.width - metrics.stringWidth("Am")) / 2;
		y = Am.y + ((Am.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Am", z, y);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 9, start_y + h * 8 + offset, w, h);
		Cm = new Rectangle(start_x + w * 9, start_y + h * 8 + offset, w, h);
		z = Cm.x + (Cm.width - metrics.stringWidth("Cm")) / 2;
		y = Cm.y + ((Cm.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Cm", z, y);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 10, start_y + h * 8 + offset, w, h);
		Bk = new Rectangle(start_x + w * 10, start_y + h * 8 + offset, w, h);
		z = Bk.x + (Bk.width - metrics.stringWidth("Bk")) / 2;
		y = Bk.y + ((Bk.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Bk", z, y);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 11, start_y + h * 8 + offset, w, h);
		Cf = new Rectangle(start_x + w * 11, start_y + h * 8 + offset, w, h);
		z = Cf.x + (Cf.width - metrics.stringWidth("Cf")) / 2;
		y = Cf.y + ((Cf.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Cf", z, y);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 12, start_y + h * 8 + offset, w, h);
		Es = new Rectangle(start_x + w * 12, start_y + h * 8 + offset, w, h);
		z = Es.x + (Es.width - metrics.stringWidth("Es")) / 2;
		y = Es.y + ((Es.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Es", z, y);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 13, start_y + h * 8 + offset, w, h);
		Fm = new Rectangle(start_x + w * 13, start_y + h * 8 + offset, w, h);
		z = Fm.x + (Fm.width - metrics.stringWidth("Fm")) / 2;
		y = Fm.y + ((Fm.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Fm", z, y);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 14, start_y + h * 8 + offset, w, h);
		Md = new Rectangle(start_x + w * 14, start_y + h * 8 + offset, w, h);
		z = Md.x + (Md.width - metrics.stringWidth("Md")) / 2;
		y = Md.y + ((Md.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Md", z, y);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 15, start_y + h * 8 + offset, w, h);
		No = new Rectangle(start_x + w * 15, start_y + h * 8 + offset, w, h);
		z = No.x + (No.width - metrics.stringWidth("No")) / 2;
		y = No.y + ((No.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("No", z, y);

		g.setColor(new Color(247, 116, 237));
		g.fillRect(start_x + w * 16, start_y + h * 8 + offset, w, h);
		Lr = new Rectangle(start_x + w * 16, start_y + h * 8 + offset, w, h);
		z = Lr.x + (Lr.width - metrics.stringWidth("Lr")) / 2;
		y = Lr.y + ((Lr.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.drawString("Lr", z, y);

		// black
		g.setColor(Color.black);
		g.drawRect(start_x, start_y, w, h);
		g.setColor(Color.black);
		g.drawRect(start_x, start_y + h, w, h);
		g.setColor(Color.black);
		g.drawRect(start_x, start_y + h * 2, w, h);
		g.setColor(Color.black);
		g.drawRect(start_x, start_y + h * 3, w, h);
		g.setColor(Color.black);
		g.drawRect(start_x, start_y + h * 4, w, h);
		g.setColor(Color.black);
		g.drawRect(start_x, start_y + h * 5, w, h);
		g.setColor(Color.black);
		g.drawRect(start_x, start_y + h * 6, w, h);
		g.setColor(Color.black);

		g.drawRect(start_x + w, start_y + h, w, h);
		g.setColor(Color.black);
		g.drawRect(start_x + w, start_y + h * 2, w, h);
		g.setColor(Color.black);
		g.drawRect(start_x + w, start_y + h * 3, w, h);
		g.setColor(Color.black);
		g.drawRect(start_x + w, start_y + h * 4, w, h);
		g.setColor(Color.black);
		g.drawRect(start_x + w, start_y + h * 5, w, h);
		g.setColor(Color.black);
		g.drawRect(start_x + w, start_y + h * 6, w, h);

		g.setColor(Color.black);
		g.drawRect(start_x + w, start_y + h, w, h);
		g.drawRect(start_x + w, start_y + h * 2, w, h);
		g.drawRect(start_x + w, start_y + h * 3, w, h);
		g.drawRect(start_x + w, start_y + h * 4, w, h);
		g.drawRect(start_x + w, start_y + h * 5, w, h);
		g.drawRect(start_x + w, start_y + h * 6, w, h);
		g.drawRect(start_x + w * 12, start_y, 5 * w, h);

		for (int x = 2; x <= 11; x++) {
			g.setColor(Color.black);
			g.drawRect(start_x + w * x, start_y + h * 3, w, h);
			g.drawRect(start_x + w * x, start_y + h * 4, w, h);
			g.drawRect(start_x + w * x, start_y + h * 5, w, h);
			g.drawRect(start_x + w * x, start_y + h * 6, w, h);
		}

		for (int x = 12; x <= 16; x++) {
			g.setColor(Color.black);
			g.drawRect(start_x + w * x, start_y + h, w, h);
			g.drawRect(start_x + w * x, start_y + h * 2, w, h);
			g.drawRect(start_x + w * x, start_y + h * 3, w, h);
			g.drawRect(start_x + w * x, start_y + h * 4, w, h);
			g.drawRect(start_x + w * x, start_y + h * 5, w, h);
			g.drawRect(start_x + w * x, start_y + h * 6, w, h);
		}

		g.setColor(Color.black);
		g.drawRect(start_x + w * 17, start_y, w, h);
		g.drawRect(start_x + w * 17, start_y + h, w, h);
		g.drawRect(start_x + w * 17, start_y + h * 2, w, h);
		g.drawRect(start_x + w * 17, start_y + h * 3, w, h);
		g.drawRect(start_x + w * 17, start_y + h * 4, w, h);
		g.drawRect(start_x + w * 17, start_y + h * 5, w, h);
		g.drawRect(start_x + w * 17, start_y + h * 6, w, h);

		for (int x = 3; x <= 16; x++) {
			g.setColor(Color.black);
			g.drawRect(start_x + w * x, start_y + h * 7 + offset, w, h);
			g.drawRect(start_x + w * x, start_y + h * 8 + offset, w, h);
		}

	}

	public void mousePressed(MouseEvent e) {
		// dw about it
		int x = e.getX();
		int y = e.getY();
		if (H.contains(x, y)) {
			current = new Color(92, 242, 247);
			num = 1;
		} else if (Li.contains(x, y)) {
			current = new Color(247, 92, 92);
			num = 3;
		} else if (Na.contains(x, y)) {
			current = new Color(247, 92, 92);
			num = 11;
		} else if (K.contains(x, y)) {
			current = new Color(247, 92, 92);
			num = 19;
		} else if (Rb.contains(x, y)) {
			current = new Color(247, 92, 92);
			num = 37;
		} else if (Cs.contains(x, y)) {
			current = new Color(247, 92, 92);
			num = 55;
		} else if (Fr.contains(x, y)) {
			current = new Color(247, 92, 92);
			num = 87;
		} else if (Be.contains(x, y)) {
			current = new Color(247, 170, 92);
			num = 4;
		} else if (Mg.contains(x, y)) {
			current = new Color(247, 170, 92);
			num = 12;
		} else if (Ca.contains(x, y)) {
			current = new Color(247, 170, 92);
			num = 20;
		} else if (Sr.contains(x, y)) {
			current = new Color(247, 170, 92);
			num = 38;
		} else if (Ba.contains(x, y)) {
			current = new Color(247, 170, 92);
			num = 56;
		} else if (Ra.contains(x, y)) {
			current = new Color(247, 170, 92);
			num = 88;
		} else if (Sc.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 21;
		} else if (Y.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 39;
		} else if (La.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 200;
		} else if (Ac.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 201;
		} else if (Ti.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 22;
		} else if (Zr.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 40;
		} else if (Hf.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 72;
		} else if (Rf.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 104;
		} else if (V.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 23;
		} else if (Nb.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 41;
		} else if (Ta.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 73;
		} else if (Db.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 105;
		} else if (Cr.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 24;
		} else if (Mo.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 42;
		} else if (W.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 74;
		} else if (Sg.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 106;
		} else if (Mn.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 25;
		} else if (Tc.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 43;
		} else if (Re.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 75;
		} else if (Bh.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 107;
		} else if (Fe.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 26;
		} else if (Ru.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 44;
		} else if (Os.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 76;
		} else if (Hs.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 108;
		} else if (Random.contains(x, y)) {
			current = new Color(232, 111, 23);
			num = rand.nextInt(upperbound);
		} else if (Co.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 27;
		} else if (Rh.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 45;
		} else if (Ir.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 77;
		} else if (Mt.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 109;
		} else if (Ni.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 28;
		} else if (Pd.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 46;
		} else if (Pt.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 78;
		} else if (Ds.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 110;
		} else if (Cu.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 29;
		} else if (Md.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 101;
		} else if (Ag.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 47;
		} else if (Au.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 79;
		} else if (Rg.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 111;
		} else if (Zn.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 30;
		} else if (Cd.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 48;
		} else if (Hg.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 80;
		} else if (Cn.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 112;
		} else if (B.contains(x, y)) {
			current = new Color(121, 168, 132);
			num = 5;
		} else if (Al.contains(x, y)) {
			current = new Color(114, 242, 144);
			num = 13;
		} else if (Ga.contains(x, y)) {
			current = new Color(114, 242, 144);
			num = 31;
		} else if (In.contains(x, y)) {
			current = new Color(114, 242, 144);
			num = 49;
		} else if (Tl.contains(x, y)) {
			current = new Color(114, 242, 144);
			num = 81;
		} else if (Nh.contains(x, y)) {
			current = new Color(114, 242, 144);
			num = 113;
		} else if (C.contains(x, y)) {
			current = new Color(92, 242, 247);
			num = 6;
		} else if (Si.contains(x, y)) {
			current = new Color(121, 168, 132);
			num = 14;
		} else if (Ge.contains(x, y)) {
			current = new Color(121, 168, 132);
			num = 32;
		} else if (Sn.contains(x, y)) {
			current = new Color(114, 242, 144);
			num = 50;
		} else if (Pb.contains(x, y)) {
			current = new Color(114, 242, 144);
			num = 82;
		} else if (Fl.contains(x, y)) {
			current = new Color(114, 242, 144);
			num = 114;
		} else if (N.contains(x, y)) {
			current = new Color(92, 242, 247);
			num = 7;
		} else if (P.contains(x, y)) {
			current = new Color(92, 242, 247);
			num = 15;
		} else if (As.contains(x, y)) {
			current = new Color(121, 168, 132);
			num = 33;
		} else if (Sb.contains(x, y)) {
			current = new Color(121, 168, 132);
			num = 51;
		} else if (Bi.contains(x, y)) {
			current = new Color(114, 242, 144);
			num = 83;
		} else if (Mc.contains(x, y)) {
			current = new Color(114, 242, 144);
			num = 115;
		} else if (O.contains(x, y)) {
			current = new Color(92, 242, 247);
			num = 8;
		} else if (S.contains(x, y)) {
			current = new Color(92, 242, 247);
			num = 16;
		} else if (Se.contains(x, y)) {
			current = new Color(92, 242, 247);
			num = 34;
		} else if (Te.contains(x, y)) {
			current = new Color(121, 168, 132);
			num = 52;
		} else if (Po.contains(x, y)) {
			current = new Color(121, 168, 132);
			num = 84;
		} else if (Lv.contains(x, y)) {
			current = new Color(114, 242, 144);
			num = 116;
		} else if (F.contains(x, y)) {
			current = new Color(88, 166, 214);
			num = 9;
		} else if (Cl.contains(x, y)) {
			current = new Color(88, 166, 214);
			num = 17;
		} else if (Br.contains(x, y)) {
			current = new Color(88, 166, 214);
			num = 35;
		} else if (I.contains(x, y)) {
			current = new Color(88, 166, 214);
			num = 53;
		} else if (At.contains(x, y)) {
			current = new Color(88, 166, 214);
			num = 85;
		} else if (Ts.contains(x, y)) {
			current = new Color(88, 166, 214);
			num = 117;
		} else if (He.contains(x, y)) {
			current = new Color(163, 75, 156);
			num = 2;
		} else if (Ne.contains(x, y)) {
			current = new Color(163, 75, 156);
			num = 10;
		} else if (Ar.contains(x, y)) {
			current = new Color(163, 75, 156);
			num = 18;
		} else if (Kr.contains(x, y)) {
			current = new Color(163, 75, 156);
			num = 36;
		} else if (Xe.contains(x, y)) {
			current = new Color(163, 75, 156);
			num = 54;
		} else if (Rn.contains(x, y)) {
			current = new Color(163, 75, 156);
			num = 86;
		} else if (Og.contains(x, y)) {
			current = new Color(163, 75, 156);
			num = 118;
		} else if (La.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 57;
		} else if (Ce.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 58;
		} else if (Pr.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 59;
		} else if (Nd.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 60;
		} else if (Pm.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 61;
		} else if (Sm.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 62;
		} else if (Eu.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 63;
		} else if (Gd.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 64;
		} else if (Tb.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 65;
		} else if (Dy.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 66;
		} else if (Ho.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 67;
		} else if (Er.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 68;
		} else if (Tm.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 69;
		} else if (Yb.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 70;
		} else if (Lu.contains(x, y)) {
			current = new Color(252, 174, 246);
			num = 71;
		} else if (Ac.contains(x, y)) {
			current = new Color(237, 237, 135);
			num = 89;
		} else if (Th.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 90;
		} else if (Pa.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 91;
		} else if (U.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 92;
		} else if (Np.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 93;
		} else if (Pu.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 94;
		} else if (Am.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 95;
		} else if (Cm.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 96;
		} else if (Bk.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 97;
		} else if (Cf.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 98;
		} else if (Es.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 99;
		} else if (Fm.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 100;
		} else if (Nd.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 101;
		} else if (No.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 102;
		} else if (Lr.contains(x, y)) {
			current = new Color(247, 116, 237);
			num = 103;
		} else
			current = Color.white;
		repaint();
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
	public void myMethod(Graphics g, String element, String name, String number,
			String mass, String level, String melting, String boiling,
			String natural, String date) {
		g.setColor(current);
		int start_x = 5;
		int start_y = 175;
		int h = 55;
		int w = 50;
		int offset = 20;
		int num = 0;
		int keyx = 22;
		int keyy = 22;
		int delta = 13;
		Font font1 = new Font("Serif", Font.BOLD, 18);
		Font font2 = new Font("Serif", Font.BOLD, 13);
		Font font3 = new Font("Serif", Font.BOLD, 50);
		Font font4 = new Font("Serif", Font.BOLD, 20);
		Font font5 = new Font("Serif", Font.BOLD, 75);
		red = new Rectangle(start_x, 15, start_x + w * 18, 150);
		g.setFont(font3);
		FontMetrics metrics3 = g.getFontMetrics(font3);
		g.setColor(current);
		g.fillRect(start_x + w * 18 + 5, 0, 450, start_y + h);
		red = new Rectangle(start_x + w * 18 + 5, 0, 450, start_y + h);
		int z = red.x + (red.width - metrics3.stringWidth(element)) / 2;
		int y = red.y + ((red.height - metrics3.getHeight()) / 2)
				+ metrics3.getAscent();
		g.setColor(Color.black);
		g.setFont(font5);
		g.drawString(element, z, y);

		H = new Rectangle(start_x, start_y, w, h);
		FontMetrics metrics = g.getFontMetrics(font1);

		g.setColor(current);
		g.fillRect(start_x + w * 18 + 5, start_y + h, 450, h);
		red = new Rectangle(start_x + w * 18 + 5, start_y + h, 450, h);
		z = red.x + (red.width - metrics.stringWidth(number)) / 2;
		y = red.y + ((red.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.setFont(font1);
		g.drawString(number, start_x + w * 18 + 10, y);

		g.setColor(current);
		g.fillRect(start_x + w * 18 + 5, start_y, 450, h);
		red = new Rectangle(start_x + w * 18 + 5, start_y, 450, h);
		z = red.x + (red.width - metrics.stringWidth(name)) / 2;
		y = red.y + ((red.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.setFont(font1);
		g.drawString(name, start_x + w * 18 + 10, y);

		g.setColor(current);
		g.fillRect(start_x + w * 18 + 5, start_y + 2 * h, 450, h);
		red = new Rectangle(start_x + w * 18 + 5, start_y + 2 * h, 450, h);
		z = red.x + (red.width - metrics.stringWidth(mass)) / 2;
		y = red.y + ((red.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.setFont(font1);
		g.drawString(mass, start_x + w * 18 + 10, y);

		g.setColor(current);
		g.fillRect(start_x + w * 18 + 5, start_y + 3 * h, 450, h);
		red = new Rectangle(start_x + w * 18 + 5, start_y + 3 * h, 450, h);
		z = red.x + (red.width - metrics.stringWidth(level)) / 2;
		y = red.y + ((red.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.setFont(font1);
		g.drawString(level, start_x + w * 18 + 10, y);

		g.setColor(current);
		g.fillRect(start_x + w * 18 + 5, start_y + 4 * h, 450, h);
		red = new Rectangle(start_x + w * 18 + 5, start_y + 4 * h, 450, h);
		z = red.x + (red.width - metrics.stringWidth(melting)) / 2;
		y = red.y + ((red.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.setFont(font1);
		g.drawString(melting, start_x + w * 18 + 10, y);

		g.setColor(current);
		g.fillRect(start_x + w * 18 + 5, start_y + 5 * h, 450, h);
		red = new Rectangle(start_x + w * 18 + 5, start_y + 5 * h, 450, h);
		z = red.x + (red.width - metrics.stringWidth(boiling)) / 2;
		y = red.y + ((red.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.setFont(font1);
		g.drawString(boiling, start_x + w * 18 + 10, y);

		g.setColor(current);
		g.fillRect(start_x + w * 18 + 5, start_y + 6 * h, 450, h);
		red = new Rectangle(start_x + w * 18 + 5, start_y + 6 * h, 450, h);
		z = red.x + (red.width - metrics.stringWidth(natural)) / 2;
		y = red.y + ((red.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.setFont(font1);
		g.drawString(natural, start_x + w * 18 + 10, y);

		g.setColor(current);
		g.fillRect(start_x + w * 18 + 5, start_y + 7 * h, 450, h);
		red = new Rectangle(start_x + w * 18 + 5, start_y + 7 * h, 450, h);
		z = red.x + (red.width - metrics.stringWidth(date)) / 2;
		y = red.y + ((red.height - metrics.getHeight()) / 2)
				+ metrics.getAscent();
		g.setColor(Color.black);
		g.setFont(font1);
		g.drawString(date, start_x + w * 18 + 10, y);
	}

}