package Todo1;

public class Main {
    public static void main(String[] args) {
        Anjing anjing1 = new Anjing("Mochi", 2, "Hitam", "Chihuahua");
        Anjing anjing2 = new Anjing("Bengbeng", 7, "Putih", "West Highland White Terrier");
        Anjing anjing3 = new Anjing("Luluk", 3, "Putih dan Coklat", "Bulldog");

        anjing1.info();
        anjing1.renang();
        anjing1.lari();
        anjing1.gigit();
        anjing1.gonggong();
        System.out.println();

        anjing2.info();
        anjing2.renang();
        anjing2.lari();
        anjing2.gigit();
        anjing2.gonggong();
        System.out.println();

        anjing3.info();
        anjing3.renang();
        anjing3.lari();
        anjing3.gigit();
        anjing3.gonggong();
        System.out.println();
    }
}


