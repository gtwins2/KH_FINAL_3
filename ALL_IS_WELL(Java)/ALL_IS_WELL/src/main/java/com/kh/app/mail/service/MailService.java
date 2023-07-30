package com.kh.app.mail.service;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.kh.app.admission.dao.admissionDao;
import com.kh.app.admission.service.AdmissionService;
import com.kh.app.mail.dao.mailDao;
import com.kh.app.mail.vo.MailVo;
import com.kh.app.member.vo.MemberVo;
import com.kh.app.operation.vo.OperationVo;
import com.kh.app.page.vo.PageVo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class MailService {
	private final mailDao dao;
	private final SqlSessionTemplate sst;
	
	
	
	public List<MemberVo> searchEmail(String name) {
		return dao.searchEmail(sst, name);
	}



	public List<MemberVo> getAllMembers() {
		return dao.getAllMembers(sst);
	}



	public int registerEmail(MailVo vo) {
		return dao.registerEmail(sst, vo);
	}



	public int registerSenderMail(MailVo vo) {
		return dao.registerSenderMail(sst, vo);
	}



	public int registerReceiverMail(MailVo vo) {
		return dao.registerReceiverMail(sst, vo);
	}



	public int registerAttachment(MailVo vo) {
		return dao.registerAttachment(sst, vo);
	}



	public int getReceiveMailCount(Map<String, String> paramMap) {
		return dao.getReceiveMailCount(sst, paramMap);
	}



	public List<OperationVo> getReceiveMailList(PageVo pv, Map<String, String> paramMap) {
		return dao.getReceiveMailList(sst, pv, paramMap);
	}



	public int deleteReceiveMail(String mailNo) {
		return dao.deleteReceiveMail(sst, mailNo);
	}



	public MailVo getMailDetail(String no) {
		return dao.getMailDetail(sst, no);
	}
	
}
