
import javafx.application.Application;
import javafx.event.*;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.AnimationTimer;
import java.util.*;

public class Main extends Application {

    public static void main(String[] args) {
        int buffer[][] = new int[256][256];
        // 32 x 32 grid
        // 16 x 16 sprite
        Player player = new Player(0, 0, 90);
        // getX(), getY(), getD(), move(), and turn()
        launch(args);

    }

    @Override
    public void start(Stage s) {
//         Hbox sets horizontal
//         Vbox sets vertical
//         BorderPane sets top, left, right, bottom, and center
//         AnchorPane sets distance of node from window
//         TextFlow sets text nodes in a flow
//         TilePane sets nodes in uniformly sized boxes
//         GridPane sets rows and columns (used for forms)

        Group root = new Group();
        AnchorPane anchor = new AnchorPane();
        VBox vbox = new VBox();
		Buttons buttons = new Buttons();

        Canvas c = new Canvas(640, 480);
        root.getChildren.add(c);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        Font testFont = Font.font("Times New Roman", FontWeight.BOLD, 48);
        gc.setFont(testFont);
        gc.fillText("Times New Roman", 60, 50);
        gc.strokeText("Times New Roman", 60, 50);
        Image earth = new Image( "earth.png" );
        gc.drawImage( earth, 180, 100 );

        // Image i1 = new Image("player.png");

		root.getChildren().add(anchor);
		anchor.getChildren().add(vbox);
        anchor.setLeftAnchor(vbox, 5.0);
        vbox.setSpacing(10.0);
        vbox.setPadding(new Insets(5, 5, 5, 5));

        Button menuButtons[] = new Button[20];

        for (int i = 0; i < 4; i++) {
            menuButtons[i] = new Button();
        }

        for (int i = 0; i < 4; i++) {
            menuButtons[i].setMinWidth(100.0);
        	menuButtons[i].setMaxWidth(100.0);
        }

        for (int i = 0; i < 4; i ++) {
            vbox.getChildren().add(menuButtons[i]);
        }

        menuButtons[0].setText("New game");
        menuButtons[1].setText("Load game");
        menuButtons[2].setText("Settings");
        menuButtons[3].setText("About");

        ArrayList<String> input = new ArrayList<String>();

        menuButtons[0].setOnAction(new EventHandler<ActionEvent>() {
			@Override
        	public void handle(ActionEvent e) {
            	buttons.newGame();
        	}
        });
		menuButtons[1].setOnAction(new EventHandler<ActionEvent>() {
			@Override
        	public void handle(ActionEvent e) {
            	buttons.loadGame();
        	}
        });
		menuButtons[2].setOnAction(new EventHandler<ActionEvent>() {
			@Override
        	public void handle(ActionEvent e) {
            	buttons.changeSettings();
        	}
        });
		menuButtons[3].setOnAction(new EventHandler<ActionEvent>() {
			@Override
        	public void handle(ActionEvent e) {
            	buttons.showAbout();
        	}
        });

        Scene sc = new Scene(root, 640, 480, Color.BLACK);

        sc.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    String stringCode = event.getCode().toString();
                    case UP: if (!input.contains(stringCode)) {
                        input.add(stringCode);
                    }
                }
        });
        sc.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode().toString()) {
                    case UP: 
                }
            }
        });

        s.setTitle("Simulation Game");
        s.setScene(sc);
        s.setResizable(false);
        s.show();

    }

}
