package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexiaogaikuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexiaogaikuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiaogaikuangView;


/**
 * 学校概况
 *
 * @author 
 * @email 
 * @date 2021-06-05 12:46:46
 */
public interface XuexiaogaikuangService extends IService<XuexiaogaikuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiaogaikuangVO> selectListVO(Wrapper<XuexiaogaikuangEntity> wrapper);
   	
   	XuexiaogaikuangVO selectVO(@Param("ew") Wrapper<XuexiaogaikuangEntity> wrapper);
   	
   	List<XuexiaogaikuangView> selectListView(Wrapper<XuexiaogaikuangEntity> wrapper);
   	
   	XuexiaogaikuangView selectView(@Param("ew") Wrapper<XuexiaogaikuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiaogaikuangEntity> wrapper);
   	
}

