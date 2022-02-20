import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu = 0;
		ArrayList<Address> arrayAddress = new ArrayList<Address>();
		while (menu != 5) {
			System.out.print("[1] �߰� [2] ��ü��ȸ [3] ���� [4] �˻� [5] ���� >> ");
			menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("����ó�� �߰��ϼ���.");
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String phoneNumber = sc.next();
				Address address = new Address(name, age, phoneNumber);
				arrayAddress.add(address);
			} else if (menu == 2) {
				for (int i = 0; i < arrayAddress.size(); i++) {
					System.out.println((i + 1) + ". " + arrayAddress.get(i).getName() + "("
							+ arrayAddress.get(i).getAge() + "��) : " + arrayAddress.get(i).getPhonenumber());
				}
			} else if (menu == 3) {
				System.out.print("������ �̸� : ");
				String removeName = sc.next();
				for (int i = 0; i < arrayAddress.size(); i++) {
					if (removeName.equals(arrayAddress.get(i).getName())) {
						arrayAddress.remove(i);
						System.out.println(removeName + "��(��) �����Ǿ����ϴ�.");
					} else if (i == arrayAddress.size() - 1) {
						System.out.println("��ϵ� ����ó�� �����ϴ�.");
					}
				}
				
			} else if (menu == 4) {
				System.out.print("�˻��� �̸� : ");
				String researchName = sc.next();
				for (int i = 0; i < arrayAddress.size(); i++) {
					if (researchName.equals(arrayAddress.get(i).getName())) {
						System.out.println((i + 1) + ". " + arrayAddress.get(i).getName() + "("
								+ arrayAddress.get(i).getAge() + "��) : " + arrayAddress.get(i).getPhonenumber());
					} else if (i == arrayAddress.size() - 1) {
						System.out.println("����ó�� �������� �ʽ��ϴ�.");
					}
				}
			}
			System.out.println();
		}
		System.out.println("���α׷� ����");
		sc.close();
	}
}
