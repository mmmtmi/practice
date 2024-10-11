public abstract class TangibleAsset{
  private Srting name;
  private int price;
  private String color;

  public TrangibleAsset(String name,int price,String color){
    this.name = name;
    this.price = price;
    this.color = color;
  }

  public Srting getName(){return this.name;}
  public int getPrice(){return this.price;}
  public String getColor(){return this.color;}
}
