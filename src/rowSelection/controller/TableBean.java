package rowSelection.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import rowSelection.model.Team;
import rowSelection.service.FillData;

/**
 *
 * @author Mariusz
 */
@ManagedBean
@ViewScoped
public class TableBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Team> teams;
	private Team selectedOne;
	private FillData fillData = new FillData();

	public TableBean() {
		teams = new ArrayList<>();
		fillData.populateRandom(teams, 50);
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public Team getSelectedOne() {
		return selectedOne;
	}

	public void setSelectedOne(Team selectedOne) {
		this.selectedOne = selectedOne;
	}

	public void onRowSelect(SelectEvent event) {
		FacesMessage msg = new FacesMessage("Sklad zaznaczony", ((Team) event.getObject()).getName());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowUnselect(UnselectEvent event) {
		FacesMessage msg = new FacesMessage("Sklad odznaczony", ((Team) event.getObject()).getName());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
