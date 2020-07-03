PImage pepperoni;
PImage olive;
void setup() {
    size(600, 600);
    fill(#FFFBD3);
    ellipse(300, 300, 600, 600);
    fill(200, 0, 0);
    ellipse(300, 300, 550, 550);
    fill(#FFA600);
    ellipse(300, 300, 530, 530);
    pepperoni = loadImage("Pepperoni_Slice.jpg");
    pepperoni.resize(50, 50);
    olive = loadImage("vegetable-12-512.png");
    olive.resize(50, 50);
}
void draw() {
    image(pepperoni, 200, 200);
    image(olive, 400, 123);
    if(mousePressed && (mouseButton == LEFT)) {
      image(pepperoni, mouseX, mouseY);
    }
    else if (mousePressed && (mouseButton == RIGHT)) {
      image(olive, mouseX, mouseY);
    }
}
