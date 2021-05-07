package nLayeredProject;
import nLayeredProject.business.abstracts.UserService;
import nLayeredProject.business.concretes.UserManager;
import nLayeredProject.business.concretes.UserValidationManager;
import nLayeredProject.dataAccess.concretes.HibernateUserDao;
import nLayeredProject.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		UserService userService= new UserManager(new HibernateUserDao(), new UserValidationManager());
				
		User user = new User(1,"Öznur","Gür","engindemirog@gmail.com","12345678");
		userService.add(user);
		
		
		
		
	

	}
}
