package top.imugen.shop.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 相册表
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PmsAlbum implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String coverPic;

    private Integer picCount;

    private Integer sort;

    private String description;


}
