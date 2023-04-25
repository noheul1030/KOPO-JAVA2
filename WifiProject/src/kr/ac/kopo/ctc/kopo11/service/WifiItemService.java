package kr.ac.kopo.ctc.kopo11.service;

import kr.ac.kopo.ctc.kopo11.domain.WifiItem;

public class WifiItemService {
	public double getDistance(WifiItem wifiItem1, WifiItem wifiItem2) {
		// 거리계산하는 부분 구현
		double kopo11_dist = Math.sqrt(Math.pow(wifiItem2.getLatitude()-wifiItem1.getLatitude(),2)
				+ Math.pow(wifiItem2.getLongitude()-wifiItem1.getLongitude(),2));
		
		return kopo11_dist;
	}
}
