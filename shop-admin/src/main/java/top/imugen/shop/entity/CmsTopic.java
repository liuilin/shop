package top.imugen.shop.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 话题表
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CmsTopic implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long categoryId;

    private String name;

    private LocalDateTime createTime;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    /**
     * 参与人数
     */
    private Integer attendCount;

    /**
     * 关注人数
     */
    private Integer attentionCount;

    private Integer readCount;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 参与方式
     */
    private String attendType;

    /**
     * 话题内容
     */
    private String content;


}
