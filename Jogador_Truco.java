package trucaoUFOP;
/** @author Warlen Pinheiro.*/
/**
 * Aqui é criado o Jogador do jogo de truco, é uma classe filha da classe Jogador
 */

import java.util.ArrayList;

public class Jogador_Truco extends Jogador {
	private ArrayList<Carta> mao;
	
	/**
	 * Para se criar um jogador é necessário saber o nome, então o construtor exige
	 * esse parametro
	 */
	public Jogador_Truco(String nome){
		super(nome);
	}
	
	/**
	 * É possivel remover uma carta da mão do jogador
	 * @param i
	 */
	
	public void remove_carta(int i) {
		mao.remove(i);
	}
	
	/**
	 * Retorna a mão do jogador, que é um ArrayList do tipo Carta.
	 * @return mao
	 */

	public ArrayList<Carta> getMao() {
		return mao;
	}
	
	/**
	 * Adiciona uma nova mão de cartas ao jogador
	 * @param mao2
	 */

	public void setMao(ArrayList<Carta> mao2) {
		this.mao = mao2;
	}
}
