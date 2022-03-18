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
public class Portada extends JFrame implements ActionListener{
	
	private Label lblBienvenida, lblmensaje; // Some labels
	private Button btnSig;   // Declare a Button component
	
	public Portada(){
		// Label
		lblBienvenida= new Label("Bienvenido"); // Instancia de la variable de tipo Label
		lblBienvenida.setBounds(250,30,100,30); // Esta funcion establece las medidas
		lblBienvenida.setFont(new Font("Consolas", 1, 13));  // Fuente y tamaño del texto
		add(lblBienvenida);  // Se tiene que añadir a la ventana actual con add()

		// Label
		lblmensaje= new Label("Este es tu cajero automatico"); // Instancia de la variable de tipo Label
		lblmensaje.setBounds(200,130,200,30); // Esta funcion establece las medidas
		lblmensaje.setFont(new Font("Consolas", 1, 13));  // Fuente y tamaño del texto
		add(lblmensaje);  // Se tiene que añadir a la ventana actual con add()

		// Button
		btnSig = new Button("Entrar");
		btnSig.setBounds(250, 210, 100, 30);
		add(btnSig);
		btnSig.addActionListener(this); // Se le atribuye el evento que escucha las acciones, en este caso solo es el "click"

		// General settings
		setTitle("Portada");  // Establece el titulo de la ventana
		setLayout(null);  // Existen templates para la posision de los componentes pero son algo complicadas de usar asi que no las uso pero se acomodan con setBounds()
		setSize(600, 300);  // El tamaño inicial de la ventana (600 pixeles de ancho y 300 de alto)
		setVisible(true);  // Se indica que sea visible
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSig){ // Abre una nueva ventana(transaction window)
			Ingreso main = new Ingreso();
			main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			main.setResizable(false);
			main.setLocationRelativeTo(null);
		}
	}
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		Portada app = new Portada();  
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Hace posible su cierre
		app.setResizable(false);  
		app.setLocationRelativeTo(null); 
	}
}
