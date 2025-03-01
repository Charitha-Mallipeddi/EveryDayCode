package overloading;

 class add {
static int sub(int a,int b) {return a-b;}
static int sub(int a,int b, int c) {return a-b-c;}
}
class adder{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add.sub(12,9));
		System.out.println(add.sub(13,14,15));
	        System.out.println("hello");
			System.out.println("changed");
			System.out.println("extrachanged");
		 System.out.println("moreextrachanged");


			
	
	}

	}

