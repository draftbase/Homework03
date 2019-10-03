public class TestToster {
    public static void main(String[] args) {
        Toster toster1 = new Toster();
        toster1.name = "Brown";
        toster1.color = "niebieski";
        toster1.amountOfToast = 2;
        toster1.isOff = true;

        System.out.println(toster1.name + " " + toster1.color + " " + toster1.amountOfToast + " " + toster1.isOff);

        Toster toster2 = new Toster();
        toster2.name = "Tefal";
        toster2.color = "biały";
        toster2.amountOfToast = 4;
        toster2.isOff = false;

        System.out.println(toster2.name + " " + toster2.color + " " + toster2.amountOfToast + " " + toster2.isOff);
    }
}
