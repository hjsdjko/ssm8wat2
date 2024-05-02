package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KeyankaifaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KeyankaifaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KeyankaifaView;


/**
 * 科研开发
 *
 * @author 
 * @email 
 * @date 2021-06-05 12:46:47
 */
public interface KeyankaifaService extends IService<KeyankaifaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KeyankaifaVO> selectListVO(Wrapper<KeyankaifaEntity> wrapper);
   	
   	KeyankaifaVO selectVO(@Param("ew") Wrapper<KeyankaifaEntity> wrapper);
   	
   	List<KeyankaifaView> selectListView(Wrapper<KeyankaifaEntity> wrapper);
   	
   	KeyankaifaView selectView(@Param("ew") Wrapper<KeyankaifaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KeyankaifaEntity> wrapper);
   	
}

