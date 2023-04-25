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
//		// �ʿ��� id���� �����´�.
//		return null;
//	}
	
	
	public List<WifiItem> selectAll() throws IOException {		
		File kopo11_file = new File("C:\\Users\\����\\Documents\\GitHub\\KOPO-JAVA2\\�ڹٽ�ȭ(v2023)-�ڹٽ�ȭ\\PublicWifi.txt");
		BufferedReader kopo11_buffer = new BufferedReader(new FileReader(kopo11_file));
		List<WifiItem> kopo11_wifiItems = new ArrayList<WifiItem>();
		
		String kopo11_readtxt; // String ���� ����
		// , �������� ������ �迭�� ����
		if ((kopo11_readtxt = kopo11_buffer.readLine()) == null) {
			System.out.printf("�� �����Դϴ�\n"); // ��� ����
//			return; // ����
		}
		String[] kopo11_field_name = kopo11_readtxt.split("\t");

		while ((kopo11_readtxt = kopo11_buffer.readLine()) != null) {
			// , �������� ������ �迭�� ����
			String[] kopo11_field = kopo11_readtxt.split("\t");
			WifiItem kopo11_we = new WifiItem(Integer.parseInt(kopo11_field[0]),kopo11_field[9], Double.parseDouble(kopo11_field[13]), Double.parseDouble(kopo11_field[14]));
			kopo11_wifiItems.add(kopo11_we);
			// ��� ������ �����ͼ� ����.
		}
		kopo11_buffer.close();
		return kopo11_wifiItems;
	}

//	public WifiItem update(int id,WifiItem wifiItem) {
//		return null;
//	}
//	
//	public WifiItem delete(int id) {
//		// �ش��׸��� �����.
//		return null;
//	}
}
