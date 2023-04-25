package kr.ac.kopo.ctc.kopo11;

import java.io.IOException;
import java.util.List;

import kr.ac.kopo.ctc.kopo11.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo11.domain.WifiItem;
import kr.ac.kopo.ctc.kopo11.service.WifiItemService;

public class WifiMain {

	public static void main(String[] args) throws IOException {
		WifiItemService kopo11_wifiItemService = new WifiItemService(); // Ŭ���� ��ü ����
		WifiItemDao kopo11_wifiItemDao = new WifiItemDao(); // Ŭ���� ��ü ����
		WifiItem kopo11_me = new WifiItem(0, "��⵵ ������ �д籸 Ȳ�����329���� 5 �ѱ������ش��� ���ձ��������"
				, 37.3860521, 127.1214038); // �ʱⰪ ����
		List<WifiItem> kopo11_wifiItems = kopo11_wifiItemDao.selectAll(); 

		WifiItem kopo11_near = null; // �ʱⰪ null ����
		WifiItem kopo11_far = null; // �ʱⰪ null ����
		
		double kopo11_resultMIN = Double.MAX_VALUE; // double �ִ밪 ����
		double kopo11_resultMAX = Double.MIN_VALUE; // double �ּҰ� ����

		for (WifiItem kopo11_target : kopo11_wifiItems) { // ����Ʈ�� ���� �ϳ��� �������� �ݺ���
			double kopo11_d = kopo11_wifiItemService.getDistance(kopo11_me, kopo11_target); // �� ������ ����,�浵�� ���� �Ÿ� ���.
			
			// ����� �Ÿ��� ���� �ּҰ����� ������ �� ����
			if (kopo11_d < kopo11_resultMIN) {
				kopo11_resultMIN = kopo11_d;
				kopo11_near = kopo11_target;
			}

			// ����� �Ÿ��� ���� �ִ밪���� ũ�� �� ����
			if (kopo11_d > kopo11_resultMAX) {
				kopo11_resultMAX = kopo11_d;
				kopo11_far = kopo11_target;
			}
		}

		
		System.out.printf("*******************************************************\n"); // ***** ���� ��� ����
		System.out.printf("<< ���� ����� �� >>\n"); // ��� ����
		System.out.printf(" [%d ��° �׸�]\n", kopo11_near.getId()); // �� ��� ����
		System.out.printf(" ��   �� : %s\n", kopo11_near.getRoadNameAddress()); // �� ��� ����
		System.out.printf(" ��   �� : %s\n", kopo11_near.getLatitude()); // �� ��� ����
		System.out.printf(" ��   �� : %s\n", kopo11_near.getLongitude()); // �� ��� ����
		System.out.printf(" ���������� �Ÿ� : %f\n",kopo11_resultMIN); // �� ��� ����
		System.out.printf("*******************************************************\n"); // ***** ���� ��� ����
		System.out.println(); // ����

		System.out.printf("*******************************************************\n"); // ***** ���� ��� ����
		System.out.printf("<< ���� �� �� >>\n"); // ��� ����
		System.out.printf(" [%d ��° �׸�]\n", kopo11_far.getId()); // �� ��� ����
		System.out.printf(" ��   �� : %s\n", kopo11_far.getRoadNameAddress()); // �� ��� ����
		System.out.printf(" ��   �� : %s\n", kopo11_far.getLatitude()); // �� ��� ����
		System.out.printf(" ��   �� : %s\n", kopo11_far.getLongitude()); // �� ��� ����
		System.out.printf(" ���������� �Ÿ� : %f\n", kopo11_resultMAX); // �� ��� ����
		System.out.printf("*******************************************************\n"); // ***** ���� ��� ����

	}
}
