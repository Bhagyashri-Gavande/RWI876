package aggregationDemo;

class Dog{
	  
	  String D_Name;
	  String D_Type;
	  String D_Color;
	  
	  Dog(String D_Name, String D_Type, String D_Color) {
	    this.D_Name = D_Name;
	    this.D_Type = D_Type;
	    this.D_Color = D_Color;
	  }
	}

class Cat{
	
	String C_Name;
	String C_Type;
	String C_Color;
	
	Cat(String C_Name, String C_Type, String C_Color){
		this.C_Name = C_Name;
		this.C_Type = C_Type;
		this.C_Color = C_Color;
		
	}
	
}

class Animal
{
  String A_Name;
  int price;
  Dog dog;
  Cat cat;
  Animal(String a, int p, Dog dog, Cat cat )
  {
    this.A_Name= a;
    this.price = p;
    this.dog = dog;
    this.cat = cat;
  }
}

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog("Henry","Labrador","Black");
		Cat cat = new Cat("Jack","Birman","White");
		Animal a = new Animal("Pet Animal", 3000, dog, cat );
	    System.out.println("Animal Name: "+a.A_Name);
	    System.out.println("Animal Price: "+a.price);
	    System.out.println("---Dog Details---");
	    System.out.println("Dog Name: "+a.dog.D_Name);
	    System.out.println("Dog Type: "+a.dog.D_Type);
	    System.out.println("Dog Color: "+a.dog.D_Color);
	    System.out.println("---Cat Details---");
	    System.out.println("Cat Name: "+a.cat.C_Name);
	    System.out.println("Cat Type: "+a.cat.C_Type);
	    System.out.println("Cat Color: "+a.cat.C_Color);
		
	}

}