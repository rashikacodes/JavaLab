//Design a Stop Watch using event handling and multi-threading in Java.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StopWatch {
    private static int hours = 0, minutes = 0, seconds = 0;
    private static boolean running = false;
    private static Thread timerThread;
    private static JLabel timeLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stop Watch");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        timeLabel = new JLabel("00:00:00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        frame.add(timeLabel);

        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        frame.add(startButton);
        frame.add(stopButton);
        frame.add(resetButton);
        

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!running) {
                    running = true;
                    timerThread = new Thread(() -> {
                        while (running) {
                            try {
                                Thread.sleep(1000);
                                seconds++;
                                if (seconds == 60) {
                                    seconds = 0;
                                    minutes++;
                                    if (minutes == 60) {
                                        minutes = 0;
                                        hours++;
                                    }
                                }
                                SwingUtilities.invokeLater(() -> {
                                    timeLabel.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
                                });
                            } catch (InterruptedException ex) {
                                break;
                            }
                        }
                    });
                    timerThread.start();
                }
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                running = false;
                if (timerThread != null) {
                    timerThread.interrupt();
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                running = false;
                if (timerThread != null) {
                    timerThread.interrupt();
                }
                hours = 0;
                minutes = 0;
                seconds = 0;
                timeLabel.setText("00:00:00");
            }
        });

        frame.setVisible(true);
    }
}