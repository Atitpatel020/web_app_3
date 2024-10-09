package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import service.DAOService;

public class DAOServiceImpl implements DAOService {
	private Connection con;
	private Statement stmnt;

	@Override
	 public boolean verifyLogin(String user_name, String password) {
        try {
            ResultSet result = stmnt.executeQuery(
                "SELECT * FROM registration WHERE user_name='" + user_name + "' AND password='" + password + "'");
            return result.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

	@Override
	public void connectDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_app_3", "root", "test");
			stmnt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void saveRegistration(String name, String city, String email, String mobile) {
		try {
			stmnt.executeUpdate("Insert into student values('" + name + "','" + city + "','" + email + "','" + mobile + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


}
