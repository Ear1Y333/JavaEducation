import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sorry extends JPanel {

    private static final String TEXT = "Не обижайся"; // текст для анимации
    private static final int DELAY = 20; // задержка таймера в миллисекундах
    private static final int STEP = 2; // шаг смещения текста в пикселях
    private static final Font FONT = new Font("Arial", Font.BOLD, 32); // шрифт текста
    private static final Color COLOR = Color.PINK; // цвет текста

    private int x; // текущая координата x текста
    private int y; // текущая координата y текста
    private int width; // ширина текста в пикселях
    private int height; // высота текста в пикселях

    public Sorry() {
        setBackground(Color.WHITE); // устанавливаем белый фон
        setFont(FONT); // устанавливаем шрифт
        setForeground(COLOR); // устанавливаем цвет
        // создаем таймер, который будет вызывать метод actionPerformed каждые DELAY миллисекунд
        Timer timer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveText(); // перемещаем текст
                repaint(); // перерисовываем панель
            }
        });
        timer.start(); // запускаем таймер
    }

    // метод для перемещения текста
    private void moveText() {
        // если текст вышел за левую границу панели, то перемещаем его вправо
        if (x + width < 0) {
            x = getWidth();
        }
        // иначе смещаем текст влево на STEP пикселей
        else {
            x -= STEP;
        }
    }

    // метод для отрисовки текста
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        FontMetrics fm = g2d.getFontMetrics();
        width = fm.stringWidth(TEXT);
        height = fm.getHeight();
        y = (getHeight() - height) / 2 + fm.getAscent();
        g2d.drawString(TEXT, x, y);
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Animated Text");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Sorry());
        frame.setSize(650, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}