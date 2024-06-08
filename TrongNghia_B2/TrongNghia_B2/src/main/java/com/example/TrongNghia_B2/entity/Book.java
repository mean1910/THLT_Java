package com.example.TrongNghia_B2.entity;
import jakarta.validation.constraints.*;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Book {
//    @NotNull(message = "ID không được để trống")
//    @Min(value=1, message ="ID phải là số nguyên dương lớn hơn 0")

    private int id;

    @NotBlank(message = "Tiêu đề không được bỏ trống")
    @Size(max=100, message ="Tiêu đề không đuọc vuọt quá 100 ký tự")
    private String title;

    @NotBlank(message = "Tác giả không được bỏ trống")
    @Size(max=100, message ="Tên tác giả không đuọc vuọt quá 100 ký tự")
    private String author;

    @NotNull(message = "Giá không được bỏ trống")
    @Min(value=100, message ="Giá phải là 1 số không âm")
    private Double price;

    @NotBlank(message = "Thể loại không được bỏ trống")
    @Pattern(regexp = "^[A-Za-z ]+$",message = "Thể loại chỉ chấp nhận chữ cái và khoảng trắng")
    private String category;

}
