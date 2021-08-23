package layer.pl;


import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;

public interface PLInterface {
	void add(String username, String password) throws PLException;


	void addLevel(int level, String[][] primaryColors, String[][] endcolors) throws PLException;

	String[][] getLevel(int level, String s) throws PLException, SQLException;

	void edit(String username, String name, String family) throws PLException;
    void editLastlevel(String username, int level)throws PLException;

	void remove(String username) throws PLException;

	ArrayList<String> getUsername() throws PLException;

	UserDataBean getData(String username) throws PLException;
//	List<UserData> getAllUsers();
	void editMovesTime1(String username,long move,long time)throws PLException;
	void editMovesTime2(String username,long move,long time)throws PLException;
	void editMovesTime3(String username,long move,long time)throws PLException;
	void editMovesTime4(String username,long move,long time)throws PLException;
	void editMovesTime5(String username,long move,long time)throws PLException;
	void editMovesTime6(String username,long move,long time)throws PLException;
	void editMovesTime7(String username,long move,long time)throws PLException;
	void editMovesTime8(String username,long move,long time)throws PLException;
	void editMovesTime9(String username,long move,long time)throws PLException;
	void editMovesTime10(String username,long move,long time)throws PLException;
	void editMovesTime11(String username,long move,long time)throws PLException;
	void editMovesTime12(String username,long move,long time)throws PLException;
	void editMovesTime13(String username,long move,long time)throws PLException;
	void editMovesTime14(String username,long move,long time)throws PLException;
	void editMovesTime15(String username,long move,long time)throws PLException;

}
