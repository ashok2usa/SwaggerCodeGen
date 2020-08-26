package SwaggerCodeGenProject.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class SuccessDTO  {
  
  
  @NotNull
  private String memberID = null;

  
  /**
   * Successful operation.
   **/
  @ApiModelProperty(required = true, value = "Successful operation.")
  @JsonProperty("memberID")
  public String getMemberID() {
    return memberID;
  }
  public void setMemberID(String memberID) {
    this.memberID = memberID;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessDTO {\n");
    
    sb.append("  memberID: ").append(memberID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
