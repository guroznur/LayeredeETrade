package nLayeredProject.business.abstracts;

import nLayeredProject.entities.concretes.User;

public interface UserValidationService {
	
	boolean isEmailFormatValid(User user);
	boolean isPasswordLenghtValid(User user);
	boolean isFirstAndLastNameValid(User user);
    boolean isFieldsFill(String email, String password);
	


}
