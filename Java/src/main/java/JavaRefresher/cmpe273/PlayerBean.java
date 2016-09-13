package JavaRefresher.cmpe273;

public class PlayerBean {

	private String playerName,position;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPositions() {
		return position;
	}
	public void setPositions(String positions) {
		this.position = positions;
	}
	public int getAttackXp() {
		return attackXp;
	}
	public void setAttackXp(int attackXp) {
		this.attackXp = attackXp;
	}
	public int getMidfieldXp() {
		return midfieldXp;
	}
	public void setMidfieldXp(int midfieldXp) {
		this.midfieldXp = midfieldXp;
	}
	public int getDefenseXp() {
		return defenseXp;
	}
	public void setDefenseXp(int defenseXp) {
		this.defenseXp = defenseXp;
	}
	private int attackXp, midfieldXp, defenseXp;
	
}
