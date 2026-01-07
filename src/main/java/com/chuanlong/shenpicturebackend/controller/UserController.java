package com.chuanlong.shenpicturebackend.controller;

import com.chuanlong.shenpicturebackend.common.BaseResponse;
import com.chuanlong.shenpicturebackend.common.ResultUtils;
import com.chuanlong.shenpicturebackend.exception.ErrorCode;
import com.chuanlong.shenpicturebackend.exception.ThrowUtils;
import com.chuanlong.shenpicturebackend.model.dto.UserLoginRequest;
import com.chuanlong.shenpicturebackend.model.dto.UserRegisterRequest;
import com.chuanlong.shenpicturebackend.model.vo.LoginUserVO;
import com.chuanlong.shenpicturebackend.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户注册
     */
    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        ThrowUtils.throwIf(userRegisterRequest == null, ErrorCode.PARAMS_ERROR);
        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        return ResultUtils.success(result);
    }

    @PostMapping("/login")
    public BaseResponse<LoginUserVO> userLogin(@RequestBody UserLoginRequest userLoginRequest, HttpServletRequest request) {
        ThrowUtils.throwIf(userLoginRequest == null, ErrorCode.PARAMS_ERROR);
        String userAccount = userLoginRequest.getUserAccount();
        String userPassword = userLoginRequest.getUserPassword();
        LoginUserVO loginUserVO = userService.userLogin(userAccount, userPassword, request);
        return ResultUtils.success(loginUserVO);
    }


}


