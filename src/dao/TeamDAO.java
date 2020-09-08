package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO {
	public void createTeam(Team team) throws Exception {

		String sql = "INSERT INTO TEAM(ID, NAME, COACH, HOME_CITY, CAPTION ) VALUES(?,?,?,?,?)";
		Connection con = ConnectionManager.getConnection();

		// statement Object
		PreparedStatement preparedStatement = con.prepareStatement(sql);

		preparedStatement.setLong(1, team.getId());
		preparedStatement.setString(2, team.getName());
		preparedStatement.setString(3, team.getCoach());
		preparedStatement.setObject(4, team.getCity().getCityId());
		preparedStatement.setInt(5, team.getCaptain());
		preparedStatement.executeUpdate();
		con.close();
	}

}
