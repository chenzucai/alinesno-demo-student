package com.alinesno.cloud.alinesno.student.demo.entity;

import javax.persistence.Table;
import javax.persistence.Entity;
import com.alinesno.cloud.common.facade.orm.entity.BaseEntity;


/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2021-03-01 16:58:37
 */
@Entity
@Table(name="test")
public class TestEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "TestEntity{" +
			"name=" + name +
			"}";
	}
}
