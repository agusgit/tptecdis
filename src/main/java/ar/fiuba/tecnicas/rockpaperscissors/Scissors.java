package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors {
	
	public Scissors vs(Scissors scissorsChoice){
		return this;
	}
	
	public Scissors vs(Paper paperChoice){
		return this;
	}
	
	public Rock vs(Rock rockChoice){
		return rockChoice;
	}
}
