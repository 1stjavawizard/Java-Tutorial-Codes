public class Examples{
	public static void main(String[] args){
		Form f = new Form();
		Form2 f2 = new Form2();
		//Thread t1 = new Thread(f);
		//Thread t2 = new Thread(f2);
		f.start();
		f2.start();
	}
}


class Form extends Thread{
	public void run(){
		System.out.println("We are in the run");
	}
}

class Form2 extends Thread{
	public void run(){
		System.out.println("We are in the run 2");
	}
}