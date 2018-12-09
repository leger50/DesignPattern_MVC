# Exemples d'implémentation

```java runnable
public class ModelView extends JFrame{
	
	public ModelView() {
		
        //fenetre
        this.setTitle("Carte de visite");
        this.setSize(600, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		
        this.setVisible(true);
	}
}

public class Main {

	public static void main(String[] args) {
        new ModelView();
	}
}


```