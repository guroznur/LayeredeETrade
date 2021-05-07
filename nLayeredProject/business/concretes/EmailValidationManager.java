package nLayeredProject.business.concretes;

import nLayeredProject.business.abstracts.EmailValidationService;

public class EmailValidationManager implements EmailValidationService{

	@Override
	public void sendToMail(String message) {
		System.out.println("Do�rulama linki maile g�nderildi." + message);
		
	}

	@Override
	public boolean isVerified(){
		
		return true;
	}
				

}
