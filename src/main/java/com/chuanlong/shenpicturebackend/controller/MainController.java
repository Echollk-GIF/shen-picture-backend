package com.chuanlong.shenpicturebackend.controller;

import com.chuanlong.shenpicturebackend.common.BaseResponse;
import com.chuanlong.shenpicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 接口测试
     */
    @GetMapping("/test")
    public BaseResponse<String> test() {
        return ResultUtils.success("ok");
    }

}
