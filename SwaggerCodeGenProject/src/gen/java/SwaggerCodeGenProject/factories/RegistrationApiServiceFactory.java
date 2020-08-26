package SwaggerCodeGenProject.factories;

import SwaggerCodeGenProject.RegistrationApiService;
import SwaggerCodeGenProject.impl.RegistrationApiServiceImpl;

public class RegistrationApiServiceFactory {

   private final static RegistrationApiService service = new RegistrationApiServiceImpl();

   public static RegistrationApiService getRegistrationApi()
   {
      return service;
   }
}
