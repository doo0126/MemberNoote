package com.icac.memberNote.DTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private  String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;

}
