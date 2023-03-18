package co.DevelHopeHelloWorld.Swagger01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NameController {

    @GetMapping
    public String get(){
        return "Mirko";
    }

}
