package util;

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box3<Fruit> fruitBox = new Box3<>();
        Box3<Apple> appleBox = new Box3<>();
        Box3<Grape> grapeBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

    
        appleBox.add(new Apple());
        // appleBox.add(new Grape());
        toyBox.add(new Toy());


        //와일드카드 형식
        // <? extends T> T와 그 자손들만 가능
        // <? super T> : T와 그 조상들만 가능
        // <?> : 제한없음


        Juicer.makeJuice(fruitBox);
        Juicer.makeJuice(grapeBox);
        Juicer.makeJuice(appleBox);
    }
}
