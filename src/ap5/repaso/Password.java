package ap5.repaso;

public class Password {

	private int longitud;
	private String password;
	
	public Password() {
		this.longitud=8;
		this.password="password";
	}
	
	public Password(int longitud) {
		this.longitud=longitud;
		int i=1;
		double value = 0;
		while(i <= longitud) {
			value = value + Math.random()*Math.pow(10, i);
			i++;
		}
		this.password= Double.toString(value);
		
	}
	
	public boolean isStrong() {
		char[] arr = password.toCharArray();
		int lowercase = 0;
		int uppercase = 0;
		int number = 0;
		for(Character c : arr) {
			if(Character.isUpperCase(c)) {
				uppercase++;
			}
			if(Character.isLowerCase(c)) {
				lowercase++;
			}
			if(Character.isDigit(c)) {
				number++;
			}
			
		}
		return(uppercase > 2 || lowercase > 1 || number > 5);	
	}
	
	public void generatePassword() {
		password= Double.toString((Math.random()*Math.pow(10, longitud)));
	}
	
	//Falta completar pero prefiero hacer otras cosas
	
	
}
