package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshenggongzuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshenggongzuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshenggongzuoView;


/**
 * 学生工作
 *
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface XueshenggongzuoService extends IService<XueshenggongzuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshenggongzuoVO> selectListVO(Wrapper<XueshenggongzuoEntity> wrapper);
   	
   	XueshenggongzuoVO selectVO(@Param("ew") Wrapper<XueshenggongzuoEntity> wrapper);
   	
   	List<XueshenggongzuoView> selectListView(Wrapper<XueshenggongzuoEntity> wrapper);
   	
   	XueshenggongzuoView selectView(@Param("ew") Wrapper<XueshenggongzuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshenggongzuoEntity> wrapper);
   	
}

