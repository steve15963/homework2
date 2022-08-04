package shop.comuser.homework.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.comuser.homework.domain.SearchParam;

@RestController
@RequestMapping("/api")
public class PostController {
    //@RequestMapping(method = RequestMethod.POST, path="postMethod")
    @PostMapping("/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam) {
        return searchParam;
    }
}