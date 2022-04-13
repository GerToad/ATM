package Ventanas;
import javax.swing.*;
import atm.d.*;

public class Deposito extends Transactions{

	private double saldoDisponible;
	private double saldoTotal;

	public Deposito(int cuenta){
		pantalla.Deposito();
		while(true){
			System.out.println("Dentro de deposito y " + pantalla.getChoose());
			if(pantalla.getChoose() == "salir"){
				pantalla.setVisible(false);
				break;
			}
			if(pantalla.getChoose() == "monto"){
				baseDatosBanco.abonar(cuenta, pantalla.getMonto());
				System.out.println(baseDatosBanco.obtenerSaldoDisponible(cuenta) + " " +
						baseDatosBanco.obtenerSaldoTotal(cuenta));
				//pantalla.setChoose("vaciar");
				pantalla.setVisible(false);
				break;
				//System.exit(0);
			}
		}
	}
}
