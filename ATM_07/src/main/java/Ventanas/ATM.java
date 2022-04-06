
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
		ingreso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ingreso.setResizable(false);
		ingreso.setLocationRelativeTo(null);
		while(true){
			pass = ingreso.getPass();
			System.out.println(pass);  // Sin este print no sirve
			if(pass){
				break;
			}
		}

		Transactions trnstn = new Transactions();
		trnstn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		trnstn.setResizable(false);
		trnstn.setLocationRelativeTo(null);
		
	}

	public static void main(String args[]) {
		ATM app = new ATM();
	}
}
