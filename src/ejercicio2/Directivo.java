package ejercicio2;

public class Directivo extends Empleado{
	
	public Directivo(String nombre) {
		
		super(nombre);
		
	}

	@Override
	public String toString() {
		
		String cad = super.toString();
		
		cad += " -> Directivo";
		
		return cad;
		
	}
}
