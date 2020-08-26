package SwaggerCodeGenProject.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class MemberDetailsInnerDTO  {
  
  
  @NotNull
  private Integer memberAge = null;
  
  @NotNull
  private String memberName = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("memberAge")
  public Integer getMemberAge() {
    return memberAge;
  }
  public void setMemberAge(Integer memberAge) {
    this.memberAge = memberAge;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("memberName")
  public String getMemberName() {
    return memberName;
  }
  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberDetailsInnerDTO {\n");
    
    sb.append("  memberAge: ").append(memberAge).append("\n");
    sb.append("  memberName: ").append(memberName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
