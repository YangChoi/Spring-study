package board.service;

import java.util.List;
import java.util.Map;

import board.bean.BoardDTO;
import board.bean.BoardPaging;

public interface BoardService {

	public void boardWrite(Map<String, String> map);

	public List<BoardDTO> getBoardList(String pg);

	public List<BoardDTO> getBoardSearch(Map<String, String> map);

	public BoardPaging boardPaging(String pg);
	
	public BoardPaging boardPaging(Map<String, String> map);

}
