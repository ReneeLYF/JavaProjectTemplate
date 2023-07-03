import com.parasoft.interfaces2.ICalculator;

public class Calculator implements ICalculator {

    private Screen screen = new Screen(Screen.Brightness.MIDDLE);
    public int add(int a, int b) {
        int result = a + b;
        screen.showResult(result);
        return result;
    }
    public int delete(int a, int b) {
        int result = a + b;
        int result1 = b + 1;
        int result2 = result1;
        screen.showResult2(result);
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
    }
}
