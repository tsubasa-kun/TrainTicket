package com.wyt.trainticket.model.biz.interfaces;

import com.love_cookies.cookie_library.interfaces.CallBack;
import com.wyt.trainticket.model.bean.UserBean;

/**
 * Created by cookie on 2017/3/17 0017.
 * <p>
 * 登录逻辑接口
 */
public interface ILoginBiz {
    /**
     * 登录
     *
     * @param userBean 用户实体类
     * @param callBack 回调
     */
    void doLogin(UserBean userBean, CallBack callBack);
}
