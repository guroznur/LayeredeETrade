package nLayeredProject.core.adapters;

import nLayeredProject.googleValidation.GoogleValidationManager;

public class GoogleValidationManagerAdapter implements GoogleValidationService{

	@Override
	public void logInToSystem(String message) {
		GoogleValidationManager manager = new GoogleValidationManager();
		manager.logIn(message);
	}

	

}
