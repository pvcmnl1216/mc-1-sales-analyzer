package com.jap.sales;

import java.util.Date;

public class SalesRecord {
    private String date;
    private int customer_id;
    private int product_category;
    private String payment_method;
    private double amount;
    private double time_on_site;
    private int clicks_in_site;


    // Generate Constructors

    public SalesRecord(String date, int customer_id, int product_category, String payment_method, double amount, double time_on_site, int clicks_in_site) {
        this.date = date;
        this.customer_id = customer_id;
        this.product_category = product_category;
        this.payment_method = payment_method;
        this.amount = amount;
        this.time_on_site = time_on_site;
        this.clicks_in_site = clicks_in_site;
    }

    // Generate Getters and Setters

    // Generate the toString method

}
