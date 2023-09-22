package kr.or.ddit.memo.service;

public class MemoDoesNotExistException extends RuntimeException{

	public MemoDoesNotExistException(int code) {
		super(String.format("%d 번 메모가 존재하지 않습니다.", code));
	}
	
}
