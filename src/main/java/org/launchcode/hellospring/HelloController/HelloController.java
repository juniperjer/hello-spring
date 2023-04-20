package org.launchcode.hellospring.HelloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    //for get requests, request to root path
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello Spring!";
//    }
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name){//@requestparam for including params within the query
        return "hello "+ name;
    }

    //handles request of the form /hello/LaunchCode (this is part of the path)
    //this is different from the commented out one because it is handling with the {name}
    @GetMapping("{name}")
    public String hellowWithPathParam(@PathVariable String name){
        return "Hello"+ name;
    }
    //sends form data
    //now lives at hello/form
    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action= 'hello' method = 'post'>" + //submit a request to /hello
                "<input type = 'text' name= 'name'>" +
                "<input type = 'submit' value ='Greet Me'>" +
                "</form>" +
                "</body>" +
                "<html>";
    }
    @GetMapping("form")
    public String helloSelect(){
        return "<label for= 'helloSelect'>" +
                    "<select name= 'language'>" +
                        "<option value 'Tagalog'>Tagalog</option>" +
                        "<option value 'English'>English</option>" +
                    "</select>" +
                "</label>";
    }

}
