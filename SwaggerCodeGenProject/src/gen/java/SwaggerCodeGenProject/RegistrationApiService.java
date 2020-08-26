package SwaggerCodeGenProject;

import SwaggerCodeGenProject.*;
import SwaggerCodeGenProject.dto.*;

import SwaggerCodeGenProject.dto.ErrorDTO;
import SwaggerCodeGenProject.dto.MemberDetailsDTO;
import SwaggerCodeGenProject.dto.SuccessDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class RegistrationApiService {
    public abstract Response registerMember(MemberDetailsDTO memberDetails);
}

