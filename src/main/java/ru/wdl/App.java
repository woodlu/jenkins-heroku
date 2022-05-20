package ru.wdl;

import ru.hh.nab.starter.NabApplication;
import ru.wdl.config.AppConfig;

public class App {
    public static void main(String[] args) {
        NabApplication.builder()
                .configureJersey().addAllowedPackages("ru.wdl").bindToRoot()
                .build().run(AppConfig.class);
    }
}
