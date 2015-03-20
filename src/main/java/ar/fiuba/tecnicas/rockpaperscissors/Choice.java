package ar.fiuba.tecnicas.rockpaperscissors;

public interface Choice {
	
	public Choice vs(Choice someChoice);
	
	public Choice vs(Rock rockChoice);
	
	public Choice vs(Paper paperChoice);
	
	public Choice vs(Scissors scissorsChoice);
}
