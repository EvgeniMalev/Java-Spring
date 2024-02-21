public class Building {
   private int id;
   private String Locationtown; 
   private String Locationcountry;   
   private int humancapacity;  
   private int floors; 
   
   public Building() {}
   
   public Building(String Locationtown, String Locationcountry, int humancapacity, int floors) {
      this.Locationtown = Locationtown;
      this.Locationcountry = Locationcountry;
      this.humancapacity = humancapacity;
	  this.floors = floors;
   }
   
   public int getId() {
      return id;
   }
   
   public void setId(int id) {
      this.id = id;
   }
   
   public String getLocationtown() {
      return Locationtown;
   }
   
   public void setLocationtown(String locationtown) {
      this.Locationtown = locationtown;
   }
   
   public String getLocationcountry() {
      return Locationcountry;
   }
   
   public void setLocationcountry(String locationcountry) {
      this.Locationcountry = locationcountry;
   }
   
   public int getHumancapacity() {
      return humancapacity;
   }
   
   public void setHumancapacity(int humancapacity) {
      this.humancapacity = humancapacity;
   }
   
   public int getFloors() {
      return floors;
   }
   
   public void setFloors(int floors) {
      this.floors = floors;
   }
}
