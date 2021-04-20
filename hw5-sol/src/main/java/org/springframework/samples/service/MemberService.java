package org.springframework.samples.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.samples.model.MemberInfo;
import org.springframework.samples.model.PerformerType;
import org.springframework.samples.controller.member.MemberRegistRequest;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	private int nextMemberId = 0;
	private Map<String, MemberInfo> memberMap = new HashMap<String, MemberInfo>();

	public MemberService() {
	}

	public List<MemberInfo> getMembers() {
		return new ArrayList<MemberInfo>(memberMap.values());
	}

	public MemberInfo registNewMember(MemberRegistRequest memRegReq) {
		MemberInfo mi = new MemberInfo("m" + nextMemberId,
				memRegReq.getName(),  
				memRegReq.getPassword(),
				memRegReq.getPhone(),
				memRegReq.getAddress(),
				PerformerType.valueOf(memRegReq.getType()), 
				memRegReq.getTitle(), 
//				Integer.parseInt(memRegReq.getLength()),
				memRegReq.getLength(),
				memRegReq.isNewPerformer(),
				new Date());
		nextMemberId++;
		memberMap.put(mi.getId(), mi);
		return mi;
	}
}
