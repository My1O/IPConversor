package dal;
import java.util.Scanner;

public class Validaciones {
	//private BufferedReader reader;
    private Scanner reader;

	public Validaciones(Scanner lec)
    {
		this.reader = lec;
	}
	private boolean isNumericDouble(String cadena)
    {
		try
        {
			Double.parseDouble(cadena);
			return true;
		}
        catch (NumberFormatException n)
        {
			return false;
		}
	}
	private boolean isNumericInteger(String cadena)
    {
		try
        {
			Integer.parseInt(cadena);
			return true;
		}
        catch (NumberFormatException n)
        {
			return false;
		}
	}
	public double ValidaDouble(String mensaje)
    {
		String cadena = null;
		Double eleccion;
		do
        {
			System.out.print(mensaje);
			eleccion = (isNumericDouble(cadena = reader.nextLine())) ? Double.parseDouble(cadena) : null;
			System.out.print(eleccion == null ? " >> Expresion no valida (Ingresa un valor Numerico) << " : "");

		} while (eleccion == null);
		return eleccion;
	}
	public int ValidaInt(String mensaje)
    {
		String cadena = null;
		Integer eleccion;
		do
        {
			System.out.print(mensaje);
			eleccion = (isNumericInteger(cadena = reader.nextLine())) ? Integer.parseInt(cadena) : null;
			System.out.print(
					eleccion == null ? " >> Expresion no valida (Ingresa un valor Numerico o un Entero) << " : "");
		} while (eleccion == null);
		return eleccion;
	}
	public int ValidaRango(int a, int b, String Mensaje) 
    {
		int eleccion = 0;
		do {
			eleccion = ValidaInt(Mensaje);
			System.out.print(eleccion < a || eleccion > b ? "<<< Valor fuera de rango >>> " : "");
		} while (eleccion < a || eleccion > b);
		return eleccion;
	}
	public int EnteroMayoresA(int valor, String Mensaje, String Error) 
    {
		int retorno;
		do {
			retorno = ValidaInt(Mensaje);
			System.out.println(retorno <= valor ? Error : " ");
		} while (retorno <= valor);
		return retorno;
	}
	public double DobleMayoresA(double valor, String Mensaje, String Error)
    {
		double retorno;
		do {
			retorno = ValidaDouble(Mensaje);
			System.out.println(retorno <= valor ? Error : " ");
		} while (retorno <= valor);
		return retorno;
	}
	public double DobleDiferenteDe(double valor, String Mensaje, String Error)
    {
		double retorno = 0;
		do {
			retorno = ValidaDouble(Mensaje);
			System.out.println(retorno == valor ? Error : " ");
		} while (retorno == valor);
		return retorno;
	}
}