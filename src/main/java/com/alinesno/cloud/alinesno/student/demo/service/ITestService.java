package com.alinesno.cloud.alinesno.student.demo.service;

import org.springframework.data.repository.NoRepositoryBean;
import com.alinesno.cloud.alinesno.student.demo.entity.TestEntity;
import com.alinesno.cloud.common.facade.services.IBaseService;

/**
 * <p>  服务类 </p>
 *
 * @author ${author}
 * @since 2021-03-01 16:58:37
 */
@NoRepositoryBean
public interface ITestService extends IBaseService<TestEntity, String> {

}
