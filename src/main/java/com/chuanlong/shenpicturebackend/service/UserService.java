package com.chuanlong.shenpicturebackend.service;

import com.chuanlong.shenpicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chuanlong.shenpicturebackend.model.vo.LoginUserVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author echollk
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2026-01-07 01:19:00
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);


    /**
     * 获取加密后的密码
     *
     * @param userPassword 原始密码
     * @return 加密后的密码
     */
    String getEncryptPassword(String userPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request httpRequest 请求方便设置 cookie
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 获取脱敏的已登录用户信息
     *
     * @return 脱敏的已登录用户信息
     */
    LoginUserVO getLoginUserVO(User user);

}


