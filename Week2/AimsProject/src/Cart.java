public class Cart {
    int qty_ordered =  0;
    public static final int max_ordered = 20; 
    private DigitalVideoDisc item_order[] = new DigitalVideoDisc[max_ordered];

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qty_ordered < max_ordered){
            item_order[qty_ordered] = disc; 
            qty_ordered++; 
            System.out.println("The disc has been added");
        }
        else{ 
            System.out.println("The cart is almost full");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int index = 0; index < qty_ordered; index++){ 
            if(item_order[index].equals(disc)){
                for(int j = index; j <qty_ordered - 1; j++){
                    item_order[j] = item_order[j+1];
                }
                item_order[qty_ordered-1] = null; 
                qty_ordered--;
                break;
            } 
        }
    }
    public float totalCost(){
        float total = 0; 
        for(int index = 0; index < 20; index++){
            if(item_order[index] != null){
                total+= item_order[index].getCost();
            }   
        }
        return total;
    }

}
