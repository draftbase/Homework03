public class MathMetod {
    boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    double circleField(double num) {
        return 2*3.14*num;
    }

    int power(int num) {
        return (int) Math.pow(num,2);
    }

}
