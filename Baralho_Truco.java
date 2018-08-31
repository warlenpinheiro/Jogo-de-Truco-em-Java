package trucaoUFOP;

import java.util.ArrayList;

/** @author Warlen Pinheiro.*/
/**  A classe Baralho_Truco � uma classe filha da classe Baralho, isso ocorre porque
 *  a estrutura da classe � parecida, por�m precisamos remover algumas cartas que n�o pertecem ao jogo de truco.
 *  */

public class Baralho_Truco extends Baralho {
	private ArrayList<Carta> baralho_truco = new ArrayList<Carta>();
	
	/**
	 * O m�todo tem a fun��o de criar o baralho de truco atrav�s da utiliza��o de dois 
	 * ENUMS Carta e Naipes, adicionando somente as cartas 
	 * que perten�am ao jogo de truco, e ao mesmo tempo dando um valor a elas. 
	 * Todas as cartas s�o salvas em um ArrayList.
	 */
	private void cria_Baralho() {
		int i=1;
		String nome, naipe;
		for(BaralhoENUM criando : BaralhoENUM.values()) {
			nome = criando.toString();
			if(nome == "OITO"|nome == "NOVE" | nome =="DEZ") {
				continue;
			}
			for(Naipes construindo : Naipes.values()) {
				naipe = construindo.toString();
				if(nome=="A") {
					i = 8;
					if(naipe=="ESPADAS") {
						i = 12;
					}
				}
				else if(nome=="DOIS") {
					i = 9;
				}
				else if(nome=="QUATRO") {
					i = 1;
					if(naipe=="PAUS") {
						i = 14;
					}
				}
				else if(nome=="SETE") {
					i = 4;
					if(naipe=="COPAS") {
						i = 13;
					}
					else if(naipe=="OUROS") {
						i = 11;
					}
				}
				else if(nome=="DAMA") {
					i = 5;
				}
				Carta cards = new Carta(i, naipe, nome);
				baralho_truco.add(cards);
			}
			i++;
		}
		
	}
	/**
	 * O metodo tem a fun��o de retornar o baralho criado pelo metodo cria_baralho
	 * @return baralho_truco
	 */
	public ArrayList<Carta> getBaralho(){
		cria_Baralho();
		return baralho_truco;
	}
	
}
