package com.entity.vo;

import com.entity.XuexiaogaikuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学校概况
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-06-05 12:46:46
 */
public class XuexiaogaikuangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 英文名
	 */
	
	private String yingwenming;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 校园面积
	 */
	
	private String xiaoyuanmianji;
		
	/**
	 * 创办时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangbanshijian;
		
	/**
	 * 所在国家
	 */
	
	private String suozaiguojia;
		
	/**
	 * 学校地址
	 */
	
	private String xuexiaodizhi;
		
	/**
	 * 办学性质
	 */
	
	private String banxuexingzhi;
		
	/**
	 * 学校介绍
	 */
	
	private String xuexiaojieshao;
		
	/**
	 * 组织机构
	 */
	
	private String zuzhijigou;
		
	/**
	 * 学校领导
	 */
	
	private String xuexiaolingdao;
		
	/**
	 * 发展规划
	 */
	
	private String fazhanguihua;
				
	
	/**
	 * 设置：英文名
	 */
	 
	public void setYingwenming(String yingwenming) {
		this.yingwenming = yingwenming;
	}
	
	/**
	 * 获取：英文名
	 */
	public String getYingwenming() {
		return yingwenming;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：校园面积
	 */
	 
	public void setXiaoyuanmianji(String xiaoyuanmianji) {
		this.xiaoyuanmianji = xiaoyuanmianji;
	}
	
	/**
	 * 获取：校园面积
	 */
	public String getXiaoyuanmianji() {
		return xiaoyuanmianji;
	}
				
	
	/**
	 * 设置：创办时间
	 */
	 
	public void setChuangbanshijian(Date chuangbanshijian) {
		this.chuangbanshijian = chuangbanshijian;
	}
	
	/**
	 * 获取：创办时间
	 */
	public Date getChuangbanshijian() {
		return chuangbanshijian;
	}
				
	
	/**
	 * 设置：所在国家
	 */
	 
	public void setSuozaiguojia(String suozaiguojia) {
		this.suozaiguojia = suozaiguojia;
	}
	
	/**
	 * 获取：所在国家
	 */
	public String getSuozaiguojia() {
		return suozaiguojia;
	}
				
	
	/**
	 * 设置：学校地址
	 */
	 
	public void setXuexiaodizhi(String xuexiaodizhi) {
		this.xuexiaodizhi = xuexiaodizhi;
	}
	
	/**
	 * 获取：学校地址
	 */
	public String getXuexiaodizhi() {
		return xuexiaodizhi;
	}
				
	
	/**
	 * 设置：办学性质
	 */
	 
	public void setBanxuexingzhi(String banxuexingzhi) {
		this.banxuexingzhi = banxuexingzhi;
	}
	
	/**
	 * 获取：办学性质
	 */
	public String getBanxuexingzhi() {
		return banxuexingzhi;
	}
				
	
	/**
	 * 设置：学校介绍
	 */
	 
	public void setXuexiaojieshao(String xuexiaojieshao) {
		this.xuexiaojieshao = xuexiaojieshao;
	}
	
	/**
	 * 获取：学校介绍
	 */
	public String getXuexiaojieshao() {
		return xuexiaojieshao;
	}
				
	
	/**
	 * 设置：组织机构
	 */
	 
	public void setZuzhijigou(String zuzhijigou) {
		this.zuzhijigou = zuzhijigou;
	}
	
	/**
	 * 获取：组织机构
	 */
	public String getZuzhijigou() {
		return zuzhijigou;
	}
				
	
	/**
	 * 设置：学校领导
	 */
	 
	public void setXuexiaolingdao(String xuexiaolingdao) {
		this.xuexiaolingdao = xuexiaolingdao;
	}
	
	/**
	 * 获取：学校领导
	 */
	public String getXuexiaolingdao() {
		return xuexiaolingdao;
	}
				
	
	/**
	 * 设置：发展规划
	 */
	 
	public void setFazhanguihua(String fazhanguihua) {
		this.fazhanguihua = fazhanguihua;
	}
	
	/**
	 * 获取：发展规划
	 */
	public String getFazhanguihua() {
		return fazhanguihua;
	}
			
}
