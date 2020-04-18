package com.gulimall.order.dao;

import com.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhangfeng
 * @email 908980328@qq.com
 * @date 2020-04-18 13:28:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
