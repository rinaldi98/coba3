package coba3;

public class sketboadAksi {
    public static void main(String[] args){
        sketboad A = new sketboad();  
   
        A.setMerk("rifcul");
        A.setWarna("Merah");
        A.setHarga(170000);

        A.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(A.getmerk());
        System.out.print("Warnanya \t: ");
        System.out.println(A.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(A.getHarga());
        
        sketboad AP = new sketboad();
        AP.setMerk("oakey");
        AP.setWarna("Hitam");
        AP.setHarga(1200000);
     }
  }
