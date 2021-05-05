package hazel.tyrfing.spring;

import hazel.tyrfing.engine.GameEngine;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InputController {

    private final GameEngine gameEngine = new GameEngine();

    @GetMapping("/")
    public String setUp(){
        return "webpage.html";
    }

    @PostMapping("/")
    public String initial(){

        return "uwu";

        //if the player hits A
        //gameEngine.setAreaId(1);
        //gameEngine.runInput();
    }


}
