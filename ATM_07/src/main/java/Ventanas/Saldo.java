package Ventanas;
import javax.swing.*;

public class Saldo extends Transactions{

	public double getSaldoDisponible(int cuenta){
		return baseDatosBanco.obtenerSaldoDisponible( cuenta );
	}

	public double getSaldoTotal(int cuenta){
		return baseDatosBanco.obtenerSaldoTotal( cuenta );
	}

}
