package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JixujiaoyuDao;
import com.entity.JixujiaoyuEntity;
import com.service.JixujiaoyuService;
import com.entity.vo.JixujiaoyuVO;
import com.entity.view.JixujiaoyuView;

@Service("jixujiaoyuService")
public class JixujiaoyuServiceImpl extends ServiceImpl<JixujiaoyuDao, JixujiaoyuEntity> implements JixujiaoyuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JixujiaoyuEntity> page = this.selectPage(
                new Query<JixujiaoyuEntity>(params).getPage(),
                new EntityWrapper<JixujiaoyuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JixujiaoyuEntity> wrapper) {
		  Page<JixujiaoyuView> page =new Query<JixujiaoyuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JixujiaoyuVO> selectListVO(Wrapper<JixujiaoyuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JixujiaoyuVO selectVO(Wrapper<JixujiaoyuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JixujiaoyuView> selectListView(Wrapper<JixujiaoyuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JixujiaoyuView selectView(Wrapper<JixujiaoyuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
