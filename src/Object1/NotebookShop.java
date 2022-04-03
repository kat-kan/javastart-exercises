package Object1;

public class NotebookShop {
    public static void main(String[] args) {
        Computer msi1 = new Computer("MSI", 550);
        Computer msi2 = new Computer("MSI", 550);
        Computer msi3 = new Computer("MSI", 725);
        Computer asus1 = new Computer("ASUS", 550);
        Computer asus2 = new Computer("ASUS", 654);

        DataStore store = new DataStore();
        store.add(msi1);
        store.add(msi2);
        store.add(msi3);
        store.add(asus1);
        store.add(asus2);

        System.out.println(store.checkAvailability(msi1));
        System.out.println(store.checkAvailability(asus1));
        System.out.println(store.getInfoAboutStore());



    }
}
