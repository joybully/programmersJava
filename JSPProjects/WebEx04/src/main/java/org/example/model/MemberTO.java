package org.example.model;

import lombok.*;

// @Getter
// argument 없는 생성자
// @NoArgsConstructor
// argument 다 가져와서 생성자 만듬
//@AllArgsConstructor
// @RequiredArgsConstructor
// @ToString
@Data
public class MemberTO {
    // 1개 단위만 getter, setter생성
    // private @Getter @Setter String deptno;
    @NonNull private String deptno;
    @NonNull private String dname;
    private String loc;
}
