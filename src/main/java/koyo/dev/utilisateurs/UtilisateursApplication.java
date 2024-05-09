package koyo.dev.utilisateurs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class UtilisateursApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilisateursApplication.class, args);
	}

}
