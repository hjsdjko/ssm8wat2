package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PinpaizhuanyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PinpaizhuanyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PinpaizhuanyeView;


/**
 * 品牌专业
 *
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface PinpaizhuanyeService extends IService<PinpaizhuanyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PinpaizhuanyeVO> selectListVO(Wrapper<PinpaizhuanyeEntity> wrapper);
   	
   	PinpaizhuanyeVO selectVO(@Param("ew") Wrapper<PinpaizhuanyeEntity> wrapper);
   	
   	List<PinpaizhuanyeView> selectListView(Wrapper<PinpaizhuanyeEntity> wrapper);
   	
   	PinpaizhuanyeView selectView(@Param("ew") Wrapper<PinpaizhuanyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PinpaizhuanyeEntity> wrapper);
   	
}

