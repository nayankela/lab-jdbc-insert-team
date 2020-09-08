package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

public class Main {
	public static void main(String[] args) throws Exception {

		// creating objects
		CityDAO cityDAO = new CityDAO();
		TeamDAO teamDAO = new TeamDAO();
		City city = new City();
		Team team = new Team();

		// GET VALUES FROM USER
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter City ID");
		Long cityId = Long.parseLong(bufferedReader.readLine());
		city.setCityId(cityId);
		System.out.println("Enter Name");
		String cityName = bufferedReader.readLine();
		city.setCityName(cityName);
		cityDAO.createCity(city);
		System.out.println("City Data Inserted Successfully!!!");
		// GET VALUES FROM USER
		System.out.println("Enter Team ID");
		int teamId = Integer.parseInt(bufferedReader.readLine());
		team.setId(teamId);
		System.out.println("Enter Team Name");
		String teamName = bufferedReader.readLine();
		team.setName(teamName);

		System.out.println("Enter Team Coach");
		String teamCoach = bufferedReader.readLine();
		team.setCoach(teamCoach);

		team.setCity(city);

		System.out.println("Enter Team Caption");
		int teamCaption = Integer.parseInt(bufferedReader.readLine());
		team.setCaptain(teamCaption);

		teamDAO.createTeam(team);

		// fetch city details by name
		System.out.println("Enter City Name");
		String cityNamee = bufferedReader.readLine();
		City cityData = cityDAO.getCityByName(cityNamee);
		System.out.println(cityData);

	}
}
