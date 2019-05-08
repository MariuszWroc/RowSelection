/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rowSelection.service;

import java.util.List;
import java.util.Random;

import rowSelection.model.Team;

/**
 *
 * @author Mariusz
 */
public class FillData {

	public FillData() {
	}

	private final static String[] colors;
	private final static String[] title;
	private final static String[] name;
	private final static String[] secondName;
	private final static Random random = new Random();

	static {
		colors = new String[10];
		colors[0] = "Czarne";
		colors[1] = "Biale";
		colors[2] = "Zielone";
		colors[3] = "Bialo-czerwone";
		colors[4] = "Niebieskie";
		colors[5] = "Pomaranczowe";
		colors[6] = "Bialo-zielone";
		colors[7] = "Zolte";
		colors[8] = "Czerwone";
		colors[9] = "Bialo-czarne";

		title = new String[10];
		title[0] = "Slask Wroclaw";
		title[1] = "Lechia Gdansk";
		title[2] = "Wisla Krakow";
		title[3] = "Legia Warszawa";
		title[4] = "Lech Poznan";
		title[5] = "Zaglebie Lubin";
		title[6] = "Piast Gliwice";
		title[7] = "Jagielonia Bialystok";
		title[8] = "Pogon Szczecin";
		title[9] = "Widzew Lodz";

		name = new String[10];
		name[0] = "Sebastian";
		name[1] = "Waldemar";
		name[2] = "Tadeusz";
		name[3] = "Miroslaw";
		name[4] = "Mariusz";
		name[5] = "Krzysztof";
		name[6] = "Tomasz";
		name[7] = "Rafal";
		name[8] = "Antoni";
		name[9] = "Pawel";

		secondName = new String[10];
		secondName[0] = "Socha";
		secondName[1] = "Mila";
		secondName[2] = "Gikiewicz";
		secondName[3] = "Sobota";
		secondName[4] = "Zielinski";
		secondName[5] = "Hajto";
		secondName[6] = "Waldoch";
		secondName[7] = "Kokoszka";
		secondName[8] = "Lewandowski";
		secondName[9] = "Sobiech";
		
	}

	private int getRandomYear() {
		return random.nextInt(50) + 1910;
	}

	private String getRandomColor() {
		return colors[(int) (random.nextInt(10))];
	}

	private String getRandomTitle() {
		return title[(int) (random.nextInt(10))];
	}

	private String getRandomFirstName() {
		return name[(int) (random.nextInt(10))];
	}

	private String getRandomSirName() {
		return secondName[(int) (random.nextInt(10))];
	}

	private String getRandomShort() {
		int randomInt = random.nextInt(10);
		return title[randomInt].substring(0, 6);
	}

	public void populateRandom(List<Team> list, int size) {
		for (int i = 0; i < size; i++) {
			Team klub = new Team(i, getRandomTitle(), getRandomShort(), getRandomColor(), getRandomYear());
			for (int j = 0; j < 22; j++) {
				klub.populate(j, getRandomFirstName(), getRandomSirName());
			}
			list.add(klub);
		}
	}
}
