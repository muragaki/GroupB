package com.example.reservationsystem;


//import org.springframework.boot.autoconfigure.security.reactive.PathRequest;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * 
 * @author Katsuki
 *
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.formLogin(login -> login
				.loginProcessingUrl("/login")
				.loginPage("/loginForm")
				.defaultSuccessUrl("/mainmenu", true)
				.failureUrl("/loginForm?error")
				.permitAll()
		).logout(logout -> logout
				.logoutSuccessUrl("/loginForm")
		).authorizeHttpRequests(authz -> authz
				.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
				.requestMatchers("/","/planlist","/register","/register?error").permitAll()
				.requestMatchers("/endreservation").permitAll()
				.requestMatchers("/mainmenu").permitAll()
				.requestMatchers("/picture/**").permitAll()
				.requestMatchers("/img/imgpicture/**").permitAll()
				.requestMatchers("/admin/**").hasRole("ADMIN")
				.requestMatchers("/deckchair").permitAll()
				.requestMatchers("/hawaiidinner").permitAll()
				.requestMatchers("/jrsuite").permitAll()
				.requestMatchers("/yukata").permitAll()
				.anyRequest().authenticated()
		);
		return http.build();		
	}
}
