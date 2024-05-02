package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxueguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoxueguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxueguanliView;


/**
 * 教学管理
 *
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface JiaoxueguanliService extends IService<JiaoxueguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoxueguanliVO> selectListVO(Wrapper<JiaoxueguanliEntity> wrapper);
   	
   	JiaoxueguanliVO selectVO(@Param("ew") Wrapper<JiaoxueguanliEntity> wrapper);
   	
   	List<JiaoxueguanliView> selectListView(Wrapper<JiaoxueguanliEntity> wrapper);
   	
   	JiaoxueguanliView selectView(@Param("ew") Wrapper<JiaoxueguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoxueguanliEntity> wrapper);
   	
}

