package board.dao;

import java.util.List;
import java.util.Map;

import board.bean.BoardDTO;

public interface BoardDAO {
	// 글쓰기 
	public void boardWrite(Map<String, String> map);

	public List<BoardDTO> getBoardList(Map<String, Integer> map);

	public int getBoardTotalA();

	public List<BoardDTO> getBoardSearch(Map<String, String> map);

	public int getBoardSearchTotalA(Map<String, String> map);

	public BoardDTO getBoardView(String seq);

	public void boardReply(Map<String, String> map);

	public void boardModify(Map<String, Object> map);

	public void boardDelete(String seq);

	public void boardHit(String seq);
}
