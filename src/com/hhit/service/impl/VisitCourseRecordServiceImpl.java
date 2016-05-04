package com.hhit.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hhit.base.DaoSupportImpl;
import com.hhit.entity.SpiderCourse;
import com.hhit.entity.Student;
import com.hhit.entity.VisitCourseRecord;
import com.hhit.service.IVisitCourseRecordService;
@Service
@Transactional
public class VisitCourseRecordServiceImpl extends DaoSupportImpl<VisitCourseRecord> implements IVisitCourseRecordService{

	@Override
	public VisitCourseRecord findByStuAndCourse(Student student ,SpiderCourse courseFind) {
		return (VisitCourseRecord) getSession().createQuery("FROM VisitCourseRecord WHERE student=? AND spiderCourse=?")//
		.setParameter(0, student)//
		.setParameter(1, courseFind)//
		.uniqueResult();
	}

}
