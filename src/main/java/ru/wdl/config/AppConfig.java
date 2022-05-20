package ru.wdl.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.hh.nab.starter.NabProdConfig;
import ru.wdl.endpoint.AppResource;
import ru.wdl.service.EmailService;

@Configuration
@Import({
        NabProdConfig.class,
        AppResource.class,
        EmailService.class
})
public class AppConfig {
}
