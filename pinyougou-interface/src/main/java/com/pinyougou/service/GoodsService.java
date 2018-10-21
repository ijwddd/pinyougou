package com.pinyougou.service;

import com.pinyougou.pojo.Goods;
import com.pinyougou.pojo.PageResult;

import java.util.List;
import java.io.Serializable;
/**
 * GoodsService 服务接口
 * @date 2018-09-26 11:12:14
 * @version 1.0
 */
public interface GoodsService {

	/** 添加方法 */
	void save(Goods goods);

	/** 修改方法 */
	void update(Goods goods);

	/** 根据主键id删除 */
	void delete(Serializable id);

	/** 批量删除 */
	void deleteAll(Serializable[] ids);

	/** 根据主键id查询 */
	Goods findOne(Serializable id);

	/** 查询全部 */
	List<Goods> findAll();

	/** 多条件分页查询 */
	PageResult findByPage(Goods goods, int page, int rows);

	void updateStatus(Long[] ids, String status);

	void updateMarketable(Long[] ids, String status);
}