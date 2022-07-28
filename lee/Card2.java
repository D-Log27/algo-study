package solved.ac.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Card2 {

	public static void main(String[] args) throws IOException {

		// �Է� �� ���� ����
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		int nPowOf2 = 1;
		int N = Integer.parseInt(b.readLine());
		b.close();

		// ��Ģ:
		// 1. input = 2^n �̸� output = input
		// 2. else : output = 2 * (input - 2^n), �� n�� input-2^n>0 �� �����ϴ� ���� �� �ִ�
		while (N > nPowOf2) {
			nPowOf2 *= 2;
		}
		if (N == nPowOf2) {
			System.out.println(nPowOf2);
			return;
		}

		nPowOf2 /= 2;

		nPowOf2 = N - nPowOf2;
		System.out.println(2 * nPowOf2);

	}

}