
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class progress1 extends JFrame
{

static JFrame frame;
static JProgressBar bar;
public static void main(String[] args)
{

frame = new JFrame("ProgresBar demo");

JPanel panel = new JPanel();

bar = new JProgressBar(SwingConstants.VERTICAL);

bar.setValue(0);
bar.setStringPainted(true);

panel.add(bar);

frame.add(panel);

frame.setSize(500, 500);
frame.setVisible(true);
fill();
}

public static void fill()
{
int j = 0;
try {
while (j <= 100) {

bar.setValue(j + 10);

Thread.sleep(1000);
j += 20;
}
}
catch (Exception e) {
}
}
}