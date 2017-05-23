package com.cuking.controller.common.requestParam;

/**
 * Created by cuking on 2017/4/20.
 */
public class PageListRequest {
    private String openId;
    private Integer pageNO = 1;
    private Integer pageSize = 10;
    private Integer shareTimeId;
    private Integer categoryId;
    private String orderS;
    private int orderType;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getPageNO() {
        return pageNO;
    }

    public void setPageNO(Integer pageNO) {
        this.pageNO = pageNO;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getShareTimeId() {
        return shareTimeId;
    }

    public void setShareTimeId(Integer shareTimeId) {
        this.shareTimeId = shareTimeId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getOrderS() {
        return orderS;
    }

    public void setOrderS(String orderS) {
        this.orderS = orderS;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }
}
