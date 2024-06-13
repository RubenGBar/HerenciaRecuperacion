package examen.clases;

public class Mando implements Comparable<Mando>{

	public String modelo = "";
	
	public double altura = 0;
	
	public double anchura = 0;
	
	public double precio = 0;
	
	public boolean encendido = false;

	public Mando(String modelo, double altura, double anchura, double precio, boolean encendido) {
		
		if(modelo != null && !modelo.equals("")) {
			this.modelo = modelo;
		}
		if(altura > 0) {
			this.altura = altura;
		}
		if(anchura > 0) {
			this.anchura = anchura;
		}
		if(precio > 0) {
			this.precio = precio;
		}
		if(encendido) {
			this.encendido = encendido;
		}
		
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio > 0) {
			this.precio = precio;
		}
		
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		if(encendido) {
			this.encendido = encendido;
		}
		
	}

	public String getModelo() {
		return modelo;
	}

	public double getAltura() {
		return altura;
	}

	public double getAnchura() {
		return anchura;
	}
	
	public void encender() {
		
		this.encendido = true;
		
	}
	
	public void apagar() {
		
		this.encendido = false;
		
	}
	
	@Override
	public boolean equals(Object o) {
		
		boolean iguales = false;
		Mando m;
		
		if(o instanceof Mando) {
			
			m = (Mando) o;
			
			if(this.modelo.equals(m.modelo)) {
				
				iguales = true;
				
			}
			
		}
		
		return iguales;
		
	}
	
	@Override
	public String toString() {
		
		String cad = "";
		
		cad += "Mando\n";
		cad += "Modelo: " + this.modelo + "\n";
		cad += "Anchura: " + this.anchura + "\n";
		cad += "Altura: " + this.altura + "\n";
		cad += "Precio: " + this.precio + "\n";
		cad += "Encendido: ";
		if(this.encendido) {
			
			cad += "Sí\n";
			
		} else {
			
			cad += "No\n";
			
		}
		
		return cad;
	}

	@Override
	public int compareTo(Mando o) {
		
		int pos = 0;
		
		pos = this.modelo.compareToIgnoreCase(o.modelo);
		
		return pos;
	}
	
	
}
