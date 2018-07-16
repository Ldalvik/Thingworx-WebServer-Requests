package thingworx.webserver.Requests;

import thingworx.webserver.Utils;

public class Text {

    private int id = 0;
    private String text = "(empty)";
    private String color = "255,0,0";
    private int x = 50;
    private int y = 50;
    private int size = 15;
    private Requests r = new Requests();

    public Text(int id){
        this.id = id;
    }

    public Text setText(String text){
        this.text = text.replaceAll(" ","%20");
        return this;
    }

    public Text setX(int x){
        this.x = x;
        return this;
    }

    public Text setY(int y){
        this.y = y;
        return this;
    }

    public Text setColor(int r, int g, int b){
        this.color = r + "," + g + "," + b;
        return this;
    }

    public Text setSize(int size){
        this.size = size;
        return this;
    }

    public void add(){
        r.addText(text, x, y , color, size, id);
    }

    public void update(){
        r.updateText(text, x, y , color, size, id);
    }

    public void delete(){
        r.deleteText(id);
    }
}
