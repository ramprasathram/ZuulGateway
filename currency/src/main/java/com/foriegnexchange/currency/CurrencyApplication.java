package com.foriegnexchange.currency;

import com.foriegnexchange.currency.filters.ErrorFilter;
import com.foriegnexchange.currency.filters.PostFilter;
import com.foriegnexchange.currency.filters.PreFilter;
import com.foriegnexchange.currency.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient

public class CurrencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
/*	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}*/
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
