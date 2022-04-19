
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
				pantalla.teclado();
				pantalla.Ingreso();
				pantalla.revalidate();
				pantalla.repaint();
				System.out.println("ingreso");
				while(true){
					pass = pantalla.getPass();
					System.out.println("pass of ingreso: "+pass);
					if(pass){
						cuenta = pantalla.getCount();
						break;
					}
				}
				break;
			}
		}

		clean("transactions");
		String choose = "";
		double saldoDisponible = 0;
		double saldoTotal = 0;
		double[] saldos;
		while(true){
			choose = pantalla.getChoose();
			System.out.println(choose);
			Transactions temp;
			if(choose == "saldo"){
				System.out.println(choose);
				if(saldoDisponible == 0 && saldoTotal == 0){
					temp = new Saldo();
					saldos = temp.saldos(cuenta);
					saldoDisponible = saldos[0];
					saldoTotal = saldos[1];
					//clean("saldo", saldos[0], saldos[1]);
				}
				clean("saldo", saldoDisponible, saldoTotal);
				while(true){
					System.out.println("Dentro de saldo y " + pantalla.getChoose());
					if(pantalla.getChoose() == "salir"){
						break;
					}
				}
				pantalla.setChoose("vaciar");
				clean("transactions");
			}else if(choose == "deposito"){
				System.out.println(choose);
				temp = new Deposito();
				clean("deposito");
				while(true){
					System.out.println("Dentro de deposito y " + pantalla.getChoose());
					if(pantalla.getChoose() == "salir"){
						break;
					}
					if(pantalla.getChoose() == "monto"){
						temp.ejecutar(cuenta, pantalla.getMonto());
						saldos = temp.saldos(cuenta);
						saldoDisponible = saldos[0];
						saldoTotal = saldos[1];
						//pantalla.setChoose("vaciar");
						break;
					}
				}
				pantalla.setChoose("vaciar");
				clean("transactions");
			}else if(choose == "retirar"){
				System.out.println(choose);
				temp = new Retiro(cuenta);
				pantalla.setChoose("vaciar");
			}else if(choose == "cancelar"){
				System.exit(0);
				//break;
			}
		}
	}

	public void clean(String function, double sd, double sf){
		pantalla.getContentPane().removeAll();
		pantalla.teclado();
		if(function == "saldo"){
			pantalla.Saldo(sd, sf);
		}
		pantalla.revalidate();
		pantalla.repaint();
	}
	public void clean(String function){
		pantalla.getContentPane().removeAll();
		pantalla.teclado();
		if(function == "transactions"){
			pantalla.Transactions();
		}else if(function == "ingreso"){
			pantalla.Ingreso();
		}else if(function == "retiro"){
			pantalla.Retiro();
		}else if(function == "deposito"){
			pantalla.Deposito();
		}
		pantalla.revalidate();
		pantalla.repaint();
	}

	public static void main(String args[]) {
		ATM app = new ATM();
	}
}
