package com.entity.vo;

import com.entity.PinpaizhuanyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 品牌专业
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public class PinpaizhuanyeVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
		
	/**
	 * 获奖材料
	 */
	
	private String huojiangcailiao;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 专业介绍
	 */
	
	private String zhuanyejieshao;
		
	/**
	 * 特色与创新
	 */
	
	private String teseyuchuangxin;
		
	/**
	 * 师生获奖情况
	 */
	
	private String shishenghuojiangqingkuang;
				
	
	/**
	 * 设置：封面图片
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
				
	
	/**
	 * 设置：获奖材料
	 */
	 
	public void setHuojiangcailiao(String huojiangcailiao) {
		this.huojiangcailiao = huojiangcailiao;
	}
	
	/**
	 * 获取：获奖材料
	 */
	public String getHuojiangcailiao() {
		return huojiangcailiao;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：专业介绍
	 */
	 
	public void setZhuanyejieshao(String zhuanyejieshao) {
		this.zhuanyejieshao = zhuanyejieshao;
	}
	
	/**
	 * 获取：专业介绍
	 */
	public String getZhuanyejieshao() {
		return zhuanyejieshao;
	}
				
	
	/**
	 * 设置：特色与创新
	 */
	 
	public void setTeseyuchuangxin(String teseyuchuangxin) {
		this.teseyuchuangxin = teseyuchuangxin;
	}
	
	/**
	 * 获取：特色与创新
	 */
	public String getTeseyuchuangxin() {
		return teseyuchuangxin;
	}
				
	
	/**
	 * 设置：师生获奖情况
	 */
	 
	public void setShishenghuojiangqingkuang(String shishenghuojiangqingkuang) {
		this.shishenghuojiangqingkuang = shishenghuojiangqingkuang;
	}
	
	/**
	 * 获取：师生获奖情况
	 */
	public String getShishenghuojiangqingkuang() {
		return shishenghuojiangqingkuang;
	}
			
}
