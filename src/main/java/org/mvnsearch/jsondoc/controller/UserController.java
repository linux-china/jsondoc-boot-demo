package org.mvnsearch.jsondoc.controller;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiAuthToken;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.mvnsearch.jsondoc.domain.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * user controller
 *
 * @author linux_china
 */
@RestController
@Api(description = "会员服务", name = "UserService", group = "User")
@RequestMapping(value = "/user")
@ApiAuthToken(testtokens = "xxxxx")
public class UserController {

    @RequestMapping("/{id}")
    @ApiMethod(id = "Find_user_one", description = "根据会员ID查找会员", summary = "Gets a book given the book ID")
    public User show(@ApiPathParam(name = "id", description = "user id") @PathVariable Integer id, HttpServletRequest request) {
        User user = new User();
        user.setId(id);
        user.setName("jacky");
        return user;
    }
}
