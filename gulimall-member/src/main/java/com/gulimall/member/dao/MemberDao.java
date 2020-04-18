package com.gulimall.member.dao;

import com.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangfeng
 * @email 908980328@qq.com
 * @date 2020-04-18 13:10:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
