package nLayeredProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredProject.dataAccess.abstracts.UserDao;
import nLayeredProject.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	private List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanýcý eklendi:" + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("Kullanýcý silindi:" + user.getFirstName());
		
	}

	@Override
	public void Update(User user) {
		System.out.println("Kullanýcý güncellendi:" + user.getemail());
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if(user.getemail()==email) 		
			return user;
		}
		return null;
		
	}

	@Override
	public User getId(int id) {
		for (User user : users) {
			if(user.getId()==id) 
			return user;
			
		}
		return null;
	}
	
}
