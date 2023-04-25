package kr.ac.kopo.ctc.kopo11;

import java.io.IOException;
import java.util.List;

import kr.ac.kopo.ctc.kopo11.dao.WifiItemDao;
import kr.ac.kopo.ctc.kopo11.domain.WifiItem;
import kr.ac.kopo.ctc.kopo11.service.WifiItemService;

public class WifiMain {

	public static void main(String[] args) throws IOException {
		WifiItemService kopo11_wifiItemService = new WifiItemService(); // 클래스 객체 생성
		WifiItemDao kopo11_wifiItemDao = new WifiItemDao(); // 클래스 객체 생성
		WifiItem kopo11_me = new WifiItem(0, "경기도 성남시 분당구 황새울로329번길 5 한국폴리텍대학 융합기술교육원"
				, 37.3860521, 127.1214038); // 초기값 선언
		List<WifiItem> kopo11_wifiItems = kopo11_wifiItemDao.selectAll(); 

		WifiItem kopo11_near = null; // 초기값 null 선언
		WifiItem kopo11_far = null; // 초기값 null 선언
		
		double kopo11_resultMIN = Double.MAX_VALUE; // double 최대값 대입
		double kopo11_resultMAX = Double.MIN_VALUE; // double 최소값 대입

		for (WifiItem kopo11_target : kopo11_wifiItems) { // 리스트의 값을 하나씩 꺼내오는 반복문
			double kopo11_d = kopo11_wifiItemService.getDistance(kopo11_me, kopo11_target); // 두 지점의 위도,경도를 통해 거리 계산.
			
			// 계산한 거리의 값이 최소값보다 작으면 값 저장
			if (kopo11_d < kopo11_resultMIN) {
				kopo11_resultMIN = kopo11_d;
				kopo11_near = kopo11_target;
			}

			// 계산한 거리의 값이 최대값보다 크면 값 저장
			if (kopo11_d > kopo11_resultMAX) {
				kopo11_resultMAX = kopo11_d;
				kopo11_far = kopo11_target;
			}
		}

		
		System.out.printf("*******************************************************\n"); // ***** 라인 출력 개행
		System.out.printf("<< 가장 가까운 곳 >>\n"); // 출력 개행
		System.out.printf(" [%d 번째 항목]\n", kopo11_near.getId()); // 값 출력 개행
		System.out.printf(" 주   소 : %s\n", kopo11_near.getRoadNameAddress()); // 값 출력 개행
		System.out.printf(" 위   도 : %s\n", kopo11_near.getLatitude()); // 값 출력 개행
		System.out.printf(" 경   도 : %s\n", kopo11_near.getLongitude()); // 값 출력 개행
		System.out.printf(" 현재지점과 거리 : %f\n",kopo11_resultMIN); // 값 출력 개행
		System.out.printf("*******************************************************\n"); // ***** 라인 출력 개행
		System.out.println(); // 개행

		System.out.printf("*******************************************************\n"); // ***** 라인 출력 개행
		System.out.printf("<< 가장 먼 곳 >>\n"); // 출력 개행
		System.out.printf(" [%d 번째 항목]\n", kopo11_far.getId()); // 값 출력 개행
		System.out.printf(" 주   소 : %s\n", kopo11_far.getRoadNameAddress()); // 값 출력 개행
		System.out.printf(" 위   도 : %s\n", kopo11_far.getLatitude()); // 값 출력 개행
		System.out.printf(" 경   도 : %s\n", kopo11_far.getLongitude()); // 값 출력 개행
		System.out.printf(" 현재지점과 거리 : %f\n", kopo11_resultMAX); // 값 출력 개행
		System.out.printf("*******************************************************\n"); // ***** 라인 출력 개행

	}
}
