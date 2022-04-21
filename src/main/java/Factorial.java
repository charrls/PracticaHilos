
public class Factorial implements Runnable {

    public Factorial(int num) {
        numInput = num;
    }

    private int numInput;

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        int result;
        int factorial = 1;

        for (int i = 1; i <= numInput; i++) {
            factorial = factorial * i;
        }

        result = factorial;
        System.out.println("Número: " + numInput + "  Factorial: " + result + "  Hilo: " + name);
    }

    public static void main(String[] args) {

        for (String arg : args) {
            int num = Integer.parseInt(arg);

            Thread t = new Thread(new Factorial(num));
            t.start();
        }

    }
}
