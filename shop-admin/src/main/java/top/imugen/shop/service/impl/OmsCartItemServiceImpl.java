package top.imugen.shop.service.impl;

import top.imugen.shop.entity.OmsCartItem;
import top.imugen.shop.mapper.OmsCartItemMapper;
import top.imugen.shop.service.IOmsCartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Service
public class OmsCartItemServiceImpl extends ServiceImpl<OmsCartItemMapper, OmsCartItem> implements IOmsCartItemService {

}
