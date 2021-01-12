package kr.green.test.service;

import javax.servlet.http.HttpServletRequest;

import kr.green.test.Vo.UserVo;

public interface UserService {

	UserVo getUser(String id);

	String getEmail(String id);

	UserVo isUser(String id, String pw);

	boolean signup(UserVo user);
	
	UserVo getUser(HttpServletRequest request);

}
