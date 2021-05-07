package nLayeredProject.business.concretes;
import java.util.regex.Pattern;
import nLayeredProject.business.abstracts.UserValidationService;
import nLayeredProject.entities.concretes.User;

public class UserValidationManager implements UserValidationService{
	

	public static final Pattern Regex = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	 

	@Override
	 
	public boolean isEmailFormatValid(User user) {	
		if(Regex.matcher(user.getemail()).find()) {
			System.out.println("Email doðru");
			return true;
		}else {
			System.out.println("Uygun formatlarda mail giriniz.");
			return false;
		}		
}

	@Override
	public boolean isPasswordLenghtValid(User user) {
		if(user.getPassword().length()>=6) {
			return true;
		}
		System.out.println("Uygun formatlarda þifre giriniz.");
		return false;
	}

	@Override
	public boolean isFirstAndLastNameValid(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;			
		}
		System.out.println("Uygun formatlarda isim soyisim giriniz.");
		return  false;
	}

	@Override
	public boolean isFieldsFill(String email, String password) {
		if(!email.isEmpty() && !password.isEmpty()) {
			return true;
		}
		System.out.println("Lütfen email ve þifre alanlarýný doldurun.");
		return false;
	}
	
	

}
