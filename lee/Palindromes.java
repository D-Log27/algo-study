package solved.ac.lv2;

import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {// input�� ������ �𸣹Ƿ� input���� 0�� ���� ������ ���ѹݺ�
			gotoDowngraded: while (true) {// break�� label�� Ȱ���� goto �� -> �ݺ��� �ȿ� ���� ���� ��� ����(�ۼ��� �ڵ带 �ϳ��� ��� �ȿ� �־ �� ����
											// ���
				// ����)

				// �Է�
				String pal = sc.next();
				int palNum = Integer.parseInt(pal);
				if (palNum == 0) {// 0�̸� ����
					sc.close();
					return;
				}

				// ���� ����
				int[] palArr;
				int temp = palNum;
				int temp1;
				int digits = 0;

				while (temp > 0) {// �Է��� �ڸ���
					if (temp / 10 > 0) {
						digits++;
					}
					temp /= 10;
				}
				digits++;

				// ���� ����
				palArr = new int[digits];
				temp1 = digits;
				temp = palNum;
				int digitSlicer = (int) Math.pow(10, digits - 1);

				// �Է� ������ �� �ڸ������� �и�
				palArr[0] = palNum / digitSlicer;
				for (int i = 1; i < digits; i++) {
					temp = palNum / digitSlicer * digitSlicer;
					// int ������ ���� ��� ���
					// ��) palNum = 121
					// temp = 121 / 100 * 100;
					// ->temp = 1 * 100;
					// ->temp = 100;

					temp1 = palNum / (digitSlicer / 10) * (digitSlicer / 10);
					// ���� �����
					// ��) palNum = 121
					// temp1 = 121 / 10 * 10;
					// temp1 = 12 * 10;
					// temp1 = 120;

					palArr[i] = (temp1 - temp) * 10 / digitSlicer;
					// palArr[1] = (120 - 100) / 10;
					// palArr[1] = 2;
					digitSlicer /= 10;
				}

				int digitsEvenOdd = digits % 2;
				for (int i = 0; i < digits - digitsEvenOdd; i++) {
					if (palArr[i] != palArr[digits - i - 1]) { // ���ڸ� ���ڸ� ���� ��
						System.out.println("no");
						break gotoDowngraded;
					}
				}
				System.out.println("yes");
			}
		}

	}

}
