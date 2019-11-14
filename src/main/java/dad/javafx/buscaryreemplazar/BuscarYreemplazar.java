package dad.javafx.buscaryreemplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYreemplazar extends Application {

	
	Label lbl_buscar;
	TextField txt_buscar;
	
	Label lbl_reemplazar;
	TextField txt_reemplazar;
	
	CheckBox cb_mayusculasMinusculas;
	CheckBox cb_buscarHaciaAtras;
	
	CheckBox cb_expresionRegular;
	CheckBox cb_resaltarResultados;
	
	Button btn_buscar;
	Button btn_reemplazar;
	Button btn_reemplazarTodo;
	Button btn_cerrar;
	Button btn_ayuda;
	
	public void start(Stage primaryStage) throws Exception {
		
		
				//Vbox etiquetas
		
				lbl_buscar = new Label("Buscar:");				
				lbl_buscar.setPrefWidth(90);	
				lbl_buscar.setMinWidth(48);
				
				
				lbl_reemplazar = new Label("Reemplazar con:");
				lbl_reemplazar.setPrefWidth(90);
				lbl_reemplazar.setMinWidth(48);
				
				
				VBox vbox_0 = new VBox(lbl_buscar, lbl_reemplazar);				
				vbox_0.setSpacing(15);
				vbox_0.setPadding(new Insets(5));
				

				
				txt_buscar = new TextField();				
				//txt_buscar.setPrefWidth(280);
				
				
				
				txt_reemplazar = new TextField();				
				//txt_reemplazar.setPrefWidth(280);
				
							
				
				
							
				cb_mayusculasMinusculas = new CheckBox("Mayúsculas y minúsculas");				
				cb_mayusculasMinusculas.setPrefWidth(165);	
				cb_mayusculasMinusculas.setMinWidth(135);
				cb_buscarHaciaAtras = new CheckBox("Buscar hacia atrás");
				cb_buscarHaciaAtras.setPrefWidth(130);
				cb_buscarHaciaAtras.setMinWidth(98);
				HBox hbox_0 = new HBox(cb_mayusculasMinusculas,cb_buscarHaciaAtras);
		
				
				cb_expresionRegular = new CheckBox("Expresión regular");
				cb_expresionRegular.setPrefWidth(165);
				cb_expresionRegular.setMinWidth(135);
				cb_resaltarResultados = new CheckBox("Resaltar resultados");
				cb_resaltarResultados.setPrefWidth(130);
				cb_resaltarResultados.setMinWidth(98);
				
				HBox hbox_1 = new HBox(cb_expresionRegular, cb_resaltarResultados);
				
				
				VBox vbox_1 = new VBox(txt_buscar, txt_reemplazar, hbox_0, hbox_1);
				vbox_1.setPadding(new Insets(5));
				vbox_1.setSpacing(5);
				
			
				
				btn_buscar = new Button("Buscar");
				btn_buscar.setMinWidth(130);
				btn_buscar.setMaxWidth(130);
				btn_reemplazar = new Button("Reemplazar");
				btn_reemplazar.setMinWidth(130);
				btn_reemplazar.setMaxWidth(130);
				btn_reemplazarTodo = new Button("Reemplazar todo");
				btn_reemplazarTodo.setMinWidth(130);	
				btn_reemplazarTodo.setMaxWidth(130);
				btn_cerrar = new Button("Cerrar");
				btn_cerrar.setMinWidth(130);
				btn_cerrar.setMaxWidth(130);
				btn_cerrar = new Button("Cerrar");
				btn_cerrar.setMinWidth(130);
				btn_cerrar.setMaxWidth(130);
				
				VBox vbox_2 = new VBox(btn_buscar, btn_reemplazar, btn_reemplazarTodo, btn_cerrar);
				vbox_2.setPadding(new Insets(5));
				vbox_2.setSpacing(5);
				
				HBox root = new HBox(vbox_0, vbox_1, vbox_2);
				
				root.setSpacing(5);
				root.setAlignment(Pos.CENTER);
			
				Scene scene = new Scene(root, 560, 240);
				
				primaryStage.setTitle("Buscar y reemplazar");
				primaryStage.setScene(scene);
				primaryStage.show();
				
				

	}

	public static void main(String[] args) {
		launch(args);
	}


}
