package ejercicio3;

import java.util.Scanner;
import java.util.TreeSet;

public class GestionProductos {

	static TreeSet<Producto> lista = new TreeSet<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void aniadirProducto() {
		Producto p;
		NoPerecedero pnp;
		Perecedero pp;
		String nombre;
		double precio;
		int diasACaducar;
		String tipo;
		int opcProducto;
		
		System.out.println("¿Va a introducir un 1.Producto a secas, un 2.ProductoNoPerecedero o un 3.ProductoPerecedero?");
		
		opcProducto = sc.nextInt();
		sc.nextLine();
		
		switch(opcProducto) {
			
			case 1 -> {
			
				System.out.println("Introduzca el nombre del Producto");
				nombre = sc.nextLine();
				
				System.out.println("Introduzca el precio del Producto");
				precio = sc.nextDouble();
				sc.nextLine();
				
				p = new Producto(nombre, precio);
				
				lista.add(p);
				
			}
			case 2 -> {
				
				System.out.println("Introduzca el nombre del Producto");
				nombre = sc.nextLine();
				
				System.out.println("Introduzca el precio del Producto");
				precio = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Introduzca el tipo de Producto");
				tipo = sc.nextLine();
				
				pnp = new NoPerecedero(nombre, precio, tipo);
				
				lista.add(pnp);
				
			}
			case 3 -> {
				
				System.out.println("Introduzca el nombre del Producto");
				nombre = sc.nextLine();
				
				System.out.println("Introduzca el precio del Producto");
				precio = sc.nextDouble();
				sc.nextLine();
				System.out.println("Introduzca los días a caducar del Producto");
				diasACaducar = sc.nextInt();
				sc.nextLine();
				
				pp = new Perecedero(nombre, precio, diasACaducar);
				
				lista.add(pp);
				
			}
		}
		
	}
	
	public static void eliminarProducto() {
		Producto productoABuscar;
		Producto productoEliminar;
		String nombre;
		
		System.out.println("Introduzca el nombre del producto a eliminar");
		
		nombre = sc.nextLine();
		
		productoABuscar = new Producto(nombre);
		
		productoEliminar = buscar(productoABuscar);
		
		lista.remove(productoEliminar);
		
	}
	
	public static void calcularTotal() {
		Producto productoABuscar;
		Producto productoCalcular;
		double precioTotal;
		int cantidad;
		String nombre;
		
		System.out.println("Introduzca el nombre del producto a calcular el precio");
		
		nombre = sc.nextLine();
		
		productoABuscar = new Producto(nombre);
		productoCalcular = buscar(productoABuscar);
		
		System.out.println("Introduzca una cantidad");
		cantidad = sc.nextInt();
		sc.nextLine();
		precioTotal = productoCalcular.calcular(cantidad);
		
		System.out.println("El precio total es: " + precioTotal);
	}
	
	public static Producto buscar(Producto productoABuscar) {
		
		Producto p = null;
		
		for(Producto pBuscador: lista) {
			
			if(pBuscador.equals(productoABuscar)) {
				
				p = pBuscador;
				break;
				
			}
			
		}
		
		return p;
	}
	
	public static void listar() {
		
		for(Producto p: lista) {
			
			System.out.println(p);
			
		}
		
	}
	
}
