package com.entity.view;

import com.entity.JixujiaoyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 继续教育
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
@TableName("jixujiaoyu")
public class JixujiaoyuView  extends JixujiaoyuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JixujiaoyuView(){
	}
 
 	public JixujiaoyuView(JixujiaoyuEntity jixujiaoyuEntity){
 	try {
			BeanUtils.copyProperties(this, jixujiaoyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
