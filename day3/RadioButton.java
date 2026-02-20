package week3.day3;

public class RadioButton extends Button {
	

	public void selectRadioButton() {
		System.out.println("The Radio button is been selected");
	}
	

	public static void main(String[] args) {
		
		RadioButton rb= new RadioButton();
		rb.click();
		rb.setText();
		rb.submit();
		rb.selectRadioButton();
		
	

	}

}
