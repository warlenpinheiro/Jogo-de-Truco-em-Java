package trucaoUFOP;

/**
 * Na classe Jogador é criado um jogador generico para qualquer jogo.
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
	 * E através desse método é possível saber o nome do jogador
	 * @return nome
	 */
	
	public String getNome() {
		return this.nome;
	}
}
