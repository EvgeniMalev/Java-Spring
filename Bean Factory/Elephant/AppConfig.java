import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Elephant elephant() {
        return new Elephant(1, "Doris", 5000); 
    }
}
