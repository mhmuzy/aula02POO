package Hitss.Treinamento.Repository;

import Hitss.Treinamento.Classes.*;

public class CanetaRepository {
	public void status(Caneta caneta) {
		System.out.println("Modelo: " + caneta.modelo);
		System.out.println("Uma caneta " + caneta.cor);
		System.out.println("Ponta: " + caneta.ponta);
		System.out.println("Carga: " + caneta.carga);
		String resp = caneta.tampada? "Sim" : "Não";
		System.out.println("Esta tampada? " + resp);
	}
	
	public void rabiscar(Caneta caneta) {
		if (caneta.tampada) {
			System.out.println("ERRO! Não posso rabiscar.");
		}
		else {
			System.out.println("Estou rabiscando");
		}
	}
	
	public void tampar(Caneta caneta) {
		caneta.tampada = true;
	}
	
	public void destampar(Caneta caneta) {
		caneta.tampada = false;
	}
}
