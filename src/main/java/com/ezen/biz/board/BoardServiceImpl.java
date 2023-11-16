package com.ezen.biz.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.BoardDAO2;
import com.ezen.biz.dto.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO2 boardDao;
	
	@Override
	public void insertBoard(BoardVO vo) {
		
		// 강제로 예외 발생
//		if (vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0번 글을 등록할 수 없습니다.");
//		}
		boardDao.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
			
		boardDao.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		
		boardDao.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		
		return boardDao.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		
		return boardDao.getBoardList(vo);
	}

}






