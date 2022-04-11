
package Ventanas;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.*;
import atm.d.*;

/**
 *
 * @author toad
 */
public class ATM {

	public int token;
	public boolean pass = false;
	BaseDatosBanco baseDatosBanco = new BaseDatosBanco();

	private Ingreso ingreso;
	private Pantalla pantalla;
	private boolean usuarioAutenticado;
	private int cuenta;

	public ATM(){
		pantalla = new Pantalla();
		pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		pantalla.setResizable(false);                            	
		pantalla.setLocationRelativeTo(null);
		pantalla.Portada();
		while(true){
			pass = pantalla.getPass();
			System.out.println("pass of portada: "+pass);  // Sin este print no sirve
			if(pass){
				pantalla.getContentPane().removeAll();
				pantalla.Ingreso();
				pantalla.getContentPane().revalidate();
				pantalla.getContentPane().repaint();
				System.out.println("ingreso");
				while(true){  // usar pass en los while
					pass = pantalla.getPass();
					System.out.println("pass of ingreso: "+pass);
					if(pass){
						cuenta = pantalla.getCount();
						//System.out.println(cuenta);
						break;
					}
				}
				break;
			}
		}

		pantalla.getContentPane().removeAll();
		pantalla.Transactions();
		pantalla.getContentPane().revalidate();
		pantalla.getContentPane().repaint();
		String choose = "";
		while(true){
			//System.out.println(cuenta);

			choose = pantalla.getChoose();
			System.out.println(choose);
			/*Transactions temp;
			if(choose == "saldo"){
				temp = new Saldo(cuenta);
			}else if(choose == "retiro"){
				temp = new Retiro(cuenta);
			}else if(choose == "deposito"){
				temp = new Deposito(cuenta);
			}else if(choose == "cancelar"){
				break;
			}*/
			if(choose == "cancelar"){
				break;
			}
		}
	}

	/*public boolean autenticarUsuario( int count, int nip ) 
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
	}*/ 

	public static void main(String args[]) {
		ATM app = new ATM();
	}
}
