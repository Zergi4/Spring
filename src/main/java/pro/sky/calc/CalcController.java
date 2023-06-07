package pro.sky.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

@GetMapping(path="/calculator")
public String welcome() {
    return "Добро пожаловать в калькулятор!";
}
@GetMapping(path= "/calculator/plus")
public String plus(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {

    return num1 + "+" + num2 + "=" + (num1 + num2);
}
@GetMapping(path= "/calculator/minus")
public String minus(@RequestParam("num1") int num1,@RequestParam("num2") int num2) {

    return num1 + "-" + num2 + "=" + (num1 - num2);
}

}
