import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        int pilihan;
        int baris;
        int kolom;
        String nama;

        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");

            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = scanner.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = scanner.nextInt();

                        System.out.print("Masukkan kolom: ");
                        kolom = scanner.nextInt();
                        scanner.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor kursi tidak tersedia!");
                            continue;
                        }

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi!");
                            continue;
                        }

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data berhasil disimpan!");
                        break;
                    }
                    break;

                case 2:
                    System.out.println("\n DAFTAR PENONTON");

                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {

                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        }
    }
}