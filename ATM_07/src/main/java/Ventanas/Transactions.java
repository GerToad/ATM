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

	private Label lblMessage;
	private Button btnSaldo, btnRetirar, btnDeposito, btnCancelar;   // Declare a Button component

	public Transactions(){
		lblMessage= new Label("Selecciona tu transaction");
		lblMessage.setBounds(250,30,200,30);
		lblMessage.setFont(new Font("Consolas", 1, 13));
		add(lblMessage);

		// Botones
		btnSaldo = new Button("Saldo");
		btnSaldo.setBounds(50, 110, 100, 30);
		add(btnSaldo);
		btnSaldo.addActionListener(this);

		btnDeposito = new Button("Deposito");
		btnDeposito.setBounds(250, 110, 100, 30);
		add(btnDeposito);
		btnDeposito.addActionListener(this);

		btnRetirar = new Button("Retiro");
		btnRetirar.setBounds(450, 110, 100, 30);
		add(btnRetirar);
		btnRetirar.addActionListener(this);

		btnCancelar = new Button("Salir");
		btnCancelar.setBounds(250, 210, 100, 30);
		add(btnCancelar);
		btnCancelar.addActionListener(this);

		setTitle("Menu");

		setLayout(null);
		setSize(600, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCancelar){
			System.exit(0);
		}
		if(e.getSource() == btnSaldo){
			
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
