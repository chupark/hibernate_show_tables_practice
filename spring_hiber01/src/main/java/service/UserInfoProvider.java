package service;

import java.util.List;

import domain.UserInfo;

public interface UserInfoProvider {
	public void insertUser (UserInfo userInfo);
	
	public List<UserInfo> findAllUsers();
	
	public UserInfo findUser (String userId);
	
	public UserInfo updateUser(String userId, String updateName);
}
