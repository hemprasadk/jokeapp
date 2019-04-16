package prasad.springframework.joke.jokeapp.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import prasad.springframework.joke.jokeapp.Services.JokeService;

import javax.xml.ws.RequestWrapper;

@Controller
public class JokeController {
    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

@RequestMapping({"/",""})
    public String showjoke(Model model)
{
    model.addAttribute("joke",jokeService.getJoke());
    return "chucknoris";
}

}
