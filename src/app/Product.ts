export class Product {
    id: String;
    name: String;
    desc: String;
    price: number;
    img: String;
    stock: number;
    quantity: number;
    detailedDesc: String;
    detailsImg: String;

    constructor (name, desc, price, img, stock, detailedDesc, detailsImg) {
        this.id = '';
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.img = img;
        this.stock = stock;
        this.quantity = 0;
        this.detailedDesc = detailedDesc;
        this.detailsImg = detailsImg;
    }
}
