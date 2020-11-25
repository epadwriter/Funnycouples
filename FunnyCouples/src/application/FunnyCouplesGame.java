package application;
	

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

public class FunnyCouplesGame extends Application {

	/* Se definen los elementos con los que se va a trabajar en JFx */

	int clic_uno = 0;
	int clic_dos = 0;
	int PosicionImagen;

	Scene miEscena;
	Pane contenedor;
	Button Btn1, Btn2, Btn3;
	ImageView Imagen1, Imagen2, Imagen3, Imagen4, Imagen5, Imagen6, Imagen7, Imagen8, Imagen9, Imagen10, Imagen11,
			Imagen12, Imagen13, Imagen14, Imagen15, Imagen16, Imagen17, Imagen18, Imagen19, Imagen20;
	Image ymagen1;

	ArrayList<String> imagenes;
	
	public static void main(String[] args) {

		Application.launch(args);

	}

	@Override
	public void start(Stage VentanaPrincipal) {

		Cartas carta1 = new Cartas();
		Cartas carta2 = new Cartas();
		Cartas carta3 = new Cartas();
		Cartas carta4 = new Cartas();
		Cartas carta5 = new Cartas();
		Cartas carta6 = new Cartas();
		Cartas carta7 = new Cartas();
		Cartas carta8 = new Cartas();
		Cartas carta9 = new Cartas();
		Cartas carta10 = new Cartas();
		Cartas carta11 = new Cartas();
		Cartas carta12 = new Cartas();
		Cartas carta13 = new Cartas();
		Cartas carta14 = new Cartas();
		Cartas carta15= new Cartas();
		Cartas carta16 = new Cartas();
		Cartas carta17 = new Cartas();
		Cartas carta18 = new Cartas();
		Cartas carta19 = new Cartas();
		Cartas carta20 = new Cartas();
		// nodo tipo texto
		Label mensaje = new Label(
				"Bienvenidos a FunnyCouples Game. Recuerde que debe encontrar todas las parejas en el menor de los intentos posibles. Buena suerte...");
		/* Elementos contenedor tema - se definen 3 botones con el respectivo tema */

		Btn1 = new Button("Matematicas");
		Btn1.setTranslateX(40);
		Btn1.setTranslateY(30);
		Btn1.setMinWidth(80);
		Btn3 = new Button("Programación");
		Btn3.setMinWidth(80);
		Btn3.setTranslateX(140);
		Btn3.setTranslateY(30);
		Btn2 = new Button("Inglés");
		Btn2.setMinWidth(80);
		Btn2.setTranslateX(240);
		Btn2.setTranslateY(30);
		
		Btn3 = new Button("Iniciar");
		Btn3.setMinWidth(80);
		Btn3.setTranslateX(540);
		Btn3.setTranslateY(30);
		
		
		Btn1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				
				carta1.setImagenCarta(Imagen1);
				
				
				imagenes = cartas.asignar_cartas_matematicas();
				Collections.shuffle(imagenes);
				
				//imageObject
				/*
				Image imageObject = new Image(imagenes.get(0));
				Imagen1.setImage(imageObject);
				imageObject = new Image(imagenes.get(1));
				Imagen2.setImage(imageObject);
				imageObject = new Image(imagenes.get(2));
				Imagen3.setImage(imageObject);
				imageObject = new Image(imagenes.get(3));
				Imagen4.setImage(imageObject);
				imageObject = new Image(imagenes.get(4));
				Imagen5.setImage(imageObject);
				imageObject = new Image(imagenes.get(5));
				Imagen6.setImage(imageObject);
				imageObject = new Image(imagenes.get(6));
				Imagen7.setImage(imageObject);
				imageObject = new Image(imagenes.get(7));
				Imagen8.setImage(imageObject);
				imageObject = new Image(imagenes.get(8));
				Imagen9.setImage(imageObject);
				imageObject = new Image(imagenes.get(9));
				Imagen10.setImage(imageObject);
				imageObject = new Image(imagenes.get(10));
				Imagen11.setImage(imageObject);
				imageObject = new Image(imagenes.get(11));
				Imagen12.setImage(imageObject);
				imageObject = new Image(imagenes.get(12));
				Imagen13.setImage(imageObject);
				imageObject = new Image(imagenes.get(13));
				Imagen14.setImage(imageObject);
				imageObject = new Image(imagenes.get(14));
				Imagen15.setImage(imageObject);
				imageObject = new Image(imagenes.get(15));
				Imagen16.setImage(imageObject);
				imageObject = new Image(imagenes.get(16));
				Imagen17.setImage(imageObject);
				imageObject = new Image(imagenes.get(17));
				Imagen18.setImage(imageObject);
				imageObject = new Image(imagenes.get(18));
				Imagen19.setImage(imageObject);
				imageObject = new Image(imagenes.get(19));
				Imagen20.setImage(imageObject);
				*/
			}
		});

		// imÃ¡genes

		/* Se definen los ImageView iniciales con la imagen incognita.jpg */
		Cartas carta1 = new Cartas();
		carta1.setImagenCarta(Imagen1);
		carta1.setCarta_Volteada(false);
		Imagen1 = new ImageView("Imagenes/incognita.jpg");
		Imagen1.relocate(10, 100);
		Imagen1.setFitWidth(155);
		Imagen1.setFitHeight(155);
		Imagen1.setPickOnBounds(true);

		Imagen1.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				clic_uno = 0;
				clic_dos = 0;
				PosicionImagen = 1;
				voltear_carta(carta1, Imagen1, imagenes.get(0));
			}
		});

		Cartas carta2 = new Cartas();
		carta2.setImagenCarta(Imagen2);
		carta2.setCarta_Volteada(false);
		Imagen2 = new ImageView("Imagenes/incognita.jpg");
		Imagen2.relocate(150, 100);
		Imagen2.setFitWidth(155);
		Imagen2.setFitHeight(155);
		Imagen2.setPickOnBounds(true);
		Imagen2.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 2;
				voltear_carta(carta2, Imagen2, imagenes.get(1));
			}
		});

		Cartas carta3 = new Cartas();
		carta3.setImagenCarta(Imagen3);
		carta3.setCarta_Volteada(false);
		Imagen3 = new ImageView("Imagenes/incognita.jpg");
		Imagen3.relocate(290, 100);
		Imagen3.setFitWidth(155);
		Imagen3.setFitHeight(155);

		Imagen3.setPickOnBounds(true);
		Imagen3.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 3;
				voltear_carta(carta3, Imagen3, imagenes.get(2));
			}
		});

		Cartas carta4 = new Cartas();
		carta4.setImagenCarta(Imagen4);
		carta4.setCarta_Volteada(false);
		Imagen4 = new ImageView("Imagenes/incognita.jpg");
		Imagen4.relocate(430, 100);
		Imagen4.setFitWidth(155);
		Imagen4.setFitHeight(155);
		Imagen4.setPickOnBounds(true);
		Imagen4.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 4;
				voltear_carta(carta4, Imagen4, imagenes.get(3));
			}
		});

		Cartas carta5 = new Cartas();
		carta5.setImagenCarta(Imagen5);
		carta5.setCarta_Volteada(false);
		Imagen5 = new ImageView("Imagenes/incognita.jpg");
		Imagen5.relocate(570, 100);
		Imagen5.setFitWidth(155);
		Imagen5.setFitHeight(155);
		Imagen5.setPickOnBounds(true);
		Imagen5.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 5;
				voltear_carta(carta5, Imagen5, imagenes.get(4));
			}
		});

		Cartas carta6 = new Cartas();
		carta6.setImagenCarta(Imagen6);
		carta6.setCarta_Volteada(false);
		Imagen6 = new ImageView("Imagenes/incognita.jpg");
		Imagen6.relocate(10, 250);
		Imagen6.setFitWidth(155);
		Imagen6.setFitHeight(155);
		Imagen6.setPickOnBounds(true);
		Imagen6.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 6;
				voltear_carta(carta6,Imagen6,imagenes.get(5));
			}


		});

		Cartas carta7 = new Cartas();
		carta7.setImagenCarta(Imagen7);
		carta7.setCarta_Volteada(false);
		Imagen7 = new ImageView("Imagenes/incognita.jpg");
		Imagen7.relocate(150, 250);
		Imagen7.setFitWidth(155);
		Imagen7.setFitHeight(155);
		Imagen7.setPickOnBounds(true);
		Imagen7.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 7;
				voltear_carta(carta7,Imagen7,imagenes.get(6));
			}
		});

		Cartas carta8 = new Cartas();
		carta8.setImagenCarta(Imagen8);
		carta8.setCarta_Volteada(false);
		Imagen8 = new ImageView("Imagenes/incognita.jpg");
		Imagen8.relocate(290, 250);
		Imagen8.setFitWidth(155);
		Imagen8.setFitHeight(155);
		Imagen8.setPickOnBounds(true);
		Imagen8.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 8;
				voltear_carta(carta8,Imagen8,imagenes.get(7));
			}
		});

		Cartas carta9 = new Cartas();
		carta9.setImagenCarta(Imagen9);
		carta9.setCarta_Volteada(false);
		Imagen9 = new ImageView("Imagenes/incognita.jpg");
		Imagen9.relocate(430, 250);
		Imagen9.setFitWidth(155);
		Imagen9.setFitHeight(155);
		Imagen9.setPickOnBounds(true);
		Imagen9.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 9;
				voltear_carta(carta9,Imagen9,imagenes.get(8));
			}
		});

		Cartas carta10 = new Cartas();
		carta10.setImagenCarta(Imagen10);
		carta10.setCarta_Volteada(false);
		Imagen10 = new ImageView("Imagenes/incognita.jpg");
		Imagen10.relocate(570, 250);
		Imagen10.setFitWidth(155);
		Imagen10.setFitHeight(155);
		Imagen10.setPickOnBounds(true);
		Imagen10.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 10;
				voltear_carta(carta10,Imagen10,imagenes.get(9));
			}
		});

		Cartas carta11 = new Cartas();
		carta11.setImagenCarta(Imagen11);
		carta11.setCarta_Volteada(false);
		Imagen11 = new ImageView("Imagenes/incognita.jpg");
		Imagen11.relocate(10, 400);
		Imagen11.setFitWidth(155);
		Imagen11.setFitHeight(155);
		Imagen11.setPickOnBounds(true);
		Imagen11.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 11;

			}
		});

		Cartas carta12 = new Cartas();
		carta12.setImagenCarta(Imagen12);
		carta12.setCarta_Volteada(false);
		Imagen12 = new ImageView("Imagenes/incognita.jpg");
		Imagen12.relocate(150, 400);
		Imagen12.setFitWidth(155);
		Imagen12.setFitHeight(155);
		Imagen12.setPickOnBounds(true);
		Imagen12.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 12;

			}
		});

		Cartas carta13 = new Cartas();
		carta13.setImagenCarta(Imagen13);
		carta13.setCarta_Volteada(false);
		Imagen13 = new ImageView("Imagenes/incognita.jpg");
		Imagen13.relocate(290, 400);
		Imagen13.setFitWidth(155);
		Imagen13.setFitHeight(155);
		Imagen13.setPickOnBounds(true);
		Imagen13.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 13;

			}
		});

		Cartas carta14 = new Cartas();
		carta14.setImagenCarta(Imagen14);
		carta14.setCarta_Volteada(false);
		Imagen14 = new ImageView("Imagenes/incognita.jpg");
		Imagen14.relocate(430, 400);
		Imagen14.setFitWidth(155);
		Imagen14.setFitHeight(155);
		Imagen14.setPickOnBounds(true);
		Imagen14.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 14;

			}
		});

		Cartas carta15 = new Cartas();
		carta15.setImagenCarta(Imagen15);
		carta15.setCarta_Volteada(false);
		Imagen15 = new ImageView("Imagenes/incognita.jpg");
		Imagen15.relocate(570, 400);
		Imagen15.setFitWidth(155);
		Imagen15.setFitHeight(155);
		Imagen15.setPickOnBounds(true);
		Imagen15.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 15;

			}
		});

		Cartas carta16 = new Cartas();
		carta16.setImagenCarta(Imagen16);
		carta16.setCarta_Volteada(false);
		Imagen16 = new ImageView("Imagenes/incognita.jpg");
		Imagen16.relocate(10, 550);
		Imagen16.setFitWidth(155);
		Imagen16.setFitHeight(155);
		Imagen16.setPickOnBounds(true);
		Imagen16.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 16;

			}
		});

		Cartas carta17 = new Cartas();
		carta17.setImagenCarta(Imagen17);
		carta17.setCarta_Volteada(false);
		Imagen17 = new ImageView("Imagenes/incognita.jpg");
		Imagen17.relocate(150, 550);
		Imagen17.setFitWidth(155);
		Imagen17.setFitHeight(155);
		Imagen17.setPickOnBounds(true);
		Imagen17.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 17;

			}
		});

		Cartas carta18 = new Cartas();
		carta18.setImagenCarta(Imagen18);
		carta18.setCarta_Volteada(false);
		Imagen18 = new ImageView("Imagenes/incognita.jpg");
		Imagen18.relocate(290, 550);
		Imagen18.setFitWidth(155);
		Imagen18.setFitHeight(155);
		Imagen18.setPickOnBounds(true);
		Imagen18.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 18;

			}
		});

		Cartas carta19 = new Cartas();
		carta19.setImagenCarta(Imagen19);
		carta19.setCarta_Volteada(false);
		Imagen19 = new ImageView("Imagenes/incognita.jpg");
		Imagen19.relocate(430, 550);
		Imagen19.setFitWidth(155);
		Imagen19.setFitHeight(155);
		Imagen19.setPickOnBounds(true);
		Imagen19.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 19;

			}
		});

		Cartas carta20 = new Cartas();
		carta20.setImagenCarta(Imagen20);
		carta20.setCarta_Volteada(false);
		Imagen20 = new ImageView("Imagenes/incognita.jpg");
		Imagen20.relocate(570, 550);
		Imagen20.setFitWidth(155);
		Imagen20.setFitHeight(155);
		Imagen20.setPickOnBounds(true);
		Imagen20.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Double clicked");
				PosicionImagen = 20;

			}
		});

		//

		Pane contenedor = new Pane();

		contenedor.getChildren().addAll(Btn1, Btn2, Btn3, mensaje, Imagen1, Imagen2, Imagen3, Imagen4, Imagen5, Imagen6,
				Imagen7, Imagen8, Imagen9, Imagen10, Imagen11, Imagen12, Imagen13, Imagen14, Imagen15, Imagen16, Imagen17,
				Imagen18, Imagen19, Imagen20);
		// contenedor.getChildren().add(mensaje);
		// tamaÃ±o de contenedor
		contenedor.setMinSize(400, 500);
		// ahora crear escena
		Scene Miescena = new Scene(contenedor);

		//

		//

		// propiedades del escenario
		VentanaPrincipal.setTitle("FunnyCouples Game 1.0");
		VentanaPrincipal.setMinHeight(700);
		VentanaPrincipal.setMinWidth(700);
		// asignar escena a escenario
		VentanaPrincipal.setScene(Miescena);
		// mostrar en pantalla
		VentanaPrincipal.show();
		
		Btn3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				
				/*
				ImageView imagebject = new ImageView("Imagenes/incognita.jpg");
				Image imageObject;
				Imagen1.setImage(imageObject);
				Imagen2.setImage(imageObject);
				Imagen3.setImage(imageObject);
				Imagen4.setImage(imageObject);
				Imagen5.setImage(imageObject);
				Imagen6.setImage(imageObject);
				Imagen7.setImage(imageObject);
				Imagen8.setImage(imageObject);
				Imagen9.setImage(imageObject);
				Imagen10.setImage(imageObject);
				Imagen11.setImage(imageObject);
				Imagen12.setImage(imageObject);
				Imagen13.setImage(imageObject);
				Imagen14.setImage(imageObject);
				Imagen15.setImage(imageObject);
				Imagen16.setImage(imageObject);
				Imagen17.setImage(imageObject);
				Imagen18.setImage(imageObject);
				Imagen19.setImage(imageObject);
				Imagen20.setImage(imageObject); */
				
				carta1.setCarta_Volteada(true);
				carta2.setCarta_Volteada(true);
				carta3.setCarta_Volteada(true);
				carta4.setCarta_Volteada(true);
				carta5.setCarta_Volteada(true);
				carta6.setCarta_Volteada(true);
				carta7.setCarta_Volteada(true);
				carta8.setCarta_Volteada(true);
				carta9.setCarta_Volteada(true);
				carta10.setCarta_Volteada(true);
				carta11.setCarta_Volteada(true);
				carta12.setCarta_Volteada(true);
				carta13.setCarta_Volteada(true);
				carta14.setCarta_Volteada(true);
				carta15.setCarta_Volteada(true);
				carta16.setCarta_Volteada(true);
				carta17.setCarta_Volteada(true);
				carta18.setCarta_Volteada(true);
				carta19.setCarta_Volteada(true);
				carta20.setCarta_Volteada(true);
				
				
			}
		});

	}
	
	private void voltear_carta(Cartas carta, ImageView imagen,String imagenes) {
		if(carta.isCarta_Volteada()) {
			carta.setCarta_Volteada(false);
			Image imageObject = new Image(imagenes);
			imagen.setImage(imageObject);
		}else {
			carta.setCarta_Volteada(true);
			Image imageObject = new Image("Imagenes/incognita.jpg");
			imagen.setImage(imageObject);
		}
	}

}
