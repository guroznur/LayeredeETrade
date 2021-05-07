package nLayeredProject.business.abstracts;

public interface EmailValidationService {
	
	void sendToMail(String message);
	boolean isVerified();

}
