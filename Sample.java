public class Sample{
	int x = 10; //Intance variable
	int y = 25; //Intance variable
	
	public static void main(String[] args){
		Sample t = new Sample();
		Sample t1 = new Sample();
		Sample t2 = new Sample();
		Sample t3 = new Sample();
		Sample t4 = new Sample();
		t1.x = t2.x +5;
		t3.x = t1.x + t2.y +12;
		t.x = t1.x+t3.x+t3.y+5;
		System.out.println(t1.x+" and " + t2.y+" and "  + t3.x +" and " +t.x);
	}

}