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
		String frase = "gfsftsgd 1444542233";
		int numRep = 0;
		int comptadorNum = 0;
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
			if((int)frase.charAt(i) > 47 && (int)frase.charAt(i) < 58) {
				comptadorNum++;
			}
			numRep = 0;	
		}
		System.out.println(lletres.toString());
		System.out.println();
		System.out.println("Hi apareixen " + comptadorNum + " números.");
	}
}
