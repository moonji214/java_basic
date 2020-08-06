
public class Circle {


		int radius;
		static int stradius = 0;
		public Circle() { this.radius= 1; }
		public Circle(int radius) {
			this.radius= radius;
		}
		double getArea() {
			return 3.14*this.radius*this.radius;
		}
		public String toString() {
			return "Circle"+ radius;
					
		}
		public static String GettoString() {
			return "Static Circle" + stradius;		
		}
}
