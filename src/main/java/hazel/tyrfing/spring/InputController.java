package hazel.tyrfing.spring;

import hazel.tyrfing.engine.GameEngine;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InputController {

    private final GameEngine gameEngine = new GameEngine();

    @PostMapping("/")
    public String setUp(){
        return "Webpage.html";
    }

    public void initial(){
        //if the player hits A
        gameEngine.setAreaId(1);
        gameEngine.runInput();
    }


}
