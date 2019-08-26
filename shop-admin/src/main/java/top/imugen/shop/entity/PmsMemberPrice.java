package top.imugen.shop.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品会员价格表
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PmsMemberPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long productId;

    private Long memberLevelId;

    /**
     * 会员价格
     */
    private BigDecimal memberPrice;

    private String memberLevelName;


}
