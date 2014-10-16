/**
 * 
 */
package net.xavihurtado;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xavi
 *
 */
public class ComptarLletres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Character, Integer> lletres = new HashMap<Character, Integer>();
		String frase = "Hhola com va tot?";
		int numRep = 0;
		frase = frase.toUpperCase();
		for(int i = 0; i < frase.length();i++)
		{ 
			if(lletres.containsKey(frase.charAt(i))) {
				numRep = lletres.get(frase.charAt(i));
				lletres.put(frase.charAt(i),numRep + 1);
			}
			else {
				lletres.put(frase.charAt(i),1);
			}
			numRep =0;
		}
		System.out.println(lletres.toString());
	}
}
