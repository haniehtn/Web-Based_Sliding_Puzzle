package layer.pl;

import layer.bl.BLImpl;
import layer.pl.db.PGDBImpl;

public class UserDataBean {
	private String name, family, password;
	private long m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14, m15;
	private long t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15;
	private int lastlevel;

	public UserDataBean(String name, String family, String password, long m1, long m2, long m3, long m4, long m5, long m6, long m7, long m8, long m9, long m10, long m11, long m12, long m13, long m14, long m15,
						long t1, long t2, long t3, long t4, long t5, long t6, long t7, long t8, long t9, long t10, long t11, long t12, long t13, long t14, long t15, int lastlevel) {
		super();
		this.password = password;
		this.name = name;
		this.family = family;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
		this.m6 = m6;
		this.m7 = m7;
		this.m8 = m8;
		this.m9 = m9;
		this.m10 = m10;
		this.m11 = m11;
		this.m12 = m12;
		this.m13 = m13;
		this.m14 = m14;
		this.m15 = m15;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
		this.t5 = t5;
		this.t6 = t6;
		this.t7 = t7;
		this.t8 = t8;
		this.t9 = t9;
		this.t10 = t10;
		this.t11 = t11;
		this.t12 = t12;
		this.t13 = t13;
		this.t14 = t14;
		this.t15 = t15;
		this.lastlevel = lastlevel;
	}

	public String getName() {
		return name;
	}

	public String getFamily() {
		return family;
	}

	public boolean checkPassword(String pass) {
		return password.equals(pass);
	}

	public long getLoginId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getLastlevel() {
		return lastlevel;
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

	public long gettTotal() {
		return (t1!=0?t1:1000000000) + (t2!=0?t2:1000000000) + (t3!=0?t3:1000000000) + (t4!=0?t4:1000000000) + (t5!=0?t5:1000000000) + (t6!=0?t6:1000000000) + (t7!=0?t7:1000000000) + (t8!=0?t8:1000000000 + t9!=0?t9:1000000000) + (t1!=0?t10:1000000000) + (t11!=0?t11:1000000000) + (t12!=0?t12:1000000000) + (t13!=0?t13:1000000000) + (t14!=0?t14:1000000000) + (t15!=0?t15:1000000000);
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

	public long getmTotal() {
		return (m1!=0?m1:1000000000) + (m2!=0?m2:1000000000)+ (m3!=0?m3:1000000000) + (m4!=0?m4:1000000000) + (m5!=0?m5:1000000000) + (m6!=0?m6:1000000000) + (m7!=0?m7:1000000000) + (m8!=0?m8:1000000000) + (m9!=0?m9:1000000000) + (m1!=0?m10:1000000000) + (m11!=0?m11:1000000000) + (m12!=0?m12:1000000000) + (m13!=0?m13:1000000000) + (m14!=0?m14:1000000000) + (m15!=0?m15:1000000000);
	}

	public String getRankslevel(int level) throws PLException {
		BLImpl bl=new BLImpl(new PGDBImpl());
		return bl.getRanks(level);
	}
}