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


import com.dao.PinpaizhuanyeDao;
import com.entity.PinpaizhuanyeEntity;
import com.service.PinpaizhuanyeService;
import com.entity.vo.PinpaizhuanyeVO;
import com.entity.view.PinpaizhuanyeView;

@Service("pinpaizhuanyeService")
public class PinpaizhuanyeServiceImpl extends ServiceImpl<PinpaizhuanyeDao, PinpaizhuanyeEntity> implements PinpaizhuanyeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PinpaizhuanyeEntity> page = this.selectPage(
                new Query<PinpaizhuanyeEntity>(params).getPage(),
                new EntityWrapper<PinpaizhuanyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PinpaizhuanyeEntity> wrapper) {
		  Page<PinpaizhuanyeView> page =new Query<PinpaizhuanyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PinpaizhuanyeVO> selectListVO(Wrapper<PinpaizhuanyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PinpaizhuanyeVO selectVO(Wrapper<PinpaizhuanyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PinpaizhuanyeView> selectListView(Wrapper<PinpaizhuanyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PinpaizhuanyeView selectView(Wrapper<PinpaizhuanyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
