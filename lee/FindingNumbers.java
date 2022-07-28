package solved.ac.lv2;

import java.util.Scanner;

public class FindingNumbers {

	public static void main(String[] args) {
		// �Է� �� ���� ����
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		boolean isExisting = false;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int[] B = new int[M];
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}
		sc.close();

		// ��ü Ž��: B�迭 �ϳ����� A�迭�� ��� ���� ���ؼ� isExisting�� �ٲٱ�
		// question: isExisting ���� ���� �ʰ� isExisting = true
		// ��� ���� sysout(1) ����ϴ� ����� �������?
		//
		// ������: 1�� ����� �� isExisting ���̴� 0�� ����� ���� ����� ����ġ �ʽ��ϴ�.
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (B[i] == A[j]) {
					isExisting = true;
				}
			}

			// goto: question:
			if (isExisting) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
			isExisting = false;
		}
	}

}
