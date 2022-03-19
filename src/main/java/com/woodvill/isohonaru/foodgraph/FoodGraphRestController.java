package com.woodvill.isohonaru.foodgraph;

import com.woodvill.isohonaru.foodgraph.service.FoodGraphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodGraphRestController {

    @Autowired
    FoodGraphService service;

    @RequestMapping(value="/isohonaru/foodRest")
    public String foodRest(){
        return "connected!!";
    }

    @RequestMapping(value="/isohonaru/getFood")
    public List getFood(){
        List rtnList = service.getFood();
        return rtnList;
    }
}
