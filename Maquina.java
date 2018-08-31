package trucaoUFOP;

import java.util.ArrayList;

/**
 * Nessa classe é criada a máquina com a qual iremos jogar contra.
 * @author Warlen Marcio Pinheiro
 *
 */

public class Maquina extends Jogador_Truco {
	private ArrayList<Carta> mao;
	private static float esperanca = 0;
	
	/**
	 * Maquina é Filha de Jogador_Truco, então por convenção ela também recebe um
	 * nome.
	 */

	public Maquina(String nome) {
		super(nome);
	}
	
	/**
	 * Método que retorna a mão da Maquina
	 * return mao
	 */

	public ArrayList<Carta> getMao() {
		return mao;
	}
	
	/**
	 * Método que remove uma carta da mão da maquina
	 */
	
	public void remove_carta(int i) {
		mao.remove(i);
	}
	
	/**
	 * Método que modifica a mão da máquina
	 */

	public void setMao(ArrayList<Carta> mao) {
		this.mao = mao;
	}
	
	/**
	 * Método que retorna a esperanca da maquina, espepranca é a variavel com a
	 * qual a maquina toma suas decisões.
	 * return Maquina.esperanca
	 */
	
	public float getEsperanca() {
		return Maquina.esperanca;
	}
	
	/**
	 * Através desse método a máquina decide qual carta jogar. Baseando-se no
	 * valor da esperanca.
	 * @return opcao
	 */
	
	public int jogar() {
		int opcao = 0;
		esperanca = 0;
		for(int i = 0; i<mao.size(); i++) {
			if(mao.get(i).getValor()>10) {
				esperanca+=0.3;
			}
			if(mao.get(i).getValor()==14) {
				esperanca+=0.4;
			}
		}
		
		if(esperanca>0.5 & Jogo.mao_de_dez == false) {
			opcao = 3;
		}else {
			opcao = 0;
		}
		
		return opcao;
	}
	
	/**
	 * Atraves desse método a maquina joga suas cartas após trucar
	 * @return opcao
	 */
	
	public int maquina_trucou() {
		int opcao = 0,i, maior = 0;
		for(i=0; i<mao.size(); i++) {
			if(mao.get(i).getValor()>mao.get(maior).getValor()) {
				maior = i;
			}
		}
		
		opcao = maior;
		return opcao;
	}
	
	/**
	 * Metodo usado para adicionar valores à variavel esperanca
	 */
	
	public void addEsperanca(double d) {
		esperanca+=d;
	}
	
	/**
	 * Baseando-se na esperanca a máquina reage quando é trucada,
	 * retornando 1 caso queira seis, 2 caso queira aceitar e 3 caso queira correr
	 * @return int
	 */
	
	public int reagir_truco() {
		if(esperanca>0.6) {
			return 1;
		}else if(esperanca>0.4) {
			return 2;
		}else {
			return 3;
		}
	}
	
	/**
	 * Nesse método a maquina reage ao truco, baseando-se na variavel esperanca
	 * @return int
	 */
	
	public int reagir_seis() {
		if(esperanca>0.6) {
			return 1;
		}else {
			return 2;
		}
	}

}
