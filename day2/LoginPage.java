package week3.day2;

//Subclass of Basepage (overriding concept)

public class LoginPage extends BasePage {

	
		public void performCommonTasks() {
			System.out.println("The Data's are entered");
		}
			

			public static void main(String[] args) {
				LoginPage lp= new LoginPage();
				lp.clickElement();
				lp.enterText();
				lp.findElement();
				lp.performCommonTasks();
				
			}
		

	}


