
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
	boolean usuarioAutenticado = false;
	BaseDatosBanco baseDatosBanco = new BaseDatosBanco();

	private Ingreso ingreso;

	public ATM(){
		ingreso = new Ingreso();		
		while(pass){
			boolean pass = ingreso.autenticarUsuario();
		}
		//System.out.println("Here goes");
		//boolean go = ingreso.autenticarUsuario();
		//System.out.print(go);
		if(go){
			Transactions trnstn = new Transactions();
			trnstn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			trnstn.setResizable(false);
			trnstn.setLocationRelativeTo(null);
		}
	}

	public static void main(String args[]) {
		ATM app = new ATM();
	}
}
