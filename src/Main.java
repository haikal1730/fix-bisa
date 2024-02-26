import java.util.Scanner;

public class Main {
    static String[] mahasiswaUser = {"202310370311130", "202310370311129", "202310370311152"};
    static String[] roles = {"mahasiswa keren", "mahasiswa cantik", "mahasiswa gateli"};

    static String adminUser = "admin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 3) {
            System.out.println("====Pilihan:====");
            System.out.println("1. Login sebagai mahasiswa");
            System.out.println("2. Login sebagai admin");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan(1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loginMahasiswa(scanner);
                    break;
                case 2:
                    loginAdmin(scanner);
                    break;
                case 3:
                    System.out.println("hatur nuwun!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void loginMahasiswa(Scanner scanner) {
        System.out.print("Masukkan username mahasiswa: ");
        String username = scanner.next();
        boolean loggedIn = false;
        if (mahasiswaUser.length == roles.length) {
            for (int i = 0; i < mahasiswaUser.length; i++) {
                if (username.equals(mahasiswaUser[i])) {
                    loggedIn = true;
                    System.out.println("Login berhasil sebagai " + roles[i]);
                    break;
                }
            }
        } else {
            System.out.println("NIM kurang atau tidak valid.");
            return;
        }
        if (!loggedIn) {
            System.out.println("NIM tidak ada");
        }
    }

    static void loginAdmin(Scanner scanner) {
        System.out.print("Masukkan username admin: ");
        String username = scanner.next();
        if (username.equals(adminUser)) {
            System.out.println("Login berhasil sebagai admin");
        } else {
            System.out.println("Username admin tidak valid.  coba lagi.");
        }
    }
}