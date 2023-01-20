public class Main {
    public static void main(String[] args) {
        Pizza rp=new Pizza(true);
        rp.setCheezAddextra();
        rp.setToppingAddextra();
        rp.setCheezAddextra();
        rp.setTakeWay();
        System.out.println(rp.getBill());

        DeluxPizza dp=new DeluxPizza(false);
        dp.setCheezAddextra();
        dp.setTakeWay();
        System.out.println(dp.getBill());
    }
}