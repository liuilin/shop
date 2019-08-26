package top.imugen.shop.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 限时购通知记录
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SmsFlashPromotionLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer memberId;

    private Long productId;

    private String memberPhone;

    private String productName;

    /**
     * 会员订阅时间
     */
    private LocalDateTime subscribeTime;

    private LocalDateTime sendTime;


}
