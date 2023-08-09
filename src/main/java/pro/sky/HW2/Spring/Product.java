package pro.sky.HW2.Spring;

public class Product {
   // public Integer id;
    public String nameProduct;

    public Product(/*Integer id, */String nameProduct) {
       // this.id = id;
        this.nameProduct = nameProduct;
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
}
