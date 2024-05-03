package com.example.justagram.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", nullable = false)
    private int idx;

    @Column(name = "nick_name")
    private String nickName; // 닉네임

    @Column(name = "phone_num")
    private String phoneNum; // 전화번호

    @Column(name = "profile")
    private String profile; // 프로필이미지

    @Column(name = "oauth_num")
    private int oauthNum; // 간편로그인번호

    @Column(name = "join_date")
    private Instant joinDate; // 가입날짜

    public static User testUser() {
        return User.builder()
                .idx(1)
                .joinDate(Instant.ofEpochSecond(66474))
                .nickName("김주환")
                .oauthNum(1)
                .phoneNum("01020271825")
                .profile("test_img.png")
                .build();
    }
}
