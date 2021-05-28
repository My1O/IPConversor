package gui;
import java.util.Scanner;
import dal.Validaciones;

public class Menu {
	//Lector de ingreso del usuario
	Scanner leer = new Scanner(System.in);
	Validaciones v;
	OperacionesDelConversor pc;
	public Menu() 
	{
		v = new Validaciones(leer);
		pc = new OperacionesDelConversor();
	}
	// Muestra las opciones del menu princial
	public void desplegarOpcionesMenu() 
	{
     System.out.println("*-------Menu Principal - Conversor------*");
     System.out.println("1 . Convertir temperaturas");
     System.out.println("2 . Convertir Masas");
     System.out.println("3 . Convertir Longitudes");
     System.out.println("4 . Convertir Volumen");
     System.out.println("5 . Salir de la aplicacion");
    }
	public void desplegarOpcionesTemperaturas()
	{
		 System.out.println("*-------Sub Menu - Temperatura - Conversor------*");
		 System.out.println("1 . Convertir C a K");
		 System.out.println("2 . Convertir C a F");
		 System.out.println("3 . Convertir K a C");
	     System.out.println("4 . Convertir K a F");
	     System.out.println("5 . Convertir F a C");
	     System.out.println("6 . Convertir F a K");
	     System.out.println("7 . Salir de la aplicacion");
	}
	public void desplegarOpcionesMasas()
	{
		 System.out.println("*-------Sub Menu - Masas - Conversor------*");
	     System.out.println("1 . Convertir Gramos a Onzas");
	     System.out.println("2 . Convertir Gramos a Libras");
	     System.out.println("3 . Convertir Gramos a KG");
	     System.out.println("4 . Convertir Onzas a Gramos");
	     System.out.println("5 . Convertir Onzas a Libras");
	     System.out.println("6 . Convertir Onzas a KG");
	     System.out.println("7 . Convertir Libras a Onzas");
	     System.out.println("8 . Convertir Libras a Gramos");
	     System.out.println("9 . Convertir Libras a KG");
	     System.out.println("10. Convertir KG a Onzas");
	     System.out.println("11. Convertir KG a Gramos");
	     System.out.println("12. Convertir Kg a Libras");
	     System.out.println("13. Regresar al Menu Principal");
	}
	
	public void desplegarOpcionesLongitudes()
	{
		 System.out.println("*-------Sub Menu - Longitudes - Conversor------*");
	     System.out.println("1 . Convertir CM a Pulgadas");
	     System.out.println("2 . Convertir CM a Pies");
	     System.out.println("3 . Convertir CM a Yardas");
	     System.out.println("4 . Convertir Pulgadas a CM");
	     System.out.println("5 . Convertir Pulgadas a Pies");
	     System.out.println("6 . Convertir Pulgadas a Yardas");
	     System.out.println("7 . Convertir Pies a CM");
	     System.out.println("8 . Convertir Pies a Pulgadas");
	     System.out.println("9 . Convertir Pies a Yardas");
	     System.out.println("10. Convertir Yardas a CM");
	     System.out.println("11. Convertir Yardas a Pulgadas");
	     System.out.println("12. Convertir Yardas a Pies");
	     System.out.println("13. Regresar al Menu Principal");
	}
	public void desplegarOpcionesVolumen()
	{
		 System.out.println("*-------Sub Menu - Longitudes - Conversor------*");
	     System.out.println("1 . Convertir Litro a Galon");
	     System.out.println("2 . Convertir Litro a Metro Cubico");
	     System.out.println("3 . Convertir Galon a Litro");
	     System.out.println("4 . Convertir Galon a Metro Cubico");
	     System.out.println("5 . Convertir Metro Cubico a Litro");
	     System.out.println("6 . Convertir Metro Cubico a Galon");
	     System.out.println("7 . Regresar al Menu Principal");
	}
	public void mostrarMenu() 
	{
		correrOpcionMenu (v.ValidaRango(1, 5, "Ingresar dato: \n"));
	}
	private void correrOpcionMenu (int accion)
	{
		switch(accion)
			{  
		case 1 -> 
		{
			subMenuTemperatura();
		}		
		case 2 -> 
		{
			subMenuMasas();
		}
		case 3 ->
		{
			subMenuLongitudes(); 
		}
		case 4 ->
		{
			subMenuVolumen();
		}
		case 5 ->
		{
			System.exit(0);
		}
 		}
	}
	private void subMenuTemperatura()
	{
		desplegarOpcionesTemperaturas();
		correrOpcionSubMenuTemperatura(v.ValidaRango(1, 7, "Ingrese un valor correcto : \n"));
		desplegarOpcionesMenu();
		mostrarMenu();
	}  
	private void correrOpcionSubMenuTemperatura (int ejecutar)
	{
		switch(ejecutar)
		{
		case 1 ->
		{
			pc.ConvertirCelAKelvin();
		}
		case 2 ->
		{
			pc.ConvertirCelsiuAFah();
		}
		case 3 ->
		{
			pc.ConvertirKelvinaC();
		}
		case 4 ->
		{
			pc.ConvertirKelvinaF();
		}
		case 5 ->
		{
			pc.ConvertirAFarhenheit();
		}
		case 6 ->
		{
			pc.ConvertirFahaKel();
		}
		case 7 ->
		{
			desplegarOpcionesMenu();
			mostrarMenu();
		}
		}	
	}
	private void subMenuMasas()
	{
		desplegarOpcionesMasas();
		correrOpcionSubMenuMasas(v.ValidaRango(1, 13, "Ingrese un valor correcto : \n"));
		desplegarOpcionesMenu();
		mostrarMenu();
	}
	private void correrOpcionSubMenuMasas (int ejecutar)
	{
		switch(ejecutar)
		{
		case 1 -> 
		{
			pc.ConvertirGramosaOZ();
		}
		case 2 ->
		{
			pc.ConvertirGramosaLbrs();
		}
		case 3 ->
		{
			pc.ConvertirGramosaKgrs();
		}
		case 4 ->
		{
			pc.ConvertirOnzasaGr();
		}
		case 5 ->
		{
			pc.ConvertirOnzasLbrs();
		}
		case 6 ->
		{
			pc.ConvertirOnzasKgrs();
		}
		case 7 ->
		{
			pc.ConvertirLibrasaOnzas();
		}
		case 8 ->
		{
			pc.ConvertirLibrasaG();
		}
		case 9 ->
		{
			pc.ConvertirLibrasaKG();
		}
		case 10 ->
		{
			pc.ConvertirKGaOnz();
		}
		case 11 ->
		{
			pc.ConvertirKGaG();
		}
		case 12 ->
		{
			pc.ConvertirKGaLbrs();
		}
		case 13 ->
		{
			desplegarOpcionesMenu();
			mostrarMenu();
		}
		}
	}
	private void subMenuLongitudes()
	{
		desplegarOpcionesLongitudes();
		correrOpcionSubMenuLongitudes(v.ValidaRango(1, 13, "Ingrese un valor correcto : \n"));
		desplegarOpcionesMenu();
		
	}
	private void correrOpcionSubMenuLongitudes (int ejecutar)
	{		
		switch(ejecutar)
		{
		case 1 ->
		{
			pc.ConvertirCmaPulgada();
		}
		case 2 ->
		{
			pc.ConvertirCMaPie();
		}
		case 3 ->
		{
			pc.ConvertirCMaYardas();
		}
		case 4 ->
		{
			pc.ConvertirPulgadaaCM();
		}
		case 5 ->
		{
			pc.ConvertirPulgadaaPie();
		}
		case 6 ->
		{
			pc.ConvertirPulgadaaYardas();
		}
		case 7 ->
		{
			pc.ConvertirPiesaCM();
		}
		case 8 ->
		{
			pc.ConvertirPieaPul();
		}
		case 9 ->
		{
			pc.ConvertirPiesaYar();
		}
		case 10 ->
		{
			pc.ConvertirYardasaCM();
		}
		case 11 ->
		{
			pc.ConvertirYardasaPulg();
		}
		case 12 ->
		{
			pc.ConvertirYardasaPies();
		}
		case 13 ->
		{
			desplegarOpcionesMenu();
			mostrarMenu();
		}
		}
	}
	private void subMenuVolumen()
	{
		desplegarOpcionesVolumen();
		correrOpcionSubMenuVolumen(v.ValidaRango(1, 7, "Ingrese un valor correcto : \n"));
		desplegarOpcionesMenu();
		mostrarMenu();
	}
	private void correrOpcionSubMenuVolumen (int ejecutar)
	{
		switch(ejecutar)
		{
		case 1 ->
		{
			pc.ConvertirLitrosaGln();
		}
		case 2 ->
		{
			pc.ConvertirLitrosaM3();	
		}
		case 3 ->
		{
			pc.ConvertirGalonaLtr();
		}
		case 4 ->
		{
			pc.ConvertirGalonaM3();
		}
		case 5 ->
		{
			pc.ConvertirM3aLitros();
		}
		case 6 ->
		{
			pc.ConvertirM3aGls();
		}
		case 7 ->
		{
			desplegarOpcionesMenu();
			mostrarMenu();
		}
		}
	}
}
