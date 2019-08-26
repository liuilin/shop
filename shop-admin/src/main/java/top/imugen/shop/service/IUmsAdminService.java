package top.imugen.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.imugen.shop.dto.UmsAdminParam;
import top.imugen.shop.entity.UmsAdmin;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
public interface IUmsAdminService extends IService<UmsAdmin> {

    /**用户登录
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT token信息
     */
    String login(String username, String password);

    /**用户注册
     * @param umsAdminParam
     * @return
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);
}
