package study.api;


import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {

	public static void main(String[] args)  {

		List<ArplInfo> arplList;
		try {
			arplList = ArplApiService.forecastDustArplInfoList("2024-12-11");

			for(ArplInfo info : arplList) {
				System.out.println( info.toString() );
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ArplInfo 객체 -> DB 저장
		
		//ArplDAO
		ArplDAO arplDAO = new ArplDAO();
		//arplDAO.saveArpl()
	}

}
