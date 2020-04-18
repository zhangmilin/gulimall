package com.gulimall.member.feign;

import com.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhangfeng
 * @date 2020/4/18 4:11 下午
 */
@FeignClient("coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/getCouponList")
    R getCouponList();
}
