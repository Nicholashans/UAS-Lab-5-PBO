import java.util.ArrayList;
public class savePasien {
    String nama;
    public static ArrayList<Pasien> listPasien = new ArrayList<Pasien>();
    public void setPasien(Pasien newPasien){
        listPasien.add(newPasien);
    }

    public int getTotalPasien(){
        return listPasien.size();
    }

    public String getPasienIndex(String id){
        return id;
    }

    public String isExist(String kode){
        for(int i = 0; i < listPasien.size();i++){
            if(kode == listPasien.get(i).id){
                return listPasien.get(i).id;
            }
        }
        return null;
    }

    public void showAllPasien(){
        for(int i = 0;i<listPasien.size();i++){
            listPasien.get(i).showInfo();
            System.out.println("---------------------");
        }
    }
}
