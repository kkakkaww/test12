package test12;
import java.util.*;

public class Booktest {

	public static void main(String[] args) {
		HashMap<String, Book> library  = new HashMap<String,Book>();
		List<Book> books= new ArrayList<Book>();
		Scanner input=new Scanner(System.in);
		System.out.print("输入图书数量:");
		int n =input.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("输入图书编号:");
			int id =input.nextInt();
			System.out.print("输入图书名:");	
			String name=input.next();
			System.out.print("输入图书价格:");
			double price=input.nextDouble();
			System.out.print("输入图书出版商:");
			String outer=input.next();
			Book book=new Book(id,name,price,outer);
			books.add(book);
		}
        for (int i = 0; i < n; i++) {
            Book book = books.get(i);        
            System.out.println("编号：" + book.getId() + " 名称：" + book.getName() + " 价格" + book.getPrice() + " 出版社" + book.getOuter());
        }
        Iterator iter = library.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Book book = (Book) entry.getValue();
            System.out.println("a编号：" + entry.getKey() + " 名称：" + book.getName() + " 价格" + book.getPrice() + " 出版社" + book.getOuter());
        }
		
	}

}
