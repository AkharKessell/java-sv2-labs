package src.main.java.attributes.bill;

public class BillItemMain {
    public static void main(String[] args) {
        BillItem item = new BillItem("Newspaper",100,1,27.0);
        System.out.println("Item:" + item.getProduct()+" Price:"+item.getPrice()+" Quantity:"+item.getQuantity()+" VAT:"+item.getVatPercent());
        System.out.println(item.calculateTotalPrice()+" TOTAL");

        BillItem newItem = new BillItem("Phone",365_352,2,27.5);
        System.out.println("Item:" + newItem.getProduct()+" Price:"+newItem.getPrice()+" Quantity:"+newItem.getQuantity()+" VAT:"+newItem.getVatPercent());
        System.out.println(newItem.calculateTotalPrice()+" TOTAL");
    }

}
