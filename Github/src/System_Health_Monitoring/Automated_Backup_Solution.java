package System_Health_Monitoring;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Automated_Backup_Solution {

	 private static final String FTP_SERVER = "ftp.example.com";
	    private static final int FTP_PORT = 21;
	    private static final String FTP_USERNAME = "username";
	    private static final String FTP_PASSWORD = "password";
	    private static final String LOCAL_DIRECTORY = "/path/to/local/directory";
	    private static final String REMOTE_DIRECTORY = "/path/to/remote/directory";

	    public static void main(String[] args) {
	        FTPClient ftpClient = new FTPClient();
	        try {
	            ftpClient.connect(FTP_SERVER, FTP_PORT);
	            ftpClient.login(FTP_USERNAME, FTP_PASSWORD);
	            ftpClient.enterLocalPassiveMode();
	            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

	            File localDir = new File(LOCAL_DIRECTORY);
	            File[] files = localDir.listFiles();
	            if (files != null) {
	                for (File file : files) {
	                    String remoteFile = REMOTE_DIRECTORY + "/" + file.getName();
	                    FileInputStream inputStream = new FileInputStream(file);
	                    boolean uploaded = ftpClient.storeFile(remoteFile, inputStream);
	                    inputStream.close();
	                    if (uploaded) {
	                        System.out.println("File " + file.getName() + " uploaded successfully.");
	                    } else {
	                        System.out.println("Failed to upload file " + file.getName());
	                    }
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (ftpClient.isConnected()) {
	                    ftpClient.logout();
	                    ftpClient.disconnect();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}
