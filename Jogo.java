package trucaoUFOP;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Aqui fica todo o placar do jogo, ficam também algumas regras para atribuição do placar
 * @author Warlen Marcio Pinheiro
 *
 */

public class Jogo implements Regras {
	protected static int jogador1_placar = 0;
	private static int maquina_placar = 0;
	protected static boolean mao_de_dez = false;
	private boolean truco = false;
	private boolean seis = false;
	protected static int jogador_queda = 0;
	protected static int maquina_queda = 0;
	
	/**
	 * O método vitoria recebe como parametro quem ganhou a queda e atribui
	 * ao placar da rodada
	 */

	@Override
	public void vitoria(int i) {
		if(Jogo.mao_de_dez == false & this.truco == false & this.seis == false) {
			if (i==1) {
				jogador1_placar += 2;
			}else {
				setMaquina_placar(getMaquina_placar() + 2);
			}
		}else if(this.seis == false){
			if (i==1) {
				jogador1_placar += 4;
			}else {
				setMaquina_placar(getMaquina_placar() + 4);
			}
		}else {
			if (i==1) {
				jogador1_placar += 8;
			}else {
				setMaquina_placar(getMaquina_placar() + 8);
			}
		}
		
		if(jogador1_placar == 10 | getMaquina_placar() == 10) {
			Jogo.mao_de_dez = true;
		}
	}
	
	/**
	 * O método é usado para embaralhar as cartas através de uma função ja existente
	 * do Java Collections.
	 * 
	 * return baralho
	 */

	@Override
	public ArrayList<Carta> embaralha(ArrayList<Carta> baralho) {
		Collections.shuffle(baralho);
		return baralho;

	}
	
	/**
	 * O metodo retorna se o jogo está trucado
	 * @return truco
	 */

	public boolean isTruco() {
		return truco;
	}
	
	/**
	 * O metodo retorna se está na mão de dez
	 * @return mao_de_dez
	 */
	
	public boolean isMaodedez() {
		return mao_de_dez;
	}
	
	/**
	 * O metodo deixa o jogo trucado
	 */

	public void setTruco() {
		this.truco = !truco;
	}
	
	/**
	 * O metodo retorna o placar atual da maquina
	 * @return maquina_placar
	 */

	public static int getMaquina_placar() {
		return maquina_placar;
	}
	
	/**
	 * Com esse método é possível Modificar o placar da maquina
	 * @param maquina_placar
	 */

	public static void setMaquina_placar(int maquina_placar) {
		Jogo.maquina_placar = maquina_placar;
	}
	
	/**
	 * Esse metodo verifica se o jogo está em seis
	 * @return seis
	 */

	public boolean isSeis() {
		return seis;
	}
	
	/**
	 * Esse metodo deixa o jogo em seis
	 * @param seis
	 */

	public void setSeis(boolean seis) {
		this.seis = seis;
	}
	

}
