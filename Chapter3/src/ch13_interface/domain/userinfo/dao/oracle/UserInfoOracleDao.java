package ch13_interface.domain.userinfo.dao.oracle;

import ch13_interface.domain.userinfo.UserInfo;
import ch13_interface.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Oracle ====");
		System.out.println("insertUserInfo = " + userInfo.getUserId() ) ;
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("updateUserInfo : " + userInfo.getUserName());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("deleteUserInfo : " + userInfo.getPassword());
	}

}
