import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Driver extends Application {
	public static void main(String[] args) {

		Product[] productArray = new Product[100];
		Dispenser dispenser = new Dispenser();
		
		dispenser.displayProducts();
		productArray = dispenser.getProducts();
		
		
		
		 launch(args);
		 }
	
	        @Override
	        // The start() method is the main entry point for JavaFX applications.
	        public void start(Stage primaryStage) {
	            primaryStage.setTitle("Vending Machine");
	           
	            Transaction productTransaction = new Transaction();
	            
	            Image drinkImage = new Image("drinksImage.jpg");
	            ImageView drinkImageView = new ImageView();
	            drinkImageView.setImage(drinkImage);
	            drinkImageView.setFitHeight(250);
	            drinkImageView.setFitWidth(250);
	             
	            Image candyImage = new Image("candyImage.jpg");
	            ImageView candyImageView = new ImageView();
	            candyImageView.setImage(candyImage);
	            candyImageView.setFitHeight(250);
	            candyImageView.setFitWidth(250);
	            
	            Image chipsImage = new Image("chipsImage.jpg");
	            ImageView chipsImageView = new ImageView();
	            chipsImageView.setImage(chipsImage);
	            chipsImageView.setFitHeight(250);
	            chipsImageView.setFitWidth(250);
	            
	            
	            Image gumImage = new Image("gumImage.jpg");
	            ImageView gumImageView = new ImageView();
	            gumImageView.setImage(gumImage);
	            gumImageView.setFitHeight(250);
	            gumImageView.setFitWidth(250);
	            
	            Button buttonDrinks = new Button();
	            Button buttonCandy = new Button();
	            Button buttonChips = new Button();
	            Button buttonGum = new Button();
	            Button buttonCheckout = new Button();
	            Button buttonClose = new Button();
	            buttonCheckout.setStyle("-fx-font-size: 20; -fx-font-weight: bold");
	            buttonClose.setStyle("-fx-font-size: 20; -fx-font-weight: bold");
	           
	            
	            // Add text to the button
	            buttonDrinks.setText("DRINKS");
	            buttonCandy.setText("CANDY");
	            buttonChips.setText("CHIPS");
	            buttonGum.setText("GUM");
	            buttonCheckout.setText("Checkout");
	            buttonClose.setText("Close");
	            buttonDrinks.setMinWidth(250);
	            buttonDrinks.setMinHeight(50);
	            buttonCandy.setMinWidth(250);
	            buttonCandy.setMinHeight(50);
	            buttonChips.setMinWidth(250);
	            buttonChips.setMinHeight(50);
	            buttonGum.setMinWidth(250);
	            buttonGum.setMinHeight(50);   
	            buttonCheckout.setMinWidth(250);
	            buttonCheckout.setMinHeight(50);   
	            buttonClose.setMinWidth(250);
	            buttonClose.setMinHeight(50);  
	            
	            GridPane productGridPane = new GridPane();
	            
	            productGridPane.setConstraints(drinkImageView, 1, 1);
	            productGridPane.setConstraints(buttonDrinks, 1, 2);
	            productGridPane.setConstraints(candyImageView, 2, 1);
	            productGridPane.setConstraints(buttonCandy, 2, 2);
	            productGridPane.setConstraints(chipsImageView, 1, 3);
	            productGridPane.setConstraints(buttonChips, 1, 4);
	            productGridPane.setConstraints(gumImageView, 2, 3);
	            productGridPane.setConstraints(buttonGum, 2, 4);
	            productGridPane.setConstraints(buttonCheckout, 1, 5);
	            productGridPane.setConstraints(buttonClose, 2, 5);

	            //productGridPane.getChildren().addAll(drinkImageView, buttonDrinks, candyImageView, buttonCandy, chipsImageView, buttonChips, gumImageView, buttonGum);
	            productGridPane.getChildren().addAll(buttonClose, buttonCheckout, buttonDrinks, buttonCandy, buttonChips, buttonGum,drinkImageView, candyImageView, chipsImageView, gumImageView);

	            // Add event handler for the drinks button
	            buttonDrinks.setOnAction(new EventHandler<ActionEvent>() {
	                @Override
	                // Override the handle method
	                public void handle(ActionEvent event) {
	                    //System.out.println("I want a beverage");
	                	Stage drinkStage = new Stage(); // Create a new stage
	                	drinkStage.setTitle("Drinks"); // Set the stage title
	                	
	                	Button btnDrink1 = new Button();
	                	Button btnDrink2 = new Button();
	                	Button btnDrink3 = new Button();
	                	Button btnDrink4 = new Button();
	                	Button btnClose = new Button();
	                	
	                	btnDrink1.setMinWidth(250);
	                	btnDrink1.setMinHeight(50);
	                	btnDrink2.setMinWidth(250);
	                	btnDrink2.setMinHeight(50);
	                	btnDrink3.setMinWidth(250);
	                	btnDrink3.setMinHeight(50);
	                	btnDrink4.setMinWidth(250);
	                    btnDrink4.setMinHeight(50);
	                    btnClose.setMinWidth(250);
	                    btnClose.setMinHeight(50);
	                    
	                    Image drinkImage1 = new Image("pepsi.jpg");
	                    ImageView drinkImageView1 = new ImageView();
	                    drinkImageView1.setImage(drinkImage1);
	                    drinkImageView1.setFitHeight(250);
	                    drinkImageView1.setFitWidth(250);
	                    
	                    Image drinkImage2 = new Image("mountainDew.png");
	                    ImageView drinkImageView2 = new ImageView();
	                    drinkImageView2.setImage(drinkImage2);
	                    drinkImageView2.setFitHeight(250);
	                    drinkImageView2.setFitWidth(250);
	                    
	                    Image drinkImage3 = new Image("drpepper.png");
	                    ImageView drinkImageView3 = new ImageView();
	                    drinkImageView3.setImage(drinkImage3);
	                    drinkImageView3.setFitHeight(250);
	                    drinkImageView3.setFitWidth(250);
	                    
	                    Image drinkImage4 = new Image("sierramist.png");
	                    ImageView drinkImageView4 = new ImageView();
	                    drinkImageView4.setImage(drinkImage4);
	                    drinkImageView4.setFitHeight(250);
	                    drinkImageView4.setFitWidth(250);
	                	
	                	btnDrink1.setText("$2.00 - Pepsi");
	                	btnDrink2.setText("$2.00 - Mountain Dew");
	                	btnDrink3.setText("$2.00 - Dr. Pepper");
	                	btnDrink4.setText("$2.00 - Sierra Mist");
	                	btnClose.setText("Close");
	                	btnClose.setStyle("-fx-font-size: 20; -fx-font-weight: bold");
	                	
	                	GridPane drinkGridPane = new GridPane();
	                	
	                	drinkGridPane.setConstraints(drinkImageView1, 1, 1);
	                	drinkGridPane.setConstraints(btnDrink1, 1, 2);
	                	drinkGridPane.setConstraints(drinkImageView2, 2, 1);
	                	drinkGridPane.setConstraints(btnDrink2, 2, 2);
	                	drinkGridPane.setConstraints(drinkImageView3, 1, 3);
	                	drinkGridPane.setConstraints(btnDrink3, 1, 4);
	                	drinkGridPane.setConstraints(drinkImageView4, 2, 3);
	                	drinkGridPane.setConstraints(btnDrink4, 2, 4);
	                	drinkGridPane.setConstraints(btnClose, 1, 5);
	                	
	                	drinkGridPane.getChildren().addAll(btnClose, btnDrink1, btnDrink2, btnDrink3, btnDrink4, drinkImageView1, drinkImageView2, drinkImageView3, drinkImageView4);
	                	
	                	Alert alert = new Alert(AlertType.INFORMATION);
	                	alert.setTitle("Transaction");
	                	alert.setHeaderText(null);
	                	alert.setContentText("Drink Added to the Cart");

	                	
	    	            // Add event handler for the Checkout button
	    	            btnDrink1.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Pepsi", 2.00);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	    	            btnDrink2.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Mountain Dew", 2.00);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	    	            btnDrink3.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Dr. Pepper", 2.00);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	    	            btnDrink4.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Sierra Mist", 2.00);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	    	            btnClose.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    drinkStage.close();
	    	                }
	    	            });
	                	
	                    // Set a scene with a button in the stage
	                	drinkStage.setScene(new Scene(drinkGridPane, 600, 650));
	                    drinkStage.show();
	                }
	            });
	            
	            
	            // Add event handler for the Chips button
	            buttonChips.setOnAction(new EventHandler<ActionEvent>() {
	                @Override
	                // Override the handle method
	                public void handle(ActionEvent event) {
	                    //System.out.println("I want a snack");
	                    Stage chipsStage = new Stage(); // Create a new stage
	                    chipsStage.setTitle("Chips"); // Set the stage title
	                    // Set a scene with a button in the stage
	                    
	                    Image ChipsImage1 = new Image("lays-classic.jpg");
	                    ImageView ChipsImageView1 = new ImageView();
	                    ChipsImageView1.setImage(ChipsImage1);
	                    ChipsImageView1.setFitHeight(200);
	                    ChipsImageView1.setFitWidth(200);
	                    
	                    Image ChipsImage2 = new Image("lays-flamin-hot.png");
	                    ImageView ChipsImageView2 = new ImageView();
	                    ChipsImageView2.setImage(ChipsImage2);
	                    ChipsImageView2.setFitHeight(200);
	                    ChipsImageView2.setFitWidth(200);
	                    
	                    Image ChipsImage3 = new Image("cheetos-crunchy-cheese.png");
	                    ImageView ChipsImageView3 = new ImageView();
	                    ChipsImageView3.setImage(ChipsImage3);
	                    ChipsImageView3.setFitHeight(200);
	                    ChipsImageView3.setFitWidth(200);
	                    
	                    Image ChipsImage4 = new Image("cheetos-crunchy-flamin-hot.png");
	                    ImageView ChipsImageView4 = new ImageView();
	                    ChipsImageView4.setImage(ChipsImage4);
	                    ChipsImageView4.setFitHeight(200);
	                    ChipsImageView4.setFitWidth(200);
	                    
	                	Button btnChips1 = new Button();
	                	Button btnChips2 = new Button();
	                	Button btnChips3 = new Button();
	                	Button btnChips4 = new Button();
	                	Button btnClose = new Button();
	                	
	                	btnChips1.setMinWidth(200);
	                	btnChips1.setMinHeight(50);
	                	btnChips2.setMinWidth(200);
	                	btnChips2.setMinHeight(50);
	                	btnChips3.setMinWidth(200);
	                	btnChips3.setMinHeight(50);
	                	btnChips4.setMinWidth(200);
	                	btnChips4.setMinHeight(50);
	                	btnClose.setMinWidth(200);
	                	btnClose.setMinHeight(50);
	                	
	                	btnChips1.setText("$1.50 - Classic Lays");
	                	btnChips2.setText("$1.50 - Flamin Hot Lays");
	                	btnChips3.setText("$1.50 - Cheetos");
	                	btnChips4.setText("$1.50 - Flamin Hot Cheetos");
	                	btnClose.setText("Close");
	                	btnClose.setStyle("-fx-font-size: 20; -fx-font-weight: bold");
	                	
	                	GridPane ChipsGridPane = new GridPane();
	                	
	                	ChipsGridPane.setConstraints(ChipsImageView1, 1, 1);
	                	ChipsGridPane.setConstraints(btnChips1, 1, 2);
	                	ChipsGridPane.setConstraints(ChipsImageView2, 2, 1);
	                	ChipsGridPane.setConstraints(btnChips2, 2, 2);
	                	ChipsGridPane.setConstraints(ChipsImageView3, 1, 3);
	                	ChipsGridPane.setConstraints(btnChips3, 1, 4);
	                	ChipsGridPane.setConstraints(ChipsImageView4, 2, 3);
	                	ChipsGridPane.setConstraints(btnChips4, 2, 4);
	                	ChipsGridPane.setConstraints(btnClose, 1, 5);
	                	
	                	ChipsGridPane.getChildren().addAll(btnClose, btnChips1, btnChips2, btnChips3, btnChips4, ChipsImageView1, ChipsImageView2, ChipsImageView3, ChipsImageView4);
	                	
	                	Alert alert = new Alert(AlertType.INFORMATION);
	                	alert.setTitle("Transaction");
	                	alert.setHeaderText(null);
	                	alert.setContentText("Chips Added to the Cart");
	                	
	    	            // Add event handler for the Checkout button
	                	btnChips1.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Classic Lays", 1.50);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	                	btnChips2.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Flamin'Hot Lays", 1.50);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	                	btnChips3.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Cheetos", 1.50);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	                	btnChips4.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Flamin'Hot Cheetos", 2.00);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	                	
	    	            // Add event handler for the Checkout button
	    	            btnClose.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    chipsStage.close();
	    	                }
	    	            });
	                	
	                	chipsStage.setScene(new Scene(ChipsGridPane, 500, 600));
	                    chipsStage.show();
	                }
	            });
	            
	            // Add event handler for the Candy button
	            buttonCandy.setOnAction(new EventHandler<ActionEvent>() {
	                @Override
	                // Override the handle method
	                public void handle(ActionEvent event) {
	                    //System.out.println("I want a snack");
	                    Stage candyStage = new Stage(); // Create a new stage
	                    candyStage.setTitle("Candy"); // Set the stage title
	                    
	                    Image CandyImage1 = new Image("m&m.jpg");
	                    ImageView CandyImageView1 = new ImageView();
	                    CandyImageView1.setImage(CandyImage1);
	                    CandyImageView1.setFitHeight(200);
	                    CandyImageView1.setFitWidth(200);
	                    
	                    Image CandyImage2 = new Image("Kit-Kat-Wrapper-Small.jpg");
	                    ImageView CandyImageView2 = new ImageView();
	                    CandyImageView2.setImage(CandyImage2);
	                    CandyImageView2.setFitHeight(200);
	                    CandyImageView2.setFitWidth(200);
	                    
	                    Image CandyImage3 = new Image("Nestle-crunch-small.jpg");
	                    ImageView CandyImageView3 = new ImageView();
	                    CandyImageView3.setImage(CandyImage3);
	                    CandyImageView3.setFitHeight(200);
	                    CandyImageView3.setFitWidth(200);
	                    
	                    Image CandyImage4 = new Image("Twix-Wrapper-Small.jpg");
	                    ImageView CandyImageView4 = new ImageView();
	                    CandyImageView4.setImage(CandyImage4);
	                    CandyImageView4.setFitHeight(200);
	                    CandyImageView4.setFitWidth(200);
	                    
	                	Button btnCandy1 = new Button();
	                	Button btnCandy2 = new Button();
	                	Button btnCandy3 = new Button();
	                	Button btnCandy4 = new Button();
	                	Button btnClose = new Button();
	                	
	                	btnCandy1.setMinWidth(200);
	                	btnCandy1.setMinHeight(50);
	                	btnCandy2.setMinWidth(200);
	                	btnCandy2.setMinHeight(50);
	                	btnCandy3.setMinWidth(200);
	                	btnCandy3.setMinHeight(50);
	                	btnCandy4.setMinWidth(200);
	                	btnCandy4.setMinHeight(50);
	                	btnClose.setMinWidth(200);
	                	btnClose.setMinHeight(50);
	                	
	                	btnCandy1.setText("$1.50 - M&M");
	                	btnCandy2.setText("$1.50 - KitKat");
	                	btnCandy3.setText("$1.50 - Crunch Bar");
	                	btnCandy4.setText("$1.50 - Twix");
	                	btnClose.setText("Close");
	                	btnClose.setStyle("-fx-font-size: 20; -fx-font-weight: bold");
	                	
	                	GridPane CandyGridPane = new GridPane();
	                	
	                	CandyGridPane.setConstraints(CandyImageView1, 1, 1);
	                	CandyGridPane.setConstraints(btnCandy1, 1, 2);
	                	CandyGridPane.setConstraints(CandyImageView2, 2, 1);
	                	CandyGridPane.setConstraints(btnCandy2, 2, 2);
	                	CandyGridPane.setConstraints(CandyImageView3, 1, 3);
	                	CandyGridPane.setConstraints(btnCandy3, 1, 4);
	                	CandyGridPane.setConstraints(CandyImageView4, 2, 3);
	                	CandyGridPane.setConstraints(btnCandy4, 2, 4);
	                	CandyGridPane.setConstraints(btnClose, 1, 5);
	                	
	                	CandyGridPane.getChildren().addAll(btnClose, btnCandy1, btnCandy2, btnCandy3, btnCandy4, CandyImageView1, CandyImageView2, CandyImageView3, CandyImageView4);
	                	
	                	Alert alert = new Alert(AlertType.INFORMATION);
	                	alert.setTitle("Transaction");
	                	alert.setHeaderText(null);
	                	alert.setContentText("Candy Added to the Cart");

	    	            // Add event handler for the Checkout button
	                	btnCandy1.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("M&Ms", 1.50);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	                	btnCandy2.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("KitKat", 1.50);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	                	btnCandy3.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Crunch", 1.50);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	                	btnCandy4.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Twix", 1.50);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	                	
	    	            // Add event handler for the Checkout button
	    	            btnClose.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    candyStage.close();
	    	                }
	    	            });
	    	            
	                    // Set a scene with a button in the stage
	                	candyStage.setScene(new Scene(CandyGridPane, 500, 600));
	                    candyStage.show();
	                }
	            });
	            
	            // Add event handler for the Candy button
	            buttonGum.setOnAction(new EventHandler<ActionEvent>() {
	                @Override
	                // Override the handle method
	                public void handle(ActionEvent event) {
	                    //System.out.println("I want a snack");
	                    Stage gumStage = new Stage(); // Create a new stage
	                    gumStage.setTitle("Gum"); // Set the stage title
	                    
	                    Image GumImage1 = new Image("wrigleyjuicyfruit.jpg");
	                    ImageView GumImageView1 = new ImageView();
	                    GumImageView1.setImage(GumImage1);
	                    GumImageView1.setFitHeight(200);
	                    GumImageView1.setFitWidth(200);
	                    
	                    Image GumImage2 = new Image("doublemint.jpg");
	                    ImageView GumImageView2 = new ImageView();
	                    GumImageView2.setImage(GumImage2);
	                    GumImageView2.setFitHeight(200);
	                    GumImageView2.setFitWidth(200);
	                    
	                    Image GumImage3 = new Image("bigRed.png");
	                    ImageView GumImageView3 = new ImageView();
	                    GumImageView3.setImage(GumImage3);
	                    GumImageView3.setFitHeight(200);
	                    GumImageView3.setFitWidth(200);
	                    
	                    Image GumImage4 = new Image("bubbleyum.jpg");
	                    ImageView GumImageView4 = new ImageView();
	                    GumImageView4.setImage(GumImage4);
	                    GumImageView4.setFitHeight(200);
	                    GumImageView4.setFitWidth(200);
	                    
	                	Button btnGum1 = new Button();
	                	Button btnGum2 = new Button();
	                	Button btnGum3 = new Button();
	                	Button btnGum4 = new Button();
	                	Button btnClose = new Button();
	                	
	                	btnGum1.setMinWidth(200);
	                	btnGum1.setMinHeight(50);
	                	btnGum2.setMinWidth(200);
	                	btnGum2.setMinHeight(50);
	                	btnGum3.setMinWidth(200);
	                	btnGum3.setMinHeight(50);
	                	btnGum4.setMinWidth(200);
	                	btnGum4.setMinHeight(50);
	                	btnClose.setMinWidth(200);
	                	btnClose.setMinHeight(50);
	                	
	                	btnGum1.setText("$1.00 - Juciy Fruit");
	                	btnGum2.setText("$1.00 - Doublemint");
	                	btnGum3.setText("$1.00 - Big Red");
	                	btnGum4.setText("$1.00 - Bubble Yum Cotton Candy");
	                	btnClose.setText("Close");
	                	btnClose.setStyle("-fx-font-size: 20; -fx-font-weight: bold");
	                	
	                	GridPane GumGridPane = new GridPane();
	                	
	                	GumGridPane.setConstraints(GumImageView1, 1, 1);
	                	GumGridPane.setConstraints(btnGum1, 1, 2);
	                	GumGridPane.setConstraints(GumImageView2, 2, 1);
	                	GumGridPane.setConstraints(btnGum2, 2, 2);
	                	GumGridPane.setConstraints(GumImageView3, 1, 3);
	                	GumGridPane.setConstraints(btnGum3, 1, 4);
	                	GumGridPane.setConstraints(GumImageView4, 2, 3);
	                	GumGridPane.setConstraints(btnGum4, 2, 4);
	                	GumGridPane.setConstraints(btnClose, 1, 5);
	                	
	                	// Set a scene with a button in the stage
	                	GumGridPane.getChildren().addAll(btnClose, btnGum1, btnGum2, btnGum3, btnGum4, GumImageView1, GumImageView2, GumImageView3, GumImageView4);
	                	
	                	Alert alert = new Alert(AlertType.INFORMATION);
	                	alert.setTitle("Transaction");
	                	alert.setHeaderText(null);
	                	alert.setContentText("Gum Added to the Cart");
	                	
	    	            // Add event handler for the Checkout button
	                	btnGum1.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Juicy Fruit", 1.00);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	                	btnGum2.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Doublemint", 1.00);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	                	btnGum3.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Big Red", 1.00);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	    	            
	    	            // Add event handler for the Checkout button
	                	btnGum4.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    productTransaction.addItem("Bubble Yum Cotton Candy", 1.0);
	    	                    alert.showAndWait();
	    	                }
	    	            });
	                	
	    	            // Add event handler for the Checkout button
	    	            btnClose.setOnAction(new EventHandler<ActionEvent>() {
	    	                @Override
	    	                // Override the handle method
	    	                public void handle(ActionEvent event) {
	    	                    gumStage.close();
	    	                }
	    	            });
	                	
	                	gumStage.setScene(new Scene(GumGridPane, 500, 600));
	                	gumStage.show();
	                }
	            });
	            

	            // Add event handler for the Checkout button
	            buttonCheckout.setOnAction(new EventHandler<ActionEvent>() {
	                @Override
	                // Override the handle method
	                public void handle(ActionEvent event) {
	                	//Stage checkoutStage = new Stage(); // Create a new stage
	                    //checkoutStage.setTitle("Transaction"); // Set the stage title
	         	
	                	Alert alert = new Alert(AlertType.INFORMATION);
	                	alert.setTitle("Transaction");
	                	alert.setHeaderText(null);
	                	alert.setContentText(String.valueOf("Total amount of purchase : $" + productTransaction.getTotalPrice()));
	                	alert.showAndWait();
	                
	                	
	                }
	            });
	            
	            // Add event handler for the Checkout button
	            buttonClose.setOnAction(new EventHandler<ActionEvent>() {
	                @Override
	                // Override the handle method
	                public void handle(ActionEvent event) {
	                    primaryStage.close();
	                }
	            });
	           
	            
	            //VBox vbox = new VBox(5);
	            //vbox.setMinWidth(500);
	            //StackPane root = new StackPane();
	            //vbox.getChildren().addAll(buttonSnacks, buttonDrinks, buttonCheckout);
	            primaryStage.setScene(new Scene(productGridPane, 550, 625));
	            primaryStage.setMinWidth(550);
	            primaryStage.setMinHeight(700);
	            primaryStage.show();
	        }
	        
	     /*   
	     // this peice of code is for declaring the tableview of the check out

	    	TableView<Product> checkoutTableView;
	        ArrayList<Product> checkoutArray;
	        ObservableList<Product> checkoutTable;
	        Button payButton;
	        BorderPane checkoutBottom = new BorderPane();
	    	
	    // this is the checkout table view 

	    	 checkoutTableView = new TableView<>();
	            checkoutTableView.setMaxSize(400, 300);
	            checkoutTableView.setItems(checkoutTable);
	            checkoutTableView.getColumns().addAll(checkoutBrand, checkoutName, checkoutFlavor, checkoutPrice);
	    	
	    //  this would be added with all the other scenes
	    	
	    	 checkoutScene = new Scene(checkoutRoot, 500, 400);
	    	 
	    // here is for the pay and checkout images
	    		
	    		ImageView checkoutImageView = new ImageView(checkoutImage);
	            checkoutImageView.setFitHeight(40);
	            checkoutImageView.setFitWidth(40);
	    		
	    	Image payImage = new Image("image/pay.png");
	            ImageView payImageView = new ImageView(payImage);
	            payImageView.setFitHeight(30);
	            payImageView.setFitWidth(30);
	    		
	    // this is the list view for items in the cart

	    	    ListView checkoutList = new ListView();
	            checkoutList.setMaxSize(300, 275);
	    		
	    // this is the the check out button i created just one but it can be multiplied if needed

	    	   Button checkoutButton1 = new Button();
	            checkoutButton1.setGraphic(checkoutImageView1);
	            checkoutButton1.setOnAction(e -> {
	                if (checkoutList.getItems().isEmpty()){    
	                    AlertBox.display("Empty Cart", "NOTHING IS IN THE CART!");}
	                    else {
	                        if (dispenser.total.toString().endsWith("25") || dispenser.total.toString().endsWith("75"))
	                            payButton = new Button("$" + dispenser.total.toString());
	                    else payButton = new Button("$" + dispenser.total.toString() + "0");
	                    payButton.setGraphic(payImageView);
	                    payButton.setStyle("-fx-font-size: 20; -fx-font-weight: bold");
	    				
	    //' here is th piece of code to be inserted in with the other grid panes 

	    	VBox checkoutBox = new VBox();
	            checkoutBox.setAlignment(Pos.CENTER);
	            checkoutBox.getChildren().addAll(checkoutList);
	            checkoutRoot.setPadding(new Insets(25,25,25,25));
	            checkoutRoot.setCenter(checkoutBox);

	            totalBox.setAlignment(Pos.CENTER);
	    		
	            checkoutBottom.setRight(payButton);
	            checkoutRoot.setLeft(checkoutBottom);
	        */
	        
	}