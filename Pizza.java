public class Pizza {
    private boolean isveg;
    private  String bill="";
    private  int price=0;
    private  boolean CheezAddextra=false;
    private  boolean ToppingAddextra=false;
    private  boolean takeWay=false;

    //chnge price acording to market
    private int vegprice=300;
    private  int nonvegprice=400;
    private  int Cheezprice=80;
    private int vegtopingprice=70;
    private  int nonvegtopingprice=120;
    private  int addtakecharge=20;

    public Pizza(boolean isveg){
        this.isveg=isveg;
        if(isveg==true){
            this.price+=vegprice;
            this.bill+="Regular pizza price is : "+vegprice+"\n";
        }else{
            this.price+=nonvegprice;
            this.bill+="Regular pizza price is : "+nonvegprice+"\n";
        }
    }
    public int getPrice(){
        return this.price;
    }
    public void setCheezAddextra(){
        if(CheezAddextra==false){
            this.price+=Cheezprice;
            CheezAddextra=true;
        }
    }
    public void setToppingAddextra(){
        if(ToppingAddextra==false){
            if(this.isveg==true){
                this.price+=vegtopingprice;
            }else{
                this.price+=nonvegtopingprice;
            }
            ToppingAddextra=true;
        }
    }
    public void setTakeWay(){
        if(takeWay==false){
            this.price+=addtakecharge;
            takeWay=true;
        }
    }
    public String getBill(){
        if(CheezAddextra==true){
            this.bill+="Adding Extra Chez : "+Cheezprice+"\n";
        }
        if(ToppingAddextra==true){
            if(isveg==true){
                this.bill+="Adding Extra Topping : "+vegtopingprice+"\n";
            }else {
                this.bill+="Adding Extra Topping : "+nonvegtopingprice+"\n";
            }
        }
        if(takeWay==true){
            this.bill+="Taking for outside :) "+ addtakecharge+"\n";
        }
            this.bill+= "Total Bill : "+ this.price +"\n"+"Than You for Visiting us :)";
           return this.bill;
    }

}
