package SwaggerCodeGenProject.impl;

import SwaggerCodeGenProject.ApiResponseMessage;
import SwaggerCodeGenProject.RegistrationApiService;
import SwaggerCodeGenProject.dto.MemberDetailsDTO;

import javax.ws.rs.core.Response;

public class RegistrationApiServiceImpl extends RegistrationApiService {
    @Override
    public Response registerMember(MemberDetailsDTO memberDetails) {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
