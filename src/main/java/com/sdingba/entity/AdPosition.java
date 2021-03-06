package com.sdingba.entity;

import java.io.Serializable;

public class AdPosition implements Serializable {
    /**
     * 自增主键
     * 表字段 : ad_position.id
     * @mbggenerated
     */
    private Integer id;

    /**
     * 
     * 表字段 : ad_position.ad_name
     * @mbggenerated
     */
    private String adName;

    /**
     * 
     * 表字段 : ad_position.media_source
     * @mbggenerated
     */
    private String mediaSource;

    /**
     * 
     * 表字段 : ad_position.platform
     * @mbggenerated
     */
    private Integer platform;

    /**
     * 
     * 表字段 : ad_position.width
     * @mbggenerated
     */
    private Integer width;

    /**
     * 
     * 表字段 : ad_position.height
     * @mbggenerated
     */
    private Integer height;

    /**
     * 
     * 表字段 : ad_position.image_num
     * @mbggenerated
     */
    private Integer imageNum;

    /**
     * 
     * 表字段 : ad_position.image_type
     * @mbggenerated
     */
    private String imageType;

    /**
     * 
     * 表字段 : ad_position.comment
     * @mbggenerated
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ad_position
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_position.id
     *
     * @return the value of ad_position.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_position.id
     *
     * @param id the value for ad_position.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_position.ad_name
     *
     * @return the value of ad_position.ad_name
     *
     * @mbggenerated
     */
    public String getAdName() {
        return adName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_position.ad_name
     *
     * @param adName the value for ad_position.ad_name
     *
     * @mbggenerated
     */
    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_position.media_source
     *
     * @return the value of ad_position.media_source
     *
     * @mbggenerated
     */
    public String getMediaSource() {
        return mediaSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_position.media_source
     *
     * @param mediaSource the value for ad_position.media_source
     *
     * @mbggenerated
     */
    public void setMediaSource(String mediaSource) {
        this.mediaSource = mediaSource == null ? null : mediaSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_position.platform
     *
     * @return the value of ad_position.platform
     *
     * @mbggenerated
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_position.platform
     *
     * @param platform the value for ad_position.platform
     *
     * @mbggenerated
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_position.width
     *
     * @return the value of ad_position.width
     *
     * @mbggenerated
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_position.width
     *
     * @param width the value for ad_position.width
     *
     * @mbggenerated
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_position.height
     *
     * @return the value of ad_position.height
     *
     * @mbggenerated
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_position.height
     *
     * @param height the value for ad_position.height
     *
     * @mbggenerated
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_position.image_num
     *
     * @return the value of ad_position.image_num
     *
     * @mbggenerated
     */
    public Integer getImageNum() {
        return imageNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_position.image_num
     *
     * @param imageNum the value for ad_position.image_num
     *
     * @mbggenerated
     */
    public void setImageNum(Integer imageNum) {
        this.imageNum = imageNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_position.image_type
     *
     * @return the value of ad_position.image_type
     *
     * @mbggenerated
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_position.image_type
     *
     * @param imageType the value for ad_position.image_type
     *
     * @mbggenerated
     */
    public void setImageType(String imageType) {
        this.imageType = imageType == null ? null : imageType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_position.comment
     *
     * @return the value of ad_position.comment
     *
     * @mbggenerated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_position.comment
     *
     * @param comment the value for ad_position.comment
     *
     * @mbggenerated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}