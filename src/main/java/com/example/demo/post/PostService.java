package com.example.demo.post;

import java.util.List;

import com.example.demo.board.Board;

public interface PostService {

	public List<Board> getBoardList();
	
	public void saveBoard(Board board);
	
	public Board getBoardDetail(Integer postID);
	
	public void delete(Integer postID);
	
	public void updateBoard(Board board);
}
