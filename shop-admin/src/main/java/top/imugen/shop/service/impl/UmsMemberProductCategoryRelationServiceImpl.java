package top.imugen.shop.service.impl;

import top.imugen.shop.entity.UmsMemberProductCategoryRelation;
import top.imugen.shop.mapper.UmsMemberProductCategoryRelationMapper;
import top.imugen.shop.service.IUmsMemberProductCategoryRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员与产品分类关系表（用户喜欢的分类） 服务实现类
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Service
public class UmsMemberProductCategoryRelationServiceImpl extends ServiceImpl<UmsMemberProductCategoryRelationMapper, UmsMemberProductCategoryRelation> implements IUmsMemberProductCategoryRelationService {

}
