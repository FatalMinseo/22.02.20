import java.awt.print.Book;
import java.util.Arrays;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

//			BookData book1 =new BookData("�ڹ�", 10000, "����");
//			BookData book2 =new BookData("DataBase", 20000, "����");
//			BookData book3 =new BookData("Web", 30000, "��ȯ");

		BookData[] bookList = new BookData[4];
		Scanner sc = new Scanner(System.in);
//			bookList[0]=book1;
//			bookList[1]=book2;
//			bookList[2]=book3;

		for (int i = 0; i < bookList.length; i++) {
			System.out.print("å ������ �Է����ּ��� >> ");
			String title = sc.next();
			System.out.print("���ڸ� �Է����ּ��� >> ");
			String writer = sc.next();
			System.out.print("������ �Է����ּ��� >> ");
			int price = sc.nextInt();

			BookData book = new BookData(title, price, writer);
			bookList[i] = book;
		}
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int inPrice = sc.nextInt();
		System.out.println("���� ������ å ���");
		for (int i = 0; i < bookList.length; i++) {
			if(inPrice> bookList[i].getPrice()) {
				System.out.print("["+bookList[i].getTitle()+", "+bookList[i].getWriter()+", "+bookList[i].getPrice()+"��]");				
			}
		}
		
		//��̸���Ʈ
//		ArrayList<BookData> array = new ArrayList<BookData>();
//	      array.add(book1);
//	      array.get(0).getTitle();
		

		// private���� ���߾� ���� ������ ���� �߻�
		// book1.title ="¥�İ�Ƽ";

		// private���� ���߾� ���� ������ ���� �߻�!
		// book1.title = "¥�İ�Ƽ";

		// private ���� ���߾��� ������ �����ϴ� ���!!
	}

}
