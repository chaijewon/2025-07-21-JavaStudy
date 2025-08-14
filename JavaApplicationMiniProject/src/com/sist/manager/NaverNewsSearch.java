package com.sist.manager;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.text.*;
/*
 *   {	"lastBuildDate":"Tue, 21 Jan 2025 12:31:22 +0900",	"total":675726,	"start":1,	"display":10,	
 *   "items":[	
 *   	{		"title":"마포구, ‘마포순환열차버스’ 첫 운행 앞둬…골목상권 활성화",	
 *   		"originallink":"https:\/\/hobbyen-news.com\/news\/view\/1065582923310335",	
 *   		"link":"https:\/\/hobbyen-news.com\/news\/view\/1065582923310335",			
 *   "description":"숨겨진 <b>맛집<\/b>과 이색 공간을 구경할 수 있다. 제막식은 1부와 2부로 진행된다. 1부 제막식에는 마포구청장과... 주변으로 <b>맛집<\/b>이 밀집돼 있는 보행자 중심의 거리) ▶하늘길(합정역 7번 출구 주변으로 독립서점과 이색카페... ",	
 *   		"pubDate":"Tue, 21 Jan 2025 12:20:00 +0900"		},		{			"title":"장부대장 프차, 2025년 1월 2주차 '도시락' 검색 늘어",			"originallink":"http:\/\/www.shinailbo.co.kr\/news\/articleView.html?idxno=1994629",			"link":"http:\/\/www.shinailbo.co.kr\/news\/articleView.html?idxno=1994629",			"description":"장부대장 프차의 매장진단리포트 기능은 상권정보, 매출정보, 배달분석, 리뷰분석, <b>맛집<\/b>랭킹, 품질점검관리 항목의 데이터를 즉시 조회 및 생성 제공한다. [신아일보] 강동완 선임기자",			"pubDate":"Tue, 21 Jan 2025 12:10:00 +0900"		},		{			"title":"서울 도곡동 <b>맛집<\/b> ‘코시’ 자가제면우동, 미우새 김승수 배우가 극찬한...",			"originallink":"http:\/\/www.livesnews.com\/news\/article.html?no=47210",			"link":"http:\/\/www.livesnews.com\/news\/article.html?no=47210",			"description":"위치한 '코시'를 <b>맛집<\/b>으로 추천해 주목받고 있다. 매봉역에서 도보 5분 거리에 위치한 이곳은 직접 반죽한... 또한 배우 김승수는 매장 방문 당시 쫄깃한 면발과 깊은 맛의 육수에 감탄하며 양재천 단골 <b>맛집<\/b>으로 소개하기도... ",			"pubDate":"Tue, 21 Jan 2025 12:08:00 +0900"		},		{			"title":"신세계백화점 스위트파크, ‘설, 우리의 맛’ 디저트 팝업 개최",			"originallink":"https:\/\/www.cnbnews.com\/news\/article.html?no=704002",			"link":"https:\/\/www.cnbnews.com\/news\/article.html?no=704002",			"description":"넣은 프랑스 과자 파리 브레스트 등을, ‘애니브’는 문경 사과 애플파이를 선보인다. 또한 무스케이크 <b>맛집<\/b> ‘레종데트르’에선 홍시, 수정과를 활용한 6종의 무스케이크와 현미크림브륄레, 대추고타르트 등을 준비했다.",			"pubDate":"Tue, 21 Jan 2025 12:02:00 +0900"		},		{			"title":"하나카드 &quot;위안화도 무료환전&quot;",			"originallink":"https:\/\/www.newsfreezone.co.kr\/news\/articleView.html?idxno=605734",			"link":"https:\/\/www.newsfreezone.co.kr\/news\/articleView.html?idxno=605734",			"description":"현지 여행에서 <b>맛집<\/b>이나 쇼핑센터 등에서 카드 결제가 쉽지 않은 이유다. 이럴 때 하나페이 앱에 트래블로그 유니온페이 카드를 연결하면 편리하게 결제가 가능하다. 결제방식은 간단하다. 하나페이 앱 내... ",			"pubDate":"Tue, 21 Jan 2025 11:40:00 +0900"		},		{			"title":"'생생정보마당' 한 끗이 남다른 <b>맛집<\/b>, 부산 전포동 밀면 &amp; 고양 행신 감...",			"originallink":"https:\/\/www.topstarnews.net\/news\/articleView.html?idxno=15595109",			"link":"https:\/\/www.topstarnews.net\/news\/articleView.html?idxno=15595109",			"description":"'생생 정보마당에서 소개한 부산광역시 전포동 소재 밀면 <b>맛집<\/b>과 경기도 고양시 소재 감자탕 <b>맛집<\/b>이 화제다. 21일 MBN '생생정보마당'의 '문전성시의 비밀' 코너에서는 밀면-감자탕 <b>맛집<\/b>들을 방문했다. (생생정보마당 오늘... ",			"pubDate":"Tue, 21 Jan 2025 11:36:00 +0900"		},		{			"title":"신세계百 스위트파크 ‘설, 우리의 맛’ 팝업… 국내산 식재료 활용한 ...",			"originallink":"https:\/\/www.donga.com\/news\/Economy\/article\/all\/20250121\/130902984\/1",			"link":"https:\/\/n.news.naver.com\/mnews\/article\/020\/0003611259?sid=101",			"description":"무스케이크 <b>맛집<\/b> ‘레종데트르’에서는 6종 무스케이크를 홍시, 수정과 등을 활용해 선보이며 현미크림브륄레, 대추고타르트 등도 명절 선물로 제안한다. ‘포포민즈낫띵’은 감태 오란다, 흑임자 사블레, 호박씨... ",			"pubDate":"Tue, 21 Jan 2025 11:35:00 +0900"		},		{			"title":"2024 한국공연관광대상 ㈜콘텐츠플래닝 노재환 대표, ㈜네오 김재우 PD",			"originallink":"http:\/\/www.ikoreanspirit.com\/news\/articleView.html?idxno=78772",			"link":"http:\/\/www.ikoreanspirit.com\/news\/articleView.html?idxno=78772",			"description":"공연과 지역 명소, <b>맛집<\/b>, 카페를 결합한 관광 프로그램을 개발해 공연 관람을 하나의 종합 문화 체험으로 확장하며, 대학로가 국내외 관광객들에게 매력적인 문화 공간으로 자리 잡을 수 있도록 기여했다. 노재환 대표는... ",			"pubDate":"Tue, 21 Jan 2025 11:34:00 +0900"		},		{			"title":"마포구, 마포순환열차버스 시승식",			"originallink":"https:\/\/www.sedaily.com\/NewsView\/2GNS2IGTOY",			"link":"https:\/\/n.news.naver.com\/mnews\/article\/011\/0004442367?sid=102",			"description":"홍익대 인근 레드로드를 시작으로 망원시장·하늘길·도화갈매기골목 등 17개 정류소를 이용하면서 숨은 동네 <b>맛집<\/b>과 이색 공간을 구경할 수 있다. 제막식 행사에서 가수 정동원의 축하 무대가 펼쳐진다. 시승식에는... ",			"pubDate":"Tue, 21 Jan 2025 11:33:00 +0900"		},		{			"title":"콘텐츠플래닝 노재환 대표, 2024 한국공연관광협회 경영부문 대상 수상",			"originallink":"https:\/\/www.themusical.co.kr\/News\/Detail?num=14330",			"link":"https:\/\/www.themusical.co.kr\/News\/Detail?num=14330",			"description":"공연과 지역 명소, <b>맛집<\/b>, 카페를 결합한 관광 프로그램을 개발해 공연 관람을 하나의 종합 문화 체험으로 확장하며, 대학로가 국내외 관광객들에게 매력적인 문화 공간으로 자리 잡을 수 있도록 기여했다. 또한... ",			"pubDate":"Tue, 21 Jan 2025 11:33:00 +0900"		}	]}

 */
public class NaverNewsSearch {


    public static void main(String[] args) {
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.print("검색어 입력:");
    	String fd=scan.next();
    	
        newsSearchData(fd);
    }
    public static List<NewsVO> newsSearchData(String fd)
    {
    	List<NewsVO> list=new ArrayList<NewsVO>();
    	String clientId = "OtKU74j2Bx_QN_K5YPck"; //애플리케이션 클라이언트 아이디
        String clientSecret = "eyn6LY7L0j"; //애플리케이션 클라이언트 시크릿


        String text = null;
        try {
            text = URLEncoder.encode(fd, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("검색어 인코딩 실패",e);
        }
        String apiURL = "https://openapi.naver.com/v1/search/news.json?display=10&query=" + text;    // JSON 결과
        // {키:값,키:값...} => 자바 => 자바스크립트로 전송 Ajax / Vue / React / Next
        //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // XML 결과


        Map<String, String> requestHeaders = new HashMap<>();
        requestHeaders.put("X-Naver-Client-Id", clientId);
        requestHeaders.put("X-Naver-Client-Secret", clientSecret);
        String responseBody = get(apiURL,requestHeaders);
        //System.out.println(responseBody);
        /*
         *   {} => Object => JSONObject 
         *   [] => Array  => JSONArray 
         */
        // simple-json / jackson 
        try 
        {
        	JSONParser jp=new JSONParser();
        	JSONObject root=(JSONObject)jp.parse(responseBody);
        	//System.out.println(root.toJSONString());
        	JSONArray items=(JSONArray)root.get("items");
        	//System.out.println(items.toJSONString());
        	for(int i=0;i<items.size();i++)
        	{
        		NewsVO vo=new NewsVO();
        		JSONObject obj=(JSONObject)items.get(i);
        		//System.out.println(obj.toJSONString());
        		String title=(String)obj.get("title");
        		//System.out.println(title);
        		String description=(String)obj.get("description");
        		//System.out.println(description);
        		String link=(String)obj.get("link");
        		//System.out.println(link);
        		String pubDate=(String)obj.get("pubDate");
        		//System.out.println(pubDate);
        		// Tue, 21 Jan 2025 12:42:00 +0900
        		// 애기봉 주변 <b>맛집</b> 코스 개발과 관광객 유입을 통한 지역 경제 활성화 방안을 제시하며, 지역 특화 메뉴 개발과 주민 운영 사업 지원을 통해 지역의 정체성을 강화하겠다는 계획을 밝혔다. 이날 신년인사회 이후 김병수... 
        	    pubDate=new SimpleDateFormat("yyyy-MM-dd").format(new Date(pubDate));
        	    //System.out.println(pubDate);
        	    vo.setTitle(title);
        	    vo.setDescription(description);
        	    vo.setLink(link);
        	    vo.setPubDate(pubDate);
        	    list.add(vo);
        	}
        	/*
        	 *   1. 오라클 => 데이터베이스 
        	 *   --------------------------
        	 *   2. HTML => Jsoup 
        	 *   3. XML  => DocumentBuilder
        	 *       => Spring / MyBatis => XML
        	 *   4. JSON => Simple-JSON / Jacksion
        	 *   --------------------- 파싱   
        	 *      ------ 웹 
        	 *   자바스크립트 => VO,List
        	 *                |   |
        	 *               {}   [] => Ajax / Vue / React
        	 *   => Number
        	 */
        }catch(Exception ex) {}
    	return list;
    }

    private static String get(String apiUrl, Map<String, String> requestHeaders){
        HttpURLConnection con = connect(apiUrl);
        try {
            con.setRequestMethod("GET");
            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
                con.setRequestProperty(header.getKey(), header.getValue());
            }


            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
                return readBody(con.getInputStream());
            } else { // 오류 발생
                return readBody(con.getErrorStream());
            }
        } catch (IOException e) {
            throw new RuntimeException("API 요청과 응답 실패", e);
        } finally {
            con.disconnect();
        }
    }


    private static HttpURLConnection connect(String apiUrl){
        try {
            URL url = new URL(apiUrl);
            return (HttpURLConnection)url.openConnection();
        } catch (MalformedURLException e) {
            throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
        } catch (IOException e) {
            throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
        }
    }


    private static String readBody(InputStream body){
        InputStreamReader streamReader = new InputStreamReader(body);


        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
            StringBuilder responseBody = new StringBuilder();


            String line;
            while ((line = lineReader.readLine()) != null) {
                responseBody.append(line);
            }


            return responseBody.toString();
        } catch (IOException e) {
            throw new RuntimeException("API 응답을 읽는 데 실패했습니다.", e);
        }
    }
}
