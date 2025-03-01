package overloading;

class load {
	String s="cherry";
	int s1=88;
	//float d= 12.3;
	double f=12.3333;
	
    double figure(double l, int b) //two parameters with double type
    {
        return (l*b);
    }
    float figure(int s) //one parameter with float return type
    {
        return (s*s);
    }
 
    public static void main(String[] args) {
        load obj = new load();
        double m=obj.figure(5.55, 6);
        
        System.out.println(m); 
        System.out.println(obj.figure(36)); 

        System.out.println("Area of Square: " +obj.figure(3)); 
    }
}