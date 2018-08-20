<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE-edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css">
        <!--<link rel="stylesheet" type="text/css" href="css/fonts.css">-->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <script src="resources/js/jquery-slim.min.js"></script>

        <script src="resources/js/bootstrap.js"></script>
        <script src="resources/js/fontawesome-all.min.js"></script>
        <title>Bootstrap componentes botones</title>
        <style type="text/css">


            #username{
                border-radius: 0;

            }

            #password{
                border-radius: 0;

            }

            #enviar{
                border-radius: 0; 
            }

            input::placeholder {
                color: lightgrey;
                font-weight: lighter;
            }


        </style>
        <script type="text/javascript">

            /* $(window).resize(function(){
             if ($(window).width() >= 992){  
             
             $(':input').removeAttr('placeholder');
             }else{
             $("input#username").attr("placeholder","Usuario");
             $("input#password").attr("placeholder","Contraseña");
             }  
             });
             
             $(document).ready(function(){
             if ($(window).width() >= 992){
             
             $(':input').removeAttr('placeholder');
             }
             
             
             
             });*/

        </script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light boder border-bottom">
            <a class="navbar-brand" href="#">
                <img src="resources/img/mejorfuturo.png" width="70" height="50" alt="Gobierno de Baja California Sur.">
            </a>
        </nav>


        <div class="container-fluid">
            <form name="login" id="login" method="POST" action="/PruebaWeb/Login.do">

                <div class="row">
                    <div class="col">&nbsp;</div>
                </div>   
                <div class="row">
                    <div class="col-md-4 offset-md-4 text-center" >
                        <label style="font-size: 300%; "><span style="font-weight: lighter">Inicio de</span> <Strong>Sesión</Strong></label>

                    </div>

                </div>


                <div class="row">
                    <div class="col-md-4 offset-md-4 text-center">
                        <span style="font-weight: lighter; font-size: 110%">Secretaría de Finanzas del Gobierno del Edo. de B.C.S.</span>
                    </div>
                </div>
                <div class="row">
                    <div class="col">&nbsp;</div>
                </div>  
                <div class="row form-group">

                    <div class="col-md-4 offset-md-4 ">   
                        <div class="input-group">

                            <input type="text" name="usuario" id="usuario" class="form-control" placeholder="Usuario"/> 
                            <div class="input-group-prepend">
                                <div class="input-group-text"><i class="fas fa-user"></i></div>
                            </div> 
                        </div>    
                    </div> 

                </div>
                <div class="row form-group">


                    <div class="col-md-4 offset-md-4 ">             
                        <div class="input-group">

                            <input type="password" name="contrasena" id="contrasena" class="form-control" placeholder="Contraseña" />
                            <div class="input-group-prepend">
                                <div class="input-group-text"><i class="fas fa-key"></i></div>
                            </div> 
                        </div> 
                    </div>   

                </div>
                <div class="row mt-0 mb-0">

                    <div class="col-md-4 offset-md-4">
                        <a href="" style="font-weight: lighter; color: #8aafdc">Olvidaste tu contraseña</a>
                    </div>
                </div>
                <div class="row">

                    <div class="col-md-4 offset-md-4">
                        <button type="submit" class="btn btn-primary btn-block" id="enviar">Iniciar Sesión
                            &nbsp;<i class="fas fa-arrow-circle-right"></i>
                        </button>
                    </div>        
                </div>
                <div class="row mt-0 mb-0">

                    <div class="col-lg-4 offset-lg-4">
                        <hr>
                    </div>
                </div>
                <div class="row mt-0 mb-0">

                    <div class="col text-center" style="color: lightgray; font-weight: lighter; font-size: 80%">
                        Copyright &copy; 2018 Dirección de Informática de la Secretaría de Finanzas del Gobierno del Estado de Baja California Sur.
                    </div>
                </div>
                <div class="row mt-0 mb-0">

                    <div class="col-lg-4 offset-lg-4">
                        <hr>
                    </div>
                </div>
            </form>

        </div>





    </body>
</html>        