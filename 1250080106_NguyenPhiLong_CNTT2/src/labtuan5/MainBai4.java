package labtuan5;

import java.util.Scanner;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x: ");
        this.x = scanner.nextInt();
        System.out.print("Nhập y: ");
        this.y = scanner.nextInt();
        System.out.print("Nhập tốc độ x: ");
        this.xSpeed = scanner.nextInt();
        System.out.print("Nhập tốc độ y: ");
        this.ySpeed = scanner.nextInt();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return x + ", " + y + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin tâm hình tròn:");
        center.nhap();
        System.out.print("Nhập bán kính: ");
        this.radius = scanner.nextInt();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Hình tròn tại (" + center.getX() + ", " + center.getY() + 
               "), speed=(" + center.getXSpeed() + ", " + center.getYSpeed() + 
               "), bán kính=" + radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}

public class MainBai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin hình tròn:");
        MovableCircle circle = new MovableCircle(0, 0, 0, 0, 0);
        circle.nhap();

        System.out.println("Vị trí ban đầu: " + circle.toString());
        
        circle.moveUp();
        System.out.println("Sau khi di chuyển lên: " + circle.toString());
        
        circle.moveDown();
        System.out.println("Sau khi di chuyển xuống: " + circle.toString());
        
        circle.moveLeft();
        System.out.println("Sau khi di chuyển sang trái: " + circle.toString());
        
        circle.moveRight();
        System.out.println("Sau khi di chuyển sang phải: " + circle.toString());
    }
}