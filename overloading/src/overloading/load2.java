package overloading;

public class load2 {
	int mul(int k,int r) {
	return (int) (k*r);
	}
	float mul(int d,float p ) {
		return(float)(d*p);
	}
	float mul(int g, double l,float m) {
		return(float)(g*l*m);
	}

	public static void main(String[] args) {
		load2 obj =new load2();
      int k=obj.mul(3 ,5);
      //1
      System.out.println( obj.mul(4,  5.345f));

      obj.mul(3, 3.432,4.98928f);
      
      //2 
      System.out.println(k);
      
	}

}
