public class Question4{
	public int sum(int[] a){
		int x = 0;
		for(int i = 0, i<a.len(), i++){
			x = x+ a[i];
			}
		return x;
		}
	public int[] cumsum(int[] a){
		int x[] = new int[a.len()]
		int y = 0;
		for(int i = 0, i<a.len(), i++){
			y = y+a[i];
			x[i] = y;
			}
		return x;
		}
	public int[] positives(int[] a){
		int y = 0
		for(int i = 0, i<a.len(),i++){
			if a[i]>= 0 {y= y+1;}
			}
		int[] x= new int[y];
		y = 0
		for(int i = 0, i<a.len(),i++){
			if a[i]>= 0 {x[y] = a[i];
				y = y+1;
				}
			}
		}
	}
			