package Ventanas;
import javax.swing.*;
import atm.d.*;

public class Transactions{

	public BaseDatosBanco baseDatosBanco = new BaseDatosBanco();
	public Pantalla pantalla;

	public Transactions(){
		pantalla = new Pantalla();
		pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		pantalla.setResizable(false);                            	
		pantalla.setLocationRelativeTo(null);
	}

}
