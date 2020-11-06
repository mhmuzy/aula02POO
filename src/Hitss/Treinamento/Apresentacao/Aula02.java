package Hitss.Treinamento.Apresentacao;

import Hitss.Treinamento.Classes.*;
import Hitss.Treinamento.Repository.*;

public class Aula02 {

	public static void main(String[] args) {
		/*** Caneta 1 ***/
		
		/** Classe ***/		
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		
		/*** Métodos ***/
		CanetaRepository cr1 = new CanetaRepository();
		cr1.tampar(c1);
		cr1.status(c1);
		cr1.rabiscar(c1);
 
/*** ############################################################### ***/
		System.out.println("-----------------------------------------------------");
		
		
		/*** Caneta 2 ***/
		/*** Classe ***/
		Caneta c2 = new Caneta();
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		
		/*** Métodos ***/
		CanetaRepository cr2 = new CanetaRepository();
		cr2.destampar(c2);
		cr2.status(c2);
		cr2.rabiscar(c2);
	}
}
