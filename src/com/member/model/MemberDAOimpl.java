package com.member.model;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class MemberDAOimpl implements MemberDAO{

	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<MemberDTO> getMemberList() {
		String sql ="select * from springmember";
		//알아서 resultset이 변환되어서 반환된다
		List<MemberDTO> userlist = template.query(sql, new MemberMapper());
		return userlist;
	}

	@Override
	public MemberDTO findById(String id) {
		String sql ="select * from springmember where id=?";
		MemberDTO user = template.queryForObject(sql,new Object[] {id},new MemberMapper());
		return user;
	}

	@Override
	public void insert(MemberDTO user) {
		String sql ="insert into springmember values(?,?,?,?,?,sysdate)";
		Object[] param = new Object[] {
			user.getId(),user.getPass(),user.getName(),user.getAddr(),user.getMemo()
		};
		template.update(sql,param);
	}

	@Override
	public void update(MemberDTO user) {
		String sql ="update springmember set pass=?, name=?, addr=?,memo=? where id=?";
		Object[] param = new Object[] {
			user.getPass(),user.getName(),user.getAddr(),user.getMemo(),user.getId()
		};
		template.update(sql,param);
		
	}

	@Override
	public void delete(String id) {
		String sql ="delete from springmember where id=?";
		template.update(sql,id);
		
	}

}
