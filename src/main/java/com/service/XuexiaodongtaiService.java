package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexiaodongtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexiaodongtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiaodongtaiView;


/**
 * 学校动态
 *
 * @author 
 * @email 
 * @date 2021-06-05 12:46:46
 */
public interface XuexiaodongtaiService extends IService<XuexiaodongtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiaodongtaiVO> selectListVO(Wrapper<XuexiaodongtaiEntity> wrapper);
   	
   	XuexiaodongtaiVO selectVO(@Param("ew") Wrapper<XuexiaodongtaiEntity> wrapper);
   	
   	List<XuexiaodongtaiView> selectListView(Wrapper<XuexiaodongtaiEntity> wrapper);
   	
   	XuexiaodongtaiView selectView(@Param("ew") Wrapper<XuexiaodongtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiaodongtaiEntity> wrapper);
   	
}

