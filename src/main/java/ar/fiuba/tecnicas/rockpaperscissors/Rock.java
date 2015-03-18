package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock {
	
	public Rock vs(Rock rockChoice){
		return this;
	}
	
	public Rock vs(Scissors scissorsChoice){
		return this;
	}
	
	public Paper vs(Paper paperChoice){
		return paperChoice;
	}
}
