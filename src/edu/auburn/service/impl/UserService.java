package edu.auburn.service.impl;

import java.util.List;

import edu.auburn.dao.IUserDao;
import edu.auburn.dao.impl.UserDao;
import edu.auburn.domain.EduUser;
import edu.auburn.service.IUserService;

public class UserService implements IUserService{
	IUserDao dao = new UserDao();

	@Override
	public boolean addUser(EduUser user) {
		// TODO Auto-generated method stub
		return dao.addUser(user);
	}

	@Override
	public boolean delUserById(int id) {
		// TODO Auto-generated method stub
		return dao.delUserById(id);
	}

	@Override
	public boolean updateUserTypeById(int id, int type) {
		// TODO Auto-generated method stub
		return dao.updateUserTypeById(id, type);
	}

	@Override
	public List<EduUser> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public boolean checkUserByEmailAndPwd(String email, String pwd) {
		// TODO Auto-generated method stub
		return dao.checkUserByEmailAndPwd(email, pwd);
	}

	@Override
	public EduUser getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return dao.getUserByEmail(email);
	}

	@Override
	public EduUser getUserByName(String name) {
		// TODO Auto-generated method stub
		return dao.getUserByName(name);
	}

	@Override
	public EduUser getUserById(int uid) {
		// TODO Auto-generated method stub
		return dao.getUserById(uid);
	}

	@Override
	public boolean addVerifyCodeByEmail(String email, int code) {
		// TODO Auto-generated method stub
		return dao.addVerifyCodeByEmail(email, code);
	}

	@Override
	public boolean delVerifyCodeByEmail(String email) {
		// TODO Auto-generated method stub
		return dao.delVerifyCodeByEmail(email);
	}

	@Override
	public boolean checkVerifyCodeByEmail(String email, int code) {
		// TODO Auto-generated method stub
		return dao.checkVerifyCodeByEmail(email, code);
	}
	@Override
	public boolean updatePassword(String mail, String confirm) {
		return dao.updatePassword(mail, confirm);
	}

	@Override
	public List<EduUser> getTeachers() {
		// TODO Auto-generated method stub
		return dao.getUsersByType(2);
	}

	@Override
	public List<EduUser> getStudents() {
		// TODO Auto-generated method stub
		return dao.getUsersByType(4);
	}

	@Override
	public List<EduUser> getNons() {
		// TODO Auto-generated method stub
		return dao.getUsersByType(5);
	}
}
