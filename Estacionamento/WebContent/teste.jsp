<html>
	<head>
		<title>	Sistema Integrado de Estacionamento</title>
	</head>

	<style>


	.content{
     margin: 30px;
    }
.botao01{
     background: -webkit-linear-gradient(bottom, #E0E0E0, #F9F9F9 70%);
     background: -moz-linear-gradient(bottom, #E0E0E0, #F9F9F9 70%);
     background: -o-linear-gradient(bottom, #E0E0E0, #F9F9F9 70%);
     background: -ms-linear-gradient(bottom, #E0E0E0, #F9F9F9 70%);
     background: linear-gradient(bottom, #E0E0E0, #F9F9F9 70%);
     border: 1px solid #CCCCCE;
     border-radius: 3px;
     box-shadow: 0 3px 0 rgba(0, 0, 0, .3),
                   0 2px 7px rgba(0, 0, 0, 0.2);
     color: #616165;
     display: block;
     font-family: "Trebuchet MS";
     font-size: 13px;
     font-weight: bold;
     line-height: 20px;
     text-align: center;
     text-decoration: none;
     text-transform: uppercase;
     text-shadow:1px 1px 0 #FFF;
     padding: 5px 15px;
     position: relative;
     width: 100px;
}
 
.botao01:before{
     border: 1px solid #FFF;
     border-radius: 3px;
     box-shadow: inset 0 -2px 12px -4px rgba(70, 70, 70, .2),
                   inset 0 3px 2px -1px rgba(255, 255, 255, 1);
     content: "";
     bottom: 0;
     left: 0;
     right: 0;
     top: 0;
     padding: 5px;
     position: absolute;
    }
 
    .botao01:after{
     background: rgba(255, 255, 255, .4);
     border-radius: 2px;
     content: "";
     bottom: 15px;
     left: 0px;
     right: 0px;
     top: 0px;
     position: absolute;
    }
 .botao01:active{
     box-shadow: inset 0 0 7px rgba(0, 0, 0, .2);
     top: 4px;
    }
    .botao01:active:before{
     border: none;
     box-shadow:none;
    }





		.transparent {
		    //background-color: rgba(0,0,0,0.5);
			height: 60px;
			width: 90%;
			margin: 0 45;
			
			border-radius: 25px;
		}

		.contato {
			position:absolute;
		    background-color: rgba(255,5,1,0.8);
			height: 30px;
			width: 100%;
			margin: 0 auto;
			text-align: center;
			border-radius: 15px;
			bottom: 5;
		}


		.username {
			margin: 10 50;
		}

		.center {
			margin: 10;
			top:7px;
			position:relative;
		}

		.center2 {
			margin: 5;
			float:left;
			vertical-align: top;
			position:relative;
		}

		.faixa {
		    background-color: rgba(238,232,195,1);
			height: 40px;
			width: 90%;
			margin: 0 50;
			border-radius: 0px;
		}

		.faixalogo {
		    background-color: rgba(238,232,195,1);
			height: 80px;
			width: 90%;
			margin: 0 50;
			
			border-radius: 0px;
		}

		
		img { 
			float:left;
			max-width:410%;
	    	max-height:410%;
    		width: auto;
    		height: auto;
			
		}
		

		.imagem { 
			background: url(1.jpg); 
			width:844px; 
			height:474px; 
			margin: 0 235;
			opacity:0.65;
			-moz-opacity: 0.65;
			filter: alpha(opacity=65);
		}


		.faixaout {
		    position:relative;
			height: 1000px;
			width: 92%;
			margin: -90 36;
			  border-top: 1px solid #C0C0C0;
   			border-right: 1px solid #C0C0C0;   
  				 border-bottom: 1px solid #C0C0C0;
  			 border-left: 1px solid #C0C0C0;
			
		}


		.out { 
			margin: 0 125;
			top:80px;
			position:relative;
		}

		.minha-div {
			right: 1060px;
			 position: absolute;
		    height: 50px;
		    width: 50px;
		    margin: 10 155;
		}

		</style>
		
		
		<script type="text/Javascript">
function send(action)
{
	switch(action) {
		case 'save':
			document.getElementById('salvar').value = "salvar";
			document.valores.submit();
			break;
		case 'update':
			document.getElementById('salvar').value = "alterar";
			document.valores.submit();
			break;
		case 'delete':
			document.getElementById('salvar').value = "excluir";
			document.valores.submit();
			break;
		case 'listar':
			document.getElementById('salvar').value = "listar";
			document.valores.submit();
			break;
	}
	
	document.forms[0].action = url;
	document.forms[0].submit();
}
</script>


		<body>
	<br><br>
	<div class="faixalogo">
	<div class="minha-div">
		 <img src="logocsi.png">
	</div>
	</div>
	<br><br><br>
		<div class=transparent>
			<div class=center2>
			<input type=submit class="botao01" value=Entrada >
			</div>
			<div class=center2>
			<input type=submit class="botao01" value=Saida>
			</div>
			<div class=center2>
			<input type=submit class="botao01" value=Clientes>
			</div>
			<div class=center2>
			<input type=submit class="botao01" value=Valores >
			</div>
		</div>
	
		<div class=faixa>
		<div class=center>
		
			<big><b>Apresentacao</b></big>
		
		</div>
		</div>

		<br><br><br><br>
			
			<div class=faixaout>
			<div class = out>
			<% String jsonInString = (String)request.getAttribute("jsonInString");%>
			<%
			if (jsonInString != null) {
			out.println ("JSON: "+request.getAttribute("jsonInString"));}
			// Controller.Valores obj = new Controller.Valores();
			// ObjectMapper mapper = new ObjectMapper();
			// Controller.Valores obj = mapper.readValue(jsonInString, Controller.Valores.class);
			//if (jsonInString != "") {
				
			//} 
			%>
			
				
					<form name="valores" method="get" action="ValoresController">
            <h2>Cadastro de Valores</h2>
            <p>ID:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            	<input type="text" id="id" name="id"></p>
            <p>Valor Horista:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            	<input type="text" id="horista" name="horista"></p>
            <p>Valor Mensalista:&nbsp&nbsp&nbsp&nbsp
            	<input type="text" id="mensalista" name="mensalista"></p>
            <input type="hidden" name="logica" id="salvar" value="">
          	
            
            <input type="button" value="Salvar" onclick="send('save');" />
			<input type="button" value="Alterar" onclick="send('update');" />
			<input type="button" value="Excluir" onclick="send('delete');" />
			<input type="button" value="Listar" onclick="send('listar');" />

                <input type="reset" value="cancelar"></p>
            
            	

        </form>

			</div>
			</div>

		
	</body>
</html>