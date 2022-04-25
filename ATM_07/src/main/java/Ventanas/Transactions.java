package Ventanas;
import javax.swing.*;

public class Transactions{

	public BaseDatosBanco baseDatosBanco = new BaseDatosBanco();
	public double saldoDisponible;
	public double saldoTotal;
	public double[] saldos;

	public double[] saldos(int cuenta){
		saldoDisponible = baseDatosBanco.obtenerSaldoDisponible( cuenta );
		saldoTotal = baseDatosBanco.obtenerSaldoTotal( cuenta );
		saldos = new double[]{saldoDisponible, saldoTotal};
		return saldos;
	}

	public void ejecutar(int cuenta, double monto){
		//return saldos;
	}
}
