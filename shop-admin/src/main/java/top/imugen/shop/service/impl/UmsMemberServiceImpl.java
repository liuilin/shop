package top.imugen.shop.service.impl;

import top.imugen.shop.entity.UmsMember;
import top.imugen.shop.mapper.UmsMemberMapper;
import top.imugen.shop.service.IUmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements IUmsMemberService {

}
