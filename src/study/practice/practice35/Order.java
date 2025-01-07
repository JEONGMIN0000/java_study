package study.practice.practice35;

import java.util.List;

public class Order {
	
	 String orderId;
     String date;
     List<Item> items;

     public String getOrderId() {
         return orderId;
     }

     public void setOrderId(String orderId) {
         this.orderId = orderId;
     }

     public String getDate() {
         return date;
     }

     public void setDate(String date) {
         this.date = date;
     }

     public List<Item> getItems() {
         return items;
     }

     public void setItems(List<Item> items) {
         this.items = items;
     }

}
