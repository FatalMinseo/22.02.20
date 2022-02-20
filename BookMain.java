import java.awt.print.Book;
import java.util.Arrays;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {

//			BookData book1 =new BookData("자바", 10000, "병관");
//			BookData book2 =new BookData("DataBase", 20000, "동원");
//			BookData book3 =new BookData("Web", 30000, "승환");

		BookData[] bookList = new BookData[4];
		Scanner sc = new Scanner(System.in);
//			bookList[0]=book1;
//			bookList[1]=book2;
//			bookList[2]=book3;

		for (int i = 0; i < bookList.length; i++) {
			System.out.print("책 제목을 입력해주세요 >> ");
			String title = sc.next();
			System.out.print("저자를 입력해주세요 >> ");
			String writer = sc.next();
			System.out.print("가격을 입력해주세요 >> ");
			int price = sc.nextInt();

			BookData book = new BookData(title, price, writer);
			bookList[i] = book;
		}
		System.out.print("금액을 입력하세요 : ");
		int inPrice = sc.nextInt();
		System.out.println("구매 가능한 책 목록");
		for (int i = 0; i < bookList.length; i++) {
			if(inPrice> bookList[i].getPrice()) {
				System.out.print("["+bookList[i].getTitle()+", "+bookList[i].getWriter()+", "+bookList[i].getPrice()+"원]");				
			}
		}
		
		//어래이리스트
//		ArrayList<BookData> array = new ArrayList<BookData>();
//	      array.add(book1);
//	      array.get(0).getTitle();
		

		// private으로 감추어 놨기 때문에 오류 발생
		// book1.title ="짜파게티";

		// private으로 감추어 놨기 때문에 오류 발생!
		// book1.title = "짜파게티";

		// private 으로 감추어진 정보를 접근하는 방법!!
	}

}
