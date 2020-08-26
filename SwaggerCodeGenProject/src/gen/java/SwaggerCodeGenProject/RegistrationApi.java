package SwaggerCodeGenProject;

import SwaggerCodeGenProject.dto.*;
import SwaggerCodeGenProject.RegistrationApiService;
import SwaggerCodeGenProject.factories.RegistrationApiServiceFactory;

import io.swagger.annotations.ApiParam;

import SwaggerCodeGenProject.dto.ErrorDTO;
import SwaggerCodeGenProject.dto.MemberDetailsDTO;
import SwaggerCodeGenProject.dto.SuccessDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/registration")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/registration", description = "the registration API")
public class RegistrationApi  {

   private final RegistrationApiService delegate = RegistrationApiServiceFactory.getRegistrationApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Member Registration Endpoint.", notes = "This API is used to register memebrs.\n", response = SuccessDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request") })

    public Response registerMember(@ApiParam(value = "The details of the new member to be registered."  ) MemberDetailsDTO memberDetails)
    {
    return delegate.registerMember(memberDetails);
    }
}

