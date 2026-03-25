class Apartment {
   int bedrooms;
   int washrooms;
   int halls;
   int playground = 1;
   int kitchen = 1;
   int diningHall = 1;
   
   public Apartment(int bedrooms, int washrooms, int halls){
    this.bedrooms = bedrooms;
    this.washrooms = washrooms;
    this.halls = halls;
   }
   public void display(){
        System.out.println("Bedrooms:" + this.bedrooms);
        System.out.println("playground:" + this.playground);
        System.out.println("kitchen:" + this.kitchen);
        System.out.println("diningHall:" + this.diningHall);
        System.out.println("Bedrooms:" + this.washrooms);
        System.out.println("Hall:" + this.halls);
   }

}
public class Apartments{
    public static void main(String[] args){
        Apartment a1 = new Apartment(1,1, 1);
        Apartment a2 = new Apartment(2,2, 1);
        Apartment a3 = new Apartment(4,4, 2);
        System.out.println("Apartment 1");
        a1.display();
        System.out.println("Apartment 2");
        a2.display();
        System.out.println("Apartment 3");
        a3.display();
    }
}
