package Ventanas;
import javax.swing.*;

public class Retiro extends Transactions{

	public void ejecutar(int cuenta, double monto){
		System.out.println(cuenta + " " + monto);
		baseDatosBanco.cargar(cuenta, monto);
	}
}
