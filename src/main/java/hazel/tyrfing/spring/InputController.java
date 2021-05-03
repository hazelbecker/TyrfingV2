package hazel.tyrfing.spring;

import hazel.tyrfing.engine.GameEngine;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.text.html.HTML;

@Controller
public class InputController {

    private final GameEngine gameEngine = new GameEngine();

    @GetMapping("/")
    public String setUp(){
        return "webpage.html";
    }

    public void initial(){
        //if the player hits A
        gameEngine.setAreaId(1);
        gameEngine.runInput();
    }


}
