package examen.vista;

import java.util.Arrays;

import examen.clases.Mando;
import examen.clases.MandoAireAcondicionado;
import examen.clases.MandoAspiradora;
import examen.clases.MandoMinicadena;
import examen.clases.MandoTV;

public class Principal {

	public static void main(String[] args) {
		
		Mando[] mandos = new Mando[10];

		mandos[0] = new Mando("LG", 13, 3);
		mandos[1] = new MandoAireAcondicionado("Fujitsu", 15, 5);
		mandos[2] = new MandoTV("Samsung", 10, 5);
		mandos[3] = new MandoMinicadena("Sony", 8, 4);
		mandos[4] = new MandoAspiradora("Dyson", 12, 3);
		mandos[5] = new Mando("Panasonic", 12, 3, 10);
		mandos[6] = new MandoTV("Huawei", 12, 3, 20);
		mandos[7] = new MandoAspiradora("Bosch", 5, 3, 5);
		mandos[8] = new MandoMinicadena("Philips", 4, 2, 8);
		mandos[9] = new MandoAireAcondicionado("Serranito", 25, 10, 5);
		
		Arrays.sort(mandos);
		System.out.println(Arrays.toString(mandos));
		
		for(Mando mando: mandos) {
			
			mando.encender();
			
			if(mando instanceof MandoTV mandoTV) {
				
				mandoTV.subirCanal();
				mandoTV.subirVolumen();
				mandoTV.bajarVolumen();
				
			} else if(mando instanceof MandoMinicadena mini) {
				
				mini.subirVolumen();
				mini.bajarVolumen();
				
			} else if(mando instanceof MandoAspiradora aspiradora) {
				
				aspiradora.subirVelocidad();
				aspiradora.bajarVelocidad();
				
			} else if(mando instanceof MandoAireAcondicionado aire) {
				
				aire.cambiarModo();
				aire.setTemperatura(21);
				aire.subirVelocidad();
				aire.bajarVelocidad();
				
			}
			
		}
		
		System.out.println(Arrays.toString(mandos));
		
	}
}
