package top.imugen.shop.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 优惠券使用、领取历史表
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SmsCouponHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long couponId;

    private Long memberId;

    private String couponCode;

    /**
     * 领取人昵称
     */
    private String memberNickname;

    /**
     * 获取类型：0->后台赠送；1->主动获取
     */
    private Integer getType;

    private LocalDateTime createTime;

    /**
     * 使用状态：0->未使用；1->已使用；2->已过期
     */
    private Integer useStatus;

    /**
     * 使用时间
     */
    private LocalDateTime useTime;

    /**
     * 订单编号
     */
    private Long orderId;

    /**
     * 订单号码
     */
    private String orderSn;


}
