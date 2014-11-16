public class list{
	int element = new int
	list tail = new list;
	int hastail = 0;
	public void list(int x){
		element = x;
		}
	public void linkup(list x){
		tail = x;
		hastail = 1;
		}
	public int nth(int n){
		int y;
		if n ==0 {y = this.element;}
		else {y = tail.nth(n-1);}
		return y;
		}
	public int len(){
		if this.hastail==0 {return 1}
		else{ return (1+this.tail.len()}
		}
	public int cycles(int a){
		if this.element == a {return 1;}
		else if this.hastail == 0 {return 0;}
		else this.tail.cycles(a);
		}
	public int checkcycles(){cycles(this.element);}
	