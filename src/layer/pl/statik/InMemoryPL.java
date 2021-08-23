package layer.pl.statik;
import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import layer.pl.PLException;
import layer.pl.PLInterface;
import layer.pl.UserDataBean;
import java.util.Comparator;

public class InMemoryPL implements PLInterface {

	static ArrayList<User> users = new ArrayList<>();


	@Override
	public void add(String username, String password) throws PLException {
		users.add(new User(username, password, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
	}

	@Override
	public void addLevel(int level, String[][] primaryColors, String[][] endcolors) throws PLException {

	}

	@Override
	public String[][] getLevel(int level, String s) throws PLException, SQLException {
		return null;
	}

	@Override
	public void edit(String username, String name, String family)
			throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setName(name);
			u.setFamily(family);
		}
	}

	@Override
	public void editLastlevel(String username, int level) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setLastlevel(level);
		}
	}

	@Override
	public void editMovesTime1(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM1(move);
			u.setT1(time);
		}
	}

	@Override
	public void editMovesTime2(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM2(move);
			u.setT2(time);
		}
	}

	@Override
	public void editMovesTime3(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM3(move);
			u.setT3(time);
		}
	}

	@Override
	public void editMovesTime4(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM4(move);
			u.setT4(time);
		}
	}

	@Override
	public void editMovesTime5(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM5(move);
			u.setT5(time);
		}
	}

	@Override
	public void editMovesTime6(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM6(move);
			u.setT6(time);
		}
	}

	@Override
	public void editMovesTime7(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM7(move);
			u.setT7(time);
		}
	}

	@Override
	public void editMovesTime8(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM8(move);
			u.setT8(time);
		}
	}

	@Override
	public void editMovesTime9(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM9(move);
			u.setT9(time);
		}
	}

	@Override
	public void editMovesTime10(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM10(move);
			u.setT10(time);
		}
	}

	@Override
	public void editMovesTime11(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM11(move);
			u.setT11(time);
		}
	}

	@Override
	public void editMovesTime12(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM12(move);
			u.setT12(time);
		}
	}

	@Override
	public void editMovesTime13(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM13(move);
			u.setT13(time);
		}
	}

	@Override
	public void editMovesTime14(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM14(move);
			u.setT14(time);
		}
	}

	@Override
	public void editMovesTime15(String username, long move, long time) throws PLException {
		User u = getUser(username);
		if (u != null) {
			u.setM15(move);
			u.setT15(time);
		}
	}



	private User getUser(String username) {
		for (User user : users) {
			System.out.println(user.getUsername());
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void remove(String username) throws PLException {
		User u = getUser(username);
		if (u!=null) {
			users.remove(u);
		}
	}
	@Override
	public ArrayList<String> getUsername() throws PLException {
		ArrayList<String> users1=new ArrayList<>();
		for(User user: users){
			users1.add(user.getUsername());
		}

	 return users1;
	}
	@Override
	public UserDataBean getData(String username) throws PLException {
		User u = getUser(username);
		if (u!=null) {
			return new UserDataBean(u.getName(), u.getFamily(), u.getPassword(),u.getM1(),u.getM2(),u.getM3(),u.getM4(),u.getM5(),u.getM6(),u.getM7(),u.getM8(),u.getM9(),u.getM10(),u.getM11(),u.getM12(),u.getM13(),u.getM14(),u.getM15(),u.getT1(),u.getT2(),u.getT3(),u.getT4(),u.getT5(),u.getT6(),u.getT7(),u.getT8(),u.getT9(),u.getT10(),u.getT11(),u.getT12(),u.getT13(),u.getT14(),u.getT15(),u.getLastlevel());
		}
		return null;
	}
	
	private static class User {
		String username, password, name, family;
		long m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15;
		long t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
		int lastlevel;
		public User(String username, String password, String name, String family,long m1,long m2,long m3,long m4,long m5,long m6,long m7,long m8,long m9,long m10,long m11,long m12,long m13,long m14,long m15,
				long t1,long t2,long t3,long t4,long t5,long t6,long t7,long t8,long t9,long t10,long t11,long t12,long t13,long t14,long t15,int lastlevel) {
			super();
			this.username = username;
			this.password = password;
			this.name = name;
			this.family = family;
			this.m1=m1;
			this.m2=m2;
			this.m3=m3;
			this.m4=m4;
			this.m5=m5;
			this.m6=m6;
			this.m7=m7;
			this.m8=m8;
			this.m9=m9;
			this.m10=m10;
			this.m11=m11;
			this.m12=m12;
			this.m13=m13;
			this.m14=m14;
			this.m15=m15;
			this.t1=t1;
			this.t2=t2;
			this.t3=t3;
			this.t4=t4;
			this.t5=t5;
			this.t6=t6;
			this.t7=t7;
			this.t8=t8;
			this.t9=t9;
			this.t10=t10;
			this.t11=t11;
			this.t12=t12;
			this.t13=t13;
			this.t14=t14;
			this.t15=t15;
			this.lastlevel=lastlevel;

		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getFamily() {
			return family;
		}

		public void setFamily(String family) {
			this.family = family;
		}
		@Override
		public boolean equals(Object obj) {
			return obj instanceof User && name.equals(((User)obj).getName());
		}

		public void setM1(long m1) {
			if(this.m1>m1) {this.m1 = m1;}
		}

		public void setM2(long m2) {
			if(this.m2>m2)	{this.m2 = m2;}
		}

		public void setM3(long m3) {
			if(this.m3>m3) {this.m3 = m3;}
		}

		public void setM4(long m4) {
			if(this.m4>m4)	{this.m4 = m4;}
		}

		public void setM5(long m5) {
			if(this.m5>m5) {this.m5 = m5;}
		}

		public void setM6(long m6) {
			if(this.m6>m6){this.m6 = m6;}
		}

		public void setM7(long m7) {
			if(this.m7>m7){this.m7 = m7;}
		}

		public void setM8(long m8) {
			if(this.m8>m8){this.m8 = m8;}
		}

		public void setM9(long m9) {
			if(this.m9>m9){this.m9 = m9;}
		}

		public void setM10(long m10) {
			if(this.m10>m10){this.m10 = m10;}
		}

		public void setM11(long m11) {
			if(this.m11>m11){this.m11 = m11;}
		}

		public void setM12(long m12) {
			if(this.m12>m12){this.m12 = m12;}
		}

		public void setM13(long m13) {
			if(this.m13>m13){this.m13 = m13;}
		}

		public void setM14(long m14) {
			if(this.m14>m14){this.m14 = m14;}
		}

		public void setM15(long m15) {
			if(this.m15>m15){this.m15 = m15;}
		}

		public void setT1(long t1) {
			if(this.t1>t1){this.t1 = t1;}
		}

		public void setT2(long t2) {
			if(this.t2>t2){this.t2 = t2;}
		}

		public void setT3(long t3) {
			if(this.t3>t3){this.t3 = t3;}
		}

		public void setT4(long t4) {
			if(this.t4>t4){this.t4 = t4;}
		}

		public void setT5(long t5) {
			if(this.t5>t5){this.t5 = t5;}
		}

		public void setT6(long t6) {
			if(this.t6>t6){this.t6 = t6;}
		}

		public void setT7(long t7) {
			if(this.t7>t7){this.t7 = t7;}
		}

		public void setT8(long t8) {
			if(this.t8>t8){this.t8 = t8;}
		}

		public void setT9(long t9) {
			if(this.t9>t9){this.t9 = t9;}
		}

		public void setT10(long t10) {
			if(this.t10>t10){this.t10 = t10;}
		}

		public void setT11(long t11) {
			if(this.t11>t11){this.t11 = t11;}
		}

		public void setT12(long t12) {
			if(this.t12>t12){this.t12 = t12;}
		}

		public void setT13(long t13) {
			if(this.t13>t13){this.t13 = t13;}
		}

		public void setT14(long t14) {
			if(this.t14>t14){this.t14 = t14;}
		}

		public void setT15(long t15) {
			if(this.t15>t15){this.t15 = t15;}
		}


		public void setLastlevel(int lastlevel) {
			if(this.lastlevel<lastlevel){this.lastlevel = lastlevel;}
		}

		public long getM1() {
			return m1;
		}

		public long getM2() {
			return m2;
		}

		public long getM3() {
			return m3;
		}

		public long getM4() {
			return m4;
		}

		public long getM5() {
			return m5;
		}

		public long getM6() {
			return m6;
		}

		public long getM7() {
			return m7;
		}

		public long getM8() {
			return m8;
		}

		public long getM9() {
			return m9;
		}

		public long getM10() {
			return m10;
		}

		public long getM11() {
			return m11;
		}

		public long getM12() {
			return m12;
		}

		public long getM13() {
			return m13;
		}

		public long getM14() {
			return m14;
		}

		public long getM15() {
			return m15;
		}

		public long getT1() {
			return t1;
		}

		public long getT2() {
			return t2;
		}

		public long getT3() {
			return t3;
		}

		public long getT4() {
			return t4;
		}

		public long getT5() {
			return t5;
		}

		public long getT6() {
			return t6;
		}

		public long getT7() {
			return t7;
		}

		public long getT8() {
			return t8;
		}

		public long getT9() {
			return t9;
		}

		public long getT10() {
			return t10;
		}

		public long getT11() {
			return t11;
		}

		public long getT12() {
			return t12;
		}

		public long getT13() {
			return t13;
		}

		public long getT14() {
			return t14;
		}

		public long getT15() {
			return t15;
		}

		public int getLastlevel() {
			return lastlevel;}

	}

}

