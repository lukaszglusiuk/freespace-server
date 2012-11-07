package com.freespace.server.web.controller {

import javax.ws.rs._
import javax.ws.rs.core._

@Path("/message")
class ServerMainController {

  @GET
  @Path("/{param}")
  def printMessage(@PathParam("param") msg: String): Response = Response.status(200).entity("Restful example : " + msg).build()

}

}