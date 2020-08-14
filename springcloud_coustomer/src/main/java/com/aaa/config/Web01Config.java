package com.aaa.config;

import com.fasterxml.jackson.databind.ObjectMapper;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsUtils;

import javax.annotation.Resource;
import java.io.PrintWriter;

import static javafx.scene.input.KeyCode.R;

// 启用security
@EnableWebSecurity
// 启用注解
@EnableGlobalMethodSecurity(securedEnabled = true,jsr250Enabled = true,prePostEnabled = true)
public class Web01Config extends WebSecurityConfigurerAdapter {

	// 链式编程
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 使用form表单登录
		http .authorizeRequests()
				// 解析跨域请求，请求路径是否允许校验
				.requestMatchers(CorsUtils::isPreFlightRequest)
				.permitAll()
				.and()
				.cors().and().csrf().disable()
				.authorizeRequests()
				// 解析跨域请求，请求路径是否允许校验
				.requestMatchers(CorsUtils::isPreFlightRequest)
				.permitAll();
	}
}
