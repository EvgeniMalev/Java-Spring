@RestController
public class SecretController {

    @Value("${my-secret}")
    private String secret;

    @GetMapping("/secret")
    public String getSecret() {
        return "The secret is: " + secret;
    }
}
