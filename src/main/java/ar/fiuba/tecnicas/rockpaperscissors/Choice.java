package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Esta interface debe ser implementada por todas la elecciones posibles del juego
 * Rock-Paper-Scissors
 * 
 * @author Agustin
 *
 */

public interface Choice {
	
	public Choice vs(Choice someChoice);
	
	public Choice vs(Rock rockChoice);
	
	public Choice vs(Paper paperChoice);
	
	public Choice vs(Scissors scissorsChoice);
}
