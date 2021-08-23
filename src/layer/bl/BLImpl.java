package layer.bl;

import layer.pl.PLException;
import layer.pl.PLInterface;
import layer.pl.UserDataBean;

import java.sql.Array;
import java.sql.SQLException;
import java.util.TreeMap;

public class BLImpl implements BLInterface {
	PLInterface pl;
	public BLImpl(PLInterface pl) {
		this.pl = pl;
	}

	@Override
	public String getRanks(int level) throws PLException {
		TreeMap<Long,String> usersM1=new TreeMap<>();
		TreeMap<Long,String> usersM2=new TreeMap<>();
		TreeMap<Long,String> usersM3=new TreeMap<>();
		TreeMap<Long,String> usersM4=new TreeMap<>();
		TreeMap<Long,String> usersM5=new TreeMap<>();
		TreeMap<Long,String> usersM6=new TreeMap<>();
		TreeMap<Long,String> usersM7=new TreeMap<>();
		TreeMap<Long,String> usersM8=new TreeMap<>();
		TreeMap<Long,String> usersM9=new TreeMap<>();
		TreeMap<Long,String> usersM10=new TreeMap<>();
		TreeMap<Long,String> usersM11=new TreeMap<>();
		TreeMap<Long,String> usersM12=new TreeMap<>();
		TreeMap<Long,String> usersM13=new TreeMap<>();
		TreeMap<Long,String> usersM14=new TreeMap<>();
		TreeMap<Long,String> usersM15=new TreeMap<>();
		TreeMap<Long,String> usersMtotal=new TreeMap<>();
		TreeMap<Long,String> usersT1=new TreeMap<>();
		TreeMap<Long,String> usersT2=new TreeMap<>();
		TreeMap<Long,String> usersT3=new TreeMap<>();
		TreeMap<Long,String> usersT4=new TreeMap<>();
		TreeMap<Long,String> usersT5=new TreeMap<>();
		TreeMap<Long,String> usersT6=new TreeMap<>();
		TreeMap<Long,String> usersT7=new TreeMap<>();
		TreeMap<Long,String> usersT8=new TreeMap<>();
		TreeMap<Long,String> usersT9=new TreeMap<>();
		TreeMap<Long,String> usersT10=new TreeMap<>();
		TreeMap<Long,String> usersT11=new TreeMap<>();
		TreeMap<Long,String> usersT12=new TreeMap<>();
		TreeMap<Long,String> usersT13=new TreeMap<>();
		TreeMap<Long,String> usersT14=new TreeMap<>();
		TreeMap<Long,String> usersT15=new TreeMap<>();
		TreeMap<Long,String> usersTtotal=new TreeMap<>();
			for(String username: pl.getUsername()){
				if(pl.getData(username).getM1()!=0) {boolean puted=false;
					for(Long k:usersM1.keySet()) {
						if (pl.getData(username).getM1() == k) {puted=true;
							usersM1.put(k, (usersM1.get(k) + "," + username));
						}
					}
					if(!puted) usersM1.put(pl.getData(username).getM1(),username);

				}
					if(pl.getData(username).getM2()!=0) {boolean puted=false;
						for(Long k:usersM2.keySet()) {
							if (pl.getData(username).getM2() == k) {puted=true;
								usersM2.put(k, (usersM2.get(k) + "," + username));
							}
						}
						if(!puted) usersM2.put(pl.getData(username).getM2(),username);

					}
					if(pl.getData(username).getM3()!=0) {boolean puted=false;
						for(Long k:usersM3.keySet()) {
							if (pl.getData(username).getM3() == k) {puted=true;
								usersM3.put(k, (usersM3.get(k) + "," + username));
							}
						}
						if(!puted) usersM3.put(pl.getData(username).getM3(),username);

					}
					if(pl.getData(username).getM4()!=0) {boolean puted=false;
						for(Long k:usersM4.keySet()) {
							if (pl.getData(username).getM4() == k) {puted=true;
								usersM4.put(k, (usersM4.get(k) + "," + username));
							}
						}
						if(!puted) usersM4.put(pl.getData(username).getM4(),username);

					}
					if(pl.getData(username).getM5()!=0) {boolean puted=false;
						for(Long k:usersM5.keySet()) {
							if (pl.getData(username).getM5() == k) {puted=true;
								usersM5.put(k, (usersM5.get(k) + "," + username));
							}
						}
						if(!puted) usersM5.put(pl.getData(username).getM5(),username);

					}
					if(pl.getData(username).getM6()!=0) {boolean puted=false;
						for(Long k:usersM6.keySet()) {
							if (pl.getData(username).getM6() == k) {puted=true;
								usersM6.put(k, (usersM6.get(k) + "," + username));
							}
						}
						if(!puted) usersM6.put(pl.getData(username).getM6(),username);

					}
					if(pl.getData(username).getM7()!=0) {boolean puted=false;
						for(Long k:usersM7.keySet()) {
							if (pl.getData(username).getM7() == k) {puted=true;
								usersM7.put(k, (usersM7.get(k) + "," + username));
							}
						}
						if(!puted) usersM7.put(pl.getData(username).getM7(),username);

					}
					if(pl.getData(username).getM8()!=0) {boolean puted=false;
						for(Long k:usersM8.keySet()) {
							if (pl.getData(username).getM8() == k) {puted=true;
								usersM8.put(k, (usersM8.get(k) + "," + username));
							}
						}
						if(!puted) usersM8.put(pl.getData(username).getM8(),username);

					}
					if(pl.getData(username).getM9()!=0) {boolean puted=false;
						for(Long k:usersM9.keySet()) {
							if (pl.getData(username).getM9() == k) {puted=true;
								usersM9.put(k, (usersM9.get(k) + "," + username));
							}
						}
						if(!puted) usersM9.put(pl.getData(username).getM9(),username);
					}
					if(pl.getData(username).getM10()!=0) {boolean puted=false;
						for(Long k:usersM10.keySet()) {
							if (pl.getData(username).getM10() == k) {puted=true;
								usersM10.put(k, (usersM10.get(k) + "," + username));
							}
						}
						if(!puted) usersM10.put(pl.getData(username).getM10(),username);
					}
					if(pl.getData(username).getM11()!=0) {boolean puted=false;
						for(Long k:usersM11.keySet()) {
							if (pl.getData(username).getM11() == k) {puted=true;
								usersM11.put(k, (usersM11.get(k) + "," + username));
							}
						}
						if(!puted) usersM11.put(pl.getData(username).getM11(),username);
					}
					if(pl.getData(username).getM12()!=0) {boolean puted=false;
						for(Long k:usersM12.keySet()) {
							if (pl.getData(username).getM12() == k) {puted=true;
								usersM12.put(k, (usersM12.get(k) + "," + username));
							}
						}
						if(!puted) usersM12.put(pl.getData(username).getM12(),username);
					}
					if(pl.getData(username).getM13()!=0) {boolean puted=false;
						for(Long k:usersM13.keySet()) {
							if (pl.getData(username).getM13() == k) {puted=true;
								usersM13.put(k, (usersM13.get(k) + "," + username));
							}
						}
						if(!puted) usersM13.put(pl.getData(username).getM13(),username);
					}
					if(pl.getData(username).getM14()!=0) {boolean puted=false;
						for(Long k:usersM14.keySet()) {
							if (pl.getData(username).getM14() == k) {puted=true;
								usersM14.put(k, (usersM14.get(k) + "," + username));
							}
						}
						if(!puted) usersM14.put(pl.getData(username).getM14(),username);
					}
					if(pl.getData(username).getM15()!=0) {boolean puted=false;
						for(Long k:usersM15.keySet()) {
							if (pl.getData(username).getM15() == k) {puted=true;
								usersM15.put(k, (usersM15.get(k) + "," + username));
							}
						}
						if(!puted) usersM15.put(pl.getData(username).getM15(),username);
					}
					if(pl.getData(username).getmTotal()!=0) {
						boolean puted = false;
						for (Long k : usersMtotal.keySet()) {
							if (pl.getData(username).getmTotal() == k) {
								puted = true;
								usersMtotal.put(k, (usersMtotal.get(k) + "," + username));
							}
						}
						if (!puted) usersMtotal.put(pl.getData(username).getmTotal(), username);
					}
						if(pl.getData(username).getT1()!=0) {boolean puted = false;
							for (Long k : usersT1.keySet()) {
								if (pl.getData(username).getT1() == k) {
									puted = true;
									usersT1.put(k, (usersT1.get(k) + "," + username));
								}
							}
							if (!puted) usersT1.put(pl.getData(username).getT1(), username);
						}
				if(pl.getData(username).getT2()!=0) {
					boolean puted = false;
					for (Long k : usersT2.keySet()) {
						if (pl.getData(username).getT2() == k) {
							puted = true;
							usersT2.put(k, (usersT2.get(k) + "," + username));
						}
					}
					if (!puted) usersT2.put(pl.getData(username).getT2(), username);
				}
					if(pl.getData(username).getT3()!=0) {
						boolean puted = false;
						for (Long k : usersT3.keySet()) {
							if (pl.getData(username).getT3() == k) {
								puted = true;
								usersT3.put(k, (usersT3.get(k) + "," + username));
							}
						}
						if (!puted) usersT3.put(pl.getData(username).getT3(), username);
					}
				if(pl.getData(username).getT4()!=0) {
					boolean puted = false;
					for (Long k : usersT4.keySet()) {
						if (pl.getData(username).getT4() == k) {
							puted = true;
							usersT4.put(k, (usersT4.get(k) + "," + username));
						}
					}
					if (!puted) usersT4.put(pl.getData(username).getT4(), username);
				}
				if(pl.getData(username).getT5()!=0) {
					boolean puted = false;
					for (Long k : usersT5.keySet()) {
						if (pl.getData(username).getT5() == k) {
							puted = true;
							usersT5.put(k, (usersT5.get(k) + "," + username));
						}
					}
					if (!puted) usersT5.put(pl.getData(username).getT5(), username);
				}
				if(pl.getData(username).getT6()!=0) {
					boolean puted = false;
					for (Long k : usersT6.keySet()) {
						if (pl.getData(username).getT6() == k) {
							puted = true;
							usersT6.put(k, (usersT6.get(k) + "," + username));
						}
					}
					if (!puted) usersT6.put(pl.getData(username).getT6(), username);
				}
				if(pl.getData(username).getT7()!=0) {
					boolean puted = false;
					for (Long k : usersT7.keySet()) {
						if (pl.getData(username).getT7() == k) {
							puted = true;
							usersT7.put(k, (usersT7.get(k) + "," + username));
						}
					}
					if (!puted) usersT7.put(pl.getData(username).getT7(), username);
				}
				if(pl.getData(username).getT8()!=0) {
					boolean puted = false;
					for (Long k : usersT8.keySet()) {
						if (pl.getData(username).getT8() == k) {
							puted = true;
							usersT8.put(k, (usersT8.get(k) + "," + username));
						}
					}
					if (!puted) usersT8.put(pl.getData(username).getT8(), username);
				}
				if(pl.getData(username).getT9()!=0) {
					boolean puted = false;
					for (Long k : usersT9.keySet()) {
						if (pl.getData(username).getT9() == k) {
							puted = true;
							usersT9.put(k, (usersT9.get(k) + "," + username));
						}
					}
					if (!puted) usersT9.put(pl.getData(username).getT9(), username);
				}
				if(pl.getData(username).getT10()!=0) {
					boolean puted = false;
					for (Long k : usersT10.keySet()) {
						if (pl.getData(username).getT10() == k) {
							puted = true;
							usersT10.put(k, (usersT10.get(k) + "," + username));
						}
					}
					if (!puted) usersT10.put(pl.getData(username).getT10(), username);
				}
				if(pl.getData(username).getT11()!=0) {
					boolean puted = false;
					for (Long k : usersT11.keySet()) {
						if (pl.getData(username).getT11() == k) {
							puted = true;
							usersT11.put(k, (usersT11.get(k) + "," + username));
						}
					}
					if (!puted) usersT11.put(pl.getData(username).getT11(), username);
				}
				if(pl.getData(username).getT12()!=0) {
					boolean puted = false;
					for (Long k : usersT12.keySet()) {
						if (pl.getData(username).getT12() == k) {
							puted = true;
							usersT12.put(k, (usersT12.get(k) + "," + username));
						}
					}
					if (!puted) usersT12.put(pl.getData(username).getT12(), username);
				}
				if(pl.getData(username).getT13()!=0) {
					boolean puted = false;
					for (Long k : usersT13.keySet()) {
						if (pl.getData(username).getT13() == k) {
							puted = true;
							usersT13.put(k, (usersT13.get(k) + "," + username));
						}
					}
					if (!puted) usersT13.put(pl.getData(username).getT13(), username);
				}
				if(pl.getData(username).getT14()!=0) {
					boolean puted = false;
					for (Long k : usersT14.keySet()) {
						if (pl.getData(username).getT14() == k) {
							puted = true;
							usersT14.put(k, (usersT14.get(k) + "," + username));
						}
					}
					if (!puted) usersT14.put(pl.getData(username).getT14(), username);
				}
				if(pl.getData(username).getT15()!=0) {
					boolean puted = false;
					for (Long k : usersT15.keySet()) {
						if (pl.getData(username).getT15() == k) {
							puted = true;
							usersT15.put(k, (usersT15.get(k) + "," + username));
						}
					}
					if (!puted) usersT15.put(pl.getData(username).getT15(), username);
				}
				if(pl.getData(username).gettTotal()!=0) {
					boolean puted = false;
					for (Long k : usersTtotal.keySet()) {
						if (pl.getData(username).gettTotal() == k) {
							puted = true;
							usersTtotal.put(k, (usersTtotal.get(k) + "," + username));
					}
				}
				if (!puted) usersTtotal.put(pl.getData(username).gettTotal(), username);
			}
			}
			String ranks="";
			switch (level) {
				case 1: {
						ranks += "1:" + ((usersM1.size() > 0)?usersM1.values().toArray()[0]:"") + "   2:" + ((usersM1.size() > 1)?usersM1.values().toArray()[1]:"") + "   3:" + ((usersM1.size() > 2)?usersM1.values().toArray()[2]:"");
						ranks +="/1:" + ((usersM1.size() > 0)?usersT1.values().toArray()[0]:"")  + "   2:" + ((usersM1.size() > 1)?usersT1.values().toArray()[1]:"") + "   3:" + ((usersM1.size() > 2)?usersT1.values().toArray()[2]:"");
					break;
				}
				case 2: {
					ranks += "1:" + ((usersM2.size() > 0)?usersM2.values().toArray()[0]:"") + "   2:" + ((usersM2.size() > 1)?usersM2.values().toArray()[1]:"") + "   3:" + ((usersM2.size() > 2)?usersM2.values().toArray()[2]:"");
					ranks +="/1:" + ((usersM2.size() > 0)?usersT2.values().toArray()[0]:"") + "   2:" + ((usersM2.size() > 1)?usersT2.values().toArray()[1]:"") + "   3:" + ((usersM2.size() > 2)?usersT2.values().toArray()[2]:"");
					break;
				}
				case 3: {
					ranks += "1:" + ((usersM3.size() > 0)?usersM3.values().toArray()[0]:"") + "   2:" + ((usersM3.size() > 1)?usersM3.values().toArray()[1]:"") + "   3:" + ((usersM3.size() > 2)?usersM3.values().toArray()[2]:"");
					ranks +="/1:" + ((usersM3.size() > 0)?usersT3.values().toArray()[0]:"") + "   2:" + ((usersM3.size() > 1)?usersT3.values().toArray()[1]:"") + "   3:" + ((usersM3.size() > 2)?usersT3.values().toArray()[2]:"");
					break;
				}
				case 4: {
					ranks += "1:" + ((usersM4.size() > 0)?usersM4.values().toArray()[0]:"") + "   2:" + ((usersM4.size() > 1)?usersM4.values().toArray()[1]:"") + "   3:" + ((usersM4.size() > 2)?usersM4.values().toArray()[2]:"");
					ranks +="/1:" + ((usersM4.size() > 0)?usersT4.values().toArray()[0]:"") + "   2:" + ((usersM4.size() > 1)?usersT4.values().toArray()[1]:"") + "   3:" + ((usersM4.size() > 2)?usersT4.values().toArray()[2]:"");
					break;
				}
				case 5: {
					ranks += "1:" + ((usersM5.size() > 0)?usersM5.values().toArray()[0]:"") + "   2:" + ((usersM5.size() > 1)?usersM5.values().toArray()[1]:"") + "   3:" + ((usersM5.size() > 2)?usersM5.values().toArray()[2]:"");
					ranks +="/1:" + ((usersM5.size() > 0)?usersT5.values().toArray()[0]:"") + "   2:" + ((usersM5.size() > 1)?usersT5.values().toArray()[1]:"") + "   3:" + ((usersM5.size() > 2)?usersT5.values().toArray()[2]:"");
					break;
				}
				case 6: {
					ranks += "1:" + ((usersM6.size() > 0)?usersM6.values().toArray()[0]:"") + "   2:" + ((usersM6.size() > 1)?usersM6.values().toArray()[1]:"") + "   3:" + ((usersM6.size() > 2)?usersM6.values().toArray()[2]:"");
					ranks +="/1:" + ((usersM6.size() > 0)?usersT6.values().toArray()[0]:"") + "   2:" + ((usersM6.size() > 1)?usersT6.values().toArray()[1]:"") + "   3:" + ((usersM6.size() > 2)?usersT6.values().toArray()[2]:"");
					break;
				}
				case 7: {
					ranks += "1:" + ((usersM7.size() > 0)?usersM7.values().toArray()[0]:"") + "   2:" + ((usersM7.size() > 1)?usersM7.values().toArray()[1]:"") + "   3:" + ((usersM7.size() > 2)?usersM7.values().toArray()[2]:"");
					ranks +="/1:" + ((usersM7.size() > 0)?usersT7.values().toArray()[0]:"") + "   2:" + ((usersM7.size() > 1)?usersT7.values().toArray()[1]:"") + "   3:" + ((usersM7.size() > 2)?usersT7.values().toArray()[2]:"");
					break;
				}
				case 8: {
					ranks += "1:" + ((usersM8.size() > 0)?usersM8.values().toArray()[0]:"") + "   2:" + ((usersM8.size() > 1)?usersM8.values().toArray()[1]:"") + "   3:" + ((usersM8.size() > 2)?usersM8.values().toArray()[2]:"");
					ranks +="/1:" +  ((usersM8.size() > 0)?usersT8.values().toArray()[0]:"")  + "   2:" + ((usersM8.size() > 1)?usersT8.values().toArray()[1]:"") + "   3:" + ((usersM8.size() > 2)?usersT8.values().toArray()[2]:"");
					break;
				}
				case 9: {
					ranks += "1:" + ((usersM9.size() > 0)?usersM9.values().toArray()[0]:"") + "   2:" + ((usersM9.size() > 1)?usersM9.values().toArray()[1]:"") + "   3:" + ((usersM9.size() > 2)?usersM9.values().toArray()[2]:"");
					ranks +="/1:" + ((usersM9.size() > 0)?usersT9.values().toArray()[0]:"")  + "   2:" + ((usersM9.size() > 1)?usersT9.values().toArray()[1]:"") + "   3:" + ((usersM9.size() > 2)?usersT9.values().toArray()[2]:"");
					break;
				}
				case 10: {
					ranks += "1:" + ((usersM10.size() > 0)?usersM10.values().toArray()[0]:"") + "   2:" + ((usersM10.size() > 1)?usersM10.values().toArray()[1]:"") + "   3:" + ((usersM10.size() > 2)?usersM10.values().toArray()[2]:"");
					ranks +="/1:" + ((usersM10.size() > 0)?usersT10.values().toArray()[0]:"") + "   2:" + ((usersM10.size() > 1)?usersT10.values().toArray()[1]:"") + "   3:" + ((usersM10.size() > 2)?usersT10.values().toArray()[2]:"");
					break;
				}
				case 11: {
					ranks += "1:" + ((usersM11.size() > 0)?usersM11.values().toArray()[0]:"") + "   2:" + ((usersM11.size() > 1)?usersM11.values().toArray()[1]:"") + "   3:" + ((usersM11.size() > 2)?usersM11.values().toArray()[2]:"");
					ranks +="/1:" + ((usersM11.size() > 0)?usersT11.values().toArray()[0]:"") + "   2:" + ((usersM11.size() > 1)?usersT11.values().toArray()[1]:"") + "   3:" + ((usersM11.size() > 2)?usersT11.values().toArray()[2]:"");
					break;
				}
				case 12: {
					ranks += "1:" + ((usersM12.size() > 0)?usersM12.values().toArray()[0]:"") + "   2:" + ((usersM12.size() > 1)?usersM12.values().toArray()[1]:"") + "   3:" + ((usersM12.size() > 2)?usersM12.values().toArray()[2]:"");
					ranks +="/1:" +((usersM12.size() > 0)?usersT12.values().toArray()[0]:"") + "   2:" + ((usersM12.size() > 1)?usersT12.values().toArray()[1]:"") + "   3:" + ((usersM12.size() > 2)?usersT12.values().toArray()[2]:"");
					break;
				}
				case 13: {
					ranks += "1:" + ((usersM13.size() > 0)?usersM13.values().toArray()[0]:"") + "   2:" + ((usersM13.size() > 1)?usersM13.values().toArray()[1]:"") + "   3:" + ((usersM13.size() > 2)?usersM13.values().toArray()[2]:"");
					ranks +="/1:" + ((usersM13.size() > 0)?usersT13.values().toArray()[0]:"") + "   2:" + ((usersM13.size() > 1)?usersT13.values().toArray()[1]:"") + "   3:" + ((usersM13.size() > 2)?usersT13.values().toArray()[2]:"");
					break;
				}
				case 14: {
					ranks += "1:" + ((usersM14.size() > 0)?usersM14.values().toArray()[0]:"") + "   2:" + ((usersM14.size() > 1)?usersM14.values().toArray()[1]:"") + "   3:" + ((usersM14.size() > 2)?usersM14.values().toArray()[2]:"");
					ranks +="/1:" + ((usersM14.size() > 0)?usersT14.values().toArray()[0]:"") + "   2:" + ((usersM14.size() > 1)?usersT14.values().toArray()[1]:"") + "   3:" + ((usersM14.size() > 2)?usersT14.values().toArray()[2]:"");
					break;
				}
				case 15: {
					ranks += "1:" + ((usersM15.size() > 0)?usersM15.values().toArray()[0]:"") + "   2:" + ((usersM15.size() > 1)?usersM15.values().toArray()[1]:"") + "   3:" + ((usersM15.size() > 2)?usersM15.values().toArray()[2]:"");
					ranks +="/1:" + ((usersM15.size() > 0)?usersT15.values().toArray()[0]:"") + "   2:" + ((usersM15.size() > 1)?usersT15.values().toArray()[1]:"") + "   3:" + ((usersM15.size() > 2)?usersT15.values().toArray()[2]:"");
					break;
				}
				default: {
					ranks += "Based on movement: 1:" + ((usersMtotal.size() > 0)?usersMtotal.values().toArray()[0]:"") + "   2:" + ((usersMtotal.size() > 1)?usersMtotal.values().toArray()[1]:"") + "   3:" + ((usersMtotal.size() > 2)?usersMtotal.values().toArray()[2]:"");
					ranks +="/Based on time: 1:" + ((usersMtotal.size() > 0)?usersTtotal.values().toArray()[0]:"") + "   2:" + ((usersMtotal.size() > 1)?usersTtotal.values().toArray()[1]:"") + "   3:" + ((usersMtotal.size() > 2)?usersTtotal.values().toArray()[2]:"");
				}
			}

			return ranks;

	}
	@Override
	public void register(String username, String password)
			throws DuplicateUserNameException, SimplePasswordException, PLException {
		UserDataBean user = pl.getData(username);
		if (user!=null) {
			throw new DuplicateUserNameException();
		}
		if (password==null || password.length()<8) {
			throw new SimplePasswordException();
		}
		pl.add(username, password);
	}

	@Override
	public UserDataBean login(String username, String password)throws PLException{
		UserDataBean user = pl.getData(username);
		if (user!=null && user.checkPassword(password)) {
			return user;
		} else {
			return null;
		}
	}

	@Override
	public UserDataBean edit(long loginId, String username, String newName,
			String newFamily)throws PLException{
		pl.edit(username, newName, newFamily);
		return pl.getData(username);
	}

	@Override
	public void logout(long loginId)throws PLException{
	}

	@Override
	public void unregister(long loginId, String username)throws PLException{
		pl.remove(username);
	}
	@Override
	public UserDataBean editMovesTimelevel1(String username,long moves,long time) throws PLException {
		pl.editMovesTime1(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel2(String username,long moves,long time) throws PLException {
		pl.editMovesTime2(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel3(String username,long moves,long time) throws PLException {
		pl.editMovesTime3(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel4(String username,long moves,long time) throws PLException {
		pl.editMovesTime4(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel5(String username,long moves,long time) throws PLException {
		pl.editMovesTime5(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel6(String username,long moves,long time) throws PLException {
		pl.editMovesTime6(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel7(String username,long moves,long time) throws PLException {
		pl.editMovesTime7(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel8(String username,long moves,long time) throws PLException {
		pl.editMovesTime8(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel9(String username,long moves,long time) throws PLException {
		pl.editMovesTime9(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel10(String username,long moves,long time) throws PLException {
		pl.editMovesTime10(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel11(String username,long moves,long time) throws PLException {
		pl.editMovesTime11(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel12(String username,long moves,long time) throws PLException {
		pl.editMovesTime12(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel13(String username,long moves,long time) throws PLException {
		pl.editMovesTime13(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel14(String username,long moves,long time) throws PLException {
		pl.editMovesTime14(username,moves,time);
		return pl.getData(username);
	}@Override
	public UserDataBean editMovesTimelevel15(String username,long moves,long time) throws PLException {
		pl.editMovesTime15(username,moves,time);
		return pl.getData(username);
	}

	@Override
	public UserDataBean editLastlevel(String username,int level) throws PLException {
		pl.editLastlevel(username,level);
		return pl.getData(username);
	}
	@Override
    public void addLevel(int level,String[][] primaryColors, String[][] endcolors) throws PLException {
		pl.addLevel(level,primaryColors,endcolors);
    }
	@Override
	public String[][] getLevel(int i, String s) throws PLException, SQLException {
		return pl.getLevel(i,s);

	}
}
