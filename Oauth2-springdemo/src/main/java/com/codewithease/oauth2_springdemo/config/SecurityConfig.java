package com.codewithease.oauth2_springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/test/public").permitAll()
                        .requestMatchers("/api/test/profile", "/api/test/private").authenticated()
                        .anyRequest().authenticated()
                )
                .oauth2Login(Customizer.withDefaults());;

        return http.build();
    }
}
