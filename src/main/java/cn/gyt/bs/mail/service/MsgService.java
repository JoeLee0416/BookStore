package cn.gyt.bs.mail.service;


import cn.gyt.bs.mail.entity.Mail;

/**
 * <p>Title: MsgService</p>
 * <p>Description: </p>
 *
 * @author lizihao
 * @version 1.0.0
 * @date 2019/9/2 15:30
 */
public interface MsgService {


    /**
     * 发送简单邮件
     *
     * @param mail
     */
    void send(Mail mail);
}
