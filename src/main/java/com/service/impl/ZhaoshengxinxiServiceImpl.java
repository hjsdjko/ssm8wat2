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


import com.dao.ZhaoshengxinxiDao;
import com.entity.ZhaoshengxinxiEntity;
import com.service.ZhaoshengxinxiService;
import com.entity.vo.ZhaoshengxinxiVO;
import com.entity.view.ZhaoshengxinxiView;

@Service("zhaoshengxinxiService")
public class ZhaoshengxinxiServiceImpl extends ServiceImpl<ZhaoshengxinxiDao, ZhaoshengxinxiEntity> implements ZhaoshengxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaoshengxinxiEntity> page = this.selectPage(
                new Query<ZhaoshengxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhaoshengxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaoshengxinxiEntity> wrapper) {
		  Page<ZhaoshengxinxiView> page =new Query<ZhaoshengxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaoshengxinxiVO> selectListVO(Wrapper<ZhaoshengxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaoshengxinxiVO selectVO(Wrapper<ZhaoshengxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaoshengxinxiView> selectListView(Wrapper<ZhaoshengxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaoshengxinxiView selectView(Wrapper<ZhaoshengxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
