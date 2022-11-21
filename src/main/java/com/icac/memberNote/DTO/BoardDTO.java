package com.icac.memberNote.DTO;
import java.sql.Timestamp;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardDTO {
    private Long id;
    private String boardTitle;
    private String boardContents;
    private Long boardHits;
    private Timestamp boardCreatedDate;
    private Long memberId;
}
