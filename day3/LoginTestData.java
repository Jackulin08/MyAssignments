package week3.day3;

public class LoginTestData extends TestData {

	public void userName() {
		System.out.println("The Username is entered");
	}
		public void passWord() {
			System.out.println("The Password is entered");
		}
		public static void main(String[] args) {
			
			LoginTestData lt= new LoginTestData();
			lt.enterCredentials();
			lt.navigateToHomepage();
			lt.userName();
			lt.passWord();
		

	}

}

