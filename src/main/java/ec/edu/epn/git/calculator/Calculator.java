package ec.edu.epn.git.calculator;
public class Calculator {
    private int ans;

    public int addition(int a, int b) {
        return a + b;
    }

    public int sustraction(int a, int b) {
        return a - b ;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int multiplication(int a, int b) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a*b;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}
