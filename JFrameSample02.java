<<<<<<< HEAD
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JFrame;
public class JFrameSample02 extends JFrame {
public void paint(Graphics g) {
Insets insets;
insets = getInsets(); // タイトルバー、枠線の幅を取得
// 描画色を赤に設定し、文字列と直線を描画
g.setColor(Color.red);
g.drawString("Hello Java!!", insets.left, insets.top + 40);
g.drawLine(insets.left + 200, insets.top + 20, insets.left + 350,
 insets.top + 40);
// 描画色を青に設定し、塗りつぶしの矩形、塗りつぶさない矩形を描画
g.setColor(Color.blue);
g.fillRect(insets.left, insets.top + 50, 150, 100);
g.drawRect(insets.left + 200, insets.top + 50, 150, 100);
// 描画色を黒に設定し、塗りつぶしの楕円、塗りつぶさない楕円を描画
g.setColor(Color.black);
g.fillOval(insets.left, insets.top + 170, 150, 100);
g.drawOval(insets.left + 200, insets.top + 170, 150, 100);
}
=======
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JFrame;
public class JFrameSample02 extends JFrame {
public void paint(Graphics g) {
Insets insets;
insets = getInsets(); // タイトルバー、枠線の幅を取得
// 描画色を赤に設定し、文字列と直線を描画
g.setColor(Color.red);
g.drawString("Hello Java!!", insets.left, insets.top + 40);
g.drawLine(insets.left + 200, insets.top + 20, insets.left + 350,
 insets.top + 40);
// 描画色を青に設定し、塗りつぶしの矩形、塗りつぶさない矩形を描画
g.setColor(Color.blue);
g.fillRect(insets.left, insets.top + 50, 150, 100);
g.drawRect(insets.left + 200, insets.top + 50, 150, 100);
// 描画色を黒に設定し、塗りつぶしの楕円、塗りつぶさない楕円を描画
g.setColor(Color.black);
g.fillOval(insets.left, insets.top + 170, 150, 100);
g.drawOval(insets.left + 200, insets.top + 170, 150, 100);
}
>>>>>>> 54d5b9516b1d6a1e10cb7d3cc9a9626087fe8a05
}