package trucaoUFOP;
/** @author Warlen Pinheiro.*/
/**
 * Aqui � criado o Jogador do jogo de truco, � uma classe filha da classe Jogador
 */

import java.util.ArrayList;

public class Jogador_Truco extends Jogador {
	private ArrayList<Carta> mao;
	
	/**
	 * Para se criar um jogador � necess�rio saber o nome, ent�o o construtor exige
	 * esse parametro
	 */
	public Jogador_Truco(String nome){
		super(nome);
	}
	
	/**
	 * � possivel remover uma carta da m�o do jogador
	 * @param i
	 */
	
	public void remove_carta(int i) {
		mao.remove(i);
	}
	
	/**
	 * Retorna a m�o do jogador, que � um ArrayList do tipo Carta.
	 * @return mao
	 */

	public ArrayList<Carta> getMao() {
		return mao;
	}
	
	/**
	 * Adiciona uma nova m�o de cartas ao jogador
	 * @param mao2
	 */

	public void setMao(ArrayList<Carta> mao2) {
		this.mao = mao2;
	}
}
