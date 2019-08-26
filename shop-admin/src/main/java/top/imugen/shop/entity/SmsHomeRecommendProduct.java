package top.imugen.shop.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 人气推荐商品表
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SmsHomeRecommendProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long productId;

    private String productName;

    private Integer recommendStatus;

    private Integer sort;


}
