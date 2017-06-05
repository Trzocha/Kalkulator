
public class Fun {
	
	private int x,y;
	public Fun()
	{
		x = pobierz_x();
		y = pobierz_y();
		System.out.println(x+y);
	}
	public int pobierz_x(){
		return 5;
	}
	public int pobierz_y(){
		return 7;
	}

}
