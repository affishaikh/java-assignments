package com.step.assignments;

public class JewelleryBox {
    private Jewellery jewellery;
    private JewelleryBox jewelleryBox;

    public JewelleryBox(Jewellery jewellery, JewelleryBox jewelleryBox) {
        this.jewellery = jewellery;
        this.jewelleryBox = jewelleryBox;
    }

    public JewelleryBox(Jewellery jewellery) {
        this.jewellery = jewellery;
    }

    public JewelleryBox(JewelleryBox jewelleryBox) {
        this.jewelleryBox = jewelleryBox;
    }

    public JewelleryBox() {
    }

    public JewelleryBox getJewelleryBox() {
        return jewelleryBox;
    }

    public int getNumberOfJewelleries() {
        int numberOfJewelleries = 0;
        if (this.jewellery != null) {
            numberOfJewelleries = 1;
        }
        if(this.jewelleryBox == null) {
            return numberOfJewelleries;
        }
        JewelleryBox jewelleryBox = this.getJewelleryBox();
        return numberOfJewelleries + jewelleryBox.getNumberOfJewelleries();
    }

    public static void main(String[] args) {
        Jewellery j1 =new Jewellery("Gold", 10000.0d);
        JewelleryBox jb1 = new JewelleryBox(j1);
        JewelleryBox jb2 = new JewelleryBox(j1, jb1);
        System.out.println(jb1.getNumberOfJewelleries());
        System.out.println(jb2.getNumberOfJewelleries());
    }
}
