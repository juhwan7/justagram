package com.example.justagram.Entity;

import com.example.justagram.Dto.board.request.BoardAddRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idx; // idx

    @ManyToOne
    @JoinColumn(name = "user")
    private User user; // 작성자

    @Column(name = "content")
    private String content; // 게시글

    @Column(name = "created_at")
    private Timestamp createdAt; // 게시일자

    @Column(name = "img")
    private String img; // 이미지

    @Column(name = "status")
    private String status; // 게시글 상태


    public static Board postBoard(BoardAddRequest request, User user) {
        return Board.builder()
                .content(request.getContent())
                .user(user.testUser())
                .img(request.getImg())
                .status(request.getStatus())
                .createdAt(Timestamp.valueOf(LocalDateTime.now()))
                .build();
    }


}
