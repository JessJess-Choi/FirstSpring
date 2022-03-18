package project.firstServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class FirstServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstServletApplication.class, args);
	}

}
