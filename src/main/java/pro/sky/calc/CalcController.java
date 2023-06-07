package pro.sky.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

@GetMapping(path="/calculator")
public String hello() {
    return "Добро пожаловать в калькулятор!";
}

}
