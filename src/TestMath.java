public class TestMath {
    public static void main(String[] args) {
        MathMetod mathMetod = new MathMetod();
        boolean testIsEven = mathMetod.isEven(2);
        boolean testIsEven2 = mathMetod.isEven(5);
        boolean testIsOdd3 = mathMetod.isOdd(2);
        boolean testIsOdd4 = mathMetod.isOdd(5);
        double testCircleField5 = mathMetod.circleField(3);
        int testPower6 = mathMetod.power(2);
        System.out.println(testIsEven);
        System.out.println(testIsEven2);
        System.out.println(testIsOdd3);
        System.out.println(testIsOdd4);
        System.out.println(testCircleField5);
        System.out.println(testPower6);
    }
}
