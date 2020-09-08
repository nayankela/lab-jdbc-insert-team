package model;

public class Team {
	private int id;
	private String name;
	private String coach;
	private City city;
	private int captain;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int id, String name, String coach, City city, int captain) {
		super();
		this.id = id;
		this.name = name;
		this.coach = coach;
		this.city = city;
		this.captain = captain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCaptain() {
		return captain;
	}

	public void setCaptain(int captain) {
		this.captain = captain;
	}

}
