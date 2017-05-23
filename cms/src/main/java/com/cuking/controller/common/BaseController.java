package com.cuking.controller.common;

import com.cuking.core.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class BaseController {

    Logger logger = LoggerFactory.getLogger(BaseController.class);

    protected int currentPage = 1;

    protected int pageSize = 10;

    protected String ERROR = "";

    protected String WEB_ROOT = "index";



    @ExceptionHandler(Exception.class)
    public
    @ResponseBody
    ResponseVo exceptionHandler(Exception e) {
        logger.error("failure", e);
        return ResponseVo.ERROR();
    }


    @ExceptionHandler(BusinessException.class)
    public
    @ResponseBody
    ResponseVo exceptionHandler(BusinessException e) {
        return ResponseVo.ERROR(e);
    }

}
