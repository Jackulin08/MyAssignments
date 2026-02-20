package week3.day3;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		System.out.println("The Check box buuton appeared");
	}

	public static void main(String[] args) {
		
		CheckBoxButton cbb= new CheckBoxButton();
		cbb.clickCheckButton();
		cbb.click();
		cbb.setText();
		cbb.submit();
		

	}

}
