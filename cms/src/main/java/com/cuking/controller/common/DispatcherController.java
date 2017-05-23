package com.cuking.controller.common;

import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhaoyixin on 16/9/7.
 */
public class DispatcherController extends DispatcherServlet {

    @Override
    public void doDispatch(HttpServletRequest request, HttpServletResponse response) {
        try {
            super.doDispatch(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
