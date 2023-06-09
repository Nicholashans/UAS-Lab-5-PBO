// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Menu {
    String nama;
    public static Scanner input = new Scanner(System.in);
    public static Scanner inputAngka = new Scanner(System.in);
    public static Scanner inputKode = new Scanner(System.in);
    public static savePasien save = new savePasien();
    public static saveDokter saveD = new saveDokter();
    public static void main(String[] args) {
        showMenu();

    }

    public static void showMenu(){
        System.out.println("HOSPITAL MANAGEMENT MENU");
        System.out.println("========================");
        System.out.println("1. Pasien");
        System.out.println("2. Dokter");
        System.out.println("x. Exit");
        var inputUser = inputAngka.nextInt();

        if (inputUser == 1){
            showMenuPasien();
        } else if (inputUser == 2) {
            showMenuDokter();
        }

    }

    //dokter
    public static void showMenuDokter(){
        System.out.println("DOKTER PAGE");
        System.out.println("===========");
        System.out.println("1. Registration");
        System.out.println("2. Show Semua Dokter");
        System.out.println("3. Back to the Main Menu");
        System.out.print("Masukkan Pilihan :");
        var inputUser = inputAngka.nextInt();

        if (inputUser == 1){
            registrationDokter();
        }

        else if (inputUser == 2){
            showAllDokterHere();
        } else if (inputUser == 3) {
            showMenu();
        }
    }

    public static void registrationDokter(){
        System.out.println("REGISTRATION");
        System.out.println("============");
        System.out.println("Masukkan Nama yang Mau di Register ");
        String nama = input.nextLine();
        Dokter dokter1 = new Dokter(nama);

        saveD.setDokter(dokter1);
        System.out.println("DOKTER BARU TELAH DIBUAT!!!!");
        dokter1.showInfo();
        System.out.println(dokter1.getId());
        showMenuDokter();
    }


    public static void checkIdDokter(){
        System.out.println("Masukkan Kode Yang Ingin Dicek");
        String kode = inputKode.nextLine();

        String cekPasien = save.isExist(kode);

        if(cekPasien != null){
            System.out.println("DOKTER DITEMUKAN");
            System.out.println("================");
            showMenuDokter();

        }
        else{
            System.out.println("TIDAK ADA DATA, SILAKAN REGISTRASI DULU");
            showMenuDokter();
        }
    }
    public static void hapusDokter(){

    }

    public static void showAllDokterHere(){
        System.out.println("Dokter");
        for(int i = 0; i < saveDokter.listDokter.size() ;i++){
            String tes = saveDokter.listDokter.get(i).id;
            String tes2 = saveDokter.listDokter.get(i).name;
            var no = i+1;

            if(tes!=null){
                System.out.println(no + ". "+ tes + ", Nama : " + tes2);
            }
        }
    }


    //pasien
    public static void showMenuPasien(){
        System.out.println("PASIEN PAGE");
        System.out.println("===========");
        System.out.println("1. Registration");
        System.out.println("2. Show Semua Pasien");
        System.out.println("3. Check ID Pasien");
        System.out.print("Masukkan Pilihan :");
        var inputUser = inputAngka.nextInt();

        if (inputUser == 1){
            registration();
        }

        else if (inputUser == 2){
            showAllPasienHere();
        } else if (inputUser == 3) {
            checkId(); //masih gagal
        }
    }

    public static void registration(){
        System.out.println("REGISTRATION");
        System.out.println("============");
        System.out.println("Masukkan Nama yang Mau di Register ");
        String nama = input.nextLine();
        Pasien pasien1 = new Pasien(nama);

        save.setPasien(pasien1);
        System.out.println("PASIEN BARU TELAH DIBUAT!!!!");
        pasien1.showInfo();
        System.out.println(pasien1.getId());
        showMenuPasien();
    }


    public static void checkId(){
        System.out.println("Masukkan Kode Yang Ingin Dicek");
        String kode = inputKode.nextLine();

        String cekPasien = save.isExist(kode);

        if(cekPasien != null){
            System.out.println("PASIEN DITEMUKAN");
            System.out.println("================");
            showMenuPasien();

        }
        else{
            System.out.println("TIDAK ADA DATA, SILAKAN REGISTRASI DULU");
            showMenuPasien();
        }
    }
    public static void hapusPasien(){

    }

    public static void showAllPasienHere(){
        System.out.println("Pasien");
        for(int i = 0; i < savePasien.listPasien.size() ;i++){
            String tes = savePasien.listPasien.get(i).id;
            String tes2 = savePasien.listPasien.get(i).name;
            var no = i+1;

            if(tes!=null){
                System.out.println(no + ". "+ tes + ", Nama : " + tes2);
            }
        }
    }


}