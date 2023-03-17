package Peternakan;

public class Main {
    public static void main(String[] args) {
      Ternak[] animals = {
        new Ternak("Bebek", 25, 2, 2.5),
        new Ternak("Domba", 10, 4, 1.5),
        new Ternak("Unta", 7, 5, 2)
      };
  
      for (Ternak animal : animals) {
        System.out.println("Jenis : " + animal.getJenisTernak());
        System.out.println("Jumlah : " + animal.getJumlah() + " ekor");
  
        if (animal.getJenisTernak().equals("Bebek")) {
          System.out.println("Telur/Ekor : " + animal.getHasilTernak() + " Butir");
          System.out.println("Telur/Ekor : " + (animal.getHasilTernak() * animal.getBooster()) + " Butir (Setelah Booster)");
          System.out.println("Total Telur/Hari : " + animal.getOriginalTotalhasilTernak() + " Butir");
          System.out.println("Total Telur/Hari : " + animal.getBoostedTotalhasilTernak() + " Butir (Setelah Booster)");
        } else if (animal.getJenisTernak().equals("Domba")) {
          System.out.println("Bulu/Ekor : " + animal.getHasilTernak() + " kg");
          System.out.println("Bulu/Ekor : " + (animal.getHasilTernak() * animal.getBooster()) + " kg (Setelah Booster)");
          System.out.println("Total Bulu/Hari : " + animal.getOriginalTotalhasilTernak() + " kg");
          System.out.println("Total Bulu/Hari : " + animal.getBoostedTotalhasilTernak() + " kg (Setelah Booster)");
        } else if (animal.getJenisTernak().equals("Unta")) {
          System.out.println("Susu/Ekor : " + animal.getHasilTernak() + " liter");
          System.out.println("Susu/Ekor : " + (animal.getHasilTernak() * animal.getBooster()) + " liter (Setelah Booster)");
          System.out.println("Total Susu/Hari : " + animal.getOriginalTotalhasilTernak() + " liter");
          System.out.println("Total Susu/Hari : " + animal.getBoostedTotalhasilTernak() + " liter (Setelah Booster)");
        }
  
        System.out.println("==================================================");
      }
    }
  }