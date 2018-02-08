public class Piece {

    public boolean color;
    String imageURL;
    int value;
    String type;



    public Piece(boolean color, String type, String imageURL) {
        this.color = color;
        this.type = type;
        this.imageURL = imageURL;
      //  this.value = value;
    }

    public String getImageURL() {

        return imageURL;
    }

    public void setImageURL(String imageURL) {

        this.imageURL = imageURL;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String imageURL(){
            return "/bilderchess/white_pawn.png";
    }


}
