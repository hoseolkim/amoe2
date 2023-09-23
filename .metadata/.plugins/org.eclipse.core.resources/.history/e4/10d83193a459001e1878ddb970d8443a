package kr.or.ddit.memo.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.db.MemoSqlSessionFactoryBuilder;
import kr.or.ddit.vo.MemoVO;

public class MemoAthenticateDAOImpl implements MemoAthenticateDAO {
	private static MemoAthenticateDAO dao;
	private SqlSessionFactory sqlSessionFactory;
	private MemoAthenticateDAO mapper;
	
	public static synchronized MemoAthenticateDAO getMemoAthenticateDAO() {
		if(dao==null) dao = new MemoAthenticateDAOImpl();
		return dao;
	}
	
	private MemoAthenticateDAOImpl() {
		sqlSessionFactory = MemoSqlSessionFactoryBuilder.getSqlSessionFactory();
		try(
			SqlSession session = sqlSessionFactory.openSession();
		){
			mapper = session.getMapper(MemoAthenticateDAO.class); 
		}
	}
	
	@Override
	public int memoAthenticate(MemoVO memovO) {
		try(
			SqlSession session = sqlSessionFactory.openSession();
		){
			return mapper.memoAthenticate(memovO);
		}
	}

}
