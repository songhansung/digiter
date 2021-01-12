package kr.green.test.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.green.test.Vo.BoardVo;
import kr.green.test.Vo.FileVo;
import kr.green.test.pagination.Criteria;

public interface BoardDao {

	ArrayList<BoardVo> getBoardList(@Param("cri")Criteria cri);

	BoardVo getboard(@Param("num")Integer num);

	void insertBoard(@Param("board")BoardVo board);

	void updateBoard(@Param("board")BoardVo oriboard);

	void updateViews(@Param("num")Integer num);

	int getTotalCount(@Param("cri")Criteria cri);

	void insertFile(@Param("num")int num, @Param("oriFilename")String originalFilename, @Param("filename")String fileName);

	ArrayList<FileVo> getFileList(@Param("num")int num);

	void deleteFile(@Param("num")int num);
	
}
