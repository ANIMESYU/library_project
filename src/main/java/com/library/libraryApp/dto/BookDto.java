package com.library.libraryApp.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class BookDto {
    private Long id;

    @NotBlank(message = "название книги не может быть пустым")
    @Size(max = 200, message = "название слишком длинное")
    private String name;

    @NotBlank(message = "автор не может быть пустым")
    private String publishHome;

    private Integer rating;

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getPublishHome() { return publishHome; }
    public Integer getRating() { return rating; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPublishHome(String publishHome) { this.publishHome = publishHome; }
    public void setRating(Integer rating) { this.rating = rating; }
}
