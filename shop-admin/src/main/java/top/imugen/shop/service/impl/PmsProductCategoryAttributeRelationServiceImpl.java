package top.imugen.shop.service.impl;

import top.imugen.shop.entity.PmsProductCategoryAttributeRelation;
import top.imugen.shop.mapper.PmsProductCategoryAttributeRelationMapper;
import top.imugen.shop.service.IPmsProductCategoryAttributeRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） 服务实现类
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Service
public class PmsProductCategoryAttributeRelationServiceImpl extends ServiceImpl<PmsProductCategoryAttributeRelationMapper, PmsProductCategoryAttributeRelation> implements IPmsProductCategoryAttributeRelationService {

}
