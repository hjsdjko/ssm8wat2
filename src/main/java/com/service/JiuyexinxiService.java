package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuyexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiuyexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuyexinxiView;


/**
 * 就业信息
 *
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface JiuyexinxiService extends IService<JiuyexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiuyexinxiVO> selectListVO(Wrapper<JiuyexinxiEntity> wrapper);
   	
   	JiuyexinxiVO selectVO(@Param("ew") Wrapper<JiuyexinxiEntity> wrapper);
   	
   	List<JiuyexinxiView> selectListView(Wrapper<JiuyexinxiEntity> wrapper);
   	
   	JiuyexinxiView selectView(@Param("ew") Wrapper<JiuyexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiuyexinxiEntity> wrapper);
   	
}

