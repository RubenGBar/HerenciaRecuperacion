package ejercicio3;

import java.util.Scanner;
import java.util.TreeSet;

public class Principal {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		TreeSet<Producto> lista = new TreeSet<>();
		int opc = -1;
		
		do {
			
			menu();
			opc = sc.nextInt();
			
			switch(opc) {
				case 1 -> { // Añadir Producto
					
					aniadirProducto(lista);
					
				}
				case 2 -> { // Listar Productos
					
					System.out.println(lista);
					
				}
				case 3 -> { // Eliminar Productos
					
					eliminarProducto(lista);
					
				}
				case 4 -> { // Calcular Precio
					
					calcularTotal(lista);
					
				}
				
			}
			
		}while(opc != 0);
		
		System.out.println("Saliendo del programa");
		
		sc.close();
		
	}

	private static void calcularTotal(TreeSet<Producto> lista) {
		Producto p;
		Producto p2;
		double precioTotal;
		int cantidad;
		String nombre;
		
		System.out.println("¿De qué Producto quieres calcular su precio total?");
		sc.nextLine();
		nombre = sc.nextLine();
		
		p = new Producto(nombre);
		p2 = lista.ceiling(p);
		
		System.out.println("Introduzca una cantidad");
		cantidad = sc.nextInt();
		
		precioTotal = cantidad * p2.precio;
		
		System.out.println("El precio total es: " + precioTotal);
	}

	private static void eliminarProducto(TreeSet<Producto> lista) {
		Producto p;
		String nombre;
		
		System.out.println("¿Qué Producto quieres eliminar?");
		sc.nextLine();
		nombre = sc.nextLine();
		
		p = new Producto(nombre);
		
		lista.remove(p);
	}

	private static void aniadirProducto(TreeSet<Producto> lista) {
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
				
				System.out.println("Introduzca los días a caducar del Producto");
				diasACaducar = sc.nextInt();
				
				pp = new Perecedero(nombre, precio, diasACaducar);
				
				lista.add(pp);
				
			}
		}
		
	}
	
	public static void menu() {
		
		System.out.println("1. Añadir Producto");
		System.out.println("2. Listar Productos");
		System.out.println("3. Eliminar Productos");
		System.out.println("4. Calcular Precio");
		System.out.println("0. Salir");
		
	}
	
}
