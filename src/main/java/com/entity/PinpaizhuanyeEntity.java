package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 品牌专业
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
@TableName("pinpaizhuanye")
public class PinpaizhuanyeEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PinpaizhuanyeEntity() {
		
	}
	
	public PinpaizhuanyeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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
