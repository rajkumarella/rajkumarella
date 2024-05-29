package System_Health_Monitoring;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Log_File_Analyzer {
	 public static void main(String args[]) {
	        String logFilePath = "/path/to/access.log"; // Replace with your log file path
	        Map<String, Integer> statusCodeCounts = new HashMap<>();
	        Map<String, Integer> ipAddressCounts = new HashMap<>();
	        Map<String, Integer> requestedPageCounts = new HashMap<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(logFilePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] parts = line.split(" ");
	                String ipAddress = parts[0];
	                String statusCode = parts[8];
	                String requestedPage = parts[6];

	                // Count status codes
	                statusCodeCounts.put(statusCode, statusCodeCounts.getOrDefault(statusCode, 0) + 1);

	                // Count IP addresses
	                ipAddressCounts.put(ipAddress, ipAddressCounts.getOrDefault(ipAddress, 0) + 1);

	                // Count requested pages
	                requestedPageCounts.put(requestedPage, requestedPageCounts.getOrDefault(requestedPage, 0) + 1);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Number of 404 errors: " + statusCodeCounts.getOrDefault("404", 0));

	        System.out.println("\nTop 5 most requested pages:");
	        requestedPageCounts.entrySet().stream()
	                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
	                .limit(5)
	                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

	        System.out.println("\nTop 5 IP addresses with the most requests:");
	        ipAddressCounts.entrySet().stream()
	                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
	                .limit(5)
	                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	    }
	}
}
