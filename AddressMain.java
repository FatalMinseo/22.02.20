import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu = 0;
		ArrayList<Address> arrayAddress = new ArrayList<Address>();
		while (menu != 5) {
			System.out.print("[1] 추가 [2] 전체조회 [3] 삭제 [4] 검색 [5] 종료 >> ");
			menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("연락처를 추가하세요.");
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();
				Address address = new Address(name, age, phoneNumber);
				arrayAddress.add(address);
			} else if (menu == 2) {
				for (int i = 0; i < arrayAddress.size(); i++) {
					System.out.println((i + 1) + ". " + arrayAddress.get(i).getName() + "("
							+ arrayAddress.get(i).getAge() + "세) : " + arrayAddress.get(i).getPhonenumber());
				}
			} else if (menu == 3) {
				System.out.print("삭제할 이름 : ");
				String removeName = sc.next();
				for (int i = 0; i < arrayAddress.size(); i++) {
					if (removeName.equals(arrayAddress.get(i).getName())) {
						arrayAddress.remove(i);
						System.out.println(removeName + "이(가) 삭제되었습니다.");
					} else if (i == arrayAddress.size() - 1) {
						System.out.println("등록된 연락처가 없습니다.");
					}
				}
				
			} else if (menu == 4) {
				System.out.print("검색할 이름 : ");
				String researchName = sc.next();
				for (int i = 0; i < arrayAddress.size(); i++) {
					if (researchName.equals(arrayAddress.get(i).getName())) {
						System.out.println((i + 1) + ". " + arrayAddress.get(i).getName() + "("
								+ arrayAddress.get(i).getAge() + "세) : " + arrayAddress.get(i).getPhonenumber());
					} else if (i == arrayAddress.size() - 1) {
						System.out.println("연락처가 존재하지 않습니다.");
					}
				}
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
