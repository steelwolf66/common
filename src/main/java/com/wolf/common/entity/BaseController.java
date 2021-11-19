package com.wolf.common.entity;

import com.wolf.common.utils.ContextHolder;
import com.wolf.common.utils.HttpUtils;
import com.wolf.common.utils.UuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Optional;

public abstract class BaseController {
    protected static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    public BaseController() {
    }

    protected Optional<UserInfo> getUserInfo() {
        return ContextHolder.getUserInfo();
    }

    protected HttpServletRequest getRequest() {
        return HttpUtils.getRequest();
    }

    protected HttpServletResponse getResponse() {
        return HttpUtils.getResponse();
    }

    protected HttpSession getSession() {
        return HttpUtils.getRequest().getSession();
    }

    protected String get32Uuid() {
        return UuidUtil.get32Uuid();
    }

    protected String get40Uuid() {
        return UuidUtil.get40Uuid();
    }
}
