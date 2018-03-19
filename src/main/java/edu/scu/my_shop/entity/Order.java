package edu.scu.my_shop.entity;

import java.util.Date;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.order_id
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.order_date
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    private Date orderDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.user_id
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.address_id
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    private String addressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.order_status
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    private String orderStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.order_id
     *
     * @return the value of user_order.order_id
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.order_id
     *
     * @param orderId the value for user_order.order_id
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.order_date
     *
     * @return the value of user_order.order_date
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.order_date
     *
     * @param orderDate the value for user_order.order_date
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.user_id
     *
     * @return the value of user_order.user_id
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.user_id
     *
     * @param userId the value for user_order.user_id
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.address_id
     *
     * @return the value of user_order.address_id
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.address_id
     *
     * @param addressId the value for user_order.address_id
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId == null ? null : addressId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.order_status
     *
     * @return the value of user_order.order_status
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.order_status
     *
     * @param orderStatus the value for user_order.order_status
     *
     * @mbg.generated Mon Mar 19 16:09:34 CST 2018
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }
}