package trucaoUFOP;

import java.util.ArrayList;

/**
 * Interface com algumas regras e necessidades do jogo.
 * @author Warlen Marcio Pinheiro
 *
 */

public interface Regras {
	
	public void vitoria(int i);
	public ArrayList<Carta> embaralha(ArrayList<Carta> baralho);
}
