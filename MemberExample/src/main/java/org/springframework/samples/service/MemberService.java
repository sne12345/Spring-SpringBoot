package org.springframework.samples.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.samples.controller.MemberModRequest;
import org.springframework.samples.controller.MemberNotFoundException;
import org.springframework.samples.controller.MemberRegistRequest;
import org.springframework.samples.controller.NotMatchPasswordException;
import org.springframework.samples.model.Address;
import org.springframework.samples.model.MemberInfo;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	private int nextMemberId = 0;	
	private Map<String, MemberInfo> memberMap = new HashMap<String, MemberInfo>();	// 회원 정보 저장 Map

	public MemberService() {
		memberMap.put("m1", new MemberInfo("m1", "Scott", "scott@yahoo.com", "scott", false, new Address("01520", "화랑로 12, 성북구", "서울특별시")));
		memberMap.put("m2", new MemberInfo("m2", "Peter", "peter@hotmail.com", "peter", false, new Address("08290", "대청로 50, 중구", "부산광역시")));
		memberMap.put("m3", new MemberInfo("m3", "Jain", "jain@gmail.com", "jain", false, new Address("04730", "계룡로 12, 유성구", "대전광역시")));
		nextMemberId = 4;
	}

	public List<MemberInfo> getMembers() {
		return new ArrayList<MemberInfo>(memberMap.values());
	}

	public MemberInfo getMemberInfo(String memberId) {
		return memberMap.get(memberId);
	}

	public MemberInfo getMemberInfoByEmail(String email) {
		for (MemberInfo mi : memberMap.values()) {
			if (mi.getEmail().equals(email))
				return mi;
		}
		return null;
	}
	
	public String registerNewMember(MemberRegistRequest memRegReq) {
		MemberInfo mi = new MemberInfo(
							"m" + nextMemberId,		// ID 생성
							memRegReq.getName(),
							memRegReq.getEmail(), 
							memRegReq.getPassword(),
							memRegReq.isAllowNoti(), 
							memRegReq.getAddress());
		nextMemberId++;
		memberMap.put(mi.getId(), mi);
		return mi.getId();
	}

	public void modifyMemberInfo(MemberModRequest modReq) {
		MemberInfo mi = memberMap.get(modReq.getId());
		if (mi == null)
			throw new MemberNotFoundException();
		if (!mi.matchPassword(modReq.getCurrentPassword()))
			throw new NotMatchPasswordException();

		mi.setEmail(modReq.getEmail());
		mi.setName(modReq.getName());
		mi.setAllowNoti(modReq.isAllowNoti());
		mi.setAddress(modReq.getAddress());
	}
}
