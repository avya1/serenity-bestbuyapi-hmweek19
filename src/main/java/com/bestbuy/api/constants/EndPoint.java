package com.bestbuy.api.constants;

public class EndPoint {

    /*****************for products*******************************/
    public static final String GET_ALL_THE_PRODUCTS = "/products";
    public static final String CREATE_NEW_PRODUCT = "/products";
    public static final String UPDATE_SINGLE_PRODUCT_BY_ID = "/{productID}";
    public static final String DELETE_SINGLE_PRODUCT_BY_ID = "/{productID}";

    /*******************FOR STORE********************************/
    public static final String GET_ALL_THE_STORES = "/stores";
    public static final String CREATE_NEW_STORE = "/stores";
    public static final String UPDATE_SINGLE_STORE_BY_ID = "/store/{ID}";
    public static final String DELETE_SINGLE_STORE_BY_ID = "/store/{ID}";
    /**********************FOR SERVICES***************************/
    public static final String GET_ALL_THE_SERVICES = "/services";
    public static final String CREATE_NEW_SERVICE = "/services";
    public static final String UPDATE_SINGLE_SERVICE_BY_ID = "/{serviceID}";
    public static final String DELETE_SINGLE_SERVICE_BY_ID = "/{serviceID}";
    /************************FOR CATEGORIES*****************************/
    public static final String GET_ALL_THE_CATEGORIES = "/categories";
    public static final String CREATE_NEW_CATEGORY = "/categories";
    public static final String UPDATE_SINGLE_CATEGORY_BY_ID = "/{categoriesID}";
    public static final String DELETE_SINGLE_CATEGORY_BY_ID = "/{categoriesID}";



}

