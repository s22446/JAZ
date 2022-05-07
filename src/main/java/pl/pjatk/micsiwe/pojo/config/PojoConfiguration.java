package pl.pjatk.micsiwe.pojo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import pl.pjatk.micsiwe.ProfileBean;
import pl.pjatk.micsiwe.pojo.model.Pojo;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "pl.pjatk.test")
public class PojoConfiguration {

    private Environment environment;

    public PojoConfiguration(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public Pojo pojoBean() {
        return new Pojo();
    }

    @Bean
    public List<String> defaultData() {
        return List.of("aaa", "bbb", "ccc", "ddd", "eee");
    }

    @Bean
    public ProfileBean profileBean() {
        List<String> activeProfiles = Arrays.asList(environment.getActiveProfiles());
        if (activeProfiles.contains("dev")) {
            return new ProfileBean();
        }

        return null;
    }
}
