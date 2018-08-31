package trucaoUFOP;

/**
 * Na classe Jogador � criado um jogador generico para qualquer jogo.
 * 
 * @author Warlen Marcio Pinheiro
 *
 */

public class Jogador {
	private String nome;
	
	/**
	 * Seu construtor exige um nome.
	 * @param nome
	 */
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	/**
	 * E atrav�s desse m�todo � poss�vel saber o nome do jogador
	 * @return nome
	 */
	
	public String getNome() {
		return this.nome;
	}
}
