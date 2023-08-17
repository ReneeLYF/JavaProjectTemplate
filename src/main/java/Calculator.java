import com.parasoft.interfaces2.ICalculator;

public class Calculator implements ICalculator {

    private Screen screen = new Screen(Screen.Brightness.MIDDLE);
    public int add(int a, int b) {
        int result = a + b;
        screen.showResult(result);
        return result;
    }

    public static class Screen {
        private Brightness brightness;

        public Screen(Brightness brightness) {
            this.brightness = brightness;
        }

        public void showResult(int result) {
            System.out.println("The result is: " + result);
        }

        public void showResult2(int result) {
            System.out.println("The result2 is: " + result);
        }

        public enum Brightness {
            HIGH, MIDDLE, LOW
        }
                public void showResult3(int result) {
			int a = 0;
			result = 0 + a;
            System.out.println("The result3 is: " + result);
        }

        public void showResult4(int result) {
			int i = 9;
			result = 0 + i;
            System.out.println("The result4 is: " + result);
        }

        public void showResult5(int result) {
			int j = 10;
			result = 0 + j;
            System.out.println("The result5 is: " + result);
        }
		public void showResult6(int result) {
			int a = 0;
			result = 0 + a;
            System.out.println("The result6 is: " + result);
        }
    }
}
