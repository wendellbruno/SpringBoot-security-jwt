package br.com.example.securityjwt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("private")
public class PrivateController {
        
    @GetMapping()
    public String getMessage() {
        return "Hellou from private API controller";
    }
    
}
