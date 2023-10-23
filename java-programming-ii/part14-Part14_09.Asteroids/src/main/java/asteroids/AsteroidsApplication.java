package asteroids;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.input.KeyCode;
import javafx.scene.text.Text;
import javafx.animation.AnimationTimer;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicInteger;

public class AsteroidsApplication extends Application{
    
    public static int WIDTH = 600;
    public static int HEIGHT = 400;
    
    @Override
    public void start(Stage stage) throws Exception{
        
        Pane pane = new Pane();
        Text text = new Text(10, 20, "Points: ");
        pane.setPrefSize(WIDTH, HEIGHT);
        
        Ship ship = new Ship(WIDTH/2, HEIGHT/2);
        List<Asteroid> asteroids = new ArrayList<>();
        for (int i =0; i < 5; i++){
            Random random = new Random();
            Asteroid asteroid = new Asteroid(random.nextInt(WIDTH/3), random.nextInt(HEIGHT));
            asteroids.add(asteroid);
        }
        
        List<Projectile> projectiles = new ArrayList<>();
        
        pane.getChildren().add(text);
        pane.getChildren().add(ship.getCharacter());
        asteroids.forEach(asteroid -> pane.getChildren().add(asteroid.getCharacter()));
        
        AtomicInteger points = new AtomicInteger();
        
        Scene scene = new Scene(pane);
        
        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();
        scene.setOnKeyPressed(event ->{
            pressedKeys.put(event.getCode(), Boolean.TRUE);
        });
        scene.setOnKeyReleased(event -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });
        
        
        new AnimationTimer() {
           @Override
           public void handle(long now){
                if(pressedKeys.getOrDefault(KeyCode.LEFT, false)){
                    ship.turnLeft();
                }
                if(pressedKeys.getOrDefault(KeyCode.RIGHT, false)){
                    ship.turnRight();
                }
                if(pressedKeys.getOrDefault(KeyCode.UP, false)){
                    ship.accelerate();
                }
                if(pressedKeys.getOrDefault(KeyCode.SPACE, false) && projectiles.size() < 25) {
                    Projectile projectile = new Projectile((int) ship.getCharacter().getTranslateX(), (int) ship.getCharacter().getTranslateY());
                    projectile.getCharacter().setRotate(ship.getCharacter().getRotate());
                    projectiles.add(projectile);
                    
                    projectile.accelerate();
                    projectile.setMovement(projectile.getMovement().normalize().multiply(3));
                    
                    pane.getChildren().add(projectile.getCharacter());
                }
                ship.move();
                asteroids.forEach(asteroid -> asteroid.move());
                projectiles.forEach(projectile -> projectile.move());
               
                asteroids.forEach(asteroid -> {
                    if(ship.collide(asteroid)){
                        stop();
                    }
                });
                
                projectiles.forEach(projectile -> {
                    asteroids.forEach(asteroid -> {
                       if(projectile.collide(asteroid)){
                           projectile.setAlive(false);
                           asteroid.setAlive(false);
                       } 
                    });
                    if(!projectile.isAlive()){
                        text.setText("Points: " + points.addAndGet(1000));
                    }
                });
                removeFromCollision(projectiles, pane);
                removeFromCollision(asteroids, pane);
                
                if(Math.random() < 0.05){
                    Asteroid asteroid = new Asteroid (WIDTH, HEIGHT);
                    if(!asteroid.collide(ship)){
                        asteroids.add(asteroid);
                        pane.getChildren().add(asteroid.getCharacter());
                    }
                }
            }
        }.start();
        
        stage.setTitle("Asteroids!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(AsteroidsApplication.class);
    }
    
    public void removeFromCollision (List lista, Pane pane){
        List<Character> list = lista;
        list.stream()
            .filter(event -> !event.isAlive())
            .forEach(event -> pane.getChildren().remove(event.getCharacter()));
        list.removeAll(list.stream()
                    .filter(event -> !event.isAlive())
                    .collect(Collectors.toList()));
           
    }

    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }

}
