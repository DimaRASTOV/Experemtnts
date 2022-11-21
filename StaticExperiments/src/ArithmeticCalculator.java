public class ArithmeticCalculator {

    private int a;
    private int b;
    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate(Operation operation) {
        switch (operation) {
            case ADD:
                return a+b;
        }
        switch (operation) {
            case MULTIPLY:
                return a-b;
        }
        switch (operation) {
            case SUBTRACT:
                return a*b;
        }
        return 0;
    }

}
