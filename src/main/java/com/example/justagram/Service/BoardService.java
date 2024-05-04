package com.example.justagram.Service;

import com.example.justagram.Dto.board.request.BoardAddRequest;
import com.example.justagram.Dto.board.response.BoardGetListResponse;
import com.example.justagram.Entity.Board;
import com.example.justagram.Entity.User;
import com.example.justagram.Repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;


    public List<Board> getBoardList() {
        List<Board> boardList = boardRepository.findAll();

        // 출력되는 엔티티를 리스폰스로 바꿔서 출력해야함
//        List<BoardGetListResponse> getListResponses = boardList.stream().map(board -> BoardGetListResponse.BoardListResponse(boardList))


        return boardList;

    }

    public void postBoard(BoardAddRequest boardAddRequest, User user) {
        Board board = Board.postBoard(boardAddRequest, user);
        boardRepository.save(board);
    }
}
