package com.bdd.framework.cucumber.dataTables.json;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
	
public class JsonDataReader {
	public List<UserData> customerList;
	
	public JsonDataReader(){
		this.customerList = getCustomerData();
	}
	
	public List<UserData> getCustomerData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\test\\java\\com\\bdd\\framework\\cucumber\\dataTables\\json\\loginData.json"));
			UserData[] users = gson.fromJson(bufferReader, UserData[].class);
			return Arrays.asList(users);
		}catch(FileNotFoundException e) {
			throw new RuntimeException();
		}finally {
			try { if(bufferReader != null) bufferReader.close();}
			catch (IOException ignore) {}
		}
	}
	
	public UserData getDataByUserName(String username) {
		for(UserData u: customerList) {
			if(u.getUsername().equals(username)) {
				return u;
			}
		}
		return null;
	}
}