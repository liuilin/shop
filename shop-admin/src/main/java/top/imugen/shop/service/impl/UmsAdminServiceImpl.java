package top.imugen.shop.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.imugen.shop.dto.UmsAdminParam;
import top.imugen.shop.entity.UmsAdmin;
import top.imugen.shop.mapper.UmsAdminMapper;
import top.imugen.shop.service.IUmsAdminService;

import java.util.Date;
//import top.imugen.shop.util.JwtTokenUtil;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@Service
public class UmsAdminServiceImpl extends ServiceImpl<UmsAdminMapper, UmsAdmin> implements IUmsAdminService {

    /**
     * logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);
    /*@Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;*/
    /*@Autowired
    private JwtTokenUtil jwtTokenUtil;*/
    @Autowired
    private UmsAdminMapper adminMapper;

    @Override

    public String login(String username, String password) {
        String token = "null";
        //密码需要客户端加密后传递
/*
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
//            token = jwtTokenUtil.generateToken(userDetails);
            token = "123";
//            updateLoginTimeByUsername(username);
//            insertLoginLog(username);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
*/
        return token;
    }

    @Override
    public UmsAdmin register(UmsAdminParam umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        //查询用户名是否有重复
        Integer count = adminMapper.selectCount(new QueryWrapper<UmsAdmin>().lambda().eq(UmsAdmin::getUsername, umsAdmin.getUsername()));
        if (count > 0) {
            return null;
        }
        adminMapper.insert(umsAdmin);
        return umsAdmin;
    }
}
