package oauth2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/secured")
    public String secured() {
        return "secured";
    }
}
