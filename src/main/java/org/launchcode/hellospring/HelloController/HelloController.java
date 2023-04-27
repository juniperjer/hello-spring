package org.launchcode.hellospring.HelloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value= "hello",method = {RequestMethod.GET, RequestMethod.POST})
public class HelloController {
    //for get requests, request to root path
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello Spring!";
//    }

//    public String helloWithQueryParam(@RequestParam String name){//@requestparam for including params within the query
//        return "hello "+ name;
//    }

    //handles request of the form /hello/LaunchCode (this is part of the path)
    //this is different from the commented out one because it is handling with the {name}
    @GetMapping("hello/{name}")
    public String hellowWithPathParam(@PathVariable String name){
        return "Hello"+ name;
    }
    //sends form data
    //now lives at hello/form
    @GetMapping("form")
    public String helloForm(){
        return "form";
    }

}
