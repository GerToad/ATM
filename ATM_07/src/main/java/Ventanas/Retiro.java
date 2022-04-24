package Ventanas;
import javax.swing.*;
import atm.d.*;

public class Retiro extends Transactions{

	/*public Pantalla pantalla = new Pantalla();

	public Retiro(int cuenta){
		pantalla.Retiro();
		while(true){
			System.out.println("Dentro de retiro y " + pantalla.getChoose());
			if(pantalla.getChoose() == "salir"){
				pantalla.setVisible(false);
				break;
			}
			if(pantalla.getChoose() == "retiro"){
				if(pantalla.getMonto() <= baseDatosBanco.obtenerSaldoDisponible(cuenta)){
					baseDatosBanco.cargar(cuenta, pantalla.getMonto());
					System.out.println(baseDatosBanco.obtenerSaldoDisponible(cuenta) + " " +
							baseDatosBanco.obtenerSaldoTotal(cuenta));
					//System.exit(0);
					pantalla.setVisible(false);
					break;
				}else{
					pantalla.setChoose("insuficiente");
					pantalla.lblmsg= new Label("El monto excede los fondos");
					pantalla.lblmsg.setBounds(220,60,200,30);
					pantalla.lblmsg.setFont(new Font("Consolas", 1, 13));
					pantalla.add(pantalla.lblmsg);
				}
			}
		}
	}*/

	public void ejecutar(int cuenta, double monto){
		System.out.println(cuenta + " " + monto);
		baseDatosBanco.cargar(cuenta, monto);
	}
}
