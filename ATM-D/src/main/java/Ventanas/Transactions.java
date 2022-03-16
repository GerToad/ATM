/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ventanas;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.*;

/**
 *
 * @author toad
 */
public class Transactions extends JFrame implements ActionListener{

	private Label lblWlk, lblUsr, lblPsw;
	private TextField tfUsr, tfPsw; // Declare a TextField component
	private Button btnLgn;   // Declare a Button component

	public Transactions(){
		lblWlk= new Label("You're in");
		lblWlk.setBounds(250,30,100,30);
		lblWlk.setFont(new Font("Consolas", 1, 13));
		add(lblWlk);

		// User
		lblUsr= new Label("Usuario");
		lblUsr.setBounds(100,100,75,30);
		lblUsr.setFont(new Font("Consolas", 1, 13));
		add(lblUsr);

		tfUsr = new TextField(10);
		tfUsr.setBounds(200,100,200,30);
		add(tfUsr);

		// Password
		lblPsw= new Label("Contraseña");
		lblPsw.setBounds(100,150,75,30);
		lblPsw.setFont(new Font("Consolas", 1, 13));
		add(lblPsw);

		tfPsw = new TextField(10);
		tfPsw.setBounds(200,150,200,30);
		add(tfPsw);

		btnLgn = new Button("Entrar");
		btnLgn.setBounds(250, 210, 100, 30);
		add(btnLgn);
		btnLgn.addActionListener(this);

		setTitle("Message");

		setLayout(null);
		setSize(600, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLgn){
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		Transactions app = new Transactions();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setResizable(false);
		app.setLocationRelativeTo(null);
	}
}
