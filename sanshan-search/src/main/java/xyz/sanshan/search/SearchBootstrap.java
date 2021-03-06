package xyz.sanshan.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import xyz.sanshan.auth.security.client.EnableSanShanAuthClient;

@SpringCloudApplication
@EnableSanShanAuthClient
@EnableFeignClients({"xyz.sanshan.auth.security.client.feign"})
public class SearchBootstrap extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SearchBootstrap.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SearchBootstrap.class, args);
    }

}
