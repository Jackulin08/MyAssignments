package week3.day3;

public class Button extends WebElement{
	public void submit() {
		System.out.println("The element is submitted");
	}
		

	public static void main(String[] args) {
		Button bn= new Button();
		bn.submit();
		bn.click();
		bn.setText();

	}

}
