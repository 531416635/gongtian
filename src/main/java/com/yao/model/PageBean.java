package com.yao.model;

import java.io.Serializable;

/**
 * 分页插件
 * Description:
 * @author yaoyuxiao 
 * 创建时间：2017年9月23日 上午8:56:30
 */
public class PageBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8470697978259453214L;
	
	private int currentPage; // 当前页数
	private int rows; // 分页行数
	private int totalRow; // 总行数
	private int startPage;// 起始行
	private int endPage;// 结束行
	private int totalPage; // 总页数

	public PageBean(){
		
	}
	public PageBean(int currentPage,int rows,int totalRow){
		this.currentPage = currentPage;
		this.rows = rows;
		this.totalRow = totalRow;
		
		if (currentPage < 1) {
			currentPage = 1;
		} else {
			startPage = rows * (currentPage - 1);
		}
		this.currentPage = currentPage;
		totalPage = (totalRow + rows - 1) / rows;
		this.totalRow = totalRow;
		if (totalPage <= currentPage) {
			currentPage = totalPage;
			endPage = totalRow;
		}
		startPage = rows * (currentPage - 1);
		endPage = startPage + rows > totalRow ? totalRow : startPage
				+ rows;
	}

	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {

		return endPage;
	}

	public int getrows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getTotalRow() {
		return totalRow;
	}

	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}

	public int getTotalPage() {
		return this.totalPage;
	}
}
