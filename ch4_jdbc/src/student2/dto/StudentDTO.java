package student2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    // 테이블 모양과 동일하게 만들것!.
    private String studentId;
    private String name;
    private Double height;
    private String deptId;
   
}
