Team


private String teamName;
private int teamRank;
private ArrayList<String> players;

public Team (String teamName, int teamRank, ArrayList<String> players){
	this.teamName = teamName;
	this.teamRank = teamRank;
	this.players = players;
}

public void setRank(int rank){
	this.teamRank = rank;

	@Override

	public String toString(){

		return teamName + "teamName"+ teamRank + "teamRank" + players + "players";

	}
}