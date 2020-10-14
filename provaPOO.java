public class Item {
   private String title;
   private String publisher;
   private int year_published;
   private String ISBN;
   private int price;
  
   public void setTitle(String title){
       this.title = title;
   }
   public void setPublisher(String publisher){
       this.publisher = publisher;
   }
   public void setYear_published(int year_published){
       this.year_published = year_published;
   }
   public void setISBN(String ISBN){
       this.ISBN = ISBN;
   }
   public void setPrice(int price){
       this.price = price;
   }

   public int getPrice() {
       return price;
   }

   public int getYear_published() {
       return year_published;
   }

   public String getISBN() {
       return ISBN;
   }
