package com.vuestudy.vuesampleing.vueStudy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RsData<T> {
    private String resultCode;
    private String me;
    private T data;
}
