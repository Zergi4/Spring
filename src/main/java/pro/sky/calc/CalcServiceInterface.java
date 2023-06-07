package pro.sky.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalcServiceInterface {
     String welcome();

    String plus();


    String minus();

    String multiply();

    String divide();

}
