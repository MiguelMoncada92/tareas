<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <link rel="stylesheet" type="text/css" href="../WebContent/WEB-INF/Style.css">
        <title>Checkboard</title>
        <style type="text/css">
        	* {
				margin:0px;
				padding: 0px;
				
			}
			div.container{
				width: 100%;
				min-height: 30%;
				margin: 10%;
			}
			div.azul {
				border:1px solid blue;
				height: 40px;
				width: 40px;
				display: inline-block;
			}
			div.rojo {
				height: 40px;
				width: 40px;
				display: inline-block;
				border: 1px solid red;
			}
			h1 {
				color: green;
			}
        </style>
    </head>

    <body>
       <div class="container">
        <%
       
        int ancho = Integer.parseInt(request.getParameter("ancho"));
        int alto = Integer.parseInt(request.getParameter("alto"));
        String divAzul = "<div class='azul'></div>";
        String divRojo = "<div class='rojo'></div>";	
        for (int j = 0; j < alto; j++){
        	if(j%2 == 0){
        	 %><div class="fila"><%
        	for (int i = 0; i < ancho; i ++){
        		if(i%2 == 0){%>
        			<%= divAzul %>
        		<%}
        		else if(i%2 != 0 ){%>
        			<%= divRojo %>
        		<%
        		}
        	}%></div>
			<%
        	}
        	if(j%2 != 0){
           	 %><div class="fila"><%
           	for (int i = 0; i < ancho; i ++){
           		if(i%2 == 0){%>
           			<%= divRojo %>
           		<%}
           		else if(i%2 != 0 ){%>
           			<%= divAzul %>
           		<%
           		}
           	}%></div>
   			<%
           	}
        	
        }
        %>
        
        </div>
    </body>

    </html>