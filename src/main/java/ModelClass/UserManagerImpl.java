package ModelClass;

import org.hibernate.SessionFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import ModelClass.User;
import DAOClass.UserDAO;
import DAOClass.UserManager;



@Service
public class UserManagerImpl implements UserManager{

	
	@Autowired
	 UserDAO userdao;
	
	public UserManagerImpl() {
		// TODO Auto-generated constructor stub
	}
	@Transactional
	public void addRec(User user) {
		// TODO Auto-generated method stub
		userdao.addRec(user);
	}
	
	
}
