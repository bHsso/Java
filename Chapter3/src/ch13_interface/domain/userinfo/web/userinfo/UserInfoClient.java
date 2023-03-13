package ch13_interface.domain.userinfo.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13_interface.domain.userinfo.UserInfo;
import ch13_interface.domain.userinfo.dao.UserInfoDao;
import ch13_interface.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13_interface.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties() ; // Properties 객체 : pair로 읽어들일 수 있는 객체
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE"); // 키값(DBTYPE)에 해당하는 값 반환 
		
		UserInfo userInfo = new UserInfo() ;
		userInfo.setUserId("12345");
		userInfo.setPassword("1111");
		userInfo.setUserName("userName");
		
		
		UserInfoDao userInfoDao = null ;
		
		if( dbType.equals("ORACLE") ) {
			userInfoDao = new UserInfoOracleDao() ;
		}else if ( dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}else {
			System.out.println(" db err ");
			return ;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
		
	}

}
