package Peternakan;

    class Ternak {
        private String jenisTernak;
        private int jumlah;
        private int hasilTernak;
        private double booster;
      
        public Ternak(String jenisTernak, int jumlah, int hasilTernak, double booster) {
          this.jenisTernak = jenisTernak;
          this.jumlah = jumlah;
          this.hasilTernak = hasilTernak;
          this.booster = booster;
        }
      
        public String getJenisTernak() {
          return jenisTernak;
        }
      
        public int getJumlah() {
          return jumlah;
        }
      
        public int getHasilTernak() {
          return hasilTernak;
        }
      
        public double getBooster() {
          return booster;
        }
      
        public int getOriginalTotalhasilTernak() {
          return hasilTernak * jumlah;
        }
      
        public double getBoostedTotalhasilTernak() {
          return hasilTernak * booster * jumlah;
        }
      }