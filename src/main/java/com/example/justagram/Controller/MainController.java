package com.example.justagram.Controller;

import com.example.justagram.Entity.Board;
import com.example.justagram.utils.ApiUtils;
import com.example.justagram.vo.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {

    @GetMapping
    public Response<Void> main() {
        return ApiUtils.success(HttpStatus.OK, "main", null);
    }
}
