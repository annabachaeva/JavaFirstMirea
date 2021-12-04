package ru.mirea.task22;

public class ViewChairFactory implements ChairFactory {
    public ViewChairFactory() {
        System.out.println("Create factory");
    }

    public VictorianChair createVictorian() {
        System.out.println("Create VictorianChair");
        return new VChair();
    }

    public MultifunctionalChair createMulti() {
        System.out.println("Create MultifunctionalChair");
        return new MulChair();
    }

    public MagicChair createMagic() {
        System.out.println("Create MagicChair");
        return new MChair();
    }
}
