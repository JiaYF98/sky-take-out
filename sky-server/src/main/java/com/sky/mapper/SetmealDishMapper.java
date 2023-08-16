package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据 dishId 查询套餐的数量
     *
     * @param dishIds
     * @return
     */
    Long getSetmealIdsByDishIds(List<Long> dishIds);

    /**
     * 批量插入套餐中的菜品
     *
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);

    /**
     * 根据套餐id批量删除套餐中的菜品
     *
     * @param setmealIds
     */
    void deleteBatchBySetmealIds(List<Long> setmealIds);

    /**
     * 根据套餐id查询套餐中的菜品
     *
     * @param setmealId
     * @return
     */

    @Select("select * from setmeal_dish where setmeal_id = #{setmealId}")
    List<SetmealDish> getsBySetmealId(Long setmealId);
}
