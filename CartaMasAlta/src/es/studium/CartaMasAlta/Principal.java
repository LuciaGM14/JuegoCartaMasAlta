package es.studium.CartaMasAlta;

public class Principal {

	public static void main(String[] args) {
		//Modelo, vista, controlador.
		Modelo modelo = new Modelo(); //solo todo lo relacionado con la base de datos.
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		Controlador controlador = new Controlador (modelo, menuPrincipal);
	}

}
