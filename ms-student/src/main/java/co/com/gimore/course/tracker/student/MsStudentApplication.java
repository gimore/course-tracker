package co.com.gimore.course.tracker.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsStudentApplication.class, args);
	}

}
