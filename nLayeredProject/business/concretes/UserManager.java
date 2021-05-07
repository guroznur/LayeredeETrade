package nLayeredProject.business.concretes;
import nLayeredProject.business.abstracts.UserService;
import nLayeredProject.business.abstracts.UserValidationService;
import nLayeredProject.dataAccess.abstracts.UserDao;
import nLayeredProject.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private UserValidationService userValidationService;

	
	
	
	public UserManager(UserDao userDao,UserValidationService userValidationService) {
		super();
		this.userDao = userDao;
		this.userValidationService=userValidationService;	
		
	}

	
	@Override
	public void add(User user) {
		if(userValidationService.isEmailFormatValid(user)&&userValidationService.isFirstAndLastNameValid(user)
				&&userValidationService.isPasswordLenghtValid(user)) {
					userDao.add(user);
					
				}
		
	}

	
}
