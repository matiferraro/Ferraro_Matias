package ejerc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class StringUtil {
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n) {
		String str = "";
		for(int i = 0; i < n; i++) {
			str += c;
		}
		return str;
	}

	// Retorna una cadena de longitud n, compuesta por s y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c) {
		while(s.length() != n) {
			s = c + s;
		}
		return s;
	}

	// Retorna un String[] conteniendo los elementos de arr representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])	{
		String arrStr[] = new String[arr.length];
		for(int i = 0; i < arr.length; i++) {
			arrStr[i] = String.valueOf(arr[i]);
		}
		return arrStr;
	}

	// Retorna un String[] conteniendo los elementos de arr representados como cadenas de caracteres
	public static int[] toIntArray(String arr[]) {
		int[] arrInt = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
		return arrInt;
	}

	// Retorna la longitud del elemento con mayor cantidad de caracteres del array arr
	public static int maxLength(String arr[]) {
		List<String> arrList = Arrays.asList(arr);
		String maxString = arrList.stream().max(comparing(String::length)).get();
		return maxString.length();
	}

	// Completa los elementos del arr agregando caracteres c a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)	{
		String arrNew[] = new String[arr.length];
		int n = maxLength(arr);
		int i = 0;
		for(String s : arr) {
			arrNew[i] = (lpad(s, n, c));
			i++;
		}
	}

}
