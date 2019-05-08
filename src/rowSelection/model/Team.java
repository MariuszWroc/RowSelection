package rowSelection.model;

import java.util.ArrayList;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Mariusz
 */
public class Team implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String shortName;
	private String colours;
	private int foundingYear;
	private List<Player> players;

	public Team() {
	}

	public Team(int id, String name, String shortName, String colours, int foundingYear) {
		this.id = id;
		this.name = name;
		this.shortName = shortName;
		this.colours = colours;
		this.foundingYear = foundingYear;
		this.players = new ArrayList<>();
	}

	public void populate(int numer, String name, String secondName) {
		this.players.add(new Player(numer, name, secondName, this));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getColours() {
		return colours;
	}

	public void setColours(String colours) {
		this.colours = colours;
	}

	public int getFoundingYear() {
		return foundingYear;
	}

	public void setFoundingYear(int foundingYear) {
		this.foundingYear = foundingYear;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
