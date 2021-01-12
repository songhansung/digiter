package kr.green.test.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import kr.green.test.Vo.BoardVo;
import kr.green.test.Vo.FileVo;
import kr.green.test.Vo.UserVo;
import kr.green.test.pagination.Criteria;


public interface BoardService {

	ArrayList<BoardVo> getBoardList(Criteria cri);

	BoardVo getboard(Integer num);

	void registerBoard(BoardVo board);

	void modifyBoard(BoardVo board,UserVo user);

	void deleteBoard(Integer num, UserVo user);

	void view(Integer num);

	int getTotalCount(Criteria cri);

	void registerFile(int num, String originalFilename, String fileName);

	ArrayList<FileVo> getFileList(Integer num);

}
