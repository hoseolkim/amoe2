package kr.or.ddit.member.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import kr.or.ddit.db.CustomSqlSessionFactoryBuilder;
import kr.or.ddit.vo.MemberVO;

class MemberDAOImplTest {
	MemberDAO dao = new MemberDAOImpl();
	
	@Test
	void testSelectMemberForAuth() {
		MemberVO inputData = new MemberVO();
		inputData.setMemId("a001");
		inputData.setMemPass("asdfasdf");
		
		MemberVO saved = dao.selectMemberForAuth(inputData);
		assertNotNull(saved);
	}
	

}
