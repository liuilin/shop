package top.imugen.shop.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 积分消费设置
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UmsIntegrationConsumeSetting implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 每一元需要抵扣的积分数量
     */
    private Integer deductionPerAmount;

    /**
     * 每笔订单最高抵用百分比
     */
    private Integer maxPercentPerOrder;

    /**
     * 每次使用积分最小单位100
     */
    private Integer useUnit;

    /**
     * 是否可以和优惠券同用；0->不可以；1->可以
     */
    private Integer couponStatus;


}
