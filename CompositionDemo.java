package compositionDemo;
import java.io.*;
import java.util.*;

class Vegetable {

	public String V_Name;
	public String V_Type;
	
	Vegetable(String V_Name,String V_Type)
	{
		this.V_Name = V_Name;
		this.V_Type = V_Type;
	}
}

 class Market
 {
	 private final List<Vegetable> vegetables;
	 Market(List<Vegetable> vegetables){
		 this.vegetables = vegetables;
	 }
	public List<Vegetable> getVegetables() {
		return vegetables;
	} 
 }


public class CompositionDemo {
	 public static void main(String[] args){
		 Vegetable v1 = new Vegetable("Tomato", "Fruit");
		 Vegetable v2 = new Vegetable("Carrot", "Root");
		 Vegetable v3 = new Vegetable("Leave", "Lettuce");
		 List<Vegetable> vegetable = new ArrayList<Vegetable>();
		 vegetable.add(v1);
		 vegetable.add(v2);
		 vegetable.add(v3);
		 Market market = new Market(vegetable);
		 List<Vegetable> vegetables = market.getVegetables();
		 for (Vegetable veg : vegetables){
			 System.out.println("Name : " + veg.V_Name + "  ---  " + "Type : " +veg.V_Type );
			 
		 }
   
	 }

}


