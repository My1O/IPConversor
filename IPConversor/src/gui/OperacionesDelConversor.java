package gui;
import java.util.Scanner;
import dol.ProcesoConvertir;
 
public class OperacionesDelConversor {
	public double celsiuConv, FahConver, numeroKG, numeroLB, numeroKGg;
	
	private Scanner leer = new Scanner(System.in);
	//Convertir Temperatura
	public void  ConvertirCelAKelvin() 
	   {
		  System.out.println("Ingrese el valor Celsius a convertir : "); 
		  celsiuConv = leer.nextInt();
		  System.out.println("el resultado de la conversion es : " + ProcesoConvertir.celsiuAKel(celsiuConv));
	   }
   public void  ConvertirCelsiuAFah() 
   {
	  System.out.println("Ingrese el valor Celsius a convertir : "); 
	  celsiuConv = leer.nextInt();
	  System.out.println("el resultado de la conversion es : " + ProcesoConvertir.celsiuAFah(celsiuConv)); 
   }
   public void  ConvertirKelvinaC() 
   {
	  System.out.println("Ingrese el valor Kelvin a convertir : "); 
	  celsiuConv = leer.nextInt();
	  System.out.println("el resultado de la conversion es : " + ProcesoConvertir.KelvinACel(celsiuConv)); 
   }
   public void  ConvertirKelvinaF() 
   {
	  System.out.println("Ingrese el valor Kelvin a convertir : "); 
	  celsiuConv = leer.nextInt();
	  System.out.println("el resultado de la conversion es : " + ProcesoConvertir.KelvintoFah(celsiuConv));
   }
   public void ConvertirAFarhenheit()
   {
	   System.out.println("Ingrese el valor Fahrenheit a convertir");
	   FahConver = leer.nextInt();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.FahACelsius(FahConver));
   }
   public void ConvertirFahaKel()
   {
	   System.out.println("Ingrese el valor Fahrenheit a convertir");
	   FahConver = leer.nextInt();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.FahAKel(FahConver));
   }
   // Convertir Masas
   public void ConvertirGramosaOZ()
   {
	   System.out.println("Ingrese los Gramos a convertir");
	   numeroKG = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.GramosaOZ(numeroKG));
   }
   public void ConvertirGramosaLbrs()
   {
	   System.out.println("Ingrese los Gramos a convertir");
	   numeroKG = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.GramosaLBs(numeroKG));
   }
   public void ConvertirGramosaKgrs()
   {
	   System.out.println("Ingrese los Gramos a convertir");
	   numeroKG = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.GramosaKG(numeroKG));
   }
   public void ConvertirOnzasaGr()
   {
	   System.out.println("Ingrese las Onzas a convertir");
	   numeroKG = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.OnzasaGr(numeroKG));
   }
   public void ConvertirOnzasLbrs()
   {
	   System.out.println("Ingrese las Onzas a convertir");
	   numeroKG = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.OnzasaLbrs(numeroKG));
   }
   public void ConvertirOnzasKgrs()
   {
	   System.out.println("Ingrese las Onzas a convertir");
	   numeroKG = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.OnzasaKGrs(numeroKG));
   }
   public void ConvertirLibrasaOnzas()
   {
	   System.out.println("Ingrese las libras a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.LibrasaOnz(numeroLB));
   }
   public void ConvertirLibrasaG()
   {
	   System.out.println("Ingrese las libras a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.LibrasaG(numeroLB));
   }
   public void ConvertirLibrasaKG()
   {
	   System.out.println("Ingrese las libras a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.LibrasaKilogr(numeroLB));
   }
   public void ConvertirKGaOnz()
   {
	   System.out.println("Ingrese las KG a convertir");
	   numeroKGg = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.KilogramosaOnz(numeroKGg));
   }
   public void ConvertirKGaG()
   {
	   System.out.println("Ingrese las KG a convertir");
	   numeroKGg = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.KilogramosaG(numeroKGg));
   }
   public void ConvertirKGaLbrs()
   {
	   System.out.println("Ingrese las KG a convertir");
	   numeroKGg = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.KilogramosaLB(numeroKGg));
   }
   // Convertir Longitudes
   public void ConvertirCmaPulgada()
   {
	   System.out.println("Ingrese los CM a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.CmAPulgada(numeroLB));
   }
   public void ConvertirCMaPie()
   {
	   System.out.println("Ingrese los CM a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.CmAPie(numeroLB));
   }
   public void ConvertirCMaYardas()
   {
	   System.out.println("Ingrese las CM a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.CmAYardas(numeroLB));
   }
   public void ConvertirPulgadaaCM()
   {
	   System.out.println("Ingrese las Pulgadas a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.PulgadasaCM(numeroLB));
   }
   public void ConvertirPulgadaaPie()
   {
	   System.out.println("Ingrese las Pulgadas a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.PulgadasaPi(numeroLB));
   }
   public void ConvertirPulgadaaYardas()
   {
	   System.out.println("Ingrese las Pulgadas a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.PulgadasaYard(numeroLB));
   }
   public void ConvertirPiesaCM()
   {
	   System.out.println("Ingrese el valor Pies a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.PiesaCM(numeroLB));
   }
   public void ConvertirPieaPul()
   {
	   System.out.println("Ingrese la medida en Pie a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.PiesaPul(numeroLB));
   }
   public void ConvertirPiesaYar()
   {
	   System.out.println("Ingrese la medida en Pie a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.PiesaYard(numeroLB));
   }
   public void ConvertirYardasaCM()
   {
	   System.out.println("Ingrese las Yardas a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.YardasaCM(numeroLB));
   }
   public void ConvertirYardasaPulg()
   {
	   System.out.println("Ingrese las Yardas a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.YardasaPulg(numeroLB));
   }
   public void ConvertirYardasaPies()
   {
	   System.out.println("Ingrese las Yardas a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.YardasaPi(numeroLB));
   }
   // Convertir Volumen
   
   public void ConvertirLitrosaGln()
   {
	   System.out.println("Ingrese los Litros a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.LitrosaGls(numeroLB));
   }
   public void ConvertirLitrosaM3()
   {
	   System.out.println("Ingrese los Litros a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.LitrosaM3(numeroLB));
   }
   public void ConvertirGalonaLtr()
   {
	   System.out.println("Ingrese las Galones a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.GalonesaLitros(numeroLB));
   }
   public void ConvertirGalonaM3()
   {
	   System.out.println("Ingrese las Galones a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.GalonesaMetros3(numeroLB));
   }
   public void ConvertirM3aLitros()
   {
	   System.out.println("Ingrese Metros Cubicos a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.MetrosCubicosaLtrs(numeroLB));
   }
   public void ConvertirM3aGls()
   {
	   System.out.println("Ingrese los Metros Cubicos a convertir");
	   numeroLB = leer.nextDouble();
	   System.out.println("el resultado de la conversion es : " + ProcesoConvertir.MetroscubicosaGls(numeroLB));
   }
}
