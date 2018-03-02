package service;

import java.util.List;

import domain.TB_Board;

public interface TB_BoardProvider {
	public void insertData (TB_Board tB_Board);
	
	public List<TB_Board> findAllData();
	
	public TB_Board findData (String num);
	
	public TB_Board updateData(String num, String updateName);
}
