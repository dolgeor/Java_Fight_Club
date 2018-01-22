
package deitel16_15;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class ColorChooser {
    private Map<String , Color> colors = new HashMap<>();
    ColorChooser(){
         colors.put("white", Color.white);
        colors.put("red", Color.red);
        colors.put("orange", Color.orange);
        colors.put("yellow", Color.yellow);
        colors.put("green", Color.green);
        colors.put("blue", Color.blue);
        colors.put("cyan", Color.cyan);
        colors.put("black", Color.black);
    }
    public Color getColor(String c){
        return colors.get(c.toLowerCase());
    }
   
}
