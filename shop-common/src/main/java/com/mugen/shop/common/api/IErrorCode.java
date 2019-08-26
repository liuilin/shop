package com.mugen.shop.common.api;

/**封装api的错误码
 * @author Daniel Liu 2019/7/7 23:03
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
