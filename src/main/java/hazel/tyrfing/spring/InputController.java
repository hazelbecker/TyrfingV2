package hazel.tyrfing.spring;

import hazel.tyrfing.engine.GameEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InputController {

    private final GameEngine gameEngine = new GameEngine();

    @Value("${html.file.location}")
    private String templateLocation;


    @GetMapping("/")
    public String setUp(){
        return templateLocation;
    }

    @PostMapping("/")
    public String initial(){

        return "uwu";

        //if the player hits A
        //gameEngine.setAreaId(1);
        //gameEngine.runInput();
    }


}
