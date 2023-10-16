
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body1parte.jsp" %>

<h1>Crear Odontologo</h1>
<p>Ingrese datos:</p>
<form class="user">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dni"
                                            placeholder="DNI">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombre"
                                            placeholder="nombre">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="apellido"
                                            placeholder="apellido">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="telefono"
                                            placeholder="telefono">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="direccion"
                                            placeholder="direccion">
                                    </div>   
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="fechanac"
                                            placeholder="fecha de nacimiento">
                                    </div> 
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="especialidad"
                                            placeholder="especialidad">
                                    </div> 
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="mail"
                                            placeholder="mail">
                                    </div>                                     
                           
                                    <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user"
                                            id="exampleInputPassword" placeholder="Password">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user"
                                            id="exampleRepeatPassword" placeholder="Repetir Password">
                                    </div>
                                    
                                    <!-- Aca va a ir todo lo que respecta a horarios y usuarios -->
                                    
                                    
                                </div>
                                <a href="#" class="btn btn-primary btn-user btn-block">
                                    Crear Odonotologo
                                </a>
                                <hr>

                            </form>
<%@include file="components/body2parte.jsp" %>