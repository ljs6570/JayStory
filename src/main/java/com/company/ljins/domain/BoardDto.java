package com.company.ljins.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private int board_no;
    private String board_title;
    private String board_content;
    private String board_date;
    private int board_hit;
    private int user_no;
}
