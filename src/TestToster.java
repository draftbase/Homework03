public class TestToster {
    public static void main(String[] args) {
//        Toster toster1 = new Toster();
//        toster1.name = "Brown";
//        toster1.color = "niebieski";
//        toster1.amountOfToast = 2;
//        toster1.isOff = true;
//
//        Toster toster2 = new Toster();
//        toster2.name = "Tefal";
//        toster2.color = "biały";
//        toster2.amountOfToast = 4;
//        toster2.isOff = false;

        Toster toster3 = new Toster("Brown",2,true,"niebieski");
        Toster toster4 = new Toster("Tefal",4,false,"biały");

        //System.out.println(toster1.name + " " + toster1.color + " " + toster1.amountOfToast + " " + toster1.isOff);
        //System.out.println(toster2.name + " " + toster2.color + " " + toster2.amountOfToast + " " + toster2.isOff);
        System.out.println(toster3.name + " " + toster3.color + " " + toster3.amountOfToast + " " + toster3.isOff);
        System.out.println(toster4.name + " " + toster4.color + " " + toster4.amountOfToast + " " + toster4.isOff);

    }
}
