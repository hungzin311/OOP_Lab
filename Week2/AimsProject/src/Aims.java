public class Aims{
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f); 
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd1);
        System.out.print("Total Cost is: "); 
        System.out.println(anOrder.totalCost());
    }
}

