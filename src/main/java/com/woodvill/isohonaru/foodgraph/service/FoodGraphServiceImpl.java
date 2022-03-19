package com.woodvill.isohonaru.foodgraph.service;

import com.woodvill.isohonaru.foodgraph.mapper.FoodGraphMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodGraphServiceImpl implements FoodGraphService{

    @Autowired
    FoodGraphMapper mapper;

    public List getFood(){
        mapper.setGraphPath();;
        List rtnList = mapper.getFoodList();

        return rtnList;
    }

}
