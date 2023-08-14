package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    Long getSetmealIdsByDishIds(List<Long> dishIds);

}
