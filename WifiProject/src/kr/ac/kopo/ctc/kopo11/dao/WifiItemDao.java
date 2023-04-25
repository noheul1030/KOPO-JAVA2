package kr.ac.kopo.ctc.kopo11.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.ctc.kopo11.domain.WifiItem;

public class WifiItemDao {
	
//	public WifiItem create(WifiItem wifiItem) {
//		return null;
//	}
//	
//	// read
//	public WifiItem selectOne(int id) {
//		// 필요한 id값만 가져온다.
//		return null;
//	}
	
	
	public List<WifiItem> selectAll() throws IOException {		
		File kopo11_file = new File("C:\\Users\\노을\\Documents\\GitHub\\KOPO-JAVA2\\자바심화(v2023)-자바심화\\PublicWifi.txt");
		BufferedReader kopo11_buffer = new BufferedReader(new FileReader(kopo11_file));
		List<WifiItem> kopo11_wifiItems = new ArrayList<WifiItem>();
		
		String kopo11_readtxt; // String 변수 선언
		// , 기준으로 나눠서 배열에 저장
		if ((kopo11_readtxt = kopo11_buffer.readLine()) == null) {
			System.out.printf("빈 파일입니다\n"); // 출력 개행
//			return; // 리턴
		}
		String[] kopo11_field_name = kopo11_readtxt.split("\t");

		while ((kopo11_readtxt = kopo11_buffer.readLine()) != null) {
			// , 기준으로 나눠서 배열에 저장
			String[] kopo11_field = kopo11_readtxt.split("\t");
			WifiItem kopo11_we = new WifiItem(Integer.parseInt(kopo11_field[0]),kopo11_field[9], Double.parseDouble(kopo11_field[13]), Double.parseDouble(kopo11_field[14]));
			kopo11_wifiItems.add(kopo11_we);
			// 모든 정보를 가져와서 저장.
		}
		kopo11_buffer.close();
		return kopo11_wifiItems;
	}

//	public WifiItem update(int id,WifiItem wifiItem) {
//		return null;
//	}
//	
//	public WifiItem delete(int id) {
//		// 해당항목을 지운다.
//		return null;
//	}
}
