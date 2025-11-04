package student2.dto;
    //Data Transfer Object == ~VO(Value Object)
    // 

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
    

public class ProfessorDTO {
    private String profID;
    private String profName;
    private String deptId;

    

    //생성자
    // public ProfessorDTO() {
    // }

    // public ProfessorDTO(String profID, String profName, String deptId) {
    //     this.profID = profID;
    //     this.profName = profName;
    //     this.deptId = deptId;
    // }


    // //getter,setter,toString
    // public String getProfID() {
    //     return profID;
    // }

    // public void setProfID(String profID) {
    //     this.profID = profID;
    // }

    // public String getProfName() {
    //     return profName;
    // }

    // public void setProfName(String profName) {
    //     this.profName = profName;
    // }

    // public String getDeptId() {
    //     return deptId;
    // }

    // public void setDeptId(String deptId) {
    //     this.deptId = deptId;
    // }

    // @Override
    // public String toString() {
    //     return "ProfessorDTO [profID=" + profID + ", profName=" + profName + ", deptId=" + deptId + "]";
    // }

    
    
    

    


}
