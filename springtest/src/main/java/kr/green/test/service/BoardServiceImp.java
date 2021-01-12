package kr.green.test.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.test.Vo.BoardVo;
import kr.green.test.Vo.FileVo;
import kr.green.test.Vo.UserVo;
import kr.green.test.dao.BoardDao;
import kr.green.test.dao.UserDao;
import kr.green.test.pagination.Criteria;


@Service
public class BoardServiceImp implements BoardService {
	@Autowired
	BoardDao boardDao;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public ArrayList<BoardVo> getBoardList(Criteria cri) {
		ArrayList<BoardVo> list = boardDao.getBoardList(cri);
		return list;
	}

	@Override
	public BoardVo getboard(Integer num) {
		if(num == null) {
			return null;
		}
		BoardVo borad = boardDao.getboard(num);
		return borad;
	}

	@Override
	public void registerBoard(BoardVo board) {
		boardDao.insertBoard(board);
	}

	@Override
	public void modifyBoard(BoardVo board, UserVo user) {
		BoardVo oriBoard = boardDao.getboard(board.getNum());
		// - 원본 게시글 작성자와 받아온 게시글 작성자가 다르거나, 회원아이디와 원본 작성자가같은지
		//   확인하여 같지않으면 메소드 종료
		if(oriBoard == null || !oriBoard.getWriter().equals(board.getWriter()) || !oriBoard.getWriter().equals(user.getId())) {
			return;
		}
		oriBoard.setTitle(board.getTitle());
		oriBoard.setContent(board.getContent());
		boardDao.updateBoard(oriBoard);
		//기존 게시글 첨부파일을 삭제
		boardDao.deleteFile(oriBoard.getNum());
	}

	@Override
	public void deleteBoard(Integer num, UserVo user) {
		if(num == null) {
			return;
		}
		BoardVo board = boardDao.getboard(num);
		if(board == null || !board.getWriter().equals(user.getId())) {
			return;
		}
		board.setIsDel("Y");
		boardDao.updateBoard(board);
	}

	@Override
	public void view(Integer num) {
		if(num == null) {
			return;
		}
		boardDao.updateViews(num);
		
	}

	@Override
	public int getTotalCount(Criteria cri) {
		return boardDao.getTotalCount(cri);
	}

	@Override
	public void registerFile(int num, String originalFilename, String fileName) {
		boardDao.insertFile(num, originalFilename, fileName);
	}

	@Override
	public ArrayList<FileVo> getFileList(Integer num) {
		if(num == null) {
			return null;
		}
		return boardDao.getFileList(num);
	}

}
