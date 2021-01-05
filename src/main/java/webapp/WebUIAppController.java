package webapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebUIAppController {

    @RequestMapping(value = "/sum")
    public static ResponseEntity<Integer> sum(@RequestParam("x") int a, @RequestParam("y") int b) {
        int sum = a + b;
        return ResponseEntity.ok(sum);
    }

    @RequestMapping("/abc")
    public static ResponseEntity<String> greet(@RequestParam("n") String personName) {
        String greeting = "Hello " + personName;
        return ResponseEntity.ok(greeting);
    }
}