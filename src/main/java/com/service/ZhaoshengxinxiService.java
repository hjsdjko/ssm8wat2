package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaoshengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaoshengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaoshengxinxiView;


/**
 * 招生信息
 *
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface ZhaoshengxinxiService extends IService<ZhaoshengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaoshengxinxiVO> selectListVO(Wrapper<ZhaoshengxinxiEntity> wrapper);
   	
   	ZhaoshengxinxiVO selectVO(@Param("ew") Wrapper<ZhaoshengxinxiEntity> wrapper);
   	
   	List<ZhaoshengxinxiView> selectListView(Wrapper<ZhaoshengxinxiEntity> wrapper);
   	
   	ZhaoshengxinxiView selectView(@Param("ew") Wrapper<ZhaoshengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaoshengxinxiEntity> wrapper);
   	
}

