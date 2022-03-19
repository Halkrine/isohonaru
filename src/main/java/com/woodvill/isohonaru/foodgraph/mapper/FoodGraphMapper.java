package com.woodvill.isohonaru.foodgraph.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodGraphMapper {

    void setGraphPath();

    List getFoodList();
}
