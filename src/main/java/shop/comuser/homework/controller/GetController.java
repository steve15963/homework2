package shop.comuser.homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import shop.comuser.homework.domain.SearchParam;

@RestController
@RequestMapping("/api")
public class GetController {
    //@RequestMapping(method = RequestMethod.GET, path="/getMethod") //localhost:8080/api/getMethod
    @GetMapping("/getMethod")
    public String WellComePage() {

        return "WellCome";
    }
    @GetMapping("/getParameter")
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd){
        String password = "abc";
        System.out.println("id : "+id);
        System.out.println("password : "+ password);
        return id + "<br>" + password;
    }
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam, @RequestParam String id) {
        return searchParam;
    }
}
