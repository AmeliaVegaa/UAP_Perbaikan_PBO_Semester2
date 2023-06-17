import java.util.ArrayList;
import java.util.Scanner;

class Data {
    private static ArrayList<Plants> tanamans = new ArrayList<>();
    private static ArrayList<Integer> lokasi = new ArrayList<>();

    public static void mulai() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("WELCOME MRS. AMELIA!");
            System.out.println("How long is the planting period of planting flowers you want?");
            int masaTanamMinggu = input.nextInt();
            int masaTanamHari = masaTanamMinggu * 7;
            System.out.println("\nWhat flower plants do you want to grow?");
            System.out.println("1. Roses");
            System.out.println("2. Sunflower");
            System.out.println("3. Tulips");
            System.out.println("Enter the number of the flower: ");
            int choice = input.nextInt();
            input.nextLine();

            for (int i = 0; i < 3; i++) {
                menanam(choice);
            }

            for (int i = 1; i <= masaTanamHari; i++) {
                if (i % 7 == 0) {
                    System.out.println("\n=== Plant Maintenance ===");
                    for (Plants tanaman : tanamans) {
                        if (!lokasi.contains(tanamans.indexOf(tanaman))) {
                            tanaman.treatment();
                        }
                    }
                }

                System.out.println("\nDay " + i + " of Planting");
                for (int j = 0; j < tanamans.size(); j++) {
                    Plants tanaman = tanamans.get(j);
                    if (tanaman.status().equals("Alive") && !lokasi.contains(j)) {
                        tanaman.berkembang();
                        if (tanaman.status().equals("Dead")) {
                            lokasi.add(j);
                            menanam(choice);
                        }
                    }
                }
            }
        }
        System.out.println("\n=========================================\n");
        System.out.println("Visualization of Flower Plants");

        for (int i = 0; i < tanamans.size(); i++) {
            if (!lokasi.contains(i)) {
                System.out.println(tanamans.get(i).toString());
            }
        }

        System.out.println("\nTHANK YOU MRS. AMELIA! SEE YOU NEXT TIME~");
    }

    public static void menanam(int choice) {
        switch (choice) {
            case 1:
                tanamans.add(new Mawar());
                System.out.println("Roses have been successfully planted.");
                break;
            case 2:
                tanamans.add(new Matahari());
                System.out.println("Sunflowers have been successfully planted.");
                break;
            case 3:
                tanamans.add(new Tulip());
                System.out.println("Tulips have been successfully planted.");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    public static void info() {
        System.out.println("Flower Planting Report:\n");
        for (int i = 0; i < tanamans.size(); i++) {
            Plants tanaman = tanamans.get(i);
            System.out.println("Flower Plant " + (i + 1) + ":");
            System.out.println(tanaman.toString());
            System.out.println();
        }
    }
}
