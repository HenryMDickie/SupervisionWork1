public class Question6{
	public int[] vectorAdd(int x, int y, int dx, int dy){
		int[] x = [x+dx,y+dy];
		return x;
		}
	public static void main(String[] args){
		int a=0;
		int b=2;
		int[] x = vectorAdd(a,b,1,1);
		a= x[0];
		b = x[1];
		System.out.println(a+" "+b);
		}
	
	