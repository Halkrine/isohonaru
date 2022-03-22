package com.woodvill.isohonaru.foodgraph;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FoodGraphRestController {


    /**
     * mockup crud test
     * @return
     */
    @RequestMapping(value="/isohonaru/foodRest")
    public String foodRest(){
        return "connected!!";
    }

    @RequestMapping(value="/isohonaru/foodRest/getList")
    public List getList(HttpServletRequest req, HttpServletResponse res){
        List rtnList = new ArrayList();

        // get list from gdb
        return rtnList;
    }

}
