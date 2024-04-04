package com.company.ljins.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
    private int user_no;
    private String user_name;
    private String user_id;
    private String user_pw;
    private String user_date;
    private String user_ip;
}
