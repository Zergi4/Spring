package pro.sky.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalcServiceInterface {
     String welcome();

    int plus(int num1,int num2);


    int minus(int num1,int num2);

    int multiply(int num1,int num2);

    int divide(int num1,int num2);

}
