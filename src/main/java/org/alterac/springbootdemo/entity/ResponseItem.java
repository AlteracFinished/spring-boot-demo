package org.alterac.springbootdemo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseItem {
    private String responseCode;
    private String responseMessage;
    private Timestamp responseTime;
}
