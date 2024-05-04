package com.example.justagram.Controller;

import com.example.justagram.Dto.board.request.BoardAddRequest;
import com.example.justagram.Entity.Board;
import com.example.justagram.Entity.User;
import com.example.justagram.Service.BoardService;
import com.example.justagram.utils.ApiUtils;
import com.example.justagram.vo.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping(value = "/post")
    public Response<List<Board>> getBoardList() {
        List<Board> boardList = boardService.getBoardList();

        return ApiUtils.success(HttpStatus.OK, "리스트 출력", boardList);
    }

    @PostMapping(value = "/post")
    public Response<Void> postBoard(@RequestBody BoardAddRequest boardAddRequest, User user) {
        boardService.postBoard(boardAddRequest, user);
        return ApiUtils.success(HttpStatus.OK, "완료", null);
    }
}
