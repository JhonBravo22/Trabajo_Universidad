package com.proyecto.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // @formatter:off
        http
                .authorizeHttpRequests((authorize) -> authorize
                        //control access privileges
                        .requestMatchers("/camas").authenticated()
                        .requestMatchers("/comida").authenticated()
                        .requestMatchers("/juguetes").authenticated()
                        .requestMatchers("/ropa").authenticated()
                        .requestMatchers("/aseo").authenticated()
                        .requestMatchers("/index").authenticated()
                        .requestMatchers("/api/createCamas","/api/readCamas","/api/updateCamas", "/api/deleteCamas").authenticated()
                        .requestMatchers("/api/createAseo","/api/readAseo","/api/updateAseo", "/api/deleteAseo").authenticated()
                        .requestMatchers("/api/createComida","/api/readComida","/api/updateComida", "/api/deleteComida").authenticated()
                        .requestMatchers("/api/createJuguetes","/api/readJuguetes","/api/updateJuguetes", "/api/deleteJuguetes").authenticated()
                        .requestMatchers("/api/createRopa","/api/readRopa","/api/updateRopa", "/api/deleteRopa").authenticated()
                        .anyRequest().permitAll()
                )
                .httpBasic(withDefaults())
                .formLogin(withDefaults());
        // @formatter:on
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        PasswordEncoder passwordEncoder = passwordEncoder();

        UserDetails user = User.builder()
                .username("Jhon4")
                .password(passwordEncoder.encode("Piñ8gepetto*"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
      }
    
}
