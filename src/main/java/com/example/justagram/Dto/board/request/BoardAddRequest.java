package com.example.justagram.Dto.board.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardAddRequest {
    // 게시글 작성할 때 사용

    @Schema(description = "작성자", nullable = false, example = "유저번호")
    private String user_post; // 작성자
    @Schema(description = "게시글", nullable = false, example = "~~")
    private String content; // 게시글
    @Schema(description = "글 상태", nullable = false, example = "게시")
    private String status; // 게시글 상태(임시저장, 삭제대기 등등)
    @Schema(description = "이미지", nullable = false, example = "img.png")
    private String img; // 이미지

}
