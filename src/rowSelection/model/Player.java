package rowSelection.model;

import java.io.Serializable;

/**
 *
 * @author Mariusz
 */
public class Player implements Serializable {
	private static final long serialVersionUID = 1L;
	private int number;
	private String name;
	private String secondName;
	private Team team;

	public Player() {
	}

	public Player(int number, String name, String secondName, Team team) {
		this.number = number;
		this.name = name;
		this.secondName = secondName;
		this.team = team;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
