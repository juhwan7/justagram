package com.example.justagram.Dto.board.response;

import com.example.justagram.Entity.Board;
import com.example.justagram.Entity.User;
import jakarta.persistence.*;
import lombok.Builder;

import java.sql.Timestamp;
import java.util.List;

@Builder
public class BoardGetListResponse {
    private int idx; // idx

    private int user_idx; // 작성자_idx

    private String content; // 게시글

    private Timestamp createdAt; // 게시일자

    private String img; // 이미지

    private String status; // 게시글 상태


    public static BoardGetListResponse BoardListResponse(Board board) {
        return BoardGetListResponse.builder()
                .idx(board.getIdx())
                .content(board.getContent())
                .createdAt(board.getCreatedAt())
                .img(board.getImg())
                .user_idx(board.getIdx())
                .status(board.getStatus())
                .build();
    }
}
