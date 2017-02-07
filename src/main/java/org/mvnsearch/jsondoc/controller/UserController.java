package org.mvnsearch.jsondoc.controller;

import org.jsondoc.core.annotation.*;
import org.mvnsearch.jsondoc.document.DocumentationConstants;
import org.mvnsearch.jsondoc.domain.model.User;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.nio.charset.Charset;


/**
 * user controller
 *
 * @author linux_china
 */
@RestController
@Api(description = "会员服务", name = "UserService", group = DocumentationConstants.GROUP_USER)
@RequestMapping(value = "/user")
@ApiAuthToken(testtokens = DocumentationConstants.AUTHORIZATION)
public class UserController {

    @GetMapping("/{id}")
    @ApiMethod(id = "Find_user_one", description = "根据会员ID查找会员", summary = "Gets a book given the book ID")
    public User show(@ApiPathParam(name = "id", description = "user id") @PathVariable Integer id,
                     HttpServletRequest request, HttpServletResponse response) {
        User user = new User();
        user.setId(id);
        user.setName("jacky");
        return user;
    }

    @GetMapping("/detail")
    @ApiMethod(description = "根据会员ID查找会员详情")
    public User detail(@ApiQueryParam(name = "id", description = "会员ID") @RequestParam Integer id,
                       HttpServletRequest request, HttpServletResponse response) {
        User user = new User();
        user.setId(id);
        user.setName("jacky");
        return user;
    }

    @GetMapping(value = "/statics")
    @ApiMethod(id = "user statics", description = "根据会员ID查找会员", summary = "get statics")
    public String statics(HttpServletRequest request) throws Exception {
        try (InputStream in = this.getClass().getResourceAsStream("/jsondoc/mock/statics.json")) {
            return StreamUtils.copyToString(in, Charset.forName("utf-8"));
        }
    }

    @PostMapping(value = "/registration", produces = MediaType.TEXT_PLAIN_VALUE)
    @ApiMethod(description = "会员注册")
    @ApiAuthNone
    public String doRegistration(@ApiQueryParam(name = "email", description = "账号邮箱", format = "email") @RequestParam String email,
                                 @ApiQueryParam(name = "password", description = "账号密码", format = "password") @RequestParam String password,
                                 @ApiQueryParam(name = "nick", description = "账号昵称, 4-12位", format = "\\w{4,12}") @RequestParam String nick,
                                 HttpServletRequest request, HttpServletResponse response) {
        return "good";
    }
}
