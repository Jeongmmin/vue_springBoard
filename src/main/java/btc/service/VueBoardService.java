package btc.service;

import java.util.List;

import btc.dto.AxiosBoardDto;

public interface VueBoardService {
	List<AxiosBoardDto> vueSelectBoardList() throws Exception;

	void vueInsertBoard(AxiosBoardDto board) throws Exception;

	AxiosBoardDto vueSelectDetailBoard(int boardIdx) throws Exception;

	void vueUpdateBoard(AxiosBoardDto board) throws Exception;

	void vueDeleteBoard(int boardIdx) throws Exception;
}
