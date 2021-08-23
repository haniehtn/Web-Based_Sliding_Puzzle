package layer.pl.db;

import java.sql.*;
import java.util.ArrayList;

import layer.pl.PLException;
import layer.pl.PLInterface;
import layer.pl.UserDataBean;

public abstract class AbstractDBImpl implements PLInterface {

	@Override
	public void add(String username, String password) throws PLException {
		String query = "Insert into users(username,name,family,password)values('" +
				username + "', null, null, '" + password + "')";
					executeUpdate(query);
	}
	@Override
	public void addLevel(int level,String[][] primaryColors, String[][] endcolors) throws PLException {
		String query = "Insert into addlevel(begin,end,level)values('" +
				primaryColors + "', '" + endcolors + "', '" +level+ "')";
		executeUpdate(query);
	}
	@Override
	public String[][] getLevel(int level, String s) throws PLException, SQLException {

		String query = "select begin,end from addlevel where username='" + level + "'";
		Connection connection = null;
		try {
			connection = getConnection();
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			String[][] begin = null;
			String[][] end = null;
			if (rs.next()) {
//				begin = rs.getArray("begin");
//				end = rs.getArray("end");
			if(s.equals("begin")) return begin;
			else return end;}
				else return null;}
			catch(SQLException e){
					e.printStackTrace();
					throw new PLException();
				} finally{
					if (connection != null) {
						try {
							connection.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
	protected abstract Connection getConnection();

	@Override
	public void edit(String username, String name, String family)
			throws PLException {
		String query = "update users set name='"+name + "', family='"+family+
				"' where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime1(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel1="+moves + ", timelevel1="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime2(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel2="+moves +", timelevel2="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime3(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel3="+moves +", timelevel3="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime4(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel4="+moves +", timelevel4="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime5(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel5="+moves +", timelevel5="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime6(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel6="+moves +", timelevel6="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime7(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel7="+moves +", timelevel7="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime8(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel8="+moves +", timelevel8="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime9(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel9="+moves +", timelevel9="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime10(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel10="+moves +", timelevel10="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime11(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel11="+moves +", timelevel11="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime12(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel12="+moves +", timelevel12="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime13(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel13="+moves +", timelevel13="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime14(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel14="+moves +", timelevel14="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}@Override
	public void editMovesTime15(String username,long moves,long time) throws PLException {
		String query = "update users set moveslevel15="+moves +", timelevel15="+time+
				" where username='" +username + "'";
		executeUpdate(query);
	}

 @Override
	public void editLastlevel(String username,int level)throws PLException {
		String query = "update users set lastlevel="+level +
				" where username='" +username + "'";
		executeUpdate(query);
	}

	private void executeUpdate(String query) throws PLException {
		Connection connection = null;
		try {
			connection = getConnection();
			Statement st = connection.createStatement();
			st.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PLException();
		} finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void remove(String username) throws PLException {
		String query = "delete from users where username='" +username + "'";
		executeUpdate(query);
	}

@Override
public ArrayList<String> getUsername() throws PLException {
	ArrayList<String> users1=new ArrayList<String>();
	String query = "select username from users";
	Connection connection = null;
	try {
		connection = getConnection();
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			users1.add(rs.getString("username"));
	}
} catch (SQLException e) {
		e.printStackTrace();
		throw new PLException();
	} finally {
		if(connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

	return users1;
}

	@Override
	public UserDataBean getData(String username) throws PLException {
		String query = "select name,family,password,moveslevel1,moveslevel2,moveslevel3,moveslevel4,moveslevel5,moveslevel6,moveslevel7,moveslevel8,moveslevel9,moveslevel10,moveslevel11,moveslevel12,moveslevel13,moveslevel14,moveslevel15,timelevel1,timelevel2,timelevel3,timelevel4,timelevel5,timelevel6,timelevel7,timelevel8,timelevel9,timelevel10,timelevel11,timelevel12,timelevel13,timelevel14,timelevel15,lastlevel from users where username='" +username + "'";
		
		Connection connection = null;
		try {
			connection = getConnection();
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				String name = rs.getString("name");
				String family = rs.getString("family");
				String password = rs.getString("password");
				long m1 = rs.getLong("moveslevel1");
				long m2 = rs.getLong("moveslevel2");
				long m3= rs.getLong("moveslevel3");
				long m4 = rs.getLong("moveslevel4");
				long m5 = rs.getLong("moveslevel5");
				long m6= rs.getLong("moveslevel6");
				long m7 = rs.getLong("moveslevel7");
				long m8 = rs.getLong("moveslevel8");
				long m9= rs.getLong("moveslevel9");
				long m10 = rs.getLong("moveslevel10");
				long m11 = rs.getLong("moveslevel11");
				long m12= rs.getLong("moveslevel12");
				long m13 = rs.getLong("moveslevel13");
				long m14 = rs.getLong("moveslevel14");
				long m15= rs.getLong("moveslevel15");
				long t1 =rs.getLong("timelevel1");
				long t2 =rs.getLong("timelevel2");
				long t3 =rs.getLong("timelevel3");
				long t4 =rs.getLong("timelevel4");
				long t5 =rs.getLong("timelevel5");
				long t6 =rs.getLong("timelevel6");
				long t7 =rs.getLong("timelevel7");
				long t8 =rs.getLong("timelevel8");
				long t9 =rs.getLong("timelevel9");
				long t10 =rs.getLong("timelevel10");
				long t11 =rs.getLong("timelevel11");
				long t12 =rs.getLong("timelevel12");
				long t13 =rs.getLong("timelevel13");
				long t14 =rs.getLong("timelevel14");
				long t15 =rs.getLong("timelevel15");
				int lastlevel=rs.getInt("lastlevel");
				return new UserDataBean(name, family, password,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,lastlevel);
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PLException();
		} finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
