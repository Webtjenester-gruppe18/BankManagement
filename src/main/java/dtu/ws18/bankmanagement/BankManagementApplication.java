package dtu.ws18.bankmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class BankManagementApplication {

    public static void main(String[] args) {

        SpringApplication.run(BankManagementApplication.class, args);
    }

}
