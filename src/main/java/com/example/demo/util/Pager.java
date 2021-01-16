package com.example.demo.util;

import java.util.List;

public class Pager<T> {
    private int page;//分页起始页
    private int lastPage;//最后分页
    private int size;//每页记录数
    private  static int PAGE_LENG=5;
    private List<T> rows;//返回的记录集合
    private List<String> signs;//标记
    private long total;//总记录条数
    private String msg;//分页状态信息
   private String category;
   private String lab;

    public static void setPageLeng(int pageLeng) {
        PAGE_LENG = pageLeng;
    }

    public static int getPageLeng() {
        return PAGE_LENG;
    }

    public List<String> getSigns() {
        return signs;
    }

    public void setSigns(List<String> signs) {
        this.signs = signs;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public List<T> getRows() {
        return rows;
    }
    public void setRows(List<T> rows) {
        this.rows = rows;
    }
    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }

}
