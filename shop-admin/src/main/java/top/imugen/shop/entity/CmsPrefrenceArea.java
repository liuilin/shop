package top.imugen.shop.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 优选专区
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CmsPrefrenceArea implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String subTitle;

    /**
     * 展示图片
     */
    private byte[] pic;

    private Integer sort;

    private Integer showStatus;


}
