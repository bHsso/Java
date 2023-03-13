package ch13_interface.domain.userinfo.dao;

import ch13_interface.domain.userinfo.UserInfo;

public interface UserInfoDao {
	
	void insertUserInfo(UserInfo userInfo); // 다른 패키지일 경우 import 
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
