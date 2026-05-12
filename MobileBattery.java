class Mobile{
	private String brand;
	private String model;
	private double price;
	private Battery battery;
	
	Mobile(String brand,String model,double price,Battery battery){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.battery=battery;
	}

	void mobileDetails(){
		System.out.println("Mobile Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		battery.batteryDetails();
	}
}
class Battery{
	private String capacity;
	private String type;
	Battery(String capacity,String type){
		this.capacity=capacity;
		this.type=type;
	}
	void batteryDetails(){
		System.out.println("Battery Details: ");
		System.out.println("Capacity: "+capacity);
		System.out.println("Type: "+type);
	}
}
class MobileBattery{
	public static void main(String args[]){
		Mobile mobile=new Mobile("Samsung","Galaxy M14",14000,new Battery("6000 mAh","Li-Po"));
		mobile.mobileDetails();
	}
}