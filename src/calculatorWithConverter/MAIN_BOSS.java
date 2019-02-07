package calculatorWithConverter;

public class MAIN_BOSS {

	public static Menu mFrame;
	public static About aFrame;
	public static NumberSystemCalculator nscframe;
	public static Converter cFrame;
	
	public static void main(String[] args) {
		
		mFrame = new Menu();
		aFrame = new About();
		cFrame = new Converter();
		nscframe = new NumberSystemCalculator();
		
		
		mFrame.setVisible(true);


	}

}
