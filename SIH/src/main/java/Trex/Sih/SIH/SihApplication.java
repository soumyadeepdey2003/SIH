package Trex.Sih.SIH;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SihApplication {

	public static void main(String[] args) {

		SpringApplication.run(SihApplication.class, args);
		System.out.println("hi");
	}

}
