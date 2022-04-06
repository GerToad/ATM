package Ventanas;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.*;
import atm.d.*;

public class Pantalla extends JFrame implements ActionListener{

	private Label lblWlk, lblUsr, lblPsw, lblmsg; // Some labels
	private TextField tfUsr, tfPsw; // Declare a TextField component
	private Button btnLgn;   // Declare a Button component
	private JPasswordField password;

	boolean usuarioAutenticado = false;
	boolean pass = false;
	BaseDatosBanco baseDatosBanco = new BaseDatosBanco();


	public Pantalla(){}

	public void Ingreso(){ // Este constructor creara todos los componentes del esta ventana

		// Label
		lblWlk= new Label("Bienvenido"); // Instancia de la variable de tipo Label
		lblWlk.setBounds(250,30,100,30); // Esta funcion establece las medidas
		lblWlk.setFont(new Font("Consolas", 1, 13));  // Fuente y tamaño del texto
		add(lblWlk);  // Se tiene que añadir a la ventana actual con add()


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

		password = new JPasswordField(10);
		password.setBounds(200,150,200,30);
		add(password);
		password.addActionListener(this);

		// Button
		btnLgn = new Button("Entrar");
		btnLgn.setBounds(250, 210, 100, 30);
		add(btnLgn);
		btnLgn.addActionListener(this); // Se le atribuye el evento que escucha las acciones, en este caso solo es el "click"

		// General settings
		setTitle("Message");  // Establece el titulo de la ventana
		setLayout(null);  // Existen templates para la posision de los componentes pero son algo complicadas de usar asi que no las uso pero se acomodan con setBounds()
		setSize(600, 300);  // El tamaño inicial de la ventana (600 pixeles de ancho y 300 de alto)
		setVisible(true);  // Se indica que sea visible

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setResizable(false);                            	
		setLocationRelativeTo(null);
	}

	public boolean getPass(){
		return pass;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLgn){ // Abre una nueva ventana(transaction window)
			autenticarUsuario();
		}
	}

	public boolean autenticarUsuario() 
	{
		int count =  Integer.parseInt(tfUsr.getText());
		String pwd = new String(password.getPassword());
		int nip = Integer.parseInt(pwd);

		// establece usuarioAutenticado con el valor booleano devuelto por la base de datos
		usuarioAutenticado = 
			baseDatosBanco.autenticarUsuario( count, nip );

		// verifica si la autenticaci�n tuvo �xito
		if ( usuarioAutenticado )
		{
			System.exit(0);
			pass = true;
		}
		else{
			// Mensaje de error
			lblmsg= new Label("Datos erroneos");
			lblmsg.setBounds(240,60,100,30);
			lblmsg.setFont(new Font("Consolas", 1, 13));
			add(lblmsg);
		}
		return pass;
	} 

	public static void main(String args[]) {
		Pantalla app = new Pantalla();
		app.Ingreso();
	}
}
