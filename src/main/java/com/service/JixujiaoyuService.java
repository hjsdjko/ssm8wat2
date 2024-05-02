package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JixujiaoyuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JixujiaoyuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JixujiaoyuView;


/**
 * 继续教育
 *
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface JixujiaoyuService extends IService<JixujiaoyuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JixujiaoyuVO> selectListVO(Wrapper<JixujiaoyuEntity> wrapper);
   	
   	JixujiaoyuVO selectVO(@Param("ew") Wrapper<JixujiaoyuEntity> wrapper);
   	
   	List<JixujiaoyuView> selectListView(Wrapper<JixujiaoyuEntity> wrapper);
   	
   	JixujiaoyuView selectView(@Param("ew") Wrapper<JixujiaoyuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JixujiaoyuEntity> wrapper);
   	
}

