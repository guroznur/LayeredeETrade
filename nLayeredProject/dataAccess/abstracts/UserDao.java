package nLayeredProject.dataAccess.abstracts;

import java.util.List;

import nLayeredProject.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void Update(User user);
	User getByEmail(String email);
	User getId(int id);
	List<User> getAll();
}
