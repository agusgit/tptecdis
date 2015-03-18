package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper {
	
	public Paper vs(Paper paperChoice){
		return this;
	}
	
	public Paper vs(Rock rockChoice){
		return this;
	}
	
	public Scissors vs(Scissors scissorsChoice){
		return scissorsChoice;
	}
}
