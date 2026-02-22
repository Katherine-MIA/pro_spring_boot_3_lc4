package com.apress.myretro.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties(prefix = "service")
@Data
public class MyRetroProperties {
    UsersProperties usersProperties;
}
