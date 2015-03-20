package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock implements Choice{
	
	public Choice vs(Choice someChoice){
		return someChoice.vs(this);
	}
	
	public Choice vs(Rock rockChoice){
		return this;
	}
	
	public Choice vs(Scissors scissorsChoice){
		return this;
	}
	
	public Choice vs(Paper paperChoice){
		return paperChoice;
	}
}
