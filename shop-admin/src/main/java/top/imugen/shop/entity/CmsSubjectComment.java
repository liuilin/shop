package top.imugen.shop.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 专题评论表
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CmsSubjectComment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long subjectId;

    private String memberNickName;

    private String memberIcon;

    private String content;

    private LocalDateTime createTime;

    private Integer showStatus;


}
