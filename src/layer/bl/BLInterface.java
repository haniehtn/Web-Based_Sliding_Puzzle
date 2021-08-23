package layer.bl;

import layer.pl.PLException;
import layer.pl.UserDataBean;

import java.sql.Array;
import java.sql.SQLException;

public interface BLInterface {
	void register(String username, String password) throws DuplicateUserNameException, SimplePasswordException, PLException;
	UserDataBean login(String username, String password)throws PLException;
	UserDataBean edit(long loginId, String username, String newName, String newFamily)throws PLException;
	void logout(long loginId)throws PLException;
	void unregister(long loginId, String username)throws PLException;
	UserDataBean editMovesTimelevel1(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel2(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel3(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel4(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel5(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel6(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel7(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel8(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel9(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel10(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel11(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel12(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel13(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel14(String username,long moves,long time) throws PLException;
	UserDataBean editMovesTimelevel15(String username,long moves,long time) throws PLException;
    UserDataBean editLastlevel(String username, int level) throws PLException;
	String getRanks(int level) throws PLException;

    void addLevel(int level,String[][] primaryColors, String[][] endcolors) throws PLException;

    String[][] getLevel(int i, String s) throws PLException, SQLException;
}
