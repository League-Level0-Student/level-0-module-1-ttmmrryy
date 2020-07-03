
void setup() {
  size(600, 600);
  PImage face = loadImage("zombie.jpg");
  face.resize(600, 600);
  background(face);
}
void draw() {
  fill(255, mouseX, mouseY);
  ellipse(190, 200, 93, 86);
  ellipse(395, 180, 85, 80);
  fill(#000000);
  ellipse(190, 200, 30, 30);
  ellipse(395, 180, 30, 30);
}
