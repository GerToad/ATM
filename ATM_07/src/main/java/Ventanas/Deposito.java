package Ventanas;
import javax.swing.*;
import atm.d.*;

public class Deposito extends Transactions{

	public void ejecutar(int cuenta, double monto){
		System.out.println(cuenta + " " + monto);
		baseDatosBanco.abonar(cuenta, monto);
	}
}
