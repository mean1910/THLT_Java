package com.example.TrongNghia_B2;
import com.example.TrongNghia_B2.entity.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;
@Configuration
public class AppConfig {
    @Bean
    public List<Book> getBooks() {
        List<Book> listBook = new ArrayList<>();


        Book book1 = new Book(
                1,
                "Cây cam ngọt của tôi",
                "Jose Mauro de Vasconcelos",
                69000.0,
                "Tiểu thuyết");

        Book book2 = new Book(
                2,
                "Đám Trẻ Ở Đại Dương Đen",
                "Kenzaburo Oe",
                85000.0,
                "Tiểu thuyết");

        Book book3 = new Book(
                3,
                "Hoàng Tử Bé",
                "Antoine de Saint-Exupéry",
                50000.0,
                "Văn học thiếu nhi");


        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);


        return listBook;
    }
}
