package org.mvnsearch.jsondoc.controller;

import org.jsondoc.core.annotation.*;
import org.mvnsearch.jsondoc.document.DocumentationConstants;
import org.mvnsearch.jsondoc.domain.model.User;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.nio.charset.Charset;

import static org.hibernate.validator.internal.metadata.raw.ConfigurationSource.API;


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

    @RequestMapping("/{id}")
    @ApiMethod(id = "Find_user_one", description = "根据会员ID查找会员", summary = "Gets a book given the book ID")
    public User show(@ApiPathParam(name = "id", description = "user id") @PathVariable Integer id,
                     HttpServletRequest request, HttpServletResponse response) {
        User user = new User();
        user.setId(id);
        user.setName("jacky");
        return user;
    }

    @RequestMapping("/detail")
    @ApiMethod(description = "根据会员ID查找会员详情")
    public User detail(@ApiQueryParam(name = "id", description = "会员ID") @RequestParam Integer id,
                       HttpServletRequest request, HttpServletResponse response) {
        User user = new User();
        user.setId(id);
        user.setName("jacky");
        return user;
    }

    @RequestMapping(value = "/statics")
    @ApiMethod(id = "user statics", description = "根据会员ID查找会员", summary = "get statics")
    public String statics(HttpServletRequest request) throws Exception {
        try (InputStream in = this.getClass().getResourceAsStream("/jsondoc/mock/statics.json")) {
            return StreamUtils.copyToString(in, Charset.forName("utf-8"));
        }
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE)
    @ApiMethod(description = "会员注册")
    public String doRegistration(@ApiQueryParam(name = "email", description = "账号邮箱") @RequestParam String email,
                                 @ApiQueryParam(name = "password", description = "账号密码", format = "\\W{6+}") @RequestParam String password,
                                 @ApiQueryParam(name = "nick", description = "账号昵称") @RequestParam String nick,
                                 HttpServletRequest request, HttpServletResponse response) {
        return "goood";
    }
}
