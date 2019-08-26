package top.imugen.shop.service.impl;

import top.imugen.shop.entity.SmsCouponHistory;
import top.imugen.shop.mapper.SmsCouponHistoryMapper;
import top.imugen.shop.service.ISmsCouponHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 优惠券使用、领取历史表 服务实现类
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Service
public class SmsCouponHistoryServiceImpl extends ServiceImpl<SmsCouponHistoryMapper, SmsCouponHistory> implements ISmsCouponHistoryService {

}
