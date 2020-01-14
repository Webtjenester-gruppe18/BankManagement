package dtu.ws18.bankmanagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    @RequestMapping("/bankmanager")
    public String index() {
        return "ToDo: Implement me";
    }
}
