import java.util.ArrayList;
import java.util.Vector;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;
public class ArrayListClass{
	public static void main(String[] args){
		TextBook book1 = new TextBook(1,"English Text","Macmillian");
		TextBook book2 = new TextBook(2,"Mathematics Text","Mathematics man");
		TextBook book3 = new TextBook(3,"Science","Man");
		ArrayList<TextBook> li =new ArrayList<TextBook>();
		li.add(book1);
		li.add(book2);
		li.add(book3);
		
		
	for(TextBook named:li){
			 
			System.out.println("The id is: "+named.id+"\n"+"The title is: "+named.title+"\n"+"The author name is: "+named.authorName);
		}
		
	}
}


class TextBook{
	int id;
	String title;
	String authorName;
	public TextBook(int id,String title,String authorName){
		this.id=id;
		this.title=title;
		this.authorName = authorName;
	}
	
	public int getId(){
		return id;
	}
	public String getTitle(){
		return title;
	}
	
	public String getAuthorName(){
		return authorName;
	}
}


class TextBook2{
	int id;
	String title;
	String authorName;
	public TextBook2(int id,String title,String authorName){
		this.id=id;
		this.title=title;
		this.authorName = authorName;
	}
}


class TextBook3{
	int id;
	String title;
	String authorName;
	public TextBook3(int id,String title,String authorName){
		this.id=id;
		this.title=title;
		this.authorName = authorName;
	}
}