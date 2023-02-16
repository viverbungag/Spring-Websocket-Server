package com.example.testserver.dto;

import lombok.*;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TextMessageDTO {
    private String newValue;
    private String type;
}
