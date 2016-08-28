package blog.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/blog")
public class BlogController {

   @RequestMapping(method=RequestMethod.GET)
   public @ResponseBody String listPosts(@RequestParam(value="name") String name) {
        return name;
    }
}
