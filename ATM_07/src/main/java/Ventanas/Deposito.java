package Ventanas;
import javax.swing.*;
import atm.d.*;

public class Deposito extends Transactions{

	//public double saldoDisponible;
	//public double saldoTotal;
	//public double[] saldos;

	/*public Deposito(int cuenta){
		saldoDisponible = getSaldoDisponible(cuenta);
		saldoTotal = getSaldoTotal(cuenta);
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
				//pantalla.setVisible(false);
				break;
				//System.exit(0);
			}
		}
	}*/

	public void ejecutar(int cuenta, double monto){
		System.out.println(cuenta + " " + monto);
		baseDatosBanco.abonar(cuenta, monto);
		//saldos = new double[]{saldoDisponible, saldoTotal};
		//saldos = saldos(cuenta);
		//return saldos;
		//System.out.println(baseDatosBanco.obtenerSaldoDisponible(cuenta) + " " +
				//baseDatosBanco.obtenerSaldoTotal(cuenta));
		//System.exit(0);
	}
}
