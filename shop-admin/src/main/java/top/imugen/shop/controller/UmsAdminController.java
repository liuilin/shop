package top.imugen.shop.controller;


import com.mugen.shop.common.api.CommonResult;
import com.mugen.shop.common.api.ResultCode;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import top.imugen.shop.dto.UmsAdminParam;
import top.imugen.shop.entity.UmsAdmin;
import top.imugen.shop.service.IUmsAdminService;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author Daniel Liu
 * @since 2019-08-03
 */
@RestController
@RequestMapping("/ums")
public class UmsAdminController {

    @Autowired
    IUmsAdminService adminService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody UmsAdminParam umsAdminParam, BindingResult result) {
        String token = adminService.login(umsAdminParam.getUsername(), umsAdminParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
//        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @PostMapping("/register")
    @ApiOperation("用户注册")
    public CommonResult register(@RequestBody UmsAdminParam umsAdminParam) {
        UmsAdmin umsAdmin = adminService.register(umsAdminParam);
        if (umsAdmin == null) {
            CommonResult.failed();
        }
        return CommonResult.success(umsAdminParam);
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.POST)
    public CommonResult remove(@PathVariable int id) {
        adminService.removeById(id);
        return CommonResult.success(ResultCode.SUCCESS);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<UmsAdmin> getById(@PathVariable int id) {
        UmsAdmin admin = adminService.getById(id);
        return CommonResult.success(admin);
    }

}
