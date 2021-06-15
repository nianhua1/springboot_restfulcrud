package com.teng.restfulcrud.excption;

/**
 * @author shkstart
 * @create 2021-06-12 22:13
 */
public class UserNameNotExsits extends RuntimeException {
    public UserNameNotExsits() {
        super("用户不存在");
    }
}
