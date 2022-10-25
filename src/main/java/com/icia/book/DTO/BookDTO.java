package com.icia.book.DTO;


import lombok.*;
import org.springframework.stereotype.Service;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {
   Long bookId;
   String bookName;
   String bookAuthor;
   int bookPrice;
   String bookPublisher;
}



