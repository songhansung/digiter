package kr.green.test.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.Vo.BoardVo;
import kr.green.test.Vo.FileVo;
import kr.green.test.Vo.UserVo;
import kr.green.test.pagination.Criteria;
import kr.green.test.pagination.PageMaker;
import kr.green.test.service.BoardService;
import kr.green.test.service.UserService;
import kr.green.test.utils.UploadFileUtils;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
	@Autowired
	UserService userService;

	private String uploadPath ="D:\\java_SHS\\upfile";
	
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public ModelAndView listGet(ModelAndView mv,HttpServletRequest request,Criteria cri){
		ArrayList<BoardVo> list = boardService.getBoardList(cri);
		UserVo user = userService.getUser(request);
		
		int totalCount = boardService.getTotalCount(cri);
		
		PageMaker pm = new PageMaker(cri, 2, totalCount);
		
		mv.addObject("pm" , pm);
		mv.addObject("list", list);
		mv.setViewName("/board/list");
		return mv;
	}
	@RequestMapping(value = "/board/detail", method = RequestMethod.GET)
	public ModelAndView detailGet(ModelAndView mv,Integer num,Criteria cri){
		//해당 게시글의 조회수를 증가
		boardService.view(num);
		BoardVo borad = boardService.getboard(num);
		ArrayList<FileVo> fList = boardService.getFileList(num);
		mv.addObject("fList", fList);
		mv.addObject("board", borad);
		mv.addObject("cri", cri);
		mv.setViewName("/board/detail");
		return mv;
	}
	@RequestMapping(value = "/board/register", method = RequestMethod.GET)
	public ModelAndView BoardRegisterGet(ModelAndView mv){
		mv.setViewName("/board/register");
		return mv;
	}
	@RequestMapping(value = "/board/register", method = RequestMethod.POST)
	public ModelAndView BoardRegisterPost(ModelAndView mv,BoardVo board,MultipartFile[] fileList) throws IOException, Exception{
		boardService.registerBoard(board);
		
		if(fileList != null) {
			for(MultipartFile file : fileList) {
				if(file != null && file.getOriginalFilename().length() != 0) {
					String fileName = UploadFileUtils.uploadFile(uploadPath, file.getOriginalFilename(),file.getBytes());	
					boardService.registerFile(board.getNum(),file.getOriginalFilename(),fileName);
				}
			}
		}
		
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	@RequestMapping(value = "/board/modify", method = RequestMethod.GET)
	public ModelAndView BoardModifyGet(ModelAndView mv,Integer num){
		BoardVo board = boardService.getboard(num);
		
		ArrayList<FileVo> fList = boardService.getFileList(num);
		mv.addObject("fList", fList);
		
		mv.addObject("board", board);
		mv.setViewName("/board/modify");
		return mv;
	}
	@RequestMapping(value = "/board/modify", method = RequestMethod.POST)
	public ModelAndView BoardModifyPost(ModelAndView mv,BoardVo board,HttpServletRequest request,MultipartFile[] fileList) throws IOException, Exception{
		UserVo user = userService.getUser(request);
		boardService.modifyBoard(board ,user);
		if(fileList != null) {
			for(MultipartFile file : fileList) {
				if(file != null && file.getOriginalFilename().length() != 0) {
					String fileName = UploadFileUtils.uploadFile(uploadPath, file.getOriginalFilename(),file.getBytes());	
					boardService.registerFile(board.getNum(),file.getOriginalFilename(),fileName);
				}
			}
		}
		
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	@RequestMapping(value = "/board/delete", method = RequestMethod.GET)
	public ModelAndView BoardDeleteGet(ModelAndView mv,Integer num,HttpServletRequest request){
		UserVo user = userService.getUser(request);
		boardService.deleteBoard(num, user);
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	@ResponseBody
	@RequestMapping(value="/board/download")
	public ResponseEntity<byte[]> downloadFile(String fileName)throws Exception{
	    InputStream in = null;
	    ResponseEntity<byte[]> entity = null;
	    try{
	        HttpHeaders headers = new HttpHeaders();
	        in = new FileInputStream(uploadPath+fileName);

	        fileName = fileName.substring(fileName.indexOf("_")+1);
	        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	        headers.add("Content-Disposition",  "attachment; filename=\"" 
				+ new String(fileName.getBytes("UTF-8"), "ISO-8859-1")+"\"");
	        entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in),headers,HttpStatus.CREATED);
	    }catch(Exception e) {
	        e.printStackTrace();
	        entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
	    }finally {
	        in.close();
	    }
	    return entity;
	}
}
