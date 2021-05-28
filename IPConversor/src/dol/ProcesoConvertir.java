package dol;

public class ProcesoConvertir 
{
	// convertir Temperatura
	public static Double celsiuAFah ( Double DatoIngresado )
	{
		return DatoIngresado *  1.8 +( 32);
	}
	public static Double celsiuAKel ( Double DatoIngresado )
	{
		return DatoIngresado + 273.15;
	}
	public static Double KelvinACel ( Double DatoIngresado )
	{
		return DatoIngresado - 273.15;
	}
	public static Double KelvintoFah ( Double DatoIngresado )
	{
		return (((DatoIngresado - 273) * 9/5) + 32);
	}
	public static Double FahACelsius ( Double DatoIngresado )
	{
		return (DatoIngresado-32)*5/9;
	}
	public static Double FahAKel ( Double DatoIngresado )
	{
		return (DatoIngresado - 32) * 5 / 9 + 273.15;
	}
	// Opciones Longitud
	public static Double CmAPulgada ( Double DatoIngresado )
	{
		return DatoIngresado / 2.54;
	}
	public static Double CmAPie ( Double DatoIngresado )
	{
		return DatoIngresado * 0.032808;
	}
	public static Double CmAYardas ( Double DatoIngresado )
	{
		return DatoIngresado * 0.010936;
	}
	public static Double PulgadasaCM ( Double DatoIngresado )
	{
		return DatoIngresado * 2.54;
	}
	public static Double PulgadasaPi ( Double DatoIngresado )
	{
		return DatoIngresado * 0.08791; 
	}
	public static Double PulgadasaYard ( Double DatoIngresado )
	{
		return DatoIngresado * 0.027778;
	}
	public static Double PiesaCM ( Double DatoIngresado )
	{
		return DatoIngresado * 30.48;  
	}
	public static Double PiesaPul ( Double DatoIngresado )
	{
		return DatoIngresado * 12; 
	}
	public static Double PiesaYard ( Double DatoIngresado )
	{
		return DatoIngresado * 0.333333;  //
	}
	public static Double YardasaCM ( Double DatoIngresado )
	{
		return DatoIngresado * 91.44; 
	}
	public static Double YardasaPulg ( Double DatoIngresado )
	{
		return DatoIngresado * 36; 
	}
	public static Double YardasaPi( Double DatoIngresado )
	{
		return DatoIngresado * 3;  
	}
	// Convertir Masas
	public static Double GramosaOZ ( Double DatoIngresado )
	{
		return DatoIngresado * 0.035274;
	}
	public static Double GramosaLBs ( Double DatoIngresado )
	{
		return DatoIngresado * 0.00220462; 
	}
	public static Double GramosaKG ( Double DatoIngresado )
	{
		return DatoIngresado * 0.001;
	}
	public static Double OnzasaGr ( Double DatoIngresado )
	{
		return DatoIngresado * 28.3495;
	}
	public static Double OnzasaLbrs ( Double DatoIngresado )
	{
		return DatoIngresado * 0.0625;
	}
	public static Double OnzasaKGrs ( Double DatoIngresado )
	{
		return DatoIngresado * 0.02835;
	}
	public static Double LibrasaOnz ( Double DatoIngresado )
	{
		return DatoIngresado * 16; 
	}
	public static Double LibrasaG ( Double DatoIngresado )
	{
		return DatoIngresado * 453.59; 
	}
	public static Double LibrasaKilogr ( Double DatoIngresado )
	{
		return DatoIngresado * 0.453592; 
	}
	public static Double KilogramosaOnz ( Double DatoIngresado )
	{
		return DatoIngresado * 35.2739;  
	}
	public static Double KilogramosaG ( Double DatoIngresado )
	{
		return DatoIngresado * 1000.00;
	}
	public static Double KilogramosaLB ( Double DatoIngresado )
	{
		return DatoIngresado * 2.20462262;
	}
	// convertir Volumen
	
	public static Double LitrosaGls ( Double DatoIngresado )
	{
		return DatoIngresado * 0.264172;
	}
	public static Double LitrosaM3 ( Double DatoIngresado )
	{
		return DatoIngresado * 0.001; // galones a metros cubicos
	}
	public static Double GalonesaLitros ( Double DatoIngresado )
	{
		return DatoIngresado * 3.7854;
	}
	public static Double GalonesaMetros3 ( Double DatoIngresado )
	{
		return DatoIngresado * 0.00378541; // galones a metros cubicos
	}
	public static Double MetrosCubicosaLtrs ( Double DatoIngresado )
	{
		return DatoIngresado * 1000.00;
	}
	public static Double MetroscubicosaGls ( Double DatoIngresado )
	{
		return DatoIngresado * 264.17;
	}
}
