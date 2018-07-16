package thingworx.webserver;

import thingworx.webserver.Requests.Image;
import thingworx.webserver.Requests.Text;

public class App
{
    public static void main(String[] args) throws InterruptedException {
        Text t = new Text(0)
                .setText("testing")
                .setColor(255,0,0)
                .setSize(10)
                .setX(10)
                .setY(50);
        t.add();

        Thread.sleep(2000);

        t.setText("updated text").setColor(0,0,255).update();

        Thread.sleep(2000);

        t.delete();

        Thread.sleep(5000);

        Image i = new Image(2)
                .setUrl("https://theowinter.ch/images/headers/helloworld.jpg")
                .setX(50)
                .setY(100);
        i.add();

        Thread.sleep(2000);

        i.setX(70).setY(100).update();

        Thread.sleep(2000);

        t.delete();
    }
}
