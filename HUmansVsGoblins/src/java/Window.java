package java;

import javax.swing.*;
import java.awt.*;

public class Window {
    public Window(int width, int height, String title, Main main){
        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width, height));
    }
}
