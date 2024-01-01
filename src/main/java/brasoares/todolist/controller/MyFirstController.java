package brasoares.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



// Controller is a component to be the layer
// between request and the others, is the one
// receive the requests for access

@RestController
@RequestMapping("/firstRoute")
public class MyFirstController {

    @GetMapping("/")
    // Class above, method ahead
    public String firstMessage(){
        return "Worked!";
    }
}