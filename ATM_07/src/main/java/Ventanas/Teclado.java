package Ventanas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Teclado extends JFrame implements ActionListener{

	public Button uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, borrar;
	public JTextField ranura;
	public String key = "";

	public Teclado(){
		teclado();
	}

	public void teclado(){

		// Uno
		uno = new Button("1");
		uno.setBounds(245, 400, 30, 30);
		add(uno);
		uno.addActionListener(this);

		// Dos
		dos = new Button("2");
		dos.setBounds(285, 400, 30, 30);
		add(dos);
		dos.addActionListener(this);

		// tres
		tres = new Button("3");
		tres.setBounds(325, 400, 30, 30);
		add(tres);
		tres.addActionListener(this);

		// cuatro
		cuatro = new Button("4");
		cuatro.setBounds(245, 440, 30, 30);
		add(cuatro);
		cuatro.addActionListener(this);

		// cinco
		cinco = new Button("5");
		cinco.setBounds(285, 440, 30, 30);
		add(cinco);
		cinco.addActionListener(this);

		// seis
		seis = new Button("6");
		seis.setBounds(325, 440, 30, 30);
		add(seis);
		seis.addActionListener(this);

		// siete
		siete = new Button("7");
		siete.setBounds(245, 480, 30, 30);
		add(siete);
		siete.addActionListener(this);

		// ocho
		ocho = new Button("8");
		ocho.setBounds(285, 480, 30, 30);
		add(ocho);
		ocho.addActionListener(this);

		// nueve
		nueve = new Button("9");
		nueve.setBounds(325, 480, 30, 30);
		add(nueve);
		nueve.addActionListener(this);

		// cero
		cero = new Button("0");
		cero.setBounds(285, 520, 30, 30);
		add(cero);
		cero.addActionListener(this);

		// Borrar
		borrar = new Button("<");
		borrar.setBounds(325, 520, 30, 30);
		add(borrar);
		borrar.addActionListener(this);

		// Ranura
		ranura = new JTextField("Efectivo");
		ranura.setBounds(150,580,300,30);
		ranura.addFocusListener(new FocusListener(){

			@Override
			public void focusGained(FocusEvent fe) {
				ranura.setText("Efectivo");
			}

			@Override
			public void focusLost(FocusEvent fe) {
				ranura.setText("Efectivo");
			}
		});
		add(ranura);

		// General settings
		setTitle("Teclado");
		setLayout(null);  
		setSize(600, 700);
		setVisible(true); 

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == uno){
			System.out.println("Uno");
			key += "1";
			System.exit(0);
		}
		if(e.getSource() == dos){
			System.out.println("Dos");
			key += "2";
		}
	}

	public String getKey(){
		return key;
	}

	public void borrar(){
		key = key.substring(0, key.length()-1);
	}

	/*public static void main(String[] args) {
		Teclado app = new Teclado();
		app.setResizable(false);                            	
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		app.setLocationRelativeTo(null);
	}*/
}
