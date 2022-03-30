/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Ventanas;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.*;
import atm.d.*;

/**
 *
 * @author toad
 */
public class Saldo extends JFrame implements ActionListener{

	private Label lblMensaje, lblUsr; // Some labels
	private Button btnCancelar;   // Declare a Button component

	public Saldo(){
		lblMensaje= new Label("Saldo actual"); // Instancia de la variable de tipo Label
		lblMensaje.setBounds(250,30,100,30); // Esta funcion establece las medidas
		lblMensaje.setFont(new Font("Consolas", 1, 13));  // Fuente y tamaño del texto
		add(lblMensaje);  // Se tiene que añadir a la ventana actual con add()

		btnCancelar = new Button("Cancelar");
		btnCancelar.setBounds(250, 210, 100, 30);
		add(btnCancelar);
		btnCancelar.addActionListener(this);

		setTitle("Saldo");

		setLayout(null);
		setSize(600, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCancelar){
			System.exit(0);
		}
	}

	public double getSaldo(){
		double saldoDisponible = 
			baseDatosBanco.obtenerSaldoDisponible( obtenerNumeroCuenta() );
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		Saldo app = new Saldo();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setResizable(false);
		app.setLocationRelativeTo(null);
	}
}
