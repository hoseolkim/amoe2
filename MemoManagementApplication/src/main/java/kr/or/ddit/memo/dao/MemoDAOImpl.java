package kr.or.ddit.memo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.db.MemoSqlSessionFactoryBuilder;
import kr.or.ddit.vo.MemoVO;

public class MemoDAOImpl implements MemoDAO {
	private static MemoDAO dao;
	private SqlSessionFactory sqlSessionFactory;
	private MemoDAO mapper;
	public static synchronized MemoDAO getMemoDAO() {
		if(dao==null) dao = new MemoDAOImpl();
		return dao;
	}
	
	private MemoDAOImpl() {
		sqlSessionFactory = MemoSqlSessionFactoryBuilder.getSqlSessionFactory();
		try(
			SqlSession session = sqlSessionFactory.openSession();
		){
			mapper = session.getMapper(MemoDAO.class); 
		}
	}
	
	
	@Override
	public int insertMemo(MemoVO memoVO) {
		try(
			SqlSession session = sqlSessionFactory.openSession();
		){
			return mapper.insertMemo(memoVO);
		}
	}

	@Override
	public List<MemoVO> selectMemoList() {
		try(
			SqlSession session = sqlSessionFactory.openSession();
		){
			return mapper.selectMemoList();
		}
	}


	@Override
	public int updateMemo(MemoVO memoVO) {
		try(
			SqlSession session = sqlSessionFactory.openSession();
		){
			return mapper.updateMemo(memoVO);
		}
	}

	@Override
	public int deleteMemo(int code) {
		try(
			SqlSession session = sqlSessionFactory.openSession();
		){
			return mapper.deleteMemo(code);
		}
	}
}