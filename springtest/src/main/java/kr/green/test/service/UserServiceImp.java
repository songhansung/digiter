package kr.green.test.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.test.Vo.UserVo;
import kr.green.test.dao.UserDao;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@Override
	public String getEmail(String id) {
		UserVo user = userDao.getUser(id);
		//id와 일치하는 회원 정보가 없으면
		if(user == null) {
			return null;
		}
		//id와 일치하는 회원이 있으면 
		return user.getEmail();
	}

	@Override
	public UserVo getUser(String id) {
		UserVo user = userDao.getUser(id);
		return user;
	}

	@Override
	public UserVo isUser(String id, String pw) {
		UserVo user = userDao.getUser(id);
		//id와 일치하는 회원 정보가 없으면
		if(user == null) {
			return null;// 회원아님 
		}
		//id와 일치하는 회원 정보가 있으면 비밀번호를 비교하여 확인
		if(passwordEncoder.matches(pw, user.getPw())) {
			return user;//비밀번호가 같아서 회원
		}
		return null;//비밀번호가 달라서 회원아님
	}

	@Override
	public boolean signup(UserVo user) {
		UserVo tmp = userDao.getUser(user.getId());
		if(tmp != null) {
			return false;
		}
		String encPw = passwordEncoder.encode(user.getPw());
		user.setPw(encPw);
		userDao.insertUser(user);
		return true;
	}

	@Override
	public UserVo getUser(HttpServletRequest request) {
		
		return (UserVo)request.getSession().getAttribute("user");
	}

}
