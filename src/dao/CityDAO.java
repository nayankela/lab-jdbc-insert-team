package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

public class CityDAO {

	public City getCityByName(String name) throws Exception {
		Connection con = ConnectionManager.getConnection();
		String sql = "SELECT * FROM CITY WHERE NAME = " + "'" + name + "'";
		Statement statement = con.createStatement();
		ResultSet set = statement.executeQuery(sql);
		City city = null;
		while (set.next()) {
			Long cityId = set.getLong(1);
			String cityName = set.getString(2);
			city = new City(cityId, cityName);
			System.out.println(city);
		}

		return city;

	}

	public void createCity(City city) throws Exception {

		String sql = "INSERT INTO CITY(ID, NAME) VALUES(?,?)";
		Connection con = ConnectionManager.getConnection();

		// statement Object
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setLong(1, city.getCityId());
		preparedStatement.setString(2, city.getCityName());

		preparedStatement.executeUpdate();
		con.close();

	}
}
