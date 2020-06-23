/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package com.liu.dianmall.common.handler;

import com.alibaba.fastjson.JSONObject;
import com.liu.dianmall.common.basic.ResponseResult;
import com.liu.dianmall.common.basic.ResponseResultManager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 全局异常捕获
 * @author 
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public ResponseResult<JSONObject> exceptionHandler(Exception e) {
		log.info("全局异常捕获,error:{}", e);
		return ResponseResultManager.setResultError("系统发生错误，请及时调整");
	}
}
