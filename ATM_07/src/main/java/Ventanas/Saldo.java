package Ventanas;
import javax.swing.*;
import atm.d.*;

public class Saldo extends Transactions{

	private double saldoDisponible;
	private double saldoTotal;

	public Saldo(int cuenta){
		saldoDisponible = getSaldoDisponible(cuenta);
		saldoTotal = getSaldoTotal(cuenta);
		pantalla.Saldo(saldoDisponible, saldoTotal);
		while(true){
			System.out.println("Dentro de saldo y " + pantalla.getChoose());
			if(pantalla.getChoose() == "salir"){
				pantalla.setVisible(false);
				break;
			}
		}
	}

	public double getSaldoDisponible(int cuenta){
		return baseDatosBanco.obtenerSaldoDisponible( cuenta );
	}

	public double getSaldoTotal(int cuenta){
		return baseDatosBanco.obtenerSaldoTotal( cuenta );
	}

}
