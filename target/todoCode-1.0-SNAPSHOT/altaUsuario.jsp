
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/body1parte.jsp" %>

<h1>Crear Usuario</h1>
<p>Ingrese datos:</p>
<form class="user"action="SvUsuarios" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu"
                                            placeholder="nombre usuario">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                                            placeholder="contrasenia">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="rol" name="rol"
                                            placeholder="rol">
                                    </div>
                                  
                                    
                                    <!-- Aca va a ir todo lo que respecta a horarios y usuarios -->
                                    
                                    
                                </div>
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Crear Usuario
                                </button>
                                <hr>

                            </form>
<%@include file="components/body2parte.jsp" %>