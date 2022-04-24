package Ventanas;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.*;
import atm.d.*;

//public class Pantalla extends JFrame implements ActionListener{
public class Pantalla extends Teclado{

	public Label lblWlk, lblUsr, lblPsw, lblmsg, lblBienvenida, lblmensaje, lblMessage, lblMensaje; 
	public TextField tfUsr, tfPsw, tfMonto;
	public Button btnLgn, btnSig, btnSaldo, btnRetirar, btnDeposito, btnCancelar, btnSalir, btnMonto, btnRetiro;
	private JPasswordField password;

	boolean usuarioAutenticado = false;
	boolean pass = false;
	private int cuenta;
	private int monto;
	private String choose;
	BaseDatosBanco baseDatosBanco = new BaseDatosBanco();


	//public Pantalla(){}

	public void Portada(){
		// Label
		lblBienvenida= new Label("Bienvenido");
		lblBienvenida.setBounds(250,30,100,30);
		lblBienvenida.setFont(new Font("Consolas", 1, 13));
		add(lblBienvenida);

		// Label
		lblmensaje= new Label("Este es tu cajero automatico");
		lblmensaje.setBounds(200,130,200,30);
		lblmensaje.setFont(new Font("Consolas", 1, 13));
		add(lblmensaje);

		// Button
		btnSig = new Button("Continuar");
		btnSig.setBounds(250, 210, 100, 30);
		add(btnSig);
		btnSig.addActionListener(this);

		// General settings
		setTitle("Portada");
		setLayout(null);  
		//setSize(600, 300);
		setVisible(true); 
	}

	public void Ingreso(){ 
		pass = false; // false para misma variable

		// Label
		lblWlk= new Label("Bienvenido");
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

		password = new JPasswordField(10);
		password.setBounds(200,150,200,30);
		add(password);
		password.addActionListener(this);

		// Button
		btnLgn = new Button("Entrar");
		btnLgn.setBounds(250, 210, 100, 30);
		add(btnLgn);
		btnLgn.addActionListener(this);

		// General settings
		setTitle("Message");
		setLayout(null);  
		//setSize(600, 300);
		setVisible(true); 
	}

	public void Transactions(){
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

		btnCancelar = new Button("Cancelar");
		btnCancelar.setBounds(250, 210, 100, 30);
		add(btnCancelar);
		btnCancelar.addActionListener(this);

		setTitle("Menu");

		setLayout(null);
		//setSize(600, 300);
		setVisible(true);
	}

	public void Saldo(double saldoDisponible, double saldoTotal){
		lblMensaje= new Label("Saldo disponible: " + saldoDisponible); // Instancia de la variable de tipo Label
		lblMensaje.setBounds(230,30,200,30); // Esta funcion establece las medidas
		lblMensaje.setFont(new Font("Consolas", 1, 13));  // Fuente y tamaño del texto
		add(lblMensaje);  // Se tiene que añadir a la ventana actual con add()

		lblMessage= new Label("Saldo total: " + saldoTotal);
		lblMessage.setBounds(230,100,200,30);
		lblMessage.setFont(new Font("Consolas", 1, 13));
		add(lblMessage);

		btnSalir = new Button("Salir");
		btnSalir.setBounds(250, 210, 100, 30);
		add(btnSalir);
		btnSalir.addActionListener(this);

		setTitle("Saldo");

		setLayout(null);
		//setSize(600, 300);
		setVisible(true);
	}

	public void Deposito(){
		lblMessage= new Label("Monto a depositar");
		lblMessage.setBounds(250,30,120,30);
		lblMessage.setFont(new Font("Consolas", 1, 13));
		add(lblMessage);

		tfMonto = new TextField();
		tfMonto.setBounds(250,100,100,30);
		tfMonto.setFont(new Font("Consolas", 1, 13));
		add(tfMonto);

		btnMonto = new Button("Depositar");
		btnMonto.setBounds(200, 210, 100, 30);
		add(btnMonto);
		btnMonto.addActionListener(this);

		btnSalir = new Button("Salir");
		btnSalir.setBounds(310, 210, 100, 30);
		add(btnSalir);
		btnSalir.addActionListener(this);

		setTitle("Deposito");

		setLayout(null);
		//setSize(600, 300);
		setVisible(true);
	}

	public void Retiro(){
		lblMessage= new Label("¿Cuanto desea retirar?");
		lblMessage.setBounds(240,30,150,30);
		lblMessage.setFont(new Font("Consolas", 1, 13));
		add(lblMessage);

		tfMonto = new TextField();
		tfMonto.setBounds(250,100,100,30);
		tfMonto.setFont(new Font("Consolas", 1, 13));
		add(tfMonto);

		btnRetiro = new Button("Retirar");
		btnRetiro.setBounds(200, 210, 100, 30);
		add(btnRetiro);
		btnRetiro.addActionListener(this);

		btnSalir = new Button("Salir");
		btnSalir.setBounds(310, 210, 100, 30);
		add(btnSalir);
		btnSalir.addActionListener(this);

		setTitle("Retiro");

		setLayout(null);
		//setSize(600, 300);
		setVisible(true);
	}

	public boolean getPass(){
		return pass;
	}

	public int getCount(){
		return cuenta;
	}

	public String getChoose(){
		return choose;
	}

	public int getMonto(){
		return monto;
	}

	public void setChoose(String empty){
		choose = empty;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSig){ 
			pass = true;
		}
		if(e.getSource() == btnLgn){
			int count =  Integer.parseInt(tfUsr.getText());
			String pwd = new String(password.getPassword());
			int nip = Integer.parseInt(pwd);

			pass = autenticarUsuario(count, nip);
			System.out.println("desde boton log "+pass);
			if(pass == false){
				// Mensaje de error
				lblmsg= new Label("Datos erroneos");
				lblmsg.setBounds(240,60,100,30);
				lblmsg.setFont(new Font("Consolas", 1, 13));
				add(lblmsg);
			}
		}
		if(e.getSource() == btnMonto){
			try{
				monto =  Integer.parseInt(tfMonto.getText());
				choose = "monto";
			}catch(Exception ex){
				// Mensaje de error
				lblmsg= new Label("Introdusca una cantidad valida");
				lblmsg.setBounds(220,60,150,30);
				lblmsg.setFont(new Font("Consolas", 1, 13));
				add(lblmsg);
			}
		}
		if(e.getSource() == btnRetiro){
			try{
				monto = Integer.parseInt(tfMonto.getText());
				choose = "retiro";
			}catch(Exception ex){
				// Mensaje de error
				lblmsg= new Label("Introdusca una cantidad valida");
				lblmsg.setBounds(220,60,200,30);
				lblmsg.setFont(new Font("Consolas", 1, 13));
				add(lblmsg);
			}
		}

		if(e.getSource() == btnCancelar){
			choose = "cancelar";
		}
		if(e.getSource() == btnSaldo){
			choose = "saldo";
		}
		if(e.getSource() == btnRetirar){
			choose = "retirar";
		}
		if(e.getSource() == btnDeposito){
			choose = "deposito";
		}
		if(e.getSource() == btnSalir){
			choose = "salir";
		}
		if(e.getSource() == uno){
			System.out.println("Uno");
			key += "1";
		}
		if(e.getSource() == dos){
			System.out.println("Dos");
			key += "2";
		}
		if(e.getSource() == tres){
			key += "3";
		}
		if(e.getSource() == cuatro){
			key += "4";
		}
		if(e.getSource() == cinco){
			key += "5";
		}
		if(e.getSource() == seis){
			key += "6";
		}
		if(e.getSource() == siete){
			key += "7";
		}
		if(e.getSource() == ocho){
			key += "8";
		}
		if(e.getSource() == nueve){
			key += "9";
		}
		if(e.getSource() == cero){
			key += "0";
		}
		if(e.getSource() == borrar){
			System.out.println("borrar");
			borrar();
		}
	}

	public boolean autenticarUsuario( int count, int nip ) 
	{
		// establece usuarioAutenticado con el valor booleano devuelto por la base de datos
		usuarioAutenticado = 
			baseDatosBanco.autenticarUsuario( count, nip );

		// verifica si la autenticaci�n tuvo �xito
		if ( usuarioAutenticado )
		{
			cuenta = count;
		}

		return usuarioAutenticado;
	} 

	//public static void main(String args[]) {
		//Pantalla app = new Pantalla();
		//app.Ingreso();
	//}
}
