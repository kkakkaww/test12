package test12;
import java.util.*;

public class Booktest {

	public static void main(String[] args) {
		HashMap<String, Book> library  = new HashMap<String,Book>();
		List<Book> books= new ArrayList<Book>();
		Scanner input=new Scanner(System.in);
		System.out.print("����ͼ������:");
		int n =input.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("����ͼ����:");
			int id =input.nextInt();
			System.out.print("����ͼ����:");	
			String name=input.next();
			System.out.print("����ͼ��۸�:");
			double price=input.nextDouble();
			System.out.print("����ͼ�������:");
			String outer=input.next();
			Book book=new Book(id,name,price,outer);
			books.add(book);
		}
        for (int i = 0; i < n; i++) {
            Book book = books.get(i);        
            System.out.println("��ţ�" + book.getId() + " ���ƣ�" + book.getName() + " �۸�" + book.getPrice() + " ������" + book.getOuter());
        }
        Iterator iter = library.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Book book = (Book) entry.getValue();
            System.out.println("a��ţ�" + entry.getKey() + " ���ƣ�" + book.getName() + " �۸�" + book.getPrice() + " ������" + book.getOuter());
        }
		
	}

}
