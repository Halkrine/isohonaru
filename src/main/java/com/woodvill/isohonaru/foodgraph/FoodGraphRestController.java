package com.woodvill.isohonaru.foodgraph;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodGraphRestController {


    @RequestMapping(value="/isohonaru/foodRest")
    public String foodRest(){
        return "connected!!";
    }
}
