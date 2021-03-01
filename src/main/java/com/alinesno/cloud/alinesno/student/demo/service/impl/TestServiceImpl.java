package com.alinesno.cloud.alinesno.student.demo.service.impl;

import com.alinesno.cloud.alinesno.student.demo.entity.TestEntity;
import com.alinesno.cloud.alinesno.student.demo.service.ITestService;
import com.alinesno.cloud.common.core.service.impl.IBaseServiceImpl;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>  服务实现类 </p>
 *
 * @author ${author}
 * @since 2021-03-01 16:58:37
 */
@Service
public class TestServiceImpl extends IBaseServiceImpl<TestEntity, String> implements ITestService {

	//日志记录
	@SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(TestServiceImpl.class);

}
