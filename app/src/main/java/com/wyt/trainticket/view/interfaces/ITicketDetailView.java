package com.wyt.trainticket.view.interfaces;

import com.wyt.trainticket.model.bean.OrderBean;

/**
 * Created by cookie on 2017/3/21 0021.
 * <p>
 * 车票详情View接口
 */
public interface ITicketDetailView {
    /**
     * 提交
     */
    void doSubmit();

    /**
     * 支付成功
     *
     * @param orderBean
     */
    void paySuccess(OrderBean orderBean);

    /**
     * 支付失败
     *
     * @param msg
     */
    void payFailed(String msg);
}
