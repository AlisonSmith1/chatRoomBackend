package com.example.chatroom;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()        // 先關掉 CSRF，方便測試
                .authorizeHttpRequests()
                .anyRequest().permitAll(); // 所有請求都放行
        return http.build();
    }
}
