package koyo.dev.utilisateurs.securite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Properties;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
;


@Configuration
@EnableWebSecurity
public class configurationSecuriteApplication {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    return
            httpSecurity
                    .csrf(AbstractHttpConfigurer::disable)

                    .authorizeHttpRequests(
                            authorize ->
                                    authorize

                                            .requestMatchers(GET,"/user").permitAll()
                                            .requestMatchers(GET,"/avis/get/{id}").permitAll()
                                            .requestMatchers(POST,"/avis/add").permitAll()
                                            .requestMatchers(POST,"/inscription").permitAll()
                                            .anyRequest().authenticated()
                    ).build();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


}

