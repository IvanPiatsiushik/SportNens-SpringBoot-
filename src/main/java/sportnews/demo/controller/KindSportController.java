package sportnews.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sportnews.demo.model.Post;
import sportnews.demo.repos.PostRepository;

import java.util.List;

@Controller
public class KindSportController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/basketball")
    public String basketball(Model model){
        List<Post> posts = postRepository.findByKind("баскетбол");
        model.addAttribute("posts",posts);
        return "basketball";
    }
    @GetMapping("/football")
    public String football(Model model){
        List<Post> posts = postRepository.findByKind("футбол");
        model.addAttribute("posts",posts);
        return "football";
    }
    @GetMapping("/hockey")
    public String hockey(Model model){
        List<Post> posts = postRepository.findByKind("хоккей");
        model.addAttribute("posts",posts);
        return "hockey";
    }
    @GetMapping("/biathlon")
    public String biathlon(Model model){
        List<Post> posts = postRepository.findByKind("биатлон");
        model.addAttribute("posts",posts);
        return "biathlon";
    }
    @GetMapping("/tennis")
    public String tennis(Model model){
        List<Post> posts = postRepository.findByKind("теннис");
        model.addAttribute("posts",posts);
        return "tennis";
    }
    @GetMapping("/")
    public String corusel(){
        return "corusel";
    }

    @GetMapping ("/registration")
    public String registration(){ return "registration"; }


}
