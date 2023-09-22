package kr.or.ddit.member.service;

/**
 * 아이디로 조회한 사용자가 존재하지 않는 경우
 *
 */
public class UserNotFundException extends RuntimeException{

	public UserNotFundException(String memId) {
		super(String.format("%s 에 해당하는 사용자가 없음.", memId));
	}
	
}
