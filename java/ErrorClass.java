import javax.swing.JOptionPane;
public class ErrorClass{
	
	public double b() throws Exception{
		double a = 0.0f;
		try{a = 6 / 0;}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
		}
		return a;
	}
	public static void main(String[] args) throws Exception{
		int s = 9;
			ErrorClass c = new ErrorClass();
			System.out.println(c.b());
		try{
			if(s!=9){
				JOptionPane.showMessageDialog(null,"yes");
			}
			else{
				throw "You did it";
			}
		}
		catch(Exception e){
			System.out.println("You got some issue here");
		}
		
		/* catch(Exception e){
		StackTraceElement[] errorlist = e.getStackTrace();	
		
		for(StackTraceElement newerror: errorlist){
			System.err.println("file name is: " + newerror.getFileName());
		     System.err.println("class name is: " + newerror.getClassName());
			 System.err.println("line number is: " + newerror.getLineNumber());
			 System.err.println("method name is: " + newerror.getMethodName());
		} */
		//JOptionPane.showMessageDialog(null,e.getMessage());
		//}
	}
}