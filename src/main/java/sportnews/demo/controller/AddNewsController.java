package sportnews.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sportnews.demo.model.Post;
import sportnews.demo.repos.PostRepository;

@Controller
public class AddNewsController {

    @Autowired
    private PostRepository postRepository;
    @GetMapping("/addNews")
    public String addNews(Model model ){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts",posts);
        return "addNews";
    }
    @GetMapping("/add")
    public String add(Model model){
        return "add";
    }
    @PostMapping("/add")
    public String addPost(@RequestParam String title,@RequestParam String anons,@RequestParam String full_text,@RequestParam String kind, Model model){
        Post post =new Post(title,anons,full_text,kind);
        postRepository.save(post);
        return "redirect:/addNews";
    }


}
