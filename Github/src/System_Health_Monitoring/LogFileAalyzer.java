package System_Health_Monitoring;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class LogFileAalyzer {
	 public static void main(String args[]) {
	        String applicationUrl = "http://example.com"; // Replace with your application URL
	        int timeout = 5000; // Timeout in milliseconds for connection and read

	        try {
	            URL url = new URL(applicationUrl);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setConnectTimeout(timeout);
	            connection.setReadTimeout(timeout);
	            int responseCode = connection.getResponseCode();

	            if (responseCode == HttpURLConnection.HTTP_OK) {
	                System.out.println("Application is UP. Status code: " + responseCode);
	            } else {
	                System.out.println("Application is DOWN. Status code: " + responseCode);
	            }
	        } catch (Exception e) {
	            System.out.println("Application is DOWN. Exception: " + e.getMessage();
	            
	            
	        }
	    }
	}

