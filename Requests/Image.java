package thingworx.webserver.Requests;

public class Image {
    private int id = 0;
    private int x = 50;
    private int y = 50;
    private String url = "";
    private Requests r = new Requests();

    public Image(int id){
        this.id = id;
    }

    public Image setUrl(String url){
        this.url = url.replaceAll(" ","%20");
        return this;
    }

    public Image setX(int x){
        this.x = x;
        return this;
    }

    public Image setY(int y){
        this.y = y;
        return this;
    }

    public void add(){
        r.addImage(url, x, y, id);
    }

    public void update(){
        r.updateImage(url, x, y, id);
    }

    public void delete(){
        r.deleteImage(id);
    }
}
