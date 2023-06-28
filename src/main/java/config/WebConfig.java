/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import org.springframework.boot.web.server.*;
import org.springframework.boot.web.servlet.server.*;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;

import static constant.AttributeConstant.*;
import static constant.ViewConstant.*;
import static org.springframework.http.HttpStatus.*;

//việc cấu hình để xử lý khi 1 yêu cầu không tìm thấy
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController(NOT_FOUND_VIEW).setViewName(FORWARD_PREFIX + INDEX_VIEW);
    }

    @Bean
    public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> containerCustomizer() {
        return container -> {
            container.addErrorPages(new ErrorPage(NOT_FOUND, NOT_FOUND_VIEW));
        };
    }
}

