package System_Health_Monitoring;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class System_Health_Monitoring_Script {
	
	    private static final double CPU_THRESHOLD = 0.8; // 80%
	    private static final double MEMORY_THRESHOLD = 0.8; // 80%
	    private static final double DISK_THRESHOLD = 0.8; // 80%

	    public static void main(String[] args) throws InterruptedException {
	        OperatingSystemMXBean osBean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
	        
	        while (true) {
	            double cpuUsage =  osBean.getSystemCpuLoad();
	            double memoryUsage = (double) (osBean.getTotalPhysicalMemorySize() - osBean.getFreePhysicalMemorySize()) / osBean.getTotalPhysicalMemorySize();
	            double diskUsage = 1.0 - ((double) osBean.getFreeDiskSpaceSize() / osBean.getTotalDiskSpaceSize());

	            if (cpuUsage > CPU_THRESHOLD) {
	                System.out.println("CPU usage exceeded threshold! Current CPU usage: " + cpuUsage);
	            }

	            if (memoryUsage > MEMORY_THRESHOLD) {
	                System.out.println("Memory usage exceeded threshold! Current memory usage: " + memoryUsage);
	            }

	            if (diskUsage > DISK_THRESHOLD) {
	                System.out.println("Disk usage exceeded threshold! Current disk usage: " + diskUsage);
	            }

	            // Sleep for 1 minute before checking again
	            Thread.sleep(60000);
	        }
	    }
	}

