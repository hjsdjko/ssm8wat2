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


import com.dao.JiaoxueguanliDao;
import com.entity.JiaoxueguanliEntity;
import com.service.JiaoxueguanliService;
import com.entity.vo.JiaoxueguanliVO;
import com.entity.view.JiaoxueguanliView;

@Service("jiaoxueguanliService")
public class JiaoxueguanliServiceImpl extends ServiceImpl<JiaoxueguanliDao, JiaoxueguanliEntity> implements JiaoxueguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoxueguanliEntity> page = this.selectPage(
                new Query<JiaoxueguanliEntity>(params).getPage(),
                new EntityWrapper<JiaoxueguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoxueguanliEntity> wrapper) {
		  Page<JiaoxueguanliView> page =new Query<JiaoxueguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoxueguanliVO> selectListVO(Wrapper<JiaoxueguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoxueguanliVO selectVO(Wrapper<JiaoxueguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoxueguanliView> selectListView(Wrapper<JiaoxueguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoxueguanliView selectView(Wrapper<JiaoxueguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
