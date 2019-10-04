public class MathMetod {
    boolean isEven(int num) {
        boolean boo = (num % 2 == 0);
        return boo;
    }

    boolean isOdd(int num) {
        boolean boo = isEven(num);
        return !boo;
    }

    double circleField(double num) {
        return 2*3.14*num;
    }

    int power(int num) {
        return (int) Math.pow(num,2);
    }

}
