package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "hoi sos nu devtool spring";
    }

    @GetMapping("/user")
    public String userPage() {
        return "hoi sos nu userpage";
    }

    @GetMapping("/admin")
    public String adminpage() {
        return "hoi sos nu adminpage";
    }
}
