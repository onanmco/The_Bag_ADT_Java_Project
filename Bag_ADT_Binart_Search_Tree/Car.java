// NAME : MUSTAFA CEM ONAN
// ID   : 180315064

public class Car implements Comparable<Car>{
		private String name;
		private int price;
		
		public Car(String name, int price) {
			this.name = name;
			this.price = price;
		}
				
		public String getName() {
			return name;
		}
		
		public int getPrice() {
			return price;
		}
		
		@Override
		public String toString() {
			return "" + name + ", Price : " + price; 
		}
		
		@Override
		public int compareTo(Car anotherCar) {
			if (this.price == anotherCar.getPrice()) {
				return this.name.compareToIgnoreCase(anotherCar.getName());
			}
			return this.price - anotherCar.getPrice();
		}
	}