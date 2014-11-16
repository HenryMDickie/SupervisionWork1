public class Stack{
	int[] x;
	public void Stack(int a){
		x = new int[1];
		x[0] = a;
		}
	public void Push(int a){
		int y = new int[x.len() + 1];
		y[0] = a;
		for(i=1, i<x.len(),i++){
			y[i] = x[i-1];
			}
		x=y;
		}
	publinc int Pop(){
		int[] y = new int[x.len() - 1];
		int a = x[0];
		for(i=1, i<x.len(),i++){
			y[i-1] = x[i];
			}
		x=y;
		return a;
		}
