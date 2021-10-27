package problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p15637 {
	static HashMap<Integer, HashMap<?, ?>> resHm = new HashMap<Integer, HashMap<?, ?>>();
	
	public static void main(String[] args) throws Exception {
		String url="";
		
		for(int i=1; i<=700; i++) {
			url = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=" + String.valueOf(i);
			sendGet(i, url);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String searchNum = st.nextToken();
		int findNum = 0;
		
		for(Integer key : resHm.keySet()) {
			System.out.println(key);
			if(resHm.containsValue(searchNum)) {
				findNum++;
			}
		}
		
		System.out.println(findNum);
		
	}
	
	public static void sendGet(Integer drwNo, String targetUrl) throws Exception {
		try {
			URL url = new URL(targetUrl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
//			con.setRequestProperty("Accept", "application/json");
			con.setRequestMethod("GET");
			
			con.connect();
			resHm.put(drwNo, (HashMap<?, ?>) con.getContent());			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
