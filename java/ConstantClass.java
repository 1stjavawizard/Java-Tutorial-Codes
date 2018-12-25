import javax.swing.JOptionPane;
import java.util.EnumSet;
public class ConstantClass{
	static final int a = 20;
	public static void main(String[] args){
		//a = 30;
		//JOptionPane.showMessageDialog(null,a);
	// using the values() method
	//for(Book b:Book.values()){
	//	System.out.printf("%s\n the title is %s\n and year manufactured is %d\n",b,b.getTitleBook(),b.getYearPublished());
	//}
	
	// using the EnumSet.range method
	//for(Book book:EnumSet.range(Book.MATHEMATICS,Book.PHYSICS)){
	//	System.out.printf("%s\n the title is %s\n and year manufactured is %d\n",book,book.getTitleBook(),book.getYearPublished());
	//}
	System.out.println(Book.MATHEMATICS);
	}
}

