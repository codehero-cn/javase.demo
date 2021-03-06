package org.crazyit.book.dao;

import java.util.Collection;
import java.util.Date;

import org.crazyit.book.vo.SaleRecord;

/**
 * 销售记录DAO接口
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @version  1.0
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public interface SaleRecordDao {

	/**
	 * 根据两个日期, 查找两个日期之间的交易记录
	 * @param begin 开始日期的字符串, 格式为yyyy-MM-dd
	 * @param end 结束日期的字符串, 格式为yyyy-MM-dd
	 * @return
	 */
	Collection<SaleRecord> findByDate(String begin, String end);
	
	/**
	 * 根据id查找销售记录
	 * @param id
	 * @return
	 */
	SaleRecord findById(String id);
	
	/**
	 * 保存一条销售记录
	 * @param record
	 * @return
	 */
	String save(SaleRecord record);
	
}
