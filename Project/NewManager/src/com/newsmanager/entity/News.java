package com.newsmanager.entity;

import java.util.Date;

/**
 * 新闻表对应的实体类
 */
public class News {

	private Integer newsId;
	private String newsTitle;
	private String newsContent;
	private String newsStatus;
	private String newsType;
	private Date createTime;
	public News() {
		
	}
	public News(Integer newsId, String newTitle, String newsContent, String newsStatus, String newsType,
			Date createTime) {
		super();
		this.newsId = newsId;
		this.newsTitle = newTitle;
		this.newsContent = newsContent;
		this.newsStatus = newsStatus;
		this.newsType = newsType;
		this.createTime = createTime;
	}
	public Integer getNewsId() {
		return newsId;
	}
	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newTitle) {
		this.newsTitle = newTitle;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getNewsStatus() {
		return newsStatus;
	}
	public void setNewsStatus(String newsStatus) {
		this.newsStatus = newsStatus;
	}
	public String getNewsType() {
		return newsType;
	}
	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
