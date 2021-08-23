package layer.pl.db;

import layer.pl.PLException;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class PGDBImpl extends AbstractDBImpl {
	String driver = "org.postgresql.Driver";
	String user = "postgres";
	String pass = "Hanieh1376";
	String url = "jdbc:postgresql://localhost:5432/postgres";

	public PGDBImpl() {
	}


	public PGDBImpl(String driver, String user, String pass, String url) {
		this.driver = driver;
		this.user = user;
		this.pass = pass;
		this.url = url;
	}

	@Override
	protected Connection getConnection() {
		try {
			Class.forName(driver).newInstance();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Failed to instantiate driver", e);
		} catch (InstantiationException e) {
			throw new RuntimeException("Failed to instantiate driver", e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException("Failed to instantiate driver", e);
		}
		Properties props = new Properties();
		props.put("user", user);
		props.put("password", pass);

		
		try {
			return	DriverManager.getConnection(url, props);
		} catch (SQLException e) {
			throw new RuntimeException("Failed to get Connection", e);
		}
	}

}
