package com.resteasy.series.upload.download.service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/fileservice")
public interface IFileService {

	// http://localhost:8080/RestEasy-UP-DOWN-Zip-File/resteasy/fileservice/download/zip  - Tomcat 7.0.x
	// http://localhost:9090/RestEasy-UP-DOWN-Zip-File/resteasy/fileservice/download/zip  - JBoss AS7
	@GET
	@Path("/download/zip/{fileName}")
	@Produces("application/zip")
	public Response downloadZippedFile(@PathParam("fileName") String fileName);

	// http://localhost:8080/RestEasy-UP-DOWN-Zip-File/resteasy/fileservice/upload/zip  - Tomcat 7.0.x
	// http://localhost:9090/RestEasy-UP-DOWN-Zip-File/resteasy/fileservice/upload/zip  - JBoss AS7
	@POST
	@Path("/upload/zip")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response uploadZippedFile(MultipartFormDataInput multipartFormDataInput);
}