package com.wolf.common.utils;

import com.wolf.common.entity.UserInfo;

import java.util.Optional;

public class ContextHolder {

    public static Optional<UserInfo> getUserInfo() {
        return Optional.ofNullable(
                HttpUtils.getRequest()).map(r -> {
            return r.getSession(false);
        }).map(s -> {
            return s.getAttribute("userInfo");
        }).map(u -> {
            return (UserInfo) u;
        });
    }

}
