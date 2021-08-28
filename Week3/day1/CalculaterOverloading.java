package Week3.day1;

public class CalculaterOverloading {
      public void Add( int X, int Y) {
    	  int z= X+Y;
    	  System.out.println("Add X+Y :" + z);
      }
      public void Add( int P, int Q, int R) {
    	  int g= P+Q+R;
    	  System.out.println("Add P+Q+R :" + g);
      }
      public void Multiply( int X, double Y) {
    	  double z= X*Y;
    	  System.out.println("Add X*Y :" + z);
      }
      public void Mulitply( int P, int Q, int R) {
    	  int g= P*Q*R;
    	  System.out.println("Add P*Q*R :" + g);
      }
      public void Subtract( int X, int Y) {
    	  int z= X-Y;
    	  System.out.println("Add X-Y :" + z);
      }
      public void Subtract( int P, int Q, int R) {
    	  int g= P-Q-R;
    	  System.out.println("Add P-Q-R :" + g);
      }
		
		public static void main(String[] args) {
			CalculaterOverloading obj = new CalculaterOverloading();
			obj.Add(5, 5);
			obj.Add(10, 15, 20);
			obj.Multiply(10, 10.45);
			obj.Mulitply(4, 5, 2);
			obj.Subtract(50, 40);
			obj.Subtract(45,5,5);
		}
		

	

}
