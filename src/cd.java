
public class cd extends wd{
	
	
public void a() {
	System.out.println("cd class a()");
}

public void b() {
	System.out.println("cd class b()");
}


public void c() {
	
	System.out.println("cd class c()");
}

public static void main(String [] args) {

	wd obj=new cd();
	obj.a();
	obj.b();
	
	((cd)obj).c();
	obj.wdcc();

	
}
	
	
	
	

}
